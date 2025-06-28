package ejercicio4;


import javax.swing.*;
import java.awt.*;


public class FrontendApp extends JFrame {
    private JTextField tfNombreEquipo, tfUniversidad, tfLenguaje, tfTamano;
    private JButton btnCrearEquipo;

    private JTextField tfNombreProg, tfApellidosProg;
    private JButton btnAnadirProg;
    private JTextArea taListado;

    private EquipoMaratonProgramacion equipo;

    public FrontendApp() {
        super("Gestión de Equipo de Programación");
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setBackground(new Color(255, 255, 204));
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel panelEquipo = new JPanel(new GridLayout(5, 2, 5, 5));
        panelEquipo.setBorder(BorderFactory.createTitledBorder("Datos del Equipo"));
        panelEquipo.add(new JLabel("Nombre Equipo:"));
        tfNombreEquipo = new JTextField(); panelEquipo.add(tfNombreEquipo);
        tfNombreEquipo.setBackground(new Color(255, 255, 204));

        panelEquipo.add(new JLabel("Universidad:"));
        tfUniversidad = new JTextField(); panelEquipo.add(tfUniversidad);
        tfUniversidad.setBackground(new Color(255, 255, 204));


        panelEquipo.add(new JLabel("Lenguaje de programación:"));
        tfLenguaje = new JTextField(); panelEquipo.add(tfLenguaje);
        tfLenguaje.setBackground(new Color(255, 255, 204));


        panelEquipo.add(new JLabel("Tamaño Equipo:"));
        tfTamano = new JTextField(); panelEquipo.add(tfTamano);
        tfTamano.setBackground(new Color(255, 255, 204));

        btnCrearEquipo = new JButton("Crear Equipo");
        panelEquipo.add(btnCrearEquipo);

        add(panelEquipo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new BorderLayout());
        taListado = new JTextArea(); taListado.setEditable(false);
        panelCentral.add(new JScrollPane(taListado), BorderLayout.CENTER);

        JPanel panelProg = new JPanel(new GridLayout(3, 2, 5, 5));
        panelProg.setBorder(BorderFactory.createTitledBorder("Agregar Programador"));
        panelProg.add(new JLabel("Nombre:"));
        tfNombreProg = new JTextField(); panelProg.add(tfNombreProg);
        panelProg.add(new JLabel("Apellidos:"));
        tfApellidosProg = new JTextField(); panelProg.add(tfApellidosProg);
        btnAnadirProg = new JButton("Añadir"); panelProg.add(btnAnadirProg);
        panelCentral.add(panelProg, BorderLayout.SOUTH);

        add(panelCentral, BorderLayout.CENTER);

        btnCrearEquipo.addActionListener(e -> crearEquipo());
        btnAnadirProg.addActionListener(e -> anadirProgramador());

        setPanelProgramadoresEnabled(false);
    }


    //para poder activar la opción de agregar a más integrantes del equipo
    //una vez se haya definidio el equiipo :v
    private void setPanelProgramadoresEnabled(boolean enabled) {
        tfNombreProg.setEnabled(enabled);
        tfApellidosProg.setEnabled(enabled);
        btnAnadirProg.setEnabled(enabled);
    }

    private void crearEquipo() {
        try {
            String nombre = tfNombreEquipo.getText().trim();
            String uni = tfUniversidad.getText().trim();
            String lang = tfLenguaje.getText().trim();
            int size = Integer.parseInt(tfTamano.getText().trim());

            if (size <= 0) throw new NumberFormatException();

            equipo = new EquipoMaratonProgramacion(nombre, uni, lang, size);
            JOptionPane.showMessageDialog(this, "Equipo creado correctamente!");

            btnCrearEquipo.setEnabled(false);
            tfNombreEquipo.setEnabled(false);
            tfUniversidad.setEnabled(false);
            tfLenguaje.setEnabled(false);
            tfTamano.setEnabled(false);
            setPanelProgramadoresEnabled(true);
            actualizarListado();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El tamaño del equipo debe ser un número entero positivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void anadirProgramador() {
        try {
            String nombre = tfNombreProg.getText().trim();
            String apellidos = tfApellidosProg.getText().trim();
            Programador p = new Programador(nombre, apellidos);
            equipo.anadirProgramador(p);
            actualizarListado();
            tfNombreProg.setText("");
            tfApellidosProg.setText("");
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Equipo Completo", JOptionPane.WARNING_MESSAGE);
            setPanelProgramadoresEnabled(false);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de Validación", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarListado() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: ").append(equipo.getNombreEquipo()).append("\n");
        sb.append("Universidad: ").append(equipo.getUniversidad()).append("\n");
        sb.append("Lenguaje: ").append(equipo.getLenguajeProgramacion()).append("\n");
        sb.append("Miembros (" + equipo.getContador() + "/" + equipo.getTamanoEquipo() + "):\n");
        for (Programador prog : equipo.getProgramadores()) {
            sb.append("- ").append(prog.getNombre()).append(" ").append(prog.getApellidos()).append("\n");
        }
        taListado.setText(sb.toString());
    }

}

