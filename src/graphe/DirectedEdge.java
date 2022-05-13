package graphe;
public class DirectedEdge extends Edge{

    private int source;


    /**
     * 
     * @param color Couleur de l'arrete
     * @param start Début de l'arrete
     * @param ends Fin de l'arrete
     * @param value Valeur de l'arrete
     * @param source 0 ou 1, 0 si l'arrete commence à start, 1 si elle commence à ends;
     */
    public DirectedEdge(Color color, Vertex start, Vertex ends, double value,int source){
        super(color,start,ends,value);
        this.source=source;
    }

    /**
     * 
     * @return la source de l'arrete
     */
    public Vertex getSource(){
        return this.ends[source];
        }
    
    /**
     * 
     * @return la fin de l'arrete
     */
    public Vertex getSink(){
        return this.ends[source-1];
    }

    /**
     * 
     * @return Arrete dirigé sous forme de string
     */
    public String ToString(){
        return "C'est une arrete dirigé";
    }
    
}