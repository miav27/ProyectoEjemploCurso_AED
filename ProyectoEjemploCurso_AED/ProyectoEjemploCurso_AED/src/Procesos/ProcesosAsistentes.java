package Procesos;
import ListasDoblesEnlazadas.*;
import Vista.*;
public class ProcesosAsistentes {
    
    public static void LimpiarEntradas(FrmAsistente fa){
        fa.txtCodigo.setText("");
        fa.txtNombre.setText("");
        fa.cbxArea.setSelectedIndex(0);
        fa.txtSueldo.setText("");
        fa.txtCodigo.requestFocus();
    }
    
    public static Asistente LeerDatos(FrmAsistente fa){
        Asistente a = new Asistente();
        a.setCod(fa.txtCodigo.getText());
        a.setNom(fa.txtNombre.getText());
        a.setAre(fa.cbxArea.getSelectedItem().toString());
        a.setSue(Double.parseDouble(fa.txtSueldo.getText()));
        return a;
    }
    
   public static void MostrarAsistente(Asistente a,FrmAsistente fa){ 
       fa.txtCodigo.setText(a.getCod());
       fa.txtNombre.setText(a.getNom());
       fa.txtSueldo.setText(String.valueOf(a.getSue()));
       if(a.getAre().equals("VENTAS")) fa.cbxArea.setSelectedIndex(0);
       else if(a.getAre().equals("MARKETING")) fa.cbxArea.setSelectedIndex(1);
       else  fa.cbxArea.setSelectedIndex(2);
       fa.txtCodigo.requestFocus();       
   }
}
