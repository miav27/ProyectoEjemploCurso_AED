package ListasEnlazadas;
//libreria
import java.io.Serializable;
public class Nodo implements Serializable {
    public Empleado emp;
    public Nodo sig; // puntero (ref. a memoria)
    public Nodo(Empleado e){
        this.emp=e;
        this.sig=null;
    }    
}
