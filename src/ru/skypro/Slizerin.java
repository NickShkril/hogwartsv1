package ru.skypro;

public class Slizerin extends Hogwarts {
    public int trick;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustOfPower;

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

    @Override
    public String toString() {
        return super.toString()+ " Хитрость " + trick +
                ", Решимость " + determination +
                ", Амбициозность " + ambition +
                ", Находчивость " + resourcefulness +
                ", Жажда власти " + lustOfPower;
    }

    public void compareSlitherin(Slizerin student) {
        if (this.trick > student.getTrick()) {
            System.out.println("Хитрость " + this.getName() + " выше чем у " + student.getName());
        } else if (this.trick == student.getTrick()) {
            System.out.println("Хитрость " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Хитрость " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.determination > student.getDetermination()) {
            System.out.println("Решимость " + this.getName() + " выше чем у " + student.getName());
        } else if (this.determination == student.getDetermination()) {
            System.out.println("Решимость " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Решимость " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.ambition > student.getAmbition()) {
            System.out.println("Амбициозность " + this.getName() + " выше чем у " + student.getName());
        } else if (this.ambition == student.getAmbition()) {
            System.out.println("Амбициозность " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Амбициозность " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println("Находчивость " + this.getName() + " выше чем у " + student.getName());
        } else if (this.resourcefulness == getResourcefulness()) {
            System.out.println("Находчивость " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Находчивость " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.lustOfPower > student.getLustOfPower()) {
            System.out.println("Жажда власти " + this.getName() + " выше чем у " + student.getName());
        } else if (this.lustOfPower == student.getLustOfPower()) {
            System.out.println("Жажда власти " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Жажда власти " + this.getName() + " ниже чем у " + student.getName());
        }

    }

    public Slizerin(String name, int magicPower, int transgrecyDistance, int trick, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, magicPower, transgrecyDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }


}