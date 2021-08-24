import java.util.Scanner;
public class questao6 {
  public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
  int numero, dígito;
  System.out.println("Digite um número inteiro de 0 a 1 000 000");
  numero = leitor.nextInt();
  if (numero < 10) {
  numero = (1);
} 
 else if (numero == 10 || numero <= 99) {
  numero = (2);
}
 else if (numero <= 999) {
  numero = (3);
} 
 else if (numero <= 9999) {
  numero = (4);
} 
 else if (numero > 9999 || numero <= 99999) {
  numero = (5);
} 
 else if (numero > 99999 || numero <= 999999) {
  numero = (6);
}
  else { 
  numero = (7); 
}
  
 System.out.println("a quantidade de digito(s) que o número possui é:" + numero);
 }
}
