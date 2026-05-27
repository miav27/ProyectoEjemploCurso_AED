package EstructuraDinamica;
import Modelo.Estudiante;
import java.io.Serializable;
import java.util.ArrayList;
public class ListaEstudiantes implements Serializable {
    private ArrayList<Estudiante> lista; 
    public ListaEstudiantes(){
        lista = new ArrayList();
    }
    
    //metodo que retorna la cantidad de objetos de la lista
    public int CantidadEst(){
        return lista.size();
    }
    
    
    
    //agregar
    public void AgregarEst(Estudiante est){
        lista.add(est);
    }
    //actualizar
    public void ActualizarEst(int pos,Estudiante nuevoest){
        lista.set(pos,nuevoest);
    }
    //eliminar
    public void EliminarEst(int pos){
        lista.remove(pos);
    }
    //recuperar
    public Estudiante RecuperarEst(int pos){
       return lista.get(pos); 
    }
    //buscar
    public int BuscarEst(String dnibuscado){
        for(int i=0;i<lista.size();i++){
            if(dnibuscado.equals(lista.get(i).getDni()))
                return i;
        }
        return -1;
    }
    //metodos getter y setter    
    public ArrayList<Estudiante> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    
    
    
}
