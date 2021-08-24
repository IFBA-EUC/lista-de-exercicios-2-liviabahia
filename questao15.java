import java.util.Scanner;
 public class questao15 {
   public static void main(String args[]){ 
     Scanner leitor = new Scanner(System.in);
     float media1, media2, media3, art;
     String nota;
     System.out.println("Digite a média da primeira unidade:");
     media1 = leitor.nextFloat();
     System.out.println("Digite a média da segunda unidade:");
     media2 = leitor.nextFloat();
     System.out.println("Digite a média da terceira unidade:");
     media3 = leitor.nextFloat();
     
    art = (media1 + media2 + media3) / 3;
    System.out.println("a média do aluno é:" + art);
    
 if (art < 4) {
  nota = ("Reprovado");
} 
 else if (art == 4 || art <= 6) {
  nota = ("Verificação Suplementar");
}
 else {
  nota = ("Aprovado!");
} 
 System.out.println("Logo, o status do aluno é:" + nota);
 }
 }
