package Ordenamiento;
import ListasDoblesEnlazadas.*;
public class OrdenarAsistente {    
    //metodo que ordena la listadoble por sueldo (algoritmo de inserción)
    public static ListaAsistentes PorSueldo(ListaAsistentes lista){
        for(Nodo i=lista.ini.sig;i!=null;i=i.sig){
            Asistente value=i.asis;
            Nodo j=i;
            while(j!=lista.ini && j.ant.asis.getSue()>value.getSue()){
                j.asis=j.ant.asis;
                j=j.ant;
            }//fin while
            j.asis=value;
        }//fin for
        return lista;
    }//fin metodo    
}//fin de la clase
