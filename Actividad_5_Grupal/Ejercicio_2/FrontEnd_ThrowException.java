package Actividad_5_Grupal.Ejercicio_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class FrontEnd_ThrowException extends JFrame implements ActionListener{
    private Container contenedor;

    //Nombre
    private JLabel lblNombre;
    private JTextField txtNombre;

    //Apellido
    private JLabel lblApellido;
    private JTextField txtApellido;

    //Edad
    private JLabel lblEdad;
    private JTextField txtEdad;

    //Boton Registrar
    private JButton btnRegistrar;
    private JLabel lblResultado;

    public FrontEnd_ThrowException() {
        iniciar();
        setTitle("Lanzando excepciones en Java");
        setSize(510, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    void iniciar(){
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(255, 255, 204));

        // Nombre
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 100, 30);
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 200, 30);
        
        // Apellido     
        lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(20, 60, 100, 30);
        txtApellido = new JTextField(); 
        txtApellido.setBounds(120, 60, 200, 30);

        // Edad
        lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(20, 100, 100, 30);
        txtEdad = new JTextField();
        txtEdad.setBounds(120, 100, 200, 30);

        // Boton Registrar
        btnRegistrar = new JButton("Registrar Vendedor");
        btnRegistrar.setBounds(120, 140, 200, 30);
        btnRegistrar.setBackground(new Color(204, 255, 204));
        btnRegistrar.addActionListener(this);

        // Etiqueta para mostrar el resultado
        lblResultado = new JLabel("");
        lblResultado.setBounds(20, 180, 460, 60);
        lblResultado.setVerticalAlignment(SwingConstants.TOP);
        lblResultado.setVisible(false); // Inicialmente oculto

        //Añadir componentes al contenedor
        contenedor.add(lblNombre);
        contenedor.add(txtNombre);
        contenedor.add(lblApellido);
        contenedor.add(txtApellido);
        contenedor.add(lblEdad);
        contenedor.add(txtEdad);
        contenedor.add(btnRegistrar);
        contenedor.add(lblResultado);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == btnRegistrar) {
            
            try {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
            
                // Crear el objeto vendedor
                Vendedor nuevoVendedor = new Vendedor(nombre, apellido);
                
                nuevoVendedor.setEdad(Integer.parseInt(txtEdad.getText())); // Asignar la edad

                // Mostrar el resultado
                lblResultado.setText("Vendedor registrado: " + nuevoVendedor.getNombre() + " " + nuevoVendedor.getApellido() + ", Edad: " + nuevoVendedor.getEdad());
                lblResultado.setVisible(true);
            } catch (NumberFormatException ex) {
                lblResultado.setText("Error: La edad debe ser un número válido.");
                lblResultado.setVisible(true);
            } catch (IllegalArgumentException ex) {
                lblResultado.setText("Error: " + ex.getMessage());
                lblResultado.setVisible(true);
            }
        }
    }
    
}
