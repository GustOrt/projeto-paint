import java.util.Scanner;

public class Oe{
  
  public static void main(String[] args){
    
    System.out.println("Macaco\n");
    Scanner in = new Scanner(System.in);
    double numeroDecimal = 3.45;
    String texto = "Macaco2";
    int numeroInteiro = 78;
    System.out.print(texto + (numeroInteiro + numeroDecimal));
    System.out.print("Digite um valor: ");
    double entradaDoUsuario = in.nextDouble();
    System.out.println("\nSeu valor é: " + entradaDoUsuario);

    
  }
}