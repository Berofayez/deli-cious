package com.pluralsight.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptService {

    public static void save(Order order) {

        String fileName = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"))
                + ".txt";

        File file = new File("receipts/" + fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("=== DELI-cious RECEIPT ===");
            writer.newLine();

            writer.write("Total: $" + order.getTotalPrice());
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
