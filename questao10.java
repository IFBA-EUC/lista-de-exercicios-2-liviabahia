import java.util.Scanner;

 public class questao10 {
   public static void main(String args[]) { 
     double valor, investimento= 0, juros;
     String yn;
     Scanner leitor = new Scanner(System.in);
     System.out.println("Qual o valor do seu investimento mensal?");
     valor = leitor.nextDouble();
     System.out.println("Qual será o a taxa?");
     juros = leitor.nextDouble();
      do {
           for(int i = 1; i <= 12; i++){
           valor = valor + (valor * (juros/100));
           investimento = investimento + valor;
           }
     System.out.println("\nSeu investimento anual é de:" + investimento);
     leitor.nextLine();
     System.out.println("\n\nDeseja fazer a previsão do seu investimento para o próximo ano? (S/N)");
     yn = leitor.nextLine();
     valor = investimento;
     } 
       while("S".equals(yn) || "Sim".equals(yn));
       
   }
  }
