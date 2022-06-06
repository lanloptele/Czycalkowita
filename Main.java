import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  String tekst;
  double a;
  Scanner wczytaj = new Scanner(System.in);
  tekst = wczytaj.nextLine();
  try{
    a = Integer.parseInt(tekst); 
  
    if(a == (int)a)
      System.out.print("\nCalkowita");
    }catch (NumberFormatException exception) { System.err.println("Niecałkowita");}
    wczytaj.close();
  }
}