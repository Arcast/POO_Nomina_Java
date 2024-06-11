/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Empleados;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*CRUD(Crear, Leer, actualizar, eliminar)*/
public class EmpleadoDAO {
    private File archivo; 
    private String filename = "ControlEmpleado.txt";/*es está declarando una variable de tipo String con el nombre "filename" 
    y se le está asignando el valor "ControlEmpleado.txt". */

    public EmpleadoDAO() {
        archivo = new File(filename);
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*el buffereWriter se utiliza para escribir texto en un archivo de texto 
    de manera eficiente y con rendimiento optimo. "FileWriter" 
    es una clase en Java que se utiliza para escribir datos en un archivo de texto. */
    public void crearEmpleado(Empleado empleado) throws IOException { 
        /*IOException es una excepción en Java que se lanza cuando ocurre un error 
        relacionado con la entrada o salida de datos, como leer o escribir en archivos*/
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(empleado.toString());
            writer.newLine();
        }
    }

    public List<Empleado> leerEmpleado() throws IOException {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                empleados.add(Empleado.fromString(linea));
            }
        }
        return empleados;
    }

    public void actualizarEmpleado(String IdEmpleado, Empleado nuevoEmpleado) throws IOException {
        List<Empleado> empleados = leerEmpleado();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Empleado empleado : empleados) {
                if (empleado.getIdEmpleado().equals(IdEmpleado)) {
                    writer.write(nuevoEmpleado.toString());
                } else {
                    writer.write(empleado.toString());
                }
                writer.newLine();
            }
        }
    }

    public void eliminarEmpleado(String IdEmpleado) throws IOException {
        List<Empleado> empleados = leerEmpleado();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Empleado empleado : empleados) {
                if (!empleado.getIdEmpleado().equals(IdEmpleado)) {
                    writer.write(empleado.toString());
                    writer.newLine();
                }
            }
        }
    }
}
  