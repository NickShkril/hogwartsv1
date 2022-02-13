package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgrecyDistance, int smart, int wise, int witty, int creative) {
        super(name, magicPower, transgrecyDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void compareRavenclaw(Ravenclaw student) {
        if (this.smart > student.getSmart()) {
            System.out.println("Ум " + this.getName() + " выше чем у " + student.getName());
        } else if (this.smart == student.getSmart()) {
            System.out.println("Ум " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Ум " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.wise > student.getWise()) {
            System.out.println("Мудрость " + this.getName() + " выше чем у " + student.getName());
        } else if (this.wise == student.getWise()) {
            System.out.println("Мудрость " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Мудрость " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.witty > student.getWitty()) {
            System.out.println("Остроумие " + this.getName() + " выше чем у " + student.getName());
        } else if (this.witty == student.getWitty()) {
            System.out.println("Остроумие " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Остроумие " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.creative > student.getCreative()) {
            System.out.println("Креативность " + this.getName() + " выше чем у " + student.getName());
        } else if (this.creative == student.getCreative()) {
            System.out.println("Креативность " + this.getName() + " и " + student.getName() + " равны");
        } else {
            System.out.println("Креативность " + this.getName() + " ниже чем у " + student.getName());
        }
    }


    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return super.toString() + " Ум " + smart +
                ", Мудрость " + wise +
                ", Остроумие " + witty +
                ", Креативность " + creative;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}