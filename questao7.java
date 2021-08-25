// a) Programa A, pois não imprime o código -1.
//b) O programa B recebe o valor, imprime para depois efetivar a condição
// da estrutura de repetição while. Para a resolução,
// define-se no código, o que fazer ao receber número(s)
// diferente(s) ou igual a -1.

import java.util.Scanner; 
 
public class Codigo { 
    public static void main(String[] args) {  
            Scanner teclado = new Scanner(System.in);       
            int codigo;
            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            while (codigo != -1) {
            System.out.println("Código: " + codigo);
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt(); 
              }
            
           }
         }


 
