

package aplicacao;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Caio Kikuti
 */
public class Vertice {
    private int nome_vertice;

    public int getNome_vertice() {
        return nome_vertice;
    }

    public void setNome_vertice(int nome_vertice) {
        this.nome_vertice = nome_vertice;
    }
    private ArrayList<Vertice> lista;
    private String cor;
    private Vertice pred;

    public ArrayList<Vertice> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Vertice> lista) {
        this.lista = lista;
    }

    public String getCor() {
        return cor;
    }

    public Vertice() {
        this.nome_vertice = 0;
        this.lista = new ArrayList<Vertice>();
        this.cor = "branco";
        this.pred = null;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Vertice getPred() {
        return pred;
    }

    public void setPred(Vertice pred) {
        this.pred = pred;
    }
    
}
