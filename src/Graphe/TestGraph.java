package Graphe;

import java.util.Arrays;

/**
 * Test class - (main class)
 */
public class TestGraph {
    public static void main(String[] args) {
        Vertex myVertex = new Vertex("an info", Color.BLANC);
        new DirectedEdge(Color.BLEU,myVertex,myVertex,3.8,1);
        new Edge(Color.ROUGE,myVertex,myVertex,6.2);
        System.out.println(myVertex.toString());
        System.out.println("Ceci est un affichage");
    }
}