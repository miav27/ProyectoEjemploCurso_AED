package Almacenamiento;
import java.io.*;
import EstructuraDinamica.*;
import Procesos.Mensajes;
public class AlmacenarEstudiante {
    public static String archivo="ListaEstudiante.bin";
    //guardando la lista de estudiante en un archivo binario
    public static void GuardarListaEst(ListaEstudiantes le){
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
    public static ListaEstudiantes RecuperarListaEst(){
        ListaEstudiantes lista=new ListaEstudiantes();
        try{
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ListaEstudiantes)ois.readObject();
            ois.close();            
        }catch(Exception ex){
          Mensajes.M1("ERROR no se puede recuperar estudiantes");
         }
        return lista;
    }
    
    
    
}//fin de la clase
