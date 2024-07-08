/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_CuentasEmpresa;

import Control_Usuario.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *

 */
public class CuentasDAO {
    private File archivo;
    private String filename = "ControlBancos.txt";
        
    public CuentasDAO() {
        archivo = new File(filename);
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void CrearCuentas(Cuentas cuentas) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(cuentas.toCuentas());
            writer.newLine();
        }
    }

    public List<Cuentas> leerCuentas() throws IOException {
        List<Cuentas> cuentas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                cuentas.add(Cuentas.fromString(linea));
            }
        }
        return cuentas;
    }

    public void actualizarCuentas(String NombreCuenta, Cuentas nuevaCuenta) throws IOException {
        List<Cuentas> listaCuentas = leerCuentas();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Cuentas cuentas : listaCuentas) {
                if (cuentas.getCuenta().equals(nuevaCuenta)) {
                    writer.write(nuevaCuenta.toCuentas());
                } else {
                    writer.write(cuentas.toString());
                }
                writer.newLine();
            }
        }
    }

    public void eliminarCuenta(String NombreCuenta) throws IOException {
        List<Cuentas> listaCuentas = leerCuentas();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Cuentas cuentas : listaCuentas) {
                if (!cuentas.getCuenta().equals(NombreCuenta)) {
                    writer.write(cuentas.toString());
                    writer.newLine();
                }
            }
        }
    }        
}
