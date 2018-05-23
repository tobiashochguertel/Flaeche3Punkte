package org.github.tobiashochguertel.flaeche3punkte;

public class FlaechenPunkt {

    private final YWert y;
    private final XWert x;

    public FlaechenPunkt(YWert y, XWert x) {
        this.y = y;
        this.x = x;
    }

    public FlaechenPunkt(XWert x, YWert y) {
        this(y, x);
    }

    public static Flaeche flaeche(FlaechenPunkt before, FlaechenPunkt current, FlaechenPunkt after) {
        final Wert result = before.y.minus(after.y).multiply(current.x);
        return new Flaeche(result.divide(new Wert(2)));
    }


}
