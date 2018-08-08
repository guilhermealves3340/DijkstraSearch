
package oficial;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    
        //lista de grafo é o nosso "mapa" do grafo
	private List<Vertice> grafo = new ArrayList<Vertice>();

	public void setVertices(List<Vertice> vertices) {

		this.grafo.addAll(vertices);
	}

	/*public void adicionarVertice(Vertice novo) {

		this.grafo.add(novo);
	}*/
        
        public void addVertice(String id) {
            
                Vertice novo = new Vertice();
                novo.setId(id);
		this.grafo.add(novo);
	}
        
        public void addAresta(String id1, String id2, int peso){
            
            Vertice aux1 = encontrarVertice(id1);
            Vertice aux2 = encontrarVertice(id2);
            Aresta novo = new Aresta(aux1, aux2);
            novo.setPeso(peso);
            
            aux1.getArestas().add(novo);
            aux1.getVizinhos().add(aux2);
            aux2.getArestas().add(novo);
            aux2.getVizinhos().add(aux1);
        }

        
	public List<Vertice> getVertices() {

		return this.grafo;
	}

	// Método que retorna o vértice cuja descrição é igual à procurada.
	public Vertice encontrarVertice(String nome) {

		for (int i = 0; i < this.getVertices().size(); i++) {

			if (nome.equalsIgnoreCase(this.getVertices().get(i).getId   ())) {

				return this.getVertices().get(i);

			}
		}

		return null;

	}

}   
