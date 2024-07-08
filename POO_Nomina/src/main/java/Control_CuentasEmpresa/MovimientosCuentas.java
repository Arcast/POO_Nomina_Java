/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_CuentasEmpresa;

import Control_Usuario.*;

/** 
 *
 *
 */
public class MovimientosCuentas {    
    private String NumeroCuenta;
    private String Creditos;
    private String Debitos;


   public MovimientosCuentas(String Cuenta, String Creditos, String Debitos){
       this.NumeroCuenta = Cuenta;
       this.Creditos = Creditos;
       this.Debitos = Debitos;
   }
 
    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String valor) {
        this.NumeroCuenta = valor;
    }
    
    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String Creditos) {
        this.Creditos = Creditos;
    }
    
    public String getDebitos() {
        return Debitos;
    }

    public void setDebitos(String Debitos) {
        this.Debitos = Debitos;
    }

    public String toMovimientosCuentas() {
        return NumeroCuenta + "," + Creditos + "," + Debitos;
    }

    public static MovimientosCuentas fromSplit(String linea) {
        String[] partes = linea.split(",");/*Divide la cadena de entrada linea 
                                             en un arreglo de cadenas usando la 
                                             coma como delimitador.*/
        return new MovimientosCuentas(partes[0], partes[1], partes[2]);
        /*Crea y devuelve un nuevo objeto Cuentas usando las partes divididas de la cadena.*/
    }
    
    
}
