
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tayro
 */
public class Fenetre extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        parcourir = new javax.swing.JButton();
        cheminTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        resoudre = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        solution = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        noeudVisites = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName("xxvxvxcv"); // NOI18N

        jLabel1.setText("Choisir le fichier qui contient les descriptions du graphe");

        parcourir.setText("Parcourir...");
        parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcourirActionPerformed(evt);
            }
        });

        cheminTf.setEditable(false);
        cheminTf.setBackground(new java.awt.Color(255, 255, 255));
        cheminTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheminTfActionPerformed(evt);
            }
        });

        jLabel2.setText("Choisir l'algorithme de recherche");

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cout Uniforme", "Algorithme A", "Algorithme A*" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        resoudre.setText("Resoudre");
        resoudre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resoudreActionPerformed(evt);
            }
        });

        jLabel3.setText("Liste des noeuds Visités");

        jLabel4.setText("La solution");

        solution.setEditable(false);
        solution.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        noeudVisites.setEditable(false);
        noeudVisites.setColumns(20);
        noeudVisites.setLineWrap(true);
        noeudVisites.setRows(5);
        jScrollPane2.setViewportView(noeudVisites);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 89, Short.MAX_VALUE)
                                .addComponent(cheminTf, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resoudre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parcourir)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parcourir)
                    .addComponent(cheminTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resoudre)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcourirActionPerformed
        filePath= selectFile();
        cheminTf.setText(filePath);
    }//GEN-LAST:event_parcourirActionPerformed
    public String selectFile(){
        String chemin="No selected File";
        try {
           String cn = UIManager.getSystemLookAndFeelClassName();
           UIManager.setLookAndFeel(cn); // Use the native L&F
       } catch (Exception cnf) {
       }
       JFileChooser dialogue = new JFileChooser(new File("."));
       PrintWriter sortie;
       File fichier;

       if (dialogue.showOpenDialog(null)== JFileChooser.APPROVE_OPTION) {
           fichier = dialogue.getSelectedFile();

           try {
                sortie = new PrintWriter(new FileWriter(fichier.getPath(), true));
                sortie.close();
                chemin =fichier.getAbsolutePath();
           } catch (IOException e) {
                   e.printStackTrace();
           }
       }
       return chemin;
    }
    private void cheminTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheminTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheminTfActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void resoudreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resoudreActionPerformed
        Carte carte = new Carte(filePath);
        algo=(String)combo.getSelectedItem();
        System.out.print(algo);
        switch (algo){
            case "Cout Uniforme":
                System.out.println("\t\t\nAlgorithme Cout Uniforme");
                    carte.coutUniforme(carte.getListePoints(), carte.getListeAdjacence());
                break;
            case "Algorithme A":
                System.out.println("\t\t\nAlgorithme A");
                    carte.algorithmeA(carte.getListePoints(), carte.getListeAdjacence());
                break;
            case "Algorithme A*":
                System.out.println("\t\t\nAlgorithme A etoile");
                carte.algorithmeAetoile(carte.getListePoints(), carte.getListeAdjacence());
                break;
            default:
                System.out.println("L'algorithme choisi est incorrect");
        }
        String listenoeud =carte.getOrdreVisite().toString();
        String listesolution=carte.getSolution().toString();
        solution.setText(listesolution.substring(1, listesolution.length()-1));
        noeudVisites.setText(listenoeud.substring(1, listenoeud.length()-1));
    }//GEN-LAST:event_resoudreActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        try {
           String cn = UIManager.getSystemLookAndFeelClassName();
           UIManager.setLookAndFeel(cn); // Use the native L&F
       } catch (Exception cnf) {
       }
        //</editor-fold>

        /* Create and display the form *
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }*/
    private String filePath;
    private String algo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cheminTf;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea noeudVisites;
    private javax.swing.JButton parcourir;
    private javax.swing.JButton resoudre;
    private javax.swing.JTextField solution;
    // End of variables declaration//GEN-END:variables
}
