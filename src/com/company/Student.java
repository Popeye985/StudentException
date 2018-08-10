package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Student {
    private String naam;
    private LocalDate vandaag = LocalDate.now();
    private LocalDate geboortedatum;
    private int leeftijd;


    public Student(String naam, int dag, int maand, int jaar) {
        try {
            geboortedatum = LocalDate.of(jaar, maand, dag);

        }catch (DateTimeException ex) {
            throw new IllegalArgumentException("Ongeldige datum");
        }

            if (naam.length() < 2) throw new IllegalArgumentException("Naam is te kort");
            this.naam = naam;
            if (geboortedatum.isAfter(vandaag))
                throw new IllegalArgumentException("Geboortedatum mag niet in de toekomst liggen");
        }


    public String getNaam() {
        return naam;
    }



    public int getLeeftijd() {
        LocalDate vandaag = LocalDate.now();
        leeftijd = vandaag.getYear() - geboortedatum.getYear();
        LocalDate verjaardag = geboortedatum.plusYears(leeftijd);
        if (verjaardag.compareTo(vandaag) > 0){
            leeftijd--;
        }

        return leeftijd;
    }

}
