void main() {
    int getal1, getal2, getal3, som, gemiddelde, rest;

    // Invoer
    getal1 = Integer.parseInt(IO.readln("Geef eerste getal: "));
    getal2 = Integer.parseInt(IO.readln("Geef tweede getal: "));
    getal3 = Integer.parseInt(IO.readln("Geef derde getal: "));

    // Verwerking
    som = getal1 + getal2 + getal3;
    gemiddelde = som / 3;
    rest = som % 3;

    // Uitvoer
    IO.println(String.format("Van de ingevoerde getallen %d, %d en %d",
            getal1, getal2, getal3));
    IO.println(String.format("is de som %d%nhet gemiddelde %d%nen de rest %d",
            som, gemiddelde, rest));
}