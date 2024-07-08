/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_CuentasEmpresa;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *

 */
// Definición de la clase CuentasDAO para manejar operaciones de archivo con objetos Cuentas
public class CuentasDAO {
    private File archivo; // Archivo donde se guardarán las cuentas
    private String filename = "ControlBancos.txt"; // Nombre del archivo

    // Constructor de la clase CuentasDAO
    public CuentasDAO() {
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
    
    // Método para crear (agregar) una nueva cuenta al archivo
    public void CrearCuentas(Cuentas cuentas) throws IOException {
        // Usando try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(cuentas.toCuentas()); // Escribe la cuenta en el archivo
            writer.newLine(); // Agrega una nueva línea
        }
    }

    // Método para leer todas las cuentas del archivo
    public List<Cuentas> leerCuentas() throws IOException {
        List<Cuentas> cuentas = new ArrayList<>(); // Lista para almacenar las cuentas leídas
        // Usando try-with-resources para asegurar que el BufferedReader se cierre correctamente
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Lee cada línea del archivo y convierte a objeto Cuentas
            while ((linea = reader.readLine()) != null) {
                cuentas.add(Cuentas.fromString(linea));
            }
        }
        return cuentas; // Devuelve la lista de cuentas
    }

    // Método para actualizar una cuenta en el archivo
    public void actualizarCuentas(String NombreCuenta, Cuentas nuevaCuenta) throws IOException {
        List<Cuentas> listaCuentas = leerCuentas(); // Lee todas las cuentas
        // Usando try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Cuentas cuentas : listaCuentas) {
                // Si la cuenta actual es la que se desea actualizar, escribe la nueva información
                if (cuentas.getCuenta().equals(NombreCuenta)) {
                    writer.write(nuevaCuenta.toCuentas());
                } else {
                    // Si no, escribe la cuenta tal cual está
                    writer.write(cuentas.toCuentas());
                }
                writer.newLine(); // Agrega una nueva línea
            }
        }
    }

    // Método para eliminar una cuenta del archivo
    public void eliminarCuenta(String NombreCuenta) throws IOException {
        List<Cuentas> listaCuentas = leerCuentas(); // Lee todas las cuentas
        // Usando try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Cuentas cuentas : listaCuentas) {
                // Si la cuenta actual no es la que se desea eliminar, se escribe en el archivo
                if (!cuentas.getCuenta().equals(NombreCuenta)) {
                    writer.write(cuentas.toCuentas());
                    writer.newLine(); // Agrega una nueva línea
                }
            }
        }
    }
}
        
     

