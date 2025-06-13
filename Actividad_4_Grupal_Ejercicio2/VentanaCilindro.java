package Actividad_4_Grupal_Ejercicio2;
import javax.swing.JOptionPane;
public class VentanaCilindro extends javax.swing.JFrame {

  
    public VentanaCilindro() {
        initComponents();
    }
                        
    private void initComponents() {

        radio = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cilindro");

        radio.setText("Radio Centimetros:");

        altura.setText("Altura:");

        campoRadio.addActionListener(this::campoRadioActionPerformed);

        calcular.setText("Calcular");
        calcular.addActionListener(this::calcularActionPerformed);

        volumen.setText("hola");

        superficie.setText("hola");

        atras.setText("Atras");
        atras.addActionListener(this::atrasActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(campoAltura)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(atras))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(superficie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(volumen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(atras))
                .addGap(28, 28, 28)
                .addComponent(volumen)
                .addGap(35, 35, 35)
                .addComponent(superficie)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void calcularActionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent evt) {                                         
// Se inicializan el radio y la altura del cilindro
        boolean error = false; /* Se inicializa variable para determinar si
        ocurre un error */
        double radioValor;
        double alturaValor;
        try {
            // Se obtiene el radio del cilindro ingresado
            radioValor = Double.parseDouble(campoRadio.getText());
            // Se obtiene la altura del cilindro ingresada
            alturaValor = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(radioValor, alturaValor); /* Se crea un
            objeto Cilindro */
            // Se calcula y muestra el volumen
            volumen.setText("Volumen (cm3): " + String.format("%.2f",cilindro.calcularVolumen()));
            // Se calcula y muestra la superficie
            superficie.setText("Superficie (cm2): " + String.format("%.2f",cilindro.calcularSuperficie()));
            } 
        catch (NumberFormatException e){
            error = true; // Si ocurre una excepción
        } finally {
            if(error) { /* Si ocurre una excepción, se muestra un mensaje de error */
                JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero"," Error", JOptionPane.ERROR_MESSAGE);}}    
    }                                        

    private void campoRadioActionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void atrasActionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent evt) {                                      
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);       
    }                                     



    // Variables declaration - do not modify                     
    private javax.swing.JLabel altura;
    private javax.swing.JButton atras;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration                   
}
