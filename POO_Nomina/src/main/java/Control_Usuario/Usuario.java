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
    private String IdTrabajador;
    private String NombreUsuario;
    private String Contrasena;

   public Usuario(String IdTrabajador, String NombreUsuario, String Contrasena){
       this.IdTrabajador = IdTrabajador;
       this.NombreUsuario = NombreUsuario;
       this.Contrasena = Contrasena;
   }
   
    public String getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(String IdTrabajador) {
        this.IdTrabajador = IdTrabajador;
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
        return IdTrabajador + "," + NombreUsuario + "," + Contrasena;
    }

    public static Usuario fromString(String linea) {
        String[] partes = linea.split(",");
        return new Usuario(partes[0], partes[1], partes[2]);
    }
    
    
}
