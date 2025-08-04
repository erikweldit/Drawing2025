package com.example.application.coonvert;
import java.io.*;

import com.vaadin.flow.router.Route;
import org.apache.batik.transcoder.*;
import org.apache.batik.transcoder.image.PNGTranscoder;

@Route("testview")
public class TestConverter {
    public static void main(String[] args) throws Exception {
        String svgFilePath = "uploads/test.svg";
        String pngFilePath = "uploads/test.png";
        svgFilePath =  "<svg width='300' height='170' xmlns='http://www.w3.org/2000/svg'>\n" +
                " <rect width='150' height='150' x='10' y='10' rx='20' ry='20' style='fill:red;stroke:black;stroke-width:5;opacity:0.5' />\n" +
                "\n" +
                "</svg>\n ";
        File svgFile = new File(svgFilePath);
        if (!svgFile.exists()) {
            throw new FileNotFoundException("Filen finnes ikke: " + svgFile.getAbsolutePath());
        }

        TranscoderInput input = new TranscoderInput(new FileInputStream(svgFile));
        TranscoderOutput output = new TranscoderOutput(new FileOutputStream(pngFilePath));

        PNGTranscoder transcoder = new PNGTranscoder();
        transcoder.transcode(input, output);

        System.out.println("Konvertering fullført: " + pngFilePath);
    }
}

