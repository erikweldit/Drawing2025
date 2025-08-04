package com.example.application.diverse.camvas;



import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@AnonymousAllowed
@Route("imagestostringg")

public class ImageToString {
    public ImageToString() {
        System.out.println("enter ImageToString ");
        try {
            // Les inn bildet
            BufferedImage image = ImageIO.read(new File("logo.png"));

            StringBuilder stringRepresentation = new StringBuilder();

            // Gå gjennom pikslene
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    int pixel = image.getRGB(x, y);

                    // Hent intensitet (gråskala)
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;
                    int gray = (red + green + blue) / 3;

                    // Konverter intensitet til et tegn (for eksempel ASCII-tegn)
                    char character = intensityToChar(gray);
                    stringRepresentation.append(character);
                }
                stringRepresentation.append("\n"); // Ny linje per rad
            }

            System.out.println(stringRepresentation.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Funksjon for å konvertere gråskala-intensitet til et ASCII-tegn
    private static char intensityToChar(int intensity) {
        // Bruk en enkel intensitetsskala
        final char[] chars = {'#', 'A', '8', '0', 'o', ':', '.', ' '};
        int index = (intensity * (chars.length - 1)) / 255;
        return chars[index];
    }
}

