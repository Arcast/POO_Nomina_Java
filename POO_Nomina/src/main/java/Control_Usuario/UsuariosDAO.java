/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase UsuariosDAO para manejar operaciones CRUD en un archivo de texto
 */
public class UsuariosDAO {
    private File archivo; // Archivo donde se guardarán los usuarios
    private String filename = "ControlUsuario.txt"; // Nombre del archivo

    // Constructor de la clase UsuariosDAO
    public UsuariosDAO() {
        archivo = new File(filename); // Inicializa el objeto File con el nombre del archivo
        try {
            // Si el archivo no existe, se crea uno nuevo
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción en caso de error al crear el archivo
        }
    }
    
    // Método para crear (agregar) un nuevo usuario al archivo
    public void crearUsuario(Usuario usuario) throws IOException {
        // Usando try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(usuario.toString()); // Escribe el usuario en el archivo en formato de cadena
            writer.newLine(); // Agrega una nueva línea
        }
    }

    // Método para leer todos los usuarios del archivo
    public List<Usuario> leerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>(); // Lista para almacenar los usuarios leídos
        // Usando try-with-resources para asegurar que el BufferedReader se cierre correctamente
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Lee cada línea del archivo y convierte a objeto Usuario
            while ((linea = reader.readLine()) != null) {
                usuarios.add(Usuario.fromString(linea));
            }
        }
        return usuarios; // Devuelve la lista de usuarios
    }

    // Método para actualizar un usuario en el archivo
    public void actualizarUsuario(String NombreUsuario, Usuario nuevoUsuario) throws IOException {
        List<Usuario> usuarios = leerUsuarios(); // Lee todos los usuarios
        // Usando try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Usuario usuario : usuarios) {
                // Si el nombre del usuario actual coincide con el que se desea actualizar, escribe la nueva información
                if (usuario.getNombreUsuario().equals(NombreUsuario)) {
                    writer.write(nuevoUsuario.toString());
                } else {
                    // Si no, escribe el usuario tal cual está
                    writer.write(usuario.toString());
                }
                writer.newLine(); // Agrega una nueva línea
            }
        }
    }

    // Método para eliminar un usuario del archivo
    public void eliminarUsuario(String NombreUsuario) throws IOException {
        List<Usuario> usuarios = leerUsuarios(); // Lee todos los usuarios
        // Usando try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Usuario usuario : usuarios) {
                // Si el nombre del usuario actual no coincide con el que se desea eliminar, se escribe en el archivo
                if (!usuario.getNombreUsuario().equals(NombreUsuario)) {
                    writer.write(usuario.toString());
                    writer.newLine(); // Agrega una nueva línea
                }
            }
        }
    }
}