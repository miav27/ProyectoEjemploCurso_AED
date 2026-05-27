package Almacenamiento;
import ListasEnlazadas.*;
import Procesos.*;
import java.io.*;
public class AlmacenarEmpleado {
    public static String archivo="ListaEmpleados.bin";
    //guardando la lista de estudiante en un archivo binario
    public static void GuardarLista(ListaEmpleados le){
        try{
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos =  new ObjectOutputStream(fos);
            oos.writeObject(le);
            oos.close();            
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede guardar ");
        }
    }//fin metodo
   //recuperar los datos del archivo binario
    public static ListaEmpleados RecuperarLista(){
        ListaEmpleados lista=new ListaEmpleados();
        try{
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ListaEmpleados)ois.readObject();
            ois.close();            
        }catch(Exception ex){
          Mensajes.M1("ERROR no se puede recuperar estudiantes");
         }
        return lista;
    }    
}
