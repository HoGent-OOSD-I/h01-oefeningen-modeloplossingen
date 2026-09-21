void main() {
    // Invoer
    int getal = Integer.parseInt(IO.readln("Geef een positief getal in: "));

    // Verwerking + uitvoer
    IO.println(String.format("%15d%15d%15d%15d%15d",1,10,100,1000,10000));    // titel
    IO.println(String.format("%15d%15d%15d%15d%15d",
            getal,
            getal * 10,
            getal * 100,
            getal * 1000,
            getal * 10000
    ));
}