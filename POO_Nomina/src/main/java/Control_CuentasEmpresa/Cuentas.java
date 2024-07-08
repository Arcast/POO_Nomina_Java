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
public class Cuentas {
    private String NombreBanco;
    private String Cuenta;


   public Cuentas(String NombreBanco, String Cuenta){
       this.NombreBanco = NombreBanco;
       this.Cuenta = Cuenta;
   }
    
    public String getNombreBanco() {
        return NombreBanco;
    }

    public void setNombreBanco(String NombreBanco) {
        this.NombreBanco = NombreBanco;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    public String toCuentas() {
        return NombreBanco + "," + Cuenta;
    }

    public static Cuentas fromString(String linea) {
        String[] partes = linea.split(",");/*Divide la cadena de entrada linea 
                                             en un arreglo de cadenas usando la 
                                             coma como delimitador.*/
        return new Cuentas(partes[0], partes[1]);
        /*Crea y devuelve un nuevo objeto Cuentas usando las partes divididas de la cadena.*/
    }
    
    
}
