package graphe;

/**
 * Test class - (main class)
 */
public class TestGraph {
    public static void main(String[] args) {
       
        Vertex myVertex = new Vertex("an info", Color.BLANC);
        DirectedEdge myDirectedEdge=new DirectedEdge(Color.BLEU,myVertex,myVertex,3.8,1);
        Edge myEdge=new Edge(Color.ROUGE,myVertex,myVertex,6.2);
        System.out.println("Tout s'est bien passé ;)");
    }
}