package Actividad_5_Grupal.Ejercicio_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class FrontEnd_Excepciones extends JFrame implements ActionListener {

    // Componentes de la interfaz
    private Container contenedor;

    // Array para almacenar objetos (simulando una lista)
    private final Object[] listaObjetos = new Object[10];
    private int indiceLista = 0; // Para saber dónde insertar el siguiente objeto
    
    // 1) División
    private JLabel lblPrimerTry;
    private JTextField txtNumerador, txtDenominador;
    private JButton btnDividir;
    private JLabel lblResultado;

    // 2) Segundo try–catch–finally
    private JLabel lblSegundoTry;
    private JTextField txtObjeto;
    private JButton btnEjecutarSegundo;
    private JLabel lblSegundoResultado;

    public FrontEnd_Excepciones() {
        iniciarComponentes();
        setTitle("Excepciones en Java");
        setSize(510, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void iniciarComponentes() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(255, 255, 204));

        /* ===== Sección 1 : División ===== */
        lblPrimerTry = new JLabel("<html>Ingrese<br>numerador y denominador</html>");
        lblPrimerTry.setBounds(20, 20, 180, 40);

        txtNumerador = new JTextField();
        txtNumerador.setBounds(220, 20, 100, 23);

        txtDenominador = new JTextField();
        txtDenominador.setBounds(330, 20, 100, 23);

        btnDividir = new JButton("Dividir");
        btnDividir.setBounds(220, 60, 100, 25);
        btnDividir.setBackground(new Color(204, 255, 204));
        btnDividir.addActionListener(this);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 95, 460, 60);
        lblResultado.setVerticalAlignment(SwingConstants.TOP);

        /* ===== Sección 2 : Objeto nulo ===== */
        lblSegundoTry = new JLabel("Añade un Objeto a la lista:");
        lblSegundoTry.setBounds(20, 200, 250, 23); // antes: 160

        txtObjeto = new JTextField();
        txtObjeto.setBounds(20, 230, 200, 23); // antes: 190

        btnEjecutarSegundo = new JButton("Añadir Objeto");
        btnEjecutarSegundo.setBounds(280, 200, 100, 25); // antes: 160
        btnEjecutarSegundo.setBackground(new Color(204, 255, 204));
        btnEjecutarSegundo.addActionListener(this);

        lblSegundoResultado = new JLabel("Lista:");
        lblSegundoResultado.setBounds(20, 260, 460, 140); // antes: 220, 100
        lblSegundoResultado.setVerticalAlignment(SwingConstants.TOP);

        /* ===== Añadir al contenedor ===== */
        contenedor.add(lblPrimerTry);
        contenedor.add(txtNumerador);
        contenedor.add(txtDenominador);
        contenedor.add(btnDividir);
        contenedor.add(lblResultado);

        contenedor.add(lblSegundoTry);
        contenedor.add(btnEjecutarSegundo);
        contenedor.add(lblSegundoResultado);
        contenedor.add(txtObjeto);
    }

    /* ---------- Lógica de botones ---------- */
    @Override
    public void actionPerformed(ActionEvent e) {
        /* --- Botón “Dividir” --- */
        if (e.getSource() == btnDividir) {
            StringBuilder sb = new StringBuilder("<html>");
            try {
                double num = Double.parseDouble(txtNumerador.getText());
                double den = Double.parseDouble(txtDenominador.getText());

                if (den == 0.0) {
                    sb.append("Error:<br>División por cero.");
                } else {
                    double res = num / den;
                    sb.append("Resultado:<br>" + String.format("%.2f", res));
                }
            } catch (NumberFormatException ex) {
                sb.append("Error:<br>Ingrese números válidos.");
            } finally {
                sb.append("<br>Ingresando al primer Finally.");
            }
            sb.append("</html>");
            lblResultado.setText(sb.toString());
        }

        /* --- Botón “Ejecutar” segundo try‑catch --- */
        if (e.getSource() == btnEjecutarSegundo) {
            StringBuilder sb = new StringBuilder("<html>");
            try {
                Object objeto = txtObjeto.getText();
                if (objeto.equals("")){
                    objeto = null; // Simulando un objeto nulo
                }
                objeto.toString(); // lanza NullPointerException
                if (indiceLista < listaObjetos.length) {
                    listaObjetos[indiceLista] = objeto;
                    indiceLista++;
                    sb.append("Objeto añadido correctamente<br>");
                } else {
                    sb.append("La lista está llena<br>");
                }
            } catch (ArithmeticException ex) {
                sb.append("División por cero<br>");
            } catch (Exception ex) {
                sb.append("Ocurrió una excepción: ")
                .append(ex.getClass().getSimpleName())
                .append("<br>");
            } finally {
                sb.append("Lista actual:<br>");
                for (int i = 0; i < indiceLista; i++) {
                    sb.append((i + 1) + ". " + listaObjetos[i] + " ");
                }
                sb.append("<br>Ingresando al segundo finally");
            }
            sb.append("</html>");
            lblSegundoResultado.setText(sb.toString());
        }
    }
    /* ---------- Método principal ---------- */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrontEnd_Excepciones().setVisible(true));
    }
}
