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
 * @author Yamil
 */
public class UsuariosDAO {
    private File archivo;
    
    public UsuariosDAO(String filename) {
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

    public void actualizarUsuario(String IdTrabajador, Usuario nuevoUsuario) throws IOException {
        List<Usuario> usuarios = leerUsuarios();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Usuario usuario : usuarios) {
                if (usuario.getIdTrabajador().equals(IdTrabajador)) {
                    writer.write(nuevoUsuario.toString());
                } else {
                    writer.write(usuario.toString());
                }
                writer.newLine();
            }
        }
    }

    public void eliminarUsuario(String IdTrabajador) throws IOException {
        List<Usuario> usuarios = leerUsuarios();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Usuario usuario : usuarios) {
                if (!usuario.getIdTrabajador().equals(IdTrabajador)) {
                    writer.write(usuario.toString());
                    writer.newLine();
                }
            }
        }
    }        
}
