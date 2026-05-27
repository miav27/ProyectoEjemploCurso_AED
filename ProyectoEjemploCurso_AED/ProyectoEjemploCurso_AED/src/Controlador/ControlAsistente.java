package Controlador;
//librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Almacenamiento.*;
import Vista.*;
import Procesos.*;
import ListasDoblesEnlazadas.*;
import Ordenamiento.*;
public class ControlAsistente implements ActionListener {
    ListaAsistentes Lista;
    Nodo actual;
    Asistente asis;
    FrmAsistente vista;
    public ControlAsistente(FrmAsistente fa){
        vista=fa;
        Lista =  new ListaAsistentes();
        vista.btnOrdenar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnRegistrar.addActionListener(this);
        Lista = AlmacenarAsistentes.RecuperarLista();
        Lista.MostrarAsistentes(vista.tblDatos);
    }
    private void ActualizarVista(){
        Lista.MostrarAsistentes(vista.tblDatos);
        AlmacenarAsistentes.GuardarLista(Lista);
        ProcesosAsistentes.LimpiarEntradas(vista);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource()== vista.btnRegistrar){
               asis =  ProcesosAsistentes.LeerDatos(vista);
               Lista.InsertarAsistente(asis);
               ActualizarVista();
               Mensajes.M1("Asistente registrado.....");
           }//fin registrar 
           if(e.getSource()==vista.btnConsultar){
               String cb = Mensajes.M2("Ingrese codigo a buscar..");
               actual = Lista.BuscarPorCodigo(cb);
               if(actual==null){
                   Mensajes.M1("Código "+cb+" no existe en la lista");
               }else{
                   ProcesosAsistentes.MostrarAsistente(actual.asis, vista);
               }
           }//fin consultar
           if(e.getSource() == vista.btnEliminar){
               int resp = Mensajes.M3("Confirmar!!!",
                           "Desea eliminar a "+actual.asis.getCod()+"?");
               if(resp==0){
                   Lista.EliminarAsistente(actual);
                   ActualizarVista();
                   Mensajes.M1("Registro eliminado...");
               }
           }//fin eliminar
           if(e.getSource()==vista.btnOrdenar){
               ListaAsistentes listaord = OrdenarAsistente.PorSueldo(Lista);
               listaord.MostrarAsistentes(vista.tblDatos);
           }
    }    
}
