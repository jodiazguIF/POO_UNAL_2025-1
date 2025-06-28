package Ejercicio_3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FrontendApp  extends JFrame implements ActionListener{

    //Atributos para los gráficos del Frontend
    private Container contenedor;
    private JLabel numero_inicial, resultado_logaritmo, resultadp_raiz;
    private JTextField campo_numero_inicial;
    private JButton calcular, limpiar;


    public FrontendApp(){

        //Instanciar las 5 notas
        inicio();
        setTitle("Calculadora Logaritmo neperiano y raiz cuadrada");
        setSize(580,420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }


    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(255, 255, 204));
        //Número inicial ingresado
        numero_inicial = new JLabel();
        numero_inicial.setText("Ingreso un número:");
        numero_inicial.setBounds(20, 20, 135, 23);
        campo_numero_inicial = new JTextField();
        campo_numero_inicial.setBounds(135, 20, 135, 23);
        //FIN Número inicial ingresado


        //Lograritmo
        resultado_logaritmo = new JLabel();
        resultado_logaritmo.setText("");
        resultado_logaritmo.setBounds(20, 70, 480, 23);
        //FIN Lograritmo



        //resultadp_raiz
        resultadp_raiz = new JLabel();
        resultadp_raiz.setText("");
        resultadp_raiz.setBounds(20, 90, 480, 23);
        //Fin resultadp_raiz




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

        contenedor.add(numero_inicial);
        contenedor.add(campo_numero_inicial);
        contenedor.add(resultado_logaritmo);
        contenedor.add(resultadp_raiz);
        contenedor.add(calcular);
        contenedor.add(limpiar);


    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {

                Double valor_ingresado = Double.parseDouble(campo_numero_inicial.getText());
                Double lg_neperiano = CálculosNuméricos.calcularLogaritmoNeperiano(valor_ingresado);
                Double raiz = CálculosNuméricos.calcularRaízCuadrada(valor_ingresado);


                System.out.print(lg_neperiano);


                if (lg_neperiano != -404) {
                    resultado_logaritmo.setText("El logaritmo neperiano es: " + lg_neperiano);
                }

                else{
                    resultado_logaritmo.setText("Ingrese un número positivo, NO es posible calcular logaritmo a negativos");
                }

                if (raiz != -404) {
                    resultadp_raiz.setText("La raiz cuadrada es: " + raiz);
                }
                else {

                    resultadp_raiz.setText("Ingrese un número positivo, NO es posible calcular raiz a negativos");
                }



            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingresa un número válido mayor a cero.",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (evento.getSource() == limpiar) {

            campo_numero_inicial.setText("");
            resultadp_raiz.setText("");
            resultado_logaritmo.setText("");

        }
    }



}
