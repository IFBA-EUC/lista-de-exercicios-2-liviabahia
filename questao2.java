import java.util.Scanner;
public class questao2 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Ponto inicial: digite a coordenada 1");
    double ha = leitor.nextDouble();
    System.out.println("Ponto final: digite a coordenada 1");
    double pe = leitor.nextDouble();
    System.out.println("Ponto inicial: digite a coordenada 2");
    double la = leitor.nextDouble();
    System.out.println("Ponto inicial: digite a coordenada 2");
    double pf = leitor.nextDouble();
    
    double distancia = Math.pow(la - ha, 2) + Math.pow(pf - pe, 2);
    System.out.printf("distancia:" + distancia);
   }
 }
