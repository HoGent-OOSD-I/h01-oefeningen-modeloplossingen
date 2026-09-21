void main() {
    int getal, duizendtallen, honderdtallen, tientallen, eenheden;

    // Invoer
    getal = Integer.parseInt(IO.readln("Geef een getal (> 999 en <=9999) in: "));

    // Verwerking
    duizendtallen = getal / 1000;
    getal = getal % 1000;
    honderdtallen = getal / 100;
    getal = getal % 100;
    tientallen = getal / 10;
    eenheden = getal % 10;

    // Uitvoer
    IO.println(String.format(
            "Het getal bestaat uit:%n%d duizendtallen%n%d honderdtallen%n%d tientallen%n%d eenheden",
            duizendtallen, honderdtallen, tientallen, eenheden
            ));
}