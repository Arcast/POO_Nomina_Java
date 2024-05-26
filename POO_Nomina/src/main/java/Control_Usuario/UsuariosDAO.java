/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *

 */
public class UsuariosDAO {
    private File archivo;
    private String filename = "ControlUsuario.txt";
        
    public UsuariosDAO() {
        archivo = new File(filename);
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void crearUsuario(Usuario usuario) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(usuario.toString());
            writer.newLine();
        }
    }

    public List<Usuario> leerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                usuarios.add(Usuario.fromString(linea));
            }
        }
        return usuarios;
    }

    public void actualizarUsuario(String NombreUsuario, Usuario nuevoUsuario) throws IOException {
        List<Usuario> usuarios = leerUsuarios();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Usuario usuario : usuarios) {
                if (usuario.getNombreUsuario().equals(NombreUsuario)) {
                    writer.write(nuevoUsuario.toString());
                } else {
                    writer.write(usuario.toString());
                }
                writer.newLine();
            }
        }
    }

    public void eliminarUsuario(String NombreUsuario) throws IOException {
        List<Usuario> usuarios = leerUsuarios();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Usuario usuario : usuarios) {
                if (!usuario.getNombreUsuario().equals(NombreUsuario)) {
                    writer.write(usuario.toString());
                    writer.newLine();
                }
            }
        }
    }        
}
