package Graphe;
import java.util.Random;

 public class Edge{
    
    private int id;
    private Color color;
    public Vertex[] ends;
    private double value;

    static int genererInt(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
     }

    /**
     * 
     * @param color Couleur de l'arrete
     * @param start Sommet numéro 1 de l'arrete
     * @param ends Sommet numéro 2 de l'arrete
     * @param value La valeur de l'arrete
     */
    public Edge(Color color, Vertex start, Vertex ends, double value){
        this.id=genererInt(1, 100000);
        this.ends[0]=start;
        this.ends[1]=ends;
        this.color=color;
        this.value=value;
    }


    /**
     * 
     * @return Les sommets auxquel est relié l'arrete 
     */       
    public Vertex[] getEnds(){
        return this.ends;
    }

    public String toString(){
        return "C'est une arrete normal";
    }
    
    

} 