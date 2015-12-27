/**
 *
 * @author Tayro
 */
public class Noeud {
    private String nom;
    private int heuristique;
    private int f;

    public Noeud(String nom, int heuristique) {
        this.nom = nom;
        this.heuristique = heuristique;
        this.f=heuristique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHeuristique() {
        return heuristique;
    }

    public void setHeuristique(int heuristique) {
        this.heuristique = heuristique;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
    
    
     public String toString(){
         return "("+nom+", "+f+")";
     }
    
}
