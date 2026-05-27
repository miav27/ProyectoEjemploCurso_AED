package Controlador;
//libreria
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ListasEnlazadas.*;
import Procesos.*;
import Vista.*;
import Almacenamiento.*;
import Ordenamiento.*;
public class ControlEmpleado implements ActionListener {
    FrmEmpleado vista;
    ListaEmpleados Lista;
    
    Nodo actual;
    
    public ControlEmpleado(FrmEmpleado fe){
        vista=fe;
        Lista = new ListaEmpleados();
        vista.btnInsertarFinal.addActionListener(this);
        vista.btnInsertarInicio.addActionListener(this);
        
        vista.btnConsultar.addActionListener(this);
        vista.btnElminar.addActionListener(this);
        vista.btnOrdernarPorNombre.addActionListener(this);
        
        
        Lista = AlmacenarEmpleado.RecuperarLista();
        Lista.MostrarDatos(vista.tblDatos);
    }//fin constructor   
    
    private void ActualizarForma(){
        ProcesosEmpleados.LimpiarEntradas(vista);
        Lista.MostrarDatos(vista.tblDatos);
        AlmacenarEmpleado.GuardarLista(Lista);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==vista.btnInsertarInicio){
              Empleado emp = ProcesosEmpleados.LeerEmp(vista);
              Nodo nuevo =  new Nodo(emp); //creamos el nodo con nuevo empleado
              Lista.AgregarInicio(nuevo);
              ActualizarForma();
          }
          if(e.getSource()==vista.btnInsertarFinal){
              Empleado emp = ProcesosEmpleados.LeerEmp(vista);
              Nodo nuevo =  new Nodo(emp); //creamos el nodo con nuevo empleado
              Lista.AgregarFinal(nuevo);
              ActualizarForma();
          }
          
          if(e.getSource()== vista.btnConsultar){
              String codbuscado = Mensajes.M2("Ingrese codigo a buscar");
              actual = Lista.BuscarEmpleado(codbuscado);
              if(actual==null){
                  Mensajes.M1("El codigo "+codbuscado+" no existe!");
              }else{
                  ProcesosEmpleados.MostrarEmpleado(actual.emp, vista);
              }
          }//fin btnConsulta   
          
          if(e.getSource()== vista.btnElminar){
              if(actual==null){
                  Mensajes.M1("No hay empleado seleccionado!!");
              }else{
                  Lista.EliminarEmpleado(actual);
                  Mensajes.M1("Empleado eliminado de la lista");
                  ActualizarForma();
              }
          }//fin btnEliminar
          
          if(e.getSource()== vista.btnOrdernarPorNombre){
              ListaEmpleados le = OrdenarEmpleado.PorNombre(Lista);
              le.MostrarDatos(vista.tblDatos);
          }//fin ordenar
          
    }//fin action    
}//fin de clase
