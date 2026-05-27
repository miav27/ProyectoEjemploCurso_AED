package ListasDoblesEnlazadas;
import java.io.Serializable;
public class Nodo implements Serializable{
  public Asistente asis;
  public Nodo sig;
  public Nodo ant;
  public Nodo(Asistente a){
      this.asis=a;
      ant=sig=null;
  }  
}
