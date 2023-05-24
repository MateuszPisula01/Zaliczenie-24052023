import java.util.Scanner;

class Main {
  public static void main(String[] args) {

int x, wynik;
  
    Scanner in= new Scanner(System.in);
    
    System.out.println("Podaj liczbe");
     x = in.nextInt();

    wynik = 0;

    while (x != 0) {

      wynik += x%10;

      x /= 10;
    }
System.out.println("suma cyfr podanej liczby wynosi " + wynik);
}
 
}