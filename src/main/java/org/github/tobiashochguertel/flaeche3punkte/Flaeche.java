package org.github.tobiashochguertel.flaeche3punkte;

public class Flaeche {

    private final int flaeche;

    public Flaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public Flaeche(Wert flaeche) {
        this.flaeche = flaeche.wert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flaeche)) return false;

        Flaeche flaeche1 = (Flaeche) o;

        return flaeche == flaeche1.flaeche;
    }

    @Override
    public int hashCode() {
        return flaeche;
    }

    @Override
    public String toString() {
        return Integer.toString(flaeche);
    }
}
