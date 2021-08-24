import java.util.Scanner; 
 
public class Distancia { 
    public static void main(String[] args) {  
      
      Scanner teclado = new Scanner(System.in);   
         double x1, y1, x2, y2, distancia;
                   
         
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");    
        x1 = teclado.nextDouble();    
        y1 = teclado.nextDouble();  
        x2 = teclado.nextDouble();  
        y2 = teclado.nextDouble(); 
         
        distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)
        ); 
        System.out.println("A distância é: " + distancia); 
    } 
} 
// definir apenas uma armazenagem de ponto flutuante (double), retirada da definição "1/2" na variável distância e mudança de Math.pow para Math.sqrt. Possibilitando a variância do resultado, não só 1.0 .//
