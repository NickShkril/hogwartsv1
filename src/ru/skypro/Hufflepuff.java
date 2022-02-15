package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private final int industrious;
    private final int loyality;
    private final int honor;

    @Override
    public void getPersonalQualities() {
        System.out.println("Имя, " + super.getName() +
                " Дистанция трансгресии, " + super.getTransgrecyDistance() +
                " Сила магии, " + super.getMagicPower() +
                " Трудолюбие, " + this.getIndustrious() +
                " Преданность, " + this.getLoyality() +
                " Честь " + this.getHonor() + ".");
    }

    @Override
    public String toString() {
        return super.toString() +
                " Трудолюбие " + industrious +
                ", преданность " + loyality +
                ", честь " + honor;
    }


    public Hufflepuff(String name, int magicPower, int transgrecyDistance, int industrious, int loyality, int honor) {
        super(name, magicPower, transgrecyDistance);
        this.industrious = industrious;
        this.loyality = loyality;
        this.honor = honor;
    }

    public void compareHufflepuff(Hufflepuff student) {
        if (this.industrious > student.getIndustrious()) {
            System.out.println("Трудолюбие " + this.getName() + " выше чем у " + student.getName());
        } else if (this.industrious == student.getIndustrious()) {
            System.out.println("Трудолюбие " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Трудолюбие " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.loyality > student.getLoyality()) {
            System.out.println("преданность " + this.getName() + " выше чем у " + student.getName());
        } else if (this.loyality == student.getLoyality()) {
            System.out.println("преданность " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("преданность " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.honor > student.getHonor()) {
            System.out.println("Честь " + this.getName() + " выше чем у " + student.getName());
        } else if (this.honor == student.getHonor()) {
            System.out.println("Честь " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Честь " + this.getName() + " ниже чем у " + student.getName());
        }

    }

    public int getIndustrious() {
        return industrious;
    }


    public int getLoyality() {
        return loyality;
    }


    public int getHonor() {
        return honor;
    }


}