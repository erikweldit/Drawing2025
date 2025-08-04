package com.example.application.coonvert;




public class Copypdf {
/*
    // Metode for å konvertere SVG til PNG
    public static File convertSvgToPng(File svgFile) throws IOException, TranscoderException {
        File pngFile = File.createTempFile("converted-", ".png");

        FileInputStream inputStream = new FileInputStream(svgFile);
        TranscoderInput input = new TranscoderInput(inputStream);
        OutputStream outputStream = new FileOutputStream(pngFile);
        TranscoderOutput output = new TranscoderOutput(outputStream);

        Transcoder transcoder = new PNGTranscoder();
        transcoder.transcode(input, output);

        outputStream.flush();
        outputStream.close();
        inputStream.close();

        return pngFile;
    }

    // Metode for å lage en PDF med 4 SVG-bilder på en A4-side
    public static File createPdfWithSvgs(File[] svgFiles) throws IOException, TranscoderException {
        if (svgFiles.length != 4) {
            throw new IllegalArgumentException("Du må ha nøyaktig 4 SVG-filer for å lage en PDF.");
        }

        File pdfFile = File.createTempFile("output-", ".pdf");
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        float pageWidth = page.getMediaBox().getWidth();
        float pageHeight = page.getMediaBox().getHeight();
        float halfWidth = pageWidth / 2;
        float halfHeight = pageHeight / 2;

        for (int i = 0; i < 4; i++) {
            File pngFile = convertSvgToPng(svgFiles[i]);
            BufferedImage image = ImageIO.read(pngFile);
            PDImageXObject pdfImage = PDImageXObject.createFromFile(pngFile.getAbsolutePath(), document);

            float x = (i % 2) * halfWidth;
            float y = pageHeight - ((i / 2) + 1) * halfHeight;

            contentStream.drawImage(pdfImage, x, y, halfWidth, halfHeight);
        }

        contentStream.close();
        document.save(pdfFile);
        document.close();

        return pdfFile;
    }

 */
}


