package Ventanas;

import Logica.Login;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin {
    private final JFrame frameLogin = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave");
    private final JPasswordField txtClave = new JPasswordField("");
    private final JButton btnIngresar = new JButton("Ingresar");


    public VentanaLogin() {
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogin.setSize(700, 300);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setLayout(null);
        frameLogin.getContentPane().setBackground(new Color(50,50,50));
        frameLogin.getRootPane().setDefaultButton(btnIngresar);

    }

    public void labelsLogin() {
        lblUsuario.setBounds(290, 30, 120, 25);
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 25));
        lblClave.setBounds(300,100,120,25);
        lblClave.setForeground(Color.WHITE);
        lblClave.setFont(new Font("Arial", Font.BOLD, 25));
    }

    public void textosLogin() {
        txtUsuario.setBounds(270,60,130,25);
        txtUsuario.setHorizontalAlignment(JTextField.CENTER);
        txtClave.setBounds(270,130,130,25);
        txtClave.setHorizontalAlignment(JTextField.CENTER);
    }

    public void botonesLogin() {
        btnIngresar.setBounds(290,170,90,25);
        btnIngresar.setBackground(new Color(39, 207, 96));
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.addActionListener(e -> verificacionLogin());


    }

    public void agregarVentanaLogin() {
        frameLogin.add(lblUsuario);
        frameLogin.add(txtUsuario);
        frameLogin.add(lblClave);
        frameLogin.add(txtClave);
        frameLogin.add(btnIngresar);
    }

    public void mostrarVentanaLogin() {
        labelsLogin();
        textosLogin();
        botonesLogin();
        agregarVentanaLogin();
        frameLogin.setVisible(true);
    }

    public void verificacionLogin() {
        Login login = new Login();
        String u = txtUsuario.getText().trim();
        String p = txtClave.getText().trim();
        String nombre = login.validarCredenciales(u,p);

        if (nombre.isEmpty()){
            JOptionPane.showMessageDialog(frameLogin,"Username y/o contraseña Incorrecta","intente nuevamente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frameLogin, "Bienvenuti " + nombre, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
