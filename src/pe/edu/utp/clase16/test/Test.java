package pe.edu.utp.clase16.test;

import com.google.gson.Gson;
import pe.edu.utp.clase16.config.Conexion;
import pe.edu.utp.clase16.daolmpl.AutorDaolmpl;
import pe.edu.utp.clase16.daolmpl.LibroDaolmpl;
import pe.edu.utp.clase16.model.Libro;

/**
 *
 * @author admin
 */
public class Test {
    
 static AutorDaolmpl adi = new AutorDaolmpl();
static LibroDaolmpl ldao = new LibroDaolmpl(); 
 static Gson gson = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conexion();
        //listar2();
        //crear();
        //modificar();
        //read();
        eliminar();
    }
    
    static void conexion(){
        if(Conexion.getConex()!=null){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }    
    }
    static void listar(){
        System.out.println(gson.toJson(adi.readAll()));
    }
    static void listar2(){
        System.out.println(gson.toJson(ldao.readAll()));
    }
    static void crear(){
        System.out.println(ldao.create(new Libro(0,"Prueba",2022,315,1)));
    }
    static void modificar(){
        System.out.println(ldao.update(new Libro(2,"Prueba22",2020,320,1)));
    }
    static void read(){
        System.out.println(gson.toJson(ldao.read(2)));
    }
    static void eliminar(){
        System.out.println(ldao.delete(2));
    }
}
