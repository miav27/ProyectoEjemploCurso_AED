package Ordenamiento;
import ListasEnlazadas.*;
public class OrdenarEmpleado {
    //metodo que ordena por nombre con el algoritmo de
    // seleccion la lista    
    public static ListaEmpleados PorNombre(ListaEmpleados a){
        Nodo k;
        for(Nodo i=a.ini;i!=null;i=i.sig){
            k=i;
            for(Nodo j=i.sig;j!=null;j=j.sig){
                if(j.emp.getNom().compareTo(k.emp.getNom())<0){
                    k=j;
                }
            }//fin 2do for
            Empleado aux=i.emp;
            i.emp=k.emp;
            k.emp=aux;
        }//fin 1er for
        return a;
    }//fin metodo    
}//fin class
