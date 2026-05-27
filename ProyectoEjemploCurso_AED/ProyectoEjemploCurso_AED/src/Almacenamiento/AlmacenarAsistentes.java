package Almacenamiento;
import ListasDoblesEnlazadas.*;
import Procesos.*;
import java.io.*;
public class AlmacenarAsistentes {
    public static String archivo="ListaAsistente.bin";
    //guardando la lista de estudiante en un archivo binario
    public static void GuardarLista(ListaAsistentes le){
        try{
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos =  new ObjectOutputStream(fos);
            oos.writeObject(le);
            oos.close();            
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede guardar asistentes");
        }
    }//fin metodo
   //recuperar los datos del archivo binario
    public static ListaAsistentes RecuperarLista(){
        ListaAsistentes lista=new ListaAsistentes();
        try{
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ListaAsistentes)ois.readObject();
            ois.close();            
        }catch(Exception ex){
          Mensajes.M1("ERROR no se puede recuperar Asistentes");
         }
        return lista;
    }    
}//fin de class
