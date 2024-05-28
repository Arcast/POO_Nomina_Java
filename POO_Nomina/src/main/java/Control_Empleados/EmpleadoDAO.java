/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Empleados;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    private File archivo;
    private String filename = "ControlEmpleado.txt";

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

    public void crearEmpleado(Empleado empleado) throws IOException {
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
  