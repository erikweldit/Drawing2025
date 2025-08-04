package com.example.application.controller;

public class tekst {
    /*

    1. Lag en controller som eksponerer filen:

public class SvgExportController {
    2.Sørg for at du skriver den til et kjent sted, for eksempel generated_svgs/filnavn.svg.

    Files.writeString(Path.of("generated_svgs/filnavn.svg"), svgContent, StandardCharsets.UTF_8);

    3.Bruk av klienten

    Image image = new Image("/generated/svg/filnavn.svg", "Generert SVG");
add(image);

4.Send til annen sever

HttpHeaders headers = new HttpHeaders();
headers.setContentType(MediaType.valueOf("image/svg+xml"));
HttpEntity<Resource> request = new HttpEntity<>(new FileSystemResource("generated_svgs/filnavn.svg"), headers);

ResponseEntity<String> response = restTemplate.postForEntity("https://api.annetsted.no/upload", request, String.class);
-------------------------------------------------
hvor må svg filen ligge

String svgContent = "<svg ...>...</svg>";
Files.writeString(Path.of("generated_svgs/filnavn.svg"), svgContent, StandardCharsets.UTF_8);
---------------------------
Bruk av filen

Image image = new Image("/generated/svg/filnavn.svg", "Min genererte SVG");
add(image);
-------------------------------
Når du genererer filen med sletting
String fileName = "filnavn.svg";
Path filePath = Path.of("generated_svgs", fileName);
Files.writeString(filePath, svgContent, StandardCharsets.UTF_8);

// Planlegg sletting etter 5 minutter
SvgFileCleaner.scheduleDeletion(filePath.toFile(), 5);
---------------------------

 1. Lag mappen programmatisk hvis den ikke finnes
Når du genererer filen, sjekk først at mappen finnes, og opprett den hvis ikke:

java
Kopier
Rediger
Path dirPath = Path.of("generated_svgs");
if (!Files.exists(dirPath)) {
    Files.createDirectories(dirPath);
}

Path filePath = dirPath.resolve("filnavn.svg");
Files.writeString(filePath, svgContent, StandardCharsets.UTF_8);
SvgFileCleaner.scheduleDeletion(filePath.toFile(), 5);
Dette er trygt og gjør at du ikke trenger å manuelt lage mappen på forhånd.

📌 2. Hvor lagres generated_svgs fysisk?
Når du bruker en relativ sti som generated_svgs, lagres mappen i "working directory" til applikasjonen, altså den katalogen hvor du starter appen fra (f.eks. med java -jar ... eller i IDE).

Eksempler:
I IntelliJ: Ofte rotnivået av prosjektet ditt.

Ved deploy (f.eks. Tomcat, Docker): Avhenger av base path — du bør da bruke en absolutt eller konfigurert base path.

✅ 3. Alternativ: Lagre i OS sin temp-katalog
Vil du ikke ha en fast mappe i prosjektet, kan du bruke systemets temp-katalog:


Path tempDir = Files.createTempDirectory("svg_temp_");
Path filePath = tempDir.resolve("filnavn.svg");
Files.writeString(filePath, svgContent);
Ulempen er at du da må ha en måte å hente korrekt sti senere (f.eks. lagre filnavn og sti i minnet, database eller session).
     */
}
