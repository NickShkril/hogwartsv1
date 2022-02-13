package ru.skypro;


public class Hogwarts {
    private  String name;
    private  int magicPower;
    private  int transgrecyDistance;

    public Hogwarts(String name, int magicPower, int transgrecyDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgrecyDistance = transgrecyDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgrecyDistance() {
        return transgrecyDistance;
    }


    @Override
    public String toString() {
        return "Студент " +
                name + " Обладает силой магии, " + magicPower +
                " и может трансгрессировать на расстояние " + transgrecyDistance + ",";
    }

    public void compareStudents(Hogwarts student) {
        if (this.magicPower > student.getMagicPower()) {
            System.out.println("Сила магии " + this.name + " выше чем у " + student.getName());
        } else if (this.magicPower == student.getMagicPower()) {
            System.out.println("Сила магии " + this.name + " и " + student.getName() + " равны");
        } else {
            System.out.println("Сила магии " + this.name + " ниже чем у " + student.getName());
        }

        if (this.transgrecyDistance > student.getTransgrecyDistance()) {
            System.out.println("Расстояние трансгресии " + this.name + " выше чем у " + student.getName());
        } else if (this.transgrecyDistance == student.getTransgrecyDistance()) {
            System.out.println("Расстояние трансгресии " + this.name + " и " + student.getName() + " равны");
        } else {
            System.out.println("Расстояние трансгресии " + this.name + " ниже чем у " + student.getName());
        }
    }

}