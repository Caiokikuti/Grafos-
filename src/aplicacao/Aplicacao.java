
package aplicacao;
import java.util.Scanner;

public class Aplicacao {

 
    public static void main(String[] args) {
       Grafo gzin = new Grafo();

       String aresta, vertices;
       Scanner teclado = new Scanner(System.in);
       
       gzin.adicionarVertice(1);
       gzin.adicionarAresta();
       gzin.imprimir();
    }
    
}
