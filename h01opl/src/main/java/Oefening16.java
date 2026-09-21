void main() {
    // Invoer
    int getal = Integer.parseInt(IO.readln("Geef een geheel getal in: "));

    // Verwerking + uitvoer
    IO.println(String.format("octale notatie = %o",getal));
    IO.println(String.format("hexadecimale notatie (klein) = %x",getal));
    IO.println(String.format("hexadecimale notatie (groot) = %X",getal));
}