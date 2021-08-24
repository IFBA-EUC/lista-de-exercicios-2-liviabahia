import java.util.Scanner;

 class questao4 {
   public static void main(String args[]) { 
   Scanner leitor = new Scanner(System.in);         
   String nome;
   int quantidade;
   double preco;
   System.out.println("Qual o nome do produto?");
   nome = leitor.nextLine();
   System.out.println("Qual a quantidade?");
   quantidade = leitor.nextInt();
   System.out.println("Qual o preço do produto?");
   preco = leitor.nextDouble();
   
   if (quantidade <= 10) {
     preco = preco * quantidade;
}  else if (quantidade <= 20) {
     preco = (preco * quantidade) - ((preco * quantidade)/ 10);
}  else if (quantidade <= 50) {
     preco = (preco * quantidade) - ((preco * quantidade)/ 20);
}  else {
     preco = (preco * quantidade) / 2; 
   }
   System.out.println("produto:" + nome);
   System.out.println("valor da compra:" + preco);
  }
 }
