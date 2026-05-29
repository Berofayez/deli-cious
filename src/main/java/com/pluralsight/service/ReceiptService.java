package com.pluralsight.service;

import com.pluralsight.model.MenuItem;
import com.pluralsight.model.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptService {

    public static void save(Order order) {

        File directory = new File("receipts");

        if (!directory.exists()) {
            directory.mkdirs();
        }

        String fileName = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"))
                + ".txt";

        File file = new File(directory, fileName);

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(file))) {

            printHeader(writer);

            writer.write("Date: "
                    + LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")));

            writer.newLine();
            writer.newLine();

            writer.write("ITEMS");
            writer.newLine();
            writer.write("--------------------------------------------------");
            writer.newLine();
            writer.newLine();

            for (MenuItem item : order.getMenuItems()) {
                writer.write(item.toString());
                writer.newLine();
                writer.newLine();
            }

            writer.write("--------------------------------------------------");
            writer.newLine();

            writer.write("TOTAL: $"
                    + String.format("%.2f", order.getTotalPrice()));

            writer.newLine();
            writer.newLine();

            printFooter(writer);

        } catch (IOException e) {
            System.out.println("Error creating receipt.");
            e.printStackTrace();
        }
    }

    private static void printHeader(BufferedWriter writer)
            throws IOException {

        writer.write("==================================================");
        writer.newLine();

        writer.write("                DELI-cious RECEIPT");
        writer.newLine();

        writer.write("==================================================");
        writer.newLine();
    }

    private static void printFooter(BufferedWriter writer)
            throws IOException {

        writer.write("==================================================");
        writer.newLine();

        writer.write("      Thank You For Choosing DELI-cious!");
        writer.newLine();

        writer.write("==================================================");
        writer.newLine();
    }
}