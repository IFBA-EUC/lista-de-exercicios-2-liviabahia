import java.util.Scanner;
public class questao16 {
  public static void main(String[] args){
  Scanner leitor = new Scanner(System.in);
  int segundos;
  int hora;
  int m;
  int s;
  System.out.println("Digite os segundos:");
  segundos = leitor.nextInt();
 
  hora = segundos / 3600;
  m = (segundos % 3600) / 60;
  s = (segundos % 3600) % 60;
  System.out.println("Quantidade de hora(s):" + hora);
  System.out.println("Total de minutos:" +m);
  System.out.println("Segundos:" +s);
 }
}
