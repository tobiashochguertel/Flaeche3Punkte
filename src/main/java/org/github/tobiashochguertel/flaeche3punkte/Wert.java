package org.github.tobiashochguertel.flaeche3punkte;

public class Wert {
    protected final int wert;

    public Wert(int wert) {
        this.wert = wert;
    }

    public Wert minus(Wert subtrahend) {
        return new Wert(this.wert - subtrahend.wert);
    }

    public Wert multiply(Wert multiplicator) {
        return new Wert(this.wert * multiplicator.wert);
    }

    public Wert divide(Wert wert) {
        return new Wert(this.wert / wert.wert);
    }
}
