
package Actividad_4_Grupal_Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        cilindro = new javax.swing.JButton();
        esfera = new javax.swing.JButton();
        piramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        cilindro.setText("Cilindro");
        cilindro.addActionListener(this::cilindroActionPerformed);

        esfera.setText("Esfera");
        esfera.addActionListener(this::esferaActionPerformed);

        piramide.setText("Piramide");
        piramide.addActionListener(this::piramideActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cilindro)
                .addGap(27, 27, 27)
                .addComponent(esfera)
                .addGap(27, 27, 27)
                .addComponent(piramide)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cilindro)
                    .addComponent(esfera)
                    .addComponent(piramide))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cilindroActionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent evt) {                                         
        VentanaCilindro ventanaCilindro = new VentanaCilindro();
        ventanaCilindro.setVisible(true);
        ventanaCilindro.setResizable(false);
    }                                        

    private void esferaActionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent evt) {                                       
        VentanaEsfera ventanaEsfera = new VentanaEsfera();
        ventanaEsfera.setVisible(true);
        ventanaEsfera.setResizable(false);
    }                                      

    private void piramideActionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent evt) {                                         
        VentanaPiramide ventanaPiramide = new VentanaPiramide();
        ventanaPiramide.setVisible(true);
        ventanaPiramide.setResizable(false);      
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cilindro;
    private javax.swing.JButton esfera;
    private javax.swing.JButton piramide;
    // End of variables declaration                   
}

