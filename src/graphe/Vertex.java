package graphe;
import java.util.Random;

public class Vertex{
    
    private int id;
    private Object info;
    private Color color;

    /**
     * 
     * @param info l'object voulant être stocké dans le sommet
     * @param color la couleur du sommet
     */
    static  int genererInt(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
     }
    public Vertex(Object info, Color color){
        this.id=genererInt(1, 100000);
        this.info=info;
        this.color=color;
    }

    /**
     * 
     * @return l'object du sommet
     */
    public Object gObject(){
        return this.info;
    }

    /**
     * 
     * @return la couleur du sommet
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * 
     * @return L'id du vertex
     */
    public int getId(){
        return this.id;
    }

    /**
     * Renvoie un sommet sous forme de String
     */
    public String toString(){
        return "C'est un sommet"; // 
    }



}