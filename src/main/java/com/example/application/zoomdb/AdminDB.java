package com.example.application.zoomdb;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
@Route("admindb")
@Component
@Profile("dev")
public class AdminDB implements CommandLineRunner {

    private final SvgImageRepository repository;

    @Autowired
    public AdminDB(SvgImageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        // If there's no console input (e.g. in Docker), just skip this runner
        if (!scanner.hasNextLine()) {
            System.out.println("No console input available, skipping AdminDB.");
            return;
        }

        System.out.println("== AdminDB meny ==");
        while (true) {
            System.out.println("\n1. Upload SVG file:");
            System.out.println("2. Search for SVG (name/id/userId)");
            System.out.println("3. Delete all with userId");
            System.out.println("4. List all for userId");
            System.out.println("5. Exit");
            System.out.print("Select: ");

            if (!scanner.hasNextLine()) {
                System.out.println("No more input, exiting AdminDB.");
                return;
            }

            String valg = scanner.nextLine();

            switch (valg) {
                case "1" -> lastOppSvg(scanner);
                case "2" -> soekEtterSvg(scanner);
                case "3" -> slettEtterUserId(scanner);
                case "4" -> listAlleForUserId(scanner);
                case "5" -> {
                    System.out.println("Finishing AdminDB.");
                    return;
                }
                default -> System.out.println("Invalid selection.");
            }
        }
    }


    private void lastOppSvg(Scanner scanner) {
        try {
            System.out.print("File path: ");
            Path path = Path.of(scanner.nextLine());
            System.out.print("User ID: ");
            String userId = scanner.nextLine();
            System.out.print("Filname: ");
            String name = scanner.nextLine();

            String content = Files.readString(path);
            SvgImage svg = new SvgImage();
            svg.setUserId(userId);
            svg.setName(name);
            svg.setContent(content);
            svg.setCreatedAt(LocalDateTime.now());
            repository.save(svg);
            System.out.println("SVG upload.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void soekEtterSvg(Scanner scanner) {
        System.out.print("Write name/id/userId: ");
        String input = scanner.nextLine();

        try {
            SvgImage found = repository.findById(Long.parseLong(input)).orElse(null);
            if (found == null) {
                List<SvgImage> results = repository.findByUserId(input);
                if (results.isEmpty()) results = repository.findByNameContainingIgnoreCase(input);
                results.forEach(img -> System.out.println(" - " + img.getId() + " | " + img.getName() + " | " + img.getUserId()));
            } else {
                System.out.println("SVG:\n" + found.getContent());
            }
        } catch (NumberFormatException e) {
            List<SvgImage> results = repository.findByUserId(input);
            if (results.isEmpty()) results = repository.findByNameContainingIgnoreCase(input);
            results.forEach(img -> System.out.println(" - " + img.getId() + " | " + img.getName() + " | " + img.getUserId()));
        }
    }

    private void slettEtterUserId(Scanner scanner) {
        System.out.print("Write userId: ");
        String userId = scanner.nextLine();
        List<SvgImage> toDelete = repository.findByUserId(userId);
        if (toDelete.isEmpty()) {
            System.out.println("None found for userId.");
            return;
        }
        repository.deleteAll(toDelete);
        System.out.println(toDelete.size() + " SVG deleted.");
    }

    private void listAlleForUserId(Scanner scanner) {
        System.out.print("Write userId: ");
        String userId = scanner.nextLine();
        List<SvgImage> results = repository.findByUserId(userId);
        if (results.isEmpty()) {
            System.out.println("None found for SVG.");
        } else {
            results.forEach(img -> System.out.println(" - " + img.getId() + " | " + img.getName() + " | " + img.getCreatedAt()));
        }
    }




}


