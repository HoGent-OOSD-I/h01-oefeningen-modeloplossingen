void main() {
    int datum, dag, maand, aantalDagenTotNieuwjaar;

    // Invoer
    datum = Integer.parseInt(IO.readln("Geef een datum in <ddmmjjjj>: "));

    // Verwerking
    dag = datum / 1000000;
    maand = datum % 1000000 / 10000;
    aantalDagenTotNieuwjaar = 30 - dag + (12 - maand)*30;

    // Uitvoer
    IO.println(String.format("Het duurt nog %d dagen voor het terug nieuwjaar is!", aantalDagenTotNieuwjaar));
}