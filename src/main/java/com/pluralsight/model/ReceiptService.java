package com.pluralsight.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptService {

    public static void save(Order order) {

        try {
            File folder = new File("receipts");
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String fileName = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"))
                    + ".txt";

            File file = new File(folder, fileName);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

                writer.write("=== DELI-cious RECEIPT ===");
                writer.newLine();
                writer.newLine();

                writer.write("Items:");
                writer.newLine();

                for (MenuItem item : order.getMenuItems()) {
                    writer.write("- " + item.toString());
                    writer.newLine();
                }

                writer.newLine();
                writer.write("TOTAL: $" + String.format("%.2f", order.getTotalPrice()));
                writer.newLine();

                writer.write("========================");

                writer.flush();

            }

            System.out.println("Receipt saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
