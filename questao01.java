import java.util.Scanner;

public class questao1 {
  public static void main(String args[]) {
  Scanner leitor = new Scanner(System.in);
  
  double a, b, c, delta, o1, o2;
  
    System.out.println("valor de a:");
    a = leitor.nextDouble();
    System.out.println("valor de b:");
    b = leitor.nextDouble();
    System.out.println("valor de c:");
    c = leitor.nextDouble();
    
    delta = b * b - 4 * a * c;
    
    if (delta >= 0) {
      o1 = (-b) / (2 * a);
      o2 = b / (2 * a);
      System.out.println("A raíz positiva é:" + o1);
      System.out.println("A raíz negativa é: + o2);
   } else if (delta < 0) {
      System.out.println("Não há raízes.");
    }
   }
 }
