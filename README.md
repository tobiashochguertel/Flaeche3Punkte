# Berechnung der Flaeche eines Dreiecks aus drei Koordinatenpunkten.

**Auschnitt aus den [Test](https://github.com/tobiashochguertel/Flaeche3Punkte/blob/master/src/test/java/org/github/tobiashochguertel/flaeche3punkte/Flaeche3PunktApplicationTests.java):**
```java
    @Test
    void demo2() {
        final FlaechenPunkt before = new FlaechenPunkt(new XWert(10), new YWert(10));
        final FlaechenPunkt current = new FlaechenPunkt(new XWert(12), new YWert(6));
        final FlaechenPunkt after = new FlaechenPunkt(new XWert(9), new YWert(8));

        final Flaeche flaeche = FlaechenPunkt.flaeche(before, current, after);
        final Flaeche expected = new Flaeche(12);
        Assertions.assertEquals(expected, flaeche);
    }
```

## Autoren

- Rene Beaupoil
- Tobias Hochgürtel

