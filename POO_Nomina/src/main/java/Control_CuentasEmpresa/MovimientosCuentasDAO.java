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
public class MovimientosCuentasDAO {
    private File archivo;
    private String filename = "MovimientoCuentas.txt";
        
    public MovimientosCuentasDAO() {
        archivo = new File(filename);
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();//diagnostica errores de una manera detallada
        }
    }
        
    public void CrearMovimientoCuentas(MovimientosCuentas movimientosCuentas) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(movimientosCuentas.toMovimientosCuentas());
            writer.newLine();
        }
    }

    public List<MovimientosCuentas> leerMovimientosCuentas() throws IOException {
        List<MovimientosCuentas> movimientosCuentas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                movimientosCuentas.add(MovimientosCuentas.fromSplit(linea));
            }
        }
        return movimientosCuentas;
    }

    public void actualizarMovimientosCuentas(String NumeroCuenta, MovimientosCuentas movimientosCuentas) throws IOException {
        List<MovimientosCuentas> movimientosCuenta = leerMovimientosCuentas();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (MovimientosCuentas movimientos : movimientosCuenta) {
                if (movimientos.getNumeroCuenta().equals(NumeroCuenta)) {
                    writer.write(movimientosCuentas.toMovimientosCuentas());
                } else {
                    writer.write(movimientosCuentas.toString());
                }
                writer.newLine();
            }
        }
    }

    public void eliminarMovimientoCuenta(String NumeroCuenta) throws IOException {
        List<MovimientosCuentas> movimientosCuenta = leerMovimientosCuentas();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (MovimientosCuentas movimientos : movimientosCuenta) {
                if (!movimientos.getNumeroCuenta().equals(NumeroCuenta)) {
                    writer.write(movimientos.toString());
                    writer.newLine();
                }
            }
        }
    }        
}
