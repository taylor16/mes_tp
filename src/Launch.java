
public class Launch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nbarg=args.length;
        if(nbarg==4 && args[0].equals("-f")&& "-t".equals(args[2])){
            String filePath=args[1];
            String algo =args[3];
            Carte carte = new Carte(filePath);
            
            switch (algo){
                case "CU":
                    System.out.println("\t\t\nAlgorithme Cout Uniforme");
                        carte.coutUniforme(carte.getListePoints(), carte.getListeAdjacence());
                    break;
                case "A":
                    System.out.println("\t\t\nAlgorithme A");
                        carte.algorithmeA(carte.getListePoints(), carte.getListeAdjacence());
                    break;
                case "A*":
                    System.out.println("\t\t\nAlgorithme A etoile");
                    carte.algorithmeAetoile(carte.getListePoints(), carte.getListeAdjacence());
                    break;
                default:
                    System.out.println("L'algorithme choisi est incorrect");
           }
        
        }else{
            System.out.println("\n Ce Programme permet de trouver le chemin le plus court qu'il faut emprunter sur une"
                    + "carte contenant un point de de'part et d'arrive' en utilisant un algorithme de rechercche");
            System.out.println("\nUtilisation : -f source -t algo ");
            System.out.println("Options: ");
            System.out.println("\t-f source Permet de specifier le chemin du fichier contenant le CSP modelise'");
            System.out.println("\t-t algo   Indique le type d'algorithme qu'on va utiliser. Comme algo, il y a:");
            System.out.println("\t                  * CU: Cout uniforme");   
            System.out.println("\t                  * A: Algorithme A");
            System.out.println("\t                  * A*: Algorithme A etoile");   
        }
    }

}
