package Ingles;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasBD {
    
    MySqlBD baseDatos = new MySqlBD().conectar("localhost","Snake","root","");
    
    public ArrayList<Datos> consultarJugador(){
        ArrayList<Datos> result = new ArrayList<>();
        ResultSet rs = baseDatos.consultar("SELECT * FROM Usuarios");
        if(rs != null){
            try {
                while(rs.next()){
                    result.add(new Datos(rs.getInt("idJugador"),rs.getString("Nombre"),rs.getString("N_Usuario"),rs.getString("Password"),
                            rs.getInt("N_D_J"),rs.getInt("N_D_J_G"),rs.getInt("N_D_J_P")));
                }
            } catch(Exception e ) {
                 e.printStackTrace();
            }
        }
        return result;
    }
    
    public Datos buscarPorId(int id) {
        Datos pac = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM Usuarios where idJugador=" +id);
        if(rs != null){
            try {
                while(rs.next()){
                    pac = new Datos(rs.getInt("idJugador"),
                            rs.getString("Nombre"),
                            rs.getString("N_Usuario"),
                            rs.getString("Password"),
                            rs.getInt("N_D_J"),
                            rs.getInt("N_D_J_G"),
                            rs.getInt("N_D_J_P")
                    );
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return pac;
    }
    
     public Datos Login(String user) {
        Datos pac = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM Usuarios where N_Usuario='" +user+"'");
        if(rs != null){
            try {
                while(rs.next()){
                    pac = new Datos(rs.getInt("idJugador"),
                            rs.getString("Nombre"),
                            rs.getString("N_Usuario"),
                            rs.getString("Password"),
                            rs.getInt("N_D_J"),
                            rs.getInt("N_D_J_G"),
                            rs.getInt("N_D_J_P")
                    );
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return pac;
    }
    
     public NewInterface ConImagen(int id) {
        NewInterface ConImagen = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM Words where IdWord=" +id);
        if(rs != null){
            try {
                while(rs.next()){
                    ConImagen = new ConImagen(rs.getInt("IdWord"),rs.getString("Word")){};
                }
            } catch(Exception e) {
            }
        }
        return ConImagen;
    }
     
     public NewInterface SinImagen(int id) {
        NewInterface SinImagen = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM Words where IdWord=" +id);
        if(rs != null){
            try {
                while(rs.next()){
                    SinImagen = new SinImagen(rs.getInt("IdWord"),rs.getString("Word")){};
                }
            } catch(Exception e) {
            }
        }
        return SinImagen;
    }
     
    public void insertarJugador(int idJugador,String Nombre,String N_Usuario,String Password,
            int N_D_J,int N_D_J_G,int N_D_J_P) {
        if(baseDatos.ejecutar("INSERT INTO Usuarios VALUES('"+idJugador+"','"+Nombre+"', '"+N_Usuario+"', '"+Password+"','"+N_D_J+"', '"+N_D_J_G+"', "+ N_D_J_P+")")){
            System.out.println("Ejecucion correcta!");
        } else{
            System.out.println("Ocurrio un problema al insertar!");
        }
    }
    
    public void modificarJugador(int idJugador,String Nombre,String N_Usuario,String Password,
            int N_D_J,int  N_D_J_G,int N_D_J_P) {
        String sql = "UPDATE Usuarios SET Nombre= '"+ Nombre
                +"', N_Usuario= '"+N_Usuario
                +"', Password= '"+Password
                +"', N_D_J= '"+N_D_J
                +"', N_D_J_G= '"+N_D_J_G
                +"', N_D_J_P= "+N_D_J_P
                +" where idJugador="+idJugador;
        if(baseDatos.ejecutar(sql)){
            System.out.println("Ejecucion correcta!");
        } else {
            System.out.println("ocurrio un problema al modificar!");
        }
    }
    
    public void borrar(int idJugador) {
        if(baseDatos.ejecutar("DELETE FROM Usuarios WHERE"+"idJugador= "+ idJugador)){
            System.out.println("Ejecucion Correcta!");
        } else {
            System.out.println("Ocurrio un problema al borrar!");
        }
    }
}
