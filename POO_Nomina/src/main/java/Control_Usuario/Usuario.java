/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Usuario;

/** 
 *
 *
 */
public class Usuario {
    private String NombreUsuario;
    private String Contrasena;

    /** El constructor inicializa los atributos NombreUsuario 
 * y Contrasena con los valores proporcionados como argumentos.*/
   public Usuario(String NombreUsuario, String Contrasena){
       this.NombreUsuario = NombreUsuario;
       this.Contrasena = Contrasena;
   }
    
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        this.Contrasena = contrasena;
    }

   
    public String toString() {//nombre no realiza el metodo tostring
        return NombreUsuario + "," + Contrasena;
    }

    public static Usuario fromString(String linea) {
        String[] partes = linea.split(",");/*Divide la cadena de entrada linea 
                                             en un arreglo de cadenas usando la 
                                             coma como delimitador.*/
        return new Usuario(partes[0], partes[1]);
        /*Crea y devuelve un nuevo objeto Usuario usando las partes divididas de la cadena.*/
    }
    
    
}
