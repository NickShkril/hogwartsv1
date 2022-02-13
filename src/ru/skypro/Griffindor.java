package ru.skypro;


public class Griffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonor(int honor) {
        this.honour = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return super.toString()
                +
                " Благородство " + nobility +
                ", Честь " + honour +
                ", Смелость " + bravery + ".";
    }

    public Griffindor(String name, int magicPower, int transgrecyDistance, int nobility, int honour, int bravery) {
        super(name, magicPower, transgrecyDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public void compareGriffindor(Griffindor student) {
        if (this.nobility > student.getNobility()) {
            System.out.println("Благородство " + this.getName() + " выше чем у " + student.getName());
        } else if (this.nobility == student.getNobility()) {
            System.out.println("Благородство " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Благородство " + this.getName()+ " ниже чем у " + student.getName());
        }

        if (this.honour > student.getHonour()) {
            System.out.println("Честь " + this.getName() + " выше чем у " + student.getName());
        } else if (this.honour == student.getHonour()) {
            System.out.println("Честь " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Честь " + this.getName()+ " ниже чем у " + student.getName());
        }

        if (this.bravery > student.getBravery()) {
            System.out.println("Смелость " + this.getName() + " выше чем у " + student.getName());
        } else if (this.bravery == student.getBravery()) {
            System.out.println("Смелость " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Смелость " + this.getName()+ " ниже чем у " + student.getName());
        }
    }
}