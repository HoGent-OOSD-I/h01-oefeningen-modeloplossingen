void main() {
    int x = 2, y = 3, som;
    som = x * x + y * y;
    IO.println("Som = " + som);
}

/*
Bespreking vragen uit focusoefening:
 * Laat het woord "int" weg uit de lijn "int x = 2, y = 3, som;"
        --> code compileert niet.
 * Laat ", som" weg uit de lijn "int x = 2, y = 3, som;".
        --> code compileert niet (want som is niet gedeclareerd).
 * Laat de lijn met "som = x * x + y * y;" volledig weg
        --> code compileert niet (want som is niet geïnitialiseerd).
 * Voeg een extra variabele genaamd a toe op de lijn "int x = 2, y = 3, som;"
        int x = 2, y = 3, som, a;
        --> code compileert wel, geeft wel een waarschuwing dat a niet gebruikt wordt.
 * Laat een accolade weg.
        --> code compileert niet.
 * Wijzig de code zodanig dat de uitvoer de volgende vorm krijgt: x = 2, y = 3, som = 13.
        IO.println("x = " + x + ", y = " + y + ", som = " + som);
        Betere oplossing nadat de sectie "geformatteerde uitvoer" in de cursus is bekeken:
        IO.println(String.format("x = %d, y = %d, som = %d", x, y, som));
 * Verander x in 3 en y in 5. Verandert de uitvoer mee?
        Ja, de uitvoer wordt "Som = 34"
 */