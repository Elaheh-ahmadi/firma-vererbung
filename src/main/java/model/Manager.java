package model;

public class Manager extends Mitarbeiter {
    private float fixum;

    public Manager(String name, char gesch, String adresse, int alter, float fixum) {
        super(name, gesch, adresse, alter);
        setFixum(fixum);
    }

    public float getFixum() {
        return fixum;
    }

    public void setFixum(float fixum) {
        this.fixum = fixum;
    }

    @Override
    public double berechneGehalt() {

        return fixum;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                "fixum=" + fixum +
                '}';
    }
}
