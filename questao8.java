import java.util. Scanner;

 public class questao8 {
   public static void main(String args[]) {
     Scanner leitor = new Scanner(System.in);
     int tanto, l = 0; int m = 1; int pin;
     System.out.println("Digite um número inteiro maior que 0:");
     tanto = leitor.nextInt();
     for (int a = 0; a < tanto; a ++) {
       System.out.println(l);
       pin = l + m;
       l = m;
       m = pin;
      }    
     }
   }
  
