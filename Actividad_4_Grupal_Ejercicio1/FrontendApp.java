package Actividad_4_Grupal_Ejercicio1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public final class FrontendApp extends JFrame implements ActionListener {


    public Nota [] datos_notas = new Nota[5];

    //Atributos para los gráficos del Frontend
    private Container contenedor;

    private JLabel nota1, nota2, nota3, nota4, nota5, promedio,
            desviacion, mayor, menor;


    private JTextField campoNota1, campoNota2, campoNota3,
            campoNota4, campoNota5;

    private JButton calcular, limpiar;


    public FrontendApp(){

        //Instanciar las 5 notas
        for (int i = 0; i < 5; i++) {

            this.getDatos_notas()[i] = new Nota(0);

        }
        //Instanciar las 5 notas


        inicio();

        setTitle("Calculadora de Notas");
        setSize(510,420);
        setLocationRelativeTo(null);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


    }


    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(255, 255, 204));

        //Botones Nota 1
        nota1 = new JLabel();
        nota1.setText("Nota 1:");
        nota1.setBounds(20, 20, 135, 23);
        campoNota1 = new JTextField();
        campoNota1.setBounds(105, 20, 135, 23);
        //FIN Botones Nota 1


        //Botones Nota 2
        nota2 = new JLabel();
        nota2.setText("Nota 2:");
        nota2.setBounds(20, 50, 135, 23);
        campoNota2 = new JTextField();
        campoNota2.setBounds(105, 50, 135, 23);
        //FIN Botones Nota 2


        //Botones Nota 3
        nota3 = new JLabel();
        nota3.setText("Nota 3:");
        nota3.setBounds(20, 80, 135, 23);
        campoNota3 = new JTextField();
        campoNota3.setBounds(105, 80, 135, 23);
        //FIN Botones Nota 3



        //Botones Nota 4
        nota4 = new JLabel();
        nota4.setText("Nota 4:");
        nota4.setBounds(20, 110, 135, 23);
        campoNota4 = new JTextField();
        campoNota4.setBounds(105, 110, 135, 23);
        //FIN Botones Nota 4




        //Botones Nota 5
        nota5 = new JLabel();
        nota5.setText("Nota 5:");
        nota5.setBounds(20, 140, 135, 23);
        campoNota5 = new JTextField();
        campoNota5.setBounds(105, 140, 135, 23);
        //FIN Botones Nota 5


        //Botón calcular
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(20, 170, 100, 23);
        calcular.addActionListener(this);
        calcular.setBackground(new Color(200, 255, 200));
        //FIN Botón calcular


        //Botón limpiar
        limpiar = new JButton();
        limpiar.setText("Borrar todo");
        limpiar.setBounds(125, 170, 100, 23);
        limpiar.addActionListener(this);
        limpiar.setBackground(new Color(255, 51, 51));
        //FIN Botón calcular


        //Botón promedio
        promedio = new JLabel();
        promedio.setText("Promedio = ");
        promedio.setBounds(20, 210, 135, 23);
        //FIN Botón promedio


        //Botón desviacion
        desviacion = new JLabel();
        desviacion.setText("Desviación = ");
        desviacion.setBounds(20, 240, 200, 23);
        //FIN Botón desviacion



        //Botón mayor
        mayor = new JLabel();
        mayor.setText("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23);
        //FIN Botón mayor




        //Botón menor
        menor = new JLabel();
        menor.setText("Nota menor = ");
        menor.setBounds(20, 300, 120, 23);
        //FIN Botón menor


        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);
    }


    public Nota[] getDatos_notas() {
        return datos_notas;
    }

    public void setDatos_notas(Nota[] datos_notas) {
        this.datos_notas = datos_notas;
    }



 @Override
public void actionPerformed(ActionEvent evento) {

    if (evento.getSource() == calcular) {
        try {
            datos_notas[0].setValor(Double.parseDouble(campoNota1.getText()));
            datos_notas[1].setValor(Double.parseDouble(campoNota2.getText()));
            datos_notas[2].setValor(Double.parseDouble(campoNota3.getText()));
            datos_notas[3].setValor(Double.parseDouble(campoNota4.getText()));
            datos_notas[4].setValor(Double.parseDouble(campoNota5.getText()));

            promedio.setText("Promedio = " + String.format("%.2f",
                    Nota.calcular_promedio(datos_notas)));

            double desviacion_calculada = Nota.calcularDesviación(datos_notas);
            desviacion.setText("Desviación estándar = " + String.format("%.2f", desviacion_calculada));

            mayor.setText("Nota Mayor = " + String.format("%.2f", Nota.obtener_mayor_nota(datos_notas)));
            menor.setText("Valor menor = " + String.format("%.2f", Nota.obtener_menor_nota(datos_notas)));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa solo números válidos en todas las notas.",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    if (evento.getSource() == limpiar) {
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText("");
        promedio.setText("Promedio = ");
        desviacion.setText("Desviación = ");
        mayor.setText("Nota mayor = ");
        menor.setText("Nota menor = ");

        for (Nota nota : datos_notas) {
            nota.setValor(0);
        }
    }
}

}
