package model;

public abstract class Mitarbeiter {
    private static int idCounter;
    private int id;
    private String name;
    private char gesch;
    private String adresse;
    private int alter;

    public Mitarbeiter(String name, char gesch, String adresse, int alter) {
        setId();
        setName(name);
        setGesch(gesch);
        setAdresse(adresse);
        setAlter(alter);
    }

    public int getId() {
        return id;
    }

    private void setId() {
        Mitarbeiter.idCounter++;
        this.id = Mitarbeiter.idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGesch() {
        return gesch;
    }

    public void setGesch(char gesch) {
        this.gesch = gesch;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public abstract double berechneGehalt();

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gesch=" + gesch +
                ", adresse='" + adresse + '\'' +
                ", alter=" + alter +
                '}';
    }
}
