import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Andmete loend
        List<String> dataList = new ArrayList<>();
        dataList.add("Vee andmed");
        dataList.add("Mulla andmed");
        dataList.add("Metsa andmed");
        dataList.add("Metsa raieandmed");
        dataList.add("Veetaseme andmed");

        Scanner scanner = new Scanner(System.in);
        List<String> filteredList = new ArrayList<>(dataList); // Kopeerime algandmed

        System.out.println("Hei! Olen siin, et Sind juhatada Sinu jaoks olulise andmeteni.");

        while (true) {
            System.out.print("Sisesta märksõna, mida otsid: ");
            String keyword = scanner.nextLine();

            // Filtreerimine märksõna põhjal
            List<String> results = new ArrayList<>();
            for (String item : filteredList) {
                if (item.toLowerCase().contains(keyword.toLowerCase())) {
                    results.add(item);
                }
            }

            if (results.isEmpty()) {
                System.out.println("Tulemusi ei leitud märksõnaga: " + keyword);
                break;
            } else {
                System.out.println("Leitud tulemused:");
                for (String result : results) {
                    System.out.println("- " + result);
                }
            }

            // Kas kasutaja soovib täpsustada?
            System.out.print("Kas soovid täpsustada? (jah/ei): ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("jah")) {
                break;
            } else {
                // Jätkame filtreeritud nimekirjaga
                filteredList = results;
            }
        }

        System.out.println("Otsing lõppenud. Aitäh!");
        scanner.close();
    }
}

