package Modelo;
import java.io.Serializable;
public class Estudiante implements Serializable {
   private String dni;
   private String nom;
   private String nivel;
   private int edad;
   private String disc;
   public Estudiante(){}   
   public double Pension(){
      double pen = switch(nivel){
          case "INICIAL"-> 450;
          case "PRIMARIA"-> 450;
          case "SECUNDARIA"-> 450;    
          default-> 0;    
      };
      return pen;
   }
   public double Descuento(){
       return disc.equals("SI")?0.25*Pension():0;               
   }
   public double PensionFinal(){ return Pension()-Descuento(); }
   
   public Object[] Registro(int num){
       Object[] fila={num,dni,nom,nivel,edad,disc,
                     Pension(),Descuento(),PensionFinal()};
       return fila;
   }
   
   
   
   
   
   public String getDni() {   return dni;    }
   public void setDni(String dni) {   this.dni = dni;    }
   public String getNom() {    return nom;   }
   public void setNom(String nom) { this.nom = nom;    }
   public String getNivel() {   return nivel;    }
   public void setNivel(String nivel) {   this.nivel = nivel;    }
   public int getEdad() {   return edad;    }
   public void setEdad(int edad) {    this.edad = edad;    }
   public String getDisc() {     return disc;    }
   public void setDisc(String disc) { this.disc = disc;    }   
}//fin de la clase
