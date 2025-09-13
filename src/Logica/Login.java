package Logica;

import java.util.ArrayList;
import java.util.List;

public class Login {
    public final List<Usuario> usuarios = new ArrayList<>();

    public Login() {
        usuarios.add(new Usuario("Chantaku", "1234", "Marcelo"));
    }

    public String validarCredenciales(String u, String p) {
        for (Usuario i : usuarios) {
            if (i.validarCredenciales(u, p)) {
                return i.getNombre();
            }
        }
        return "";
    }
}


