package com.example.application.coonvert;

import org.apache.batik.transcoder.Transcoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;

import java.io.*;

public class SvgToPngConverter {
    public static void convertSvgToPng(String svgFilePath, String pngFilePath) throws IOException, TranscoderException {
        // Les SVG-filen
        File svgFile = new File(svgFilePath);
        FileInputStream inputStream = new FileInputStream(svgFile);
        TranscoderInput input = new TranscoderInput(inputStream);

        // Opprett output-strøm til PNG-fil
        OutputStream outputStream = new FileOutputStream(pngFilePath);
        TranscoderOutput output = new TranscoderOutput(outputStream);

        // Bruk Batik sin PNGTranscoder til å konvertere SVG til PNG
        Transcoder transcoder = new PNGTranscoder();
        transcoder.transcode(input, output);

        // Lukk strømmer
        outputStream.flush();
        outputStream.close();
        inputStream.close();

        System.out.println("Konvertering fullført: " + pngFilePath);
    }

    public static void main(String[] args) {
        try {
            convertSvgToPng("input.svg", "output.png");
        } catch (IOException | TranscoderException e) {
            e.printStackTrace();
        }
    }
}

