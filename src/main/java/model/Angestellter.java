package model;

public abstract class Angestellter extends Mitarbeiter{
    public Angestellter(String name, char gesch, String adresse, int alter) {
        super(name, gesch, adresse, alter);
    }

    @Override
    public  abstract double berechneGehalt();


}

