package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry Potter", 60, 60, 60, 60, 60);
        Griffindor ron = new Griffindor("Ronald Weasley", 50, 50, 50, 50, 50);
        Griffindor hermiona = new Griffindor("Hermiona Greindger", 60, 100, 70, 70, 70);
        Slizerin drako = new Slizerin("Drako Malfoy", 55, 55, 55, 55, 55, 55, 55);
        Slizerin graham = new Slizerin("Graham Montegrew", 25, 25, 25, 25, 25, 25, 25);
        Slizerin goyle = new Slizerin("Gregory Goyle", 20, 20, 20, 20, 20, 20, 20);
        Hufflepuff smith = new Hufflepuff("Zakharia Smith", 30, 30, 30, 30, 30);
        Hufflepuff diggory = new Hufflepuff("Sedrik Diggory", 30, 30, 30, 30, 30);
        Hufflepuff finchFletchy = new Hufflepuff("Justin Finch-Fletchi", 30, 30, 30, 30, 30);
        Ravenclaw chang = new Ravenclaw("Jou Chang", 30, 30, 40, 40, 40, 40);
        Ravenclaw patil = new Ravenclaw("Padma Patil", 30, 30, 40, 40, 40, 40);
        Ravenclaw belby = new Ravenclaw("Markus Belby", 30, 30, 40, 40, 40, 40);
        harry.compareStudents(drako);
        System.out.println(harry);
        harry.compareGriffindor(hermiona);
        chang.compareRavenclaw(patil);
        System.out.println(chang);
        smith.compareHufflepuff(diggory);
        System.out.println(diggory);
        graham.compareSlitherin(goyle);
        System.out.println(goyle);
    }


}