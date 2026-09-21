void main() {
    int getal1;          // eerste getal om te vermenigvuldigen
    int getal2;          // tweede getal om te vermenigvuldigen
    int getal3;          // derde getal om te vermenigvuldigen
    int product;            // resultaat vermenigvuldiging van getal1, getal2 en getal3

    //invoer van de drie getallen:
    getal1 = Integer.parseInt(IO.readln("Geef eerste getal: "));
    getal2 = Integer.parseInt(IO.readln("Geef tweede getal: "));
    getal3 = Integer.parseInt(IO.readln("Geef derde getal: "));

    // Vermenigvuldig de getallen
    product = getal1 * getal2 * getal3;

    // toon het resultaat
    IO.print(String.format("De vermenigvuldiging van %d, %d en %d is %d",
            getal1, getal2, getal3, product));

}