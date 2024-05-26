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

    @Override
    public String toString() {
        return NombreUsuario + "," + Contrasena;
    }

    public static Usuario fromString(String linea) {
        String[] partes = linea.split(",");
        return new Usuario(partes[0], partes[1]);
    }
    
    
}
