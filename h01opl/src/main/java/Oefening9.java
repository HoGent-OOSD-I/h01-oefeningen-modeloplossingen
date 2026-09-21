void main() {
    double maandsalaris, jaarsalaris, vakantiegeld;
    int percentageVakantiegeld = 8;     // vaste waarde: 8% van het jaarsalaris

    // Invoer
    maandsalaris = Double.parseDouble(IO.readln("Geef maandsalaris in euro: "));

    // Verwerking
    jaarsalaris = maandsalaris * 12;
    vakantiegeld = jaarsalaris * percentageVakantiegeld / 100; // Integer deling of reële deling?
    /*
        datatypes in bewerking: double * int / int
        Volgens de prioriteitsregels zal de vermenigvuldiging eerst uitgevoerd worden:
            double * int
        Het resultaat van de vermenigvuldiging is een double.
        Pas daarna wordt de deling uitgevoerd volgens de prioriteitsregels:
            double / int
        --> deling is REËLE deling aangezien minstens 1 van de argumenten een double is
     */

    // Uitvoer
    IO.println(String.format("jaarsalaris = %.2f € %nvakantiegeld = %.2f €", jaarsalaris, vakantiegeld));
}