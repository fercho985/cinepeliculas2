
package Clases;
import java.sql.ResultSet;
public class Peliculas {
    Conexion cn=new Conexion();
    public ResultSet llenarPeliculas(){
        return cn.getValores("SELECT * FROM peliculas");
    }
    public void AgregarPeliculas(int idpelicula, String nombrepelicula){
     cn.UID("insert into peliculas(idpelicula,nombrepelicula) values ('"+idpelicula+"'','"+nombrepelicula+"')");
    }
     public ResultSet buscarPeliculas(String txtBuscar) {
        return (cn.getValores("SELECT * FROM peliculas  WHERE nombrepelicula LIKE '%"+txtBuscar+"%'"));
    }
    public ResultSet buscarId(String txtBuscar) {
        return (cn.getValores("SELECT * FROM peliculas  WHERE idpelicula='"+txtBuscar+"'"));
    }
   
}
