
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Tayro
 */
public class Carte {
    private ArrayList<Noeud> listePoints = new ArrayList<>();
    private HashMap<String, HashMap<String,Integer>> listeAdjacence = new HashMap<>();
    private ArrayList<Noeud> close = new ArrayList<>();
    private ArrayList<Noeud> open = new ArrayList<>();
    private ArrayList<String> ordreVisite = new ArrayList<>();
    private ArrayList<String> solution = new ArrayList<>();
    
    public Carte() {
    }
    
    public Carte(String filePath){
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = in.readLine()) != null )
            {
                if(line.toLowerCase().contains("noeuds")){
                    while ((line = in.readLine()) != null && !line.equals("") &&!line.toLowerCase().contains("adjacence"))
                    {
                        String[] point=line.split(",");
                        listePoints.add(new Noeud(point[0].trim(), Integer.parseInt(point[1].trim()))); 
                    }
                    System.out.println(listePoints);
                }
                if(line.toLowerCase().contains("adjacence")){
                    while ((line = in.readLine()) != null)
                    {
                        String tab[]= line.split(":");
                        String point = tab[0].trim();
                        String suivant[] = tab[1].trim().split(";");
                        HashMap<String,Integer> adjN = new HashMap<>();
                        for(int i=0; i<suivant.length; i++){
                            String suivInfo[] = suivant[i].split(",");
                            adjN.put(suivInfo[0].trim(),Integer.parseInt(suivInfo[1].trim()));
                        }
                        listeAdjacence.put(point, adjN);
                            
                    }
                    //System.out.println(contraintes);
                }
                
                
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("le fichier spécifié n'a pas été trouvé");
        }catch (IOException ex) {
            System.out.println("la lecture a échoué");
        }
    }
    
    public void initialisation(){
        listePoints.add(new Noeud("S",5));
        listePoints.add(new Noeud("A",2));
        listePoints.add(new Noeud("B",1));
        listePoints.add(new Noeud("C",3));
        listePoints.add(new Noeud("D",1));
        listePoints.add(new Noeud("E",6));
        listePoints.add(new Noeud("G1",0));
        listePoints.add(new Noeud("G2",0));
        System.out.println("Voici la liste des points");
        System.out.println(listePoints);
        
        HashMap<String,Integer> adjN = new HashMap<>();
        adjN.put("A",2);adjN.put("C",3);
        listeAdjacence.put("S", adjN);
        adjN = new HashMap<>();
        adjN.put("E",8);adjN.put("B",1);
        listeAdjacence.put("A", adjN);
        adjN = new HashMap<>();
        adjN.put("S",2); adjN.put("G1",4);adjN.put("D",1);adjN.put("C",1);
        listeAdjacence.put("B", adjN);
        adjN = new HashMap<>();
        adjN.put("D",1);adjN.put("G2",5);
        listeAdjacence.put("C", adjN);
        adjN = new HashMap<>();
        adjN.put("G1",5);adjN.put("G2",1);
        listeAdjacence.put("D", adjN);
        adjN = new HashMap<>();
        adjN.put("G1",9);adjN.put("G2",7);
        listeAdjacence.put("E", adjN);
        adjN = new HashMap<>();
        adjN.put("S",4);
        listeAdjacence.put("G1", adjN);
        adjN = new HashMap<>();
        listeAdjacence.put("G2", adjN);
        System.out.println("Ici la liste d'adjacence des points");
        System.out.println(listeAdjacence);
    }
    public void initialisation2(){
        listePoints.add(new Noeud("A",30));
        listePoints.add(new Noeud("B",26));
        listePoints.add(new Noeud("C",20));
        listePoints.add(new Noeud("D",21));
        listePoints.add(new Noeud("E",25));
        listePoints.add(new Noeud("F",10));
        listePoints.add(new Noeud("G",12));
        listePoints.add(new Noeud("H",8));
        listePoints.add(new Noeud("I",0));
        listePoints.add(new Noeud("J",5));
        System.out.println("Voici la liste des points");
        System.out.println(listePoints);
        
        HashMap<String,Integer> adjN = new HashMap<>();
        adjN = new HashMap<>();
        adjN.put("B",5);adjN.put("C",11);adjN.put("E",7);
        listeAdjacence.put("A", adjN);
        adjN = new HashMap<>();
        adjN.put("A",5);adjN.put("D",6);
        listeAdjacence.put("B", adjN);
        adjN = new HashMap<>();
        adjN.put("A",11);adjN.put("D",6);adjN.put("F",9);adjN.put("E",14);
        listeAdjacence.put("C", adjN);
        adjN = new HashMap<>();
        adjN.put("B",6);adjN.put("C",6);adjN.put("F",5);
        listeAdjacence.put("D", adjN);
        adjN = new HashMap<>();
        adjN.put("A",7);adjN.put("C",14);adjN.put("G",15);
        listeAdjacence.put("E", adjN);
        adjN = new HashMap<>();
        adjN.put("C",9);adjN.put("D",5);adjN.put("G",5);adjN.put("H",5);
        listeAdjacence.put("F", adjN);
        adjN = new HashMap<>();
        adjN.put("E",15);adjN.put("F",5);adjN.put("H",4);adjN.put("J",9);
        listeAdjacence.put("G", adjN);
        adjN = new HashMap<>();
        adjN.put("F",5);adjN.put("G",4);adjN.put("I",11);
        listeAdjacence.put("H", adjN);
        adjN = new HashMap<>();
        adjN.put("H",11);adjN.put("J",7);
        listeAdjacence.put("I", adjN);
        adjN = new HashMap<>();
        adjN.put("G",9);adjN.put("I",7);
        listeAdjacence.put("J", adjN);
        System.out.println("Ici la liste d'adjacence des points");
        System.out.println(listeAdjacence);
    }
    public ArrayList<Noeud> getListePoints() {
        return listePoints;
    }

    public void setListePoints(ArrayList<Noeud> listePoints) {
        this.listePoints = listePoints;
    }

    public HashMap<String, HashMap<String, Integer>> getListeAdjacence() {
        return listeAdjacence;
    }

    public void setListeAdjacence(HashMap<String, HashMap<String, Integer>> listeAdjacence) {
        this.listeAdjacence = listeAdjacence;
    }

    public ArrayList<Noeud> getClose() {
        return close;
    }

    public void setClose(ArrayList<Noeud> close) {
        this.close = close;
    }

    public ArrayList<Noeud> getOpen() {
        return open;
    }

    public void setOpen(ArrayList<Noeud> open) {
        this.open = open;
    }

    public ArrayList<String> getOrdreVisite() {
        return ordreVisite;
    }

    public void setOrdreVisite(ArrayList<String> ordreVisite) {
        this.ordreVisite = ordreVisite;
    }

    public ArrayList<String> getSolution() {
        return solution;
    }

    public void setSolution(ArrayList<String> solution) {
        this.solution = solution;
    }
    
    public Noeud getNoeudByName(String name){
        Noeud node=listePoints.get(0);
        int i=0;
        while(i<listePoints.size()&&!listePoints.get(i).getNom().equals(name) )
        {   
            i++;
        }
        node= listePoints.get(i);
        return node;
    }
    public void insertInOpen(Noeud node){
        
        boolean stop=false;
        int i=0;int position=0;
        if(open.isEmpty())open.add(node);
        else{
            while(stop == false && i<open.size()){
                if(open.get(i).getF()==node.getF()){
                    stop=true;
                    if(open.get(i).getNom().charAt(0) <= node.getNom().charAt(0))
                        position=i+1;//open.add(i+1,node);
                    else
                        position=i;//open.add(i,node);
                }else{
                    if(open.get(i).getF() > node.getF()){
                        position=i;//open.add(i,node);
                        stop=true;
                    }else{
                        i++;
                    }
                }
            }
            if(stop==true){
                open.add(position,node);
            }else open.add(node);
        }
        
    }
    public void coutUniforme(ArrayList<Noeud> listePoints, HashMap<String, HashMap<String,Integer>> listeAdjacence){
        close = new ArrayList<>();
        open = new ArrayList<>();
        ordreVisite = new ArrayList<>();
        solution = new ArrayList<>();
        //initialisation
        //close est l'ensemble vide
        // la fonction f(n) est égale g(n)
        for(int i=0;i<listePoints.size();i++){
            listePoints.get(i).setF(0);
        }
        
        Noeud firstNode =listePoints.get(0);
        int index;
        open.add(firstNode);
        HashMap<String, ArrayList<String>> chainage= new HashMap<>();
        ArrayList<String> successeurDeN=new ArrayList<>();
        successeurDeN.add(firstNode.getNom());
        chainage.put("init",successeurDeN);//initialisation du chainage
        boolean stop=false;
        //debut du traval
        while(stop==false)
        {   if(!open.isEmpty()){
                //System.out.println(open); //affichage de open pour voir si ca ce passe bien
                index=open.indexOf(getPetitF(open));
                //System.out.println("voici l'index"+index+getPetitF(open));
                Noeud choix=open.remove(index);
                
                //System.out.println(choix);
                ordreVisite.add(choix.getNom());
                close.add(choix);

                if(choix.getHeuristique()!=0){
                    HashMap<String,Integer> listeSuccesseur=listeAdjacence.get(choix.getNom());
                    //ce liste contient tous les noms des successeurs du noeud choix avec leur heuristique
                    //System.out.println(listeSuccesseur);
                    
                    if(!listeSuccesseur.isEmpty()){
                        //calcul pour chaque n de f(n)
                        Object[]liste=listeSuccesseur.keySet().toArray();//liste des noms des successeurs
                        int gpere=choix.getF();
                        //System.out.println("voici le g du pere "+choix.getNom()+" "+gpere);
                        successeurDeN=new ArrayList<>();//liste qui va contenir le chainage du noeud choix
                        for(int j=0;j<liste.length;j++){
                            String nodeName =(String)liste[j];
                            successeurDeN.add(nodeName);//ajout pour le chainage
                            Noeud node=new Noeud(nodeName,getNoeudByName(nodeName).getHeuristique()) ;
                            node.setF(0);
                            int cout=listeSuccesseur.get(nodeName);
                            int f=gpere+cout;
                            node.setF(f);
                            
                             //insertion dans open de maniere que open soit trié par ordre croissant
                            insertInOpen(node);
                            
                        }
                        
                        //faire le chainage
                        String nomChoix=choix.getNom();
                        if(chainage.containsKey(nomChoix))
                        {
                            successeurDeN.addAll(0,chainage.get(nomChoix));
                        }
                        chainage.put(nomChoix, successeurDeN);
                        //System.out.println(listePoints);
                        System.out.println("open"+ open);
                        System.out.println("close"+close);
                        
                    }

                }else{
                    System.out.println("la solution est là");
                    stop=true;
                    //construction de la solution
                    String cle=ordreVisite.get(ordreVisite.size()-1);
                    solution.add(cle);
                    while(!"init".equals(cle)){
                        cle=getCleFromChaine(chainage, cle);
                        solution.add(0,cle);
                    }
                    solution.remove("init");
                    System.out.println("\nLa liste des noeuds visités est "+ordreVisite);
                    System.out.println("Le chemin de la solution "+solution);
                }

            }else{
                System.out.println("Echec: la solution n'existe pas");
                stop=true;
            }
        } 
    }
    
    public Noeud getPetitF(ArrayList<Noeud> liste){
        Noeud val= null;
        Noeud min = liste.get(0);
        for(int i=0;i<liste.size();i++){
            val = liste.get(i);
            if(val.getF()<min.getF()){
                min = val;
            }
        }
        return min;
    }
    
    public void algorithmeAetoile(ArrayList<Noeud> listePoints, HashMap<String, HashMap<String,Integer>> listeAdjacence){
        close = new ArrayList<>();
        open = new ArrayList<>();
        ordreVisite = new ArrayList<>();
        solution = new ArrayList<>();
        //initialisation
        //close est l'ensemble vide
        // la fonction f(n) est égale h(n)+cout_chemin
        
        Noeud firstNode =listePoints.get(0);
        int index;
        open.add(firstNode);
        HashMap<String, ArrayList<String>> chainage= new HashMap<>();
        ArrayList<String> successeurDeN=new ArrayList<>();
        successeurDeN.add(firstNode.getNom());
        chainage.put("init",successeurDeN);//initialisation du chainage
        boolean stop=false;
        //debut du traval
        while(stop==false)
        {   if(!open.isEmpty()){
                //System.out.println(open); //affichage de open pour voir si ca ce passe bien
                index=open.indexOf(getPetitF(open));
                //System.out.println("voici l'index"+index+getPetitF(open));
                Noeud choix=open.remove(index);
                
                //System.out.println(choix);
                ordreVisite.add(choix.getNom());
                close.add(choix);

                if(choix.getHeuristique()!=0){
                    HashMap<String,Integer> listeSuccesseur=listeAdjacence.get(choix.getNom());
                    //ce liste contient tous les noms des successeurs du noeud choix avec leur heuristique
                    //System.out.println(listeSuccesseur);
                    
                    if(!listeSuccesseur.isEmpty()){
                        //calcul pour chaque n de f(n)
                        Object[]liste=listeSuccesseur.keySet().toArray();//liste des noms des successeurs
                        HashMap<String,Integer> listeSuccesseurF=listeSuccesseur;
                        int gpere=choix.getF()-choix.getHeuristique();
                        //System.out.println("voici le g du pere "+choix.getNom()+" "+gpere);
                        successeurDeN=new ArrayList<>();//liste qui va contenir le chainage du noeud choix
                        for(int j=0;j<liste.length;j++){
                            String nodeName =(String)liste[j];
                            successeurDeN.add(nodeName);//ajout pour le chainage
                            Noeud node=getNoeudByName(nodeName);
                            int cout=listeSuccesseur.get(nodeName);
                            int f=gpere+cout+node.getHeuristique();//ligne de difference avec l'algo A où f=node.h
                            node.setF(f);
                            listeSuccesseurF.put(nodeName, f);
                            int t=listePoints.indexOf(node);
                            listePoints.set(t, node);
                            
                             //insertion dans open
                            if(!close.contains(node)&& !open.contains(node)){
                                open.add(node);
                            }
                            //mise a jour des successeurs dans close et open
                            if(open.contains(node))
                                open.set(open.indexOf(node), node);
                            if(close.contains(node))
                            {    
                                int position=close.indexOf(node);
                                if(node.getF()<close.get(position).getF())
                                {//on retire de close celui dont la valeur de f a diminué et le met dans close
                                    open.add(node);
                                    close.remove(position);
                                }
                                else
                                {
                                    close.set(position,node);
                                }
                            }
                        }
                        
                        //faire le chainage
                        String nomChoix=choix.getNom();
                        if(chainage.containsKey(nomChoix))
                        {
                            successeurDeN.addAll(0,chainage.get(nomChoix));
                        }
                        chainage.put(nomChoix, successeurDeN);
                        //System.out.println(listePoints);
                        System.out.println("open"+ open);
                        System.out.println("close"+close);
                        
                    }

                }else{
                    System.out.println("la solution est là");
                    stop=true;
                    //construction de la solution
                    String cle=ordreVisite.get(ordreVisite.size()-1);
                    solution.add(cle);
                    while(!"init".equals(cle)){
                        cle=getCleFromChaine(chainage, cle);
                        solution.add(0,cle);
                    }
                    solution.remove("init");
                    System.out.println("\nLa liste des noeuds visités est "+ordreVisite);
                    System.out.println("Le chemin de la solution "+solution);
                }

            }else{
                System.out.println("Echec: la solution n'existe pas");
                stop=true;
            }
        } 
    }
    
    public void algorithmeA(ArrayList<Noeud> listePoints, HashMap<String, HashMap<String,Integer>> listeAdjacence){
        close = new ArrayList<>();
        open = new ArrayList<>();
        ordreVisite = new ArrayList<>();
        solution = new ArrayList<>();
        //initialisation
        //close est l'ensemble vide
        // la fonction f(n) est égale h(n)+cout_chemin
        
        Noeud firstNode =listePoints.get(0);
        int index;
        open.add(firstNode);
        HashMap<String, ArrayList<String>> chainage= new HashMap<>();
        ArrayList<String> successeurDeN=new ArrayList<>();
        successeurDeN.add(firstNode.getNom());
        chainage.put("init",successeurDeN);//initialisation du chainage
        boolean stop=false;
        //debut du traval
        while(stop==false)
        {   if(!open.isEmpty()){
                //System.out.println(open); //affichage de open pour voir si ca ce passe bien
                index=open.indexOf(getPetitF(open));
                //System.out.println("voici l'index"+index+getPetitF(open));
                Noeud choix=open.remove(index);
                
                //System.out.println(choix);
                ordreVisite.add(choix.getNom());
                close.add(choix);

                if(choix.getHeuristique()!=0){
                    HashMap<String,Integer> listeSuccesseur=listeAdjacence.get(choix.getNom());
                    //ce liste contient tous les noms des successeurs du noeud choix avec leur heuristique
                    //System.out.println(listeSuccesseur);
                    
                    if(!listeSuccesseur.isEmpty()){
                        //calcul pour chaque n de f(n)
                        Object[]liste=listeSuccesseur.keySet().toArray();//liste des noms des successeurs
                        HashMap<String,Integer> listeSuccesseurF=listeSuccesseur;
                        int gpere=choix.getF()-choix.getHeuristique();
                        //System.out.println("voici le g du pere "+choix.getNom()+" "+gpere);
                        successeurDeN=new ArrayList<>();//liste qui va contenir le chainage du noeud choix
                        for(int j=0;j<liste.length;j++){
                            String nodeName =(String)liste[j];
                            successeurDeN.add(nodeName);//ajout pour le chainage
                            Noeud node=getNoeudByName(nodeName);
                            int cout=listeSuccesseur.get(nodeName);
                            int f=node.getHeuristique();//algo A où f=node.h
                            node.setF(f);
                            listeSuccesseurF.put(nodeName, f);
                            int t=listePoints.indexOf(node);
                            listePoints.set(t, node);
                            
                             //insertion dans open
                            if(!close.contains(node)&& !open.contains(node)){
                                open.add(node);
                            }
                            //mise a jour des successeurs dans close et open
                            if(open.contains(node))
                                open.set(open.indexOf(node), node);
                            if(close.contains(node))
                            {    
                                int position=close.indexOf(node);
                                if(node.getF()<close.get(position).getF())
                                {//on retire de close celui dont la valeur de f a diminué et le met dans close
                                    open.add(node);
                                    close.remove(position);
                                }
                                else
                                {
                                    close.set(position,node);
                                }
                            }
                        }
                        
                        //faire le chainage
                        String nomChoix=choix.getNom();
                        if(chainage.containsKey(nomChoix))
                        {
                            successeurDeN.addAll(0,chainage.get(nomChoix));
                        }
                        chainage.put(nomChoix, successeurDeN);
                        //System.out.println(listePoints);
                        System.out.println("open"+ open);
                        System.out.println("close"+close);
                        
                    }

                }else{
                    System.out.println("la solution est là");
                    stop=true;
                    //construction de la solution
                    String cle=ordreVisite.get(ordreVisite.size()-1);
                    solution.add(cle);
                    while(!"init".equals(cle)){
                        cle=getCleFromChaine(chainage, cle);
                        solution.add(0,cle);
                    }
                    solution.remove("init");
                    System.out.println("\nLa liste des noeuds visités est "+ordreVisite);
                    System.out.println("Le chemin de la solution "+solution);
                }

            }else{
                System.out.println("Echec: la solution n'existe pas");
                stop=true;
            }
        } 
    }
    
    public String getCleFromChaine(HashMap<String, ArrayList<String>>  chaine, String visite){
        String val="pas trouve";int i=0;
        boolean trouve=false;
        String[] liste= chaine.keySet().toArray(new String[0]);
        String cle=liste[0];
        while(i<liste.length && trouve==false){
            cle=liste[i];
            if(chaine.get(cle).contains(visite))
            {
                trouve=true;
            }
            i++;
        }
        if(trouve)
            val=cle;
        return val;
    }
   
    public static void main(String []args){
        //Carte toto =new Carte("carte/graphe.txt");
        Carte toto = new Carte();
        toto.initialisation2();
        //toto.algorithmeA(toto.listePoints,toto.listeAdjacence);
        toto.coutUniforme(toto.listePoints,toto.listeAdjacence);
    }

}   
