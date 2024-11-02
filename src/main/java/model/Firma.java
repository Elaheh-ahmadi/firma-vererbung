package model;

import java.util.ArrayList;
import java.util.Iterator;

class GenderCount {
    public int male;
    public int female;
}

public class Firma {
    private ArrayList<Mitarbeiter> mitarbetere;

    public Firma() {
        mitarbetere = new ArrayList<>();
    }

    public boolean add(Mitarbeiter mitarbeiter) throws IllegalArgumentException {
        if (mitarbeiter == null) {
            throw new IllegalArgumentException("Fehler");
        }

        if (mitarbetere.contains(mitarbeiter)) {
            throw new IllegalArgumentException("Fehler");
        }

        return mitarbetere.add(mitarbeiter);
    }

    public boolean remove(Mitarbeiter mitarbeiter) {

        if (mitarbeiter == null) {
            throw new IllegalArgumentException("Fehler");
        }

        if (!mitarbetere.contains(mitarbeiter)) {
            throw new IllegalArgumentException("Fehle!");
        }

        return mitarbetere.remove(mitarbeiter);
    }

    public int remove(String name) throws IllegalArgumentException {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }

        int anz = 0;
        Iterator<Mitarbeiter> it = mitarbetere.iterator();
        while (it.hasNext()) {
            Mitarbeiter mitarbeiter = it.next();
            if (name.equals(mitarbeiter.getName())) {
                it.remove();
                anz++;
            }
        }
        return anz;
    }

    public int zaehleAngestellte() {
        int anz = 0;
        for (Mitarbeiter mitarbeiter : mitarbetere) {
            if (mitarbeiter instanceof Angestellter || mitarbeiter instanceof Vertragsbediensteter || mitarbeiter instanceof Beamter) {
                anz++;
            }
        }

        return anz;
    }

    public int zaehleGeschlecht(char gesch) {
        int anz = 0;
        for (Mitarbeiter mitarbeiter : mitarbetere) {
            if (mitarbeiter.getGesch() == gesch) {
                anz++;
            }
        }
        return anz;
    }

    public GenderCount zaehleAllGeschlecht() {
        GenderCount data = new GenderCount();
        for (Mitarbeiter mitarbeiter : mitarbetere) {
            switch (mitarbeiter.getGesch()) {
                case 'm':
                    data.male++;
                    break;
                case 'f':
                    data.female++;
                    break;
                default:
                    break;
            }
        }
        return data;
    }

    public double berechneGesamtGehalt() {
        double sum =0;
        for(Mitarbeiter mitarbeiter:mitarbetere){
            sum+= mitarbeiter.berechneGehalt();
        }
        return sum;
    }

}
