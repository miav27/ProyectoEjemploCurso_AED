package Procesos;
import Vista.*;
import Modelo.*;
import EstructuraDinamica.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ProcesosEstudiantes {
    //metodo que muestra en un table los datos de la lista
    public static void MostrarDatos(JTable tabla,ListaEstudiantes lista){
        String titulos[]={"Nro","Dni","Nombre","Nivel","Edad",
                          "Discapacidad","P. Inicial","Descuento","P.Final"};
        DefaultTableModel mt =  new DefaultTableModel(null,titulos);
        tabla.setModel(mt);
        for(int i=0;i<lista.CantidadEst();i++){
            mt.addRow(lista.RecuperarEst(i).Registro(i+1));
        }//fin for
    }//fin metodo
    //metodo que lee un estudiante
    public static Estudiante LeerEstudiante(Forma01 f){
        Estudiante est = new Estudiante();
        est.setDni(f.txtDni.getText());
        est.setNom(f.txtNombre.getText());
        est.setNivel(f.cbxNivel.getSelectedItem().toString());
        est.setEdad(Integer.parseInt(f.txtEdad.getText()));
        est.setDisc(f.cbxDiscapacidad.getSelectedItem().toString());
        return est;
    }//fin metodo
    
    //metodo que limpia las entradas
    public static void LimpiarEntradas(Forma01 f){
        f.txtDni.setText("");
        f.txtEdad.setText("");
        f.txtNombre.setText("");
        f.cbxNivel.setSelectedIndex(0);
        f.cbxDiscapacidad.setSelectedIndex(0);
        f.txtDni.requestFocus();
    }//fin metodo
    public static void MostrarEstudianteEnForma(Estudiante est,Forma01 f){
        f.txtDni.setText(est.getDni());
        f.txtNombre.setText(est.getNom());
        f.txtEdad.setText(String.valueOf(est.getEdad()));
        if(est.getNivel().equals("INICIAL")) f.cbxNivel.setSelectedIndex(0);
        else if(est.getNivel().equals("PRIMARIA")) f.cbxNivel.setSelectedIndex(1);
        else f.cbxNivel.setSelectedIndex(2);
        if(est.getDisc().equals("SI")) f.cbxDiscapacidad.setSelectedIndex(0);
        else f.cbxDiscapacidad.setSelectedIndex(1);
    }

    
}//fin de la clase
