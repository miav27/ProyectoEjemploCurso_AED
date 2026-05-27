package ListasDoblesEnlazadas;
import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ListaAsistentes implements Serializable {
   public Nodo ini;
   public Nodo fin;
   public ListaAsistentes(){
       ini=fin=null;
   }
   //metodo los datos del nodo en un tabla
   public void MostrarAsistentes(JTable tabla){
       String titulos[]= {"Nro","Codigo","Nombre","Area","Sueldo"};
       DefaultTableModel mt =  new DefaultTableModel(null,titulos);
       tabla.setModel(mt);     
       int num=0;
       for( Nodo aux=ini;aux!=null;aux=aux.sig){
           num++;
           mt.addRow(aux.asis.Registro(num));
       }//fin for
   }//fin metodo
   
   //metodo que busca una asistente en la lista doble
   public Nodo BuscarPorCodigo(String codbuscado){
       Nodo encontrado=ini;
       while(encontrado!=null){
           if(encontrado.asis.getCod().equalsIgnoreCase(codbuscado))
               return encontrado;
           encontrado=encontrado.sig;
       }//fin while
       return null; // solo si el codigo no existe
   }//fin metodo
   
   //metodo que elimina un nodo de la lista doble
   public void EliminarAsistente(Nodo actual){
       if(actual!=null){
           if(actual==ini){
               ini=actual.sig;
               if(actual.sig!=null)
                   actual.sig.ant=null;
           }else if(actual.sig!=null){
             actual.ant.sig = actual.sig;
             actual.sig.ant = actual.ant;
           }else{
               actual.ant.sig=null;
               fin=actual.ant;
           } //fin if
           actual=null;
       }//fin if
   }//fin metodo
   
   
   //metodo que inserta datos al final del nodo
   public void InsertarAsistente(Asistente asis){
       Nodo nuevo = new Nodo(asis);
       if(ini==null){
           ini=fin=nuevo;
       }else{
           nuevo.ant=fin;
           fin.sig=nuevo;
       }
       fin=nuevo;
       fin.sig=null;
   }//fin metodo
}//fin clase
