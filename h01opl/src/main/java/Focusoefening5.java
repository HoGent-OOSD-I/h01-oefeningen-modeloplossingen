void main() {
    IO.println(String.format("2+3*4= %d", 2+3*4));
    IO.println(String.format("(2+3)*4= %d", (2+3)*4));
    IO.println(String.format("6*3/2*4= %d", 6*3/2*4));
    IO.println(String.format("6*3/(2*4)= %d", 6*3/(2*4))); // LET OP: integer deling!
    IO.println(String.format("6*(8%%(2*3))= %d", 6*(8%(2*3))));
    IO.println(String.format("17/8+9%%5-3*2= %d", 17/8+9%5-3*2)); // LET OP: integer deling!
    IO.println(String.format("17/(8+9)%%(5-3)*2= %d", 17/(8+9)%(5-3)*2));
    IO.println(String.format("12/(2*8%%4)= %s", "Exception aangezien 16%4 = 0 waardoor 12 / 0 wordt uitgevoerd"));
    IO.println(String.format("12.4/(15%%4)= %.1f", 12.4/(15%4)));
    IO.println(String.format("20*17/8%%4= %d", 20*17/8%4)); // LET OP: integer deling!
}