package org.github.tobiashochguertel.flaeche3punkte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Flaeche3PunktApplicationTests {

    @Test
    void demo() {
        final FlaechenPunkt p1 = new FlaechenPunkt(new YWert(10), new XWert(10));
        final FlaechenPunkt p2 = new FlaechenPunkt(new YWert(6), new XWert(12));
        final FlaechenPunkt p3 = new FlaechenPunkt(new YWert(8), new XWert(9));

        final Flaeche flaeche = p1.flaeche(p2, p3);
        Assertions.assertEquals(new Flaeche(1000), flaeche);
    }

    @Test
    void demo2() {
        final FlaechenPunkt before = new FlaechenPunkt(new XWert(10), new YWert(10));
        final FlaechenPunkt current = new FlaechenPunkt(new XWert(12), new YWert(6));
        final FlaechenPunkt after = new FlaechenPunkt(new XWert(9), new YWert(8));

        final Flaeche flaeche = FlaechenPunkt.flaeche(before, current, after);
        Assertions.assertEquals(new Flaeche(12), flaeche);
    }


}
