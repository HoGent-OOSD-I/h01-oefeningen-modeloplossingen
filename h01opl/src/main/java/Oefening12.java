void main() {
    double hoogte, breedte, oppervlakteMuur, aantalRollen;
    double oppervlakte1Rol = 10 * 0.5;  //1 rol = 10 m * 50 cm =
                                        //        10 m * 0.5 m = 5 m2

    // Invoer
    hoogte = Double.parseDouble(IO.readln("Geef de hoogte van de muur in m in: "));
    breedte = Double.parseDouble(IO.readln("Geef de breedte van de muur in m in: "));

    // Verwerking
    oppervlakteMuur = hoogte * breedte;
    aantalRollen = oppervlakteMuur / oppervlakte1Rol; // Reële deling

    // Uitvoer
    IO.println(String.format("Het aantal benodigde rollen = %.1f", aantalRollen));
}