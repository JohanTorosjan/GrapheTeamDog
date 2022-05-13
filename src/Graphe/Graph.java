package Graphe;
public interface Graph{


    


    /**
     * 
     * @return Le nombre de sommets du graphe 
     */
    public int nbOfVertices();

    /**
     * 
     * @return Le nombre d'arretes du graphe 
     */
    public int nbOfEdges();
     
   /**
    *  Ajoute un sommet au graphe 
    * @param vertex Sommet à ajouter au graphe 
    */
    public void addVertex(Vertex vertex);


    /**
     *  Ajoute une arrête entre 2 sommets 
     * @param vertex1 Le premier sommet à connecter
     * @param vertex2 Le deuxieme sommet à connecter
     * @param EdgeKind Le type d'arrete : " ‘directed’ or ‘undirected’  "
     */
    public void addEdge(Vertex vertex1,Vertex vertex2,String EdgeKind);

  
    /**
     * 
     * @return True si tout les sommets sont connectés 
     */
    public boolean isConnected();

    /**
     * Retourne le(s) arrete(s) connectant les 2 sommets
     * @param vertex1 le premier sommet
     * @param vertex2 le deuxieme sommet 
     * @return
     */
    public Edge[] getEdges(Vertex vertex1, Vertex vertex2);

   /**
    * 
    * @return toutes les arrêtes du graphe 
    */
    public Edge[] getEdges();

    /**
     * 
     * @return toutes le sommets du graphe 
     */
    public Vertex [] getVertices();

    /**
     * 
     * @param vertex Le sommet dont on veut les arrêtes connectés
     * @return Les arretes connectés à un sommet
     */
    public Edge[] getNeighborEdges(Vertex vertex);

    /**
     * 
     * @return La version String d'un graphe 
     */
    public String toString();

}