
package aplicacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Grafo implements FuncoesGrafos{
   
    private ArrayList<Vertice> vertices; 
    private int total_de_vertices;

    public ArrayList<Vertice> getG1() {
        return vertices;
    }

    public void setG1(ArrayList<Vertice> g1) {
        this.vertices = g1;
    }

    public int getTotal_de_vertices() {
        return total_de_vertices;
    }

    public void setTotal_de_vertices(int total_de_vertices) {
        this.total_de_vertices = total_de_vertices;
    }
    
    @Override
    public void imprimir() {
        for(Vertice j: this.getG1()){
            System.out.println("Vertice: " +j.getNome_vertice());
            System.out.println("Adjacentes: "+ j.getLista().toString());
        }
    }


    @Override
    public Vertice adicionarVertice(int n) {
        Vertice vn = new Vertice();
        vn.setNome_vertice(n); 
       this.vertices.add(vn);
        this.total_de_vertices++;
        return vn;
    }

    @Override
    public void adicionarAresta() {
       int v1,v2;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite à qual vertice você quer adicionar: ");
       v1 = teclado.nextInt();
       System.out.println("Digite o adjacente: ");
       v2 = teclado.nextInt();
       
       for(Vertice u: this.getG1()){
           if(!this.vertices.get(v1).getLista().contains(this.vertices.get(v2))){
                if(u.getNome_vertice() == v1){
                     u.getLista().add(this.adicionarVertice(v2));
                }
            }
        }
    }

    @Override
    public void removerVertice(int n) {
        Vertice buffer = new Vertice();
        for(Vertice j: this.vertices){
           
            if(j.getNome_vertice()==n){
               buffer =j;                
            }
       }
        this.getG1().remove(buffer);
    }

 
   
}
