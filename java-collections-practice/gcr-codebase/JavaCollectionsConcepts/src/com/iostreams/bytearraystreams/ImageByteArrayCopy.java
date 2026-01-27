package com.iostreams.bytearraystreams;

import java.io.*;

public class ImageByteArrayCopy {

    public static void main(String[] args) {

        String inputImage = "input.jpg";     // put any image in project folder
        String outputImage = "output.jpg";

        try {
            // Read image into ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image copied successfully using ByteArray Streams.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

