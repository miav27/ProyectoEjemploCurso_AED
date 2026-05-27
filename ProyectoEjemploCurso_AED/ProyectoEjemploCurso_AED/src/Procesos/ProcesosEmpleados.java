package Procesos;
import Vista.*;
import ListasEnlazadas.*;
public class ProcesosEmpleados {
    public static Empleado LeerEmp(FrmEmpleado fe){
        Empleado emp=new Empleado();
        emp.setCod(fe.txtCodigo.getText());
        emp.setNom(fe.txtNombre.getText());
        emp.setAre(fe.cbxArea.getSelectedItem().toString());
        emp.setSue(Double.parseDouble(fe.txtSueldo.getText()));
        return emp;
    }
    public static void LimpiarEntradas(FrmEmpleado fe){
        fe.txtCodigo.setText("");
        fe.txtNombre.setText("");
        fe.txtSueldo.setText("");
        fe.cbxArea.setSelectedIndex(0);
        fe.txtCodigo.requestFocus();
    }
    
    public static void MostrarEmpleado(Empleado emp,FrmEmpleado fe){
        fe.txtCodigo.setText(emp.getCod());
        fe.txtNombre.setText(emp.getNom());
        fe.txtSueldo.setText(String.valueOf(emp.getSue()));
        if(emp.getAre().equals("MARKETING")) fe.cbxArea.setSelectedIndex(0);
        else if(emp.getAre().equals("PLANILLAS")) fe.cbxArea.setSelectedIndex(1);
        else fe.cbxArea.setSelectedIndex(2); 
        fe.txtCodigo.requestFocus();
    }    
}//fin class
