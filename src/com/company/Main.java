package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test op ongeldige naam");
        try{
            Student s = new Student("o", 1, 1, 2000);
            System.out.printf("Dag %s, je bent %d jaar oud.", s.getNaam(), s.getLeeftijd());
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Test op ongeldige datum");
        try{
            Student s = new Student("Joske", 29, 2, 2018);
            System.out.printf("Dag %s, je bent %d jaar oud.", s.getNaam(), s.getLeeftijd());
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Test op datum in de toekomst");
        try{
            Student s = new Student("Joske", 28, 2, 2020);
            System.out.printf("Dag %s, je bent %d jaar oud.", s.getNaam(), s.getLeeftijd());
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Test op geldige input");
        try{
            Student s = new Student("Joske", 1, 1, 2000);
            System.out.printf("Dag %s, je bent %d jaar oud.", s.getNaam(), s.getLeeftijd());
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
	// write your code here
    }
}
