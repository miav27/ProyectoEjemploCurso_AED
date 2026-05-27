package ListasEnlazadas;
//libreria
import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ListaEmpleados implements Serializable{
    public Nodo ini; // puntero al primer nodo de la lista
    public Nodo fin; // puntero al ultimo nodo de la lista
    public ListaEmpleados(){
        ini=fin=null;
    }
    //metodo que inserta al inicio de la lista un Nodo
    public void AgregarInicio(Nodo nuevo){
        if(ini==null && fin==null){// si la lista esta vacía
            ini=fin=nuevo; // ini y fin apunta la nuevo nodo
        }else{
            nuevo.sig=ini; // sig de puntero Nuevo apunte a ini
            ini=nuevo; // ini apunta donde apunta nuevo
        }
    }//fin del metodo
    // metodo que inserta al final de la lista un Nodo
    public void AgregarFinal(Nodo nuevo){
        if(ini==null && fin==null){
            ini=fin=nuevo;
        }else{
            fin.sig=nuevo;
        }
        fin=nuevo;
        fin.sig=null;
    }//fin del metodo
    //metodo que los datos de cada nodo en un JTable
    public void MostrarDatos(JTable tabla){
        String titulos[]={"Num","Codigo","Nombre","Area","Sueldo"};
        DefaultTableModel mt =  new DefaultTableModel(null,titulos);
        tabla.setModel(mt);
        Nodo aux=ini;
        int cont=0;
        while(aux!=null){ // que no este en final de la lista
            cont++;
            mt.addRow(aux.emp.Registro(cont));
            aux=aux.sig; //avanza al siguiente nodo de la lista
        }//fin while        
    }//fin metodo
    
    //metodo que busca un empleado por codigo y retorna su puntero
    public Nodo BuscarEmpleado(String codbuscado){
        Nodo aux=ini;
        while(aux!=null && !codbuscado.equals(aux.emp.getCod())){
            aux=aux.sig;
        }
        return aux;
    }//fin metodo
    
    //metodo que elimina el nodo de la lista
    public void EliminarEmpleado(Nodo actual){
        Nodo anterior = ini;
        while(anterior.sig!=actual && anterior.sig!=null){
            anterior=anterior.sig;
        }//fin while
        if(actual!=null){
            if(ini==actual){
                ini=actual.sig;
            }else{
                anterior.sig=actual.sig;
            }
        }//fin if        
    }//fin metodo
    
}//fin de clase
