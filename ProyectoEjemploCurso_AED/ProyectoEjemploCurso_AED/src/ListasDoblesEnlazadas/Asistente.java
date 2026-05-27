package ListasDoblesEnlazadas;
import java.io.Serializable;
public class Asistente implements Serializable{
    private String cod;
    private String nom;
    private String are;
    private double sue;
    public Asistente(){}
    public Object[] Registro(int num){
        Object[] fila = {num,cod,nom,are,sue};
        return fila;
    }    
    //getter y setter
    public String getCod() {      return cod;    }
    public void setCod(String cod) {      this.cod = cod;    }
    public String getNom() {      return nom;    }
    public void setNom(String nom) {     this.nom = nom;    }
    public String getAre() {     return are;    }
    public void setAre(String are) {       this.are = are;    }
    public double getSue() {        return sue;    }
    public void setSue(double sue) {       this.sue = sue;    }    
}//fin de la clase
