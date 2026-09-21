void main() {
    double prijs, nieuwePrijs;
    int percentage;

    // Invoer
    prijs = Double.parseDouble(IO.readln("Geef een prijs in (=kommagetal): "));
    percentage = Integer.parseInt(IO.readln("Geef een kortingspercentage in (=geheel getal): "));

    // Verwerking
    nieuwePrijs = prijs - (prijs * percentage /100);    // Reële deling aangezien prijs double is

    // Uitvoer
    IO.println(String.format("%f € met %d%% korting is: %f €", prijs, percentage, nieuwePrijs));
    IO.println(String.format("%.2f € met %d%% korting is: %.2f €", prijs, percentage, nieuwePrijs));
}