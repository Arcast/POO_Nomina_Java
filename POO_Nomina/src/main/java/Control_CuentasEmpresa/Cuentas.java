/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_CuentasEmpresa;

public class Cuentas {
    // Atributos privados de la clase
    private String NombreBanco; // Nombre del banco
    private String Cuenta; // Número de cuenta

    // Constructor de la clase que inicializa los atributos con los valores proporcionados
    public Cuentas(String NombreBanco, String Cuenta) {
        this.NombreBanco = NombreBanco; // Inicializa el nombre del banco
        this.Cuenta = Cuenta; // Inicializa el número de cuenta
    }
    
    // Método getter para obtener el nombre del banco
    public String getNombreBanco() {
        return NombreBanco;
    }

    // Método setter para establecer el nombre del banco
    public void setNombreBanco(String NombreBanco) {
        this.NombreBanco = NombreBanco;
    }

    // Método getter para obtener el número de cuenta
    public String getCuenta() {
        return Cuenta;
    }

    // Método setter para establecer el número de cuenta
    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    // Método que devuelve una representación de la cuenta en formato CSV
    public String toCuentas() {
        return NombreBanco + "," + Cuenta; // Devuelve los atributos separados por comas
    }

    // Método estático para crear un objeto Cuentas a partir de una cadena CSV
    public static Cuentas fromString(String linea) {
        // Divide la cadena de entrada linea en un arreglo de cadenas usando la coma como delimitador
        String[] partes = linea.split(",");
        // Crea y devuelve un nuevo objeto Cuentas usando las partes divididas de la cadena
        return new Cuentas(partes[0], partes[1]);
    }
}