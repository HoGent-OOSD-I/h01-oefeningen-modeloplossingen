void main() {
    int lengte, breedte, omtrek, oppervlakte;

    // Invoer
    lengte = Integer.parseInt(IO.readln("Geef de lengte van de rechthoek in: "));
    breedte = Integer.parseInt(IO.readln("Geef de breedte van de rechthoek in: "));

    // Verwerking
    omtrek = 2*(lengte + breedte);
    oppervlakte = lengte * breedte;

    // Uitvoer
    IO.println(String.format("De omtrek = %d%nDe oppervlakte = %d", omtrek, oppervlakte));
}