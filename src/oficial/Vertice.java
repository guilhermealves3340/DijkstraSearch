
package oficial;

import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice>{
        
        private String id;
        private int dist;
        private boolean visitado = false;
        private Vertice pai;
        private List<Aresta> arestas = new ArrayList<Aresta>();
        private List<Vertice> vizinhos = new ArrayList<Vertice>();
        
        public void setId(String nome){
                
                this.id = nome;
        }
        
        public String getId(){
                
                return id;
                
        }
        
        public void visitar (){
                
                this.visitado = true;
        }
        
        public boolean verificarVisita(){
                
                return visitado;
        }
        
        public void setDist(int distancia){
                
                this.dist = distancia;
        }
        
        public int getDist(){
                
                return this.dist;
        }
        
        public void setPai(Vertice pai){
                
                this.pai = pai;
        }
        
        public Vertice getPai(){
                
                return this.pai;
        }

        public void setVizinhos(List<Vertice> vizinhos) {
                
                this.vizinhos.addAll(vizinhos);
                                
        }
        
        public List<Vertice> getVizinhos(){
                
                return this.vizinhos;
        }
        
        public void setArestas(List <Aresta> arestas){
                
                this.arestas.addAll(arestas);
                
        }
        
        public List<Aresta> getArestas() {
                
                return arestas;
        }

        public int compareTo(Vertice vertice) {
                  if(this.getDist() < vertice.getDist()) return -1;
          else if(this.getDist() == vertice.getDist()) return 0;
          
          return 1;

                
        }
        
        @Override
        public boolean equals(Object obj) {
                if(obj instanceof Vertice){
                        Vertice vRef = (Vertice) obj;
                        if(this.getId().equals(vRef.getId())) return true;
                }
                return false;
        }
        
        @Override
        public String toString() {
                String s = " ";
                s+= this.getId();
                return s;
        }
        
        
        
        
}   
