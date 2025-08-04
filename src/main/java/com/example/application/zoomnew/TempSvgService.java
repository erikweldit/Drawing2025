package com.example.application.zoomnew;



import com.vaadin.flow.router.Route;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Route("tempfile")
public class TempSvgService {

    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public Path createTempSvg(String svgContent) throws IOException {
        Path tempFile = Files.createTempFile("svg-", ".svg");
        Files.writeString(tempFile, svgContent);

        // Planlegg sletting om 10 min
        scheduler.schedule(() -> {
            try {
                Files.deleteIfExists(tempFile);
                System.out.println("Slettet: " + tempFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, 10, TimeUnit.MINUTES);

        return tempFile;
    }
    // Files.createTempFile(Paths.get("custom-folder"), "prefix", ".svg");
    /*
    //Gjøre filen tilgjengelig for nedlasting i Vaadin
    Path file = tempSvgService.createTempSvg(svgContent);
StreamResource resource = new StreamResource("drawing.svg", () -> {
    try {
        return Files.newInputStream(file);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
});
Anchor downloadLink = new Anchor(resource, "Last ned SVG");
downloadLink.getElement().setAttribute("download", true);


     */
}

