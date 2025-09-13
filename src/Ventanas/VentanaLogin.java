package Ventanas;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;

public class VentanaLogin {
    private final JFrame frameLogin = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave");
    private final JPasswordField txtClave = new JPasswordField("");
    private final JButton btnIngresar = new JButton("Ingresar");

    public VentanaLogin() {
        configuracionVentanaLogin();

    }

    public void botonesLogin() {

    }

    public void labelsLogin() {
        lblUsuario.setBounds(1,1,1,1);
    }

    public void textosLogin() {

    }

    public void configuracionVentanaLogin() {
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogin.setSize(700, 200);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setLayout(null);
        frameLogin.getContentPane().setBackground(new Color(50,50,50));
    }

    public void agregarVentanaLogin() {

    }

    public void mostrarVentanaLogin() {
        frameLogin.setVisible(true);
    }
}
