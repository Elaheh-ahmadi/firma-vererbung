package model;

public class Beamter extends Angestellter {
    public Beamter(String name, char gesch, String adresse, int alter) {
        super(name, gesch, adresse, alter);
    }

    @Override
    public double berechneGehalt() {
        return 1462;
    }

    @Override
    public String toString() {
        return "Beamter{"+ super.toString()+ "}";
    }
}
