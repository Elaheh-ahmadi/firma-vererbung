package model;

public class Freelancer extends  Mitarbeiter{
    private float stundenSatz;
    private int stunden;

    public Freelancer(int id, String name, char gesch, String adresse, int alter, float stundenSatz, int stunden) {
        super(name, gesch, adresse, alter);
        setStundenSatz  (stundenSatz);
        setStunden (stunden);
    }

    public float getStundenSatz() {
        return stundenSatz;
    }

    public void setStundenSatz(float stundenSatz) {
        this.stundenSatz = stundenSatz;
    }

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        this.stunden = stunden;
    }

    @Override
    public double berechneGehalt() {
        return stunden*stundenSatz;
    }

    @Override
    public String toString() {
        return "Freelancer{" + super.toString()+
                "stundenSatz=" + stundenSatz +
                ", stunden=" + stunden +
                '}';
    }
}
