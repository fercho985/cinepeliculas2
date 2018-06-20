
package Clases;
import java.sql.ResultSet;
public class Usuarios {
 Conexion cn= new Conexion();
 
 public ResultSet usuariosRegistrados(){
     return cn.getValores("SELECT * FROM usuarios");
 }
}
