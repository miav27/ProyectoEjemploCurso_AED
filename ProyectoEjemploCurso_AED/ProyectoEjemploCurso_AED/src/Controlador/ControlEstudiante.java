package Controlador;
//libreria
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import Procesos.*;
import Almacenamiento.*;
import EstructuraDinamica.*;
public class ControlEstudiante implements ActionListener {
    Forma01 vista;
    ListaEstudiantes Lista;
    int posicion;
    Estudiante est;
    public ControlEstudiante(Forma01 f){
        vista=f;
        Lista = new ListaEstudiantes();
        vista.btnRegistrar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        Lista =  AlmacenarEstudiante.RecuperarListaEst();
        ProcesosEstudiantes.MostrarDatos(vista.tblDatos,Lista);
    }
    
    private void ActualizarForma(){
        AlmacenarEstudiante.GuardarListaEst(Lista);
        ProcesosEstudiantes.LimpiarEntradas(vista);
        ProcesosEstudiantes.MostrarDatos(vista.tblDatos,Lista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnRegistrar){
            Estudiante est = ProcesosEstudiantes.LeerEstudiante(vista);
            Lista.AgregarEst(est);
            ActualizarForma();
            Mensajes.M1("Estudiante Registrado...");
        }
        if(e.getSource()==vista.btnConsultar){
            String dnibuscado = Mensajes.M2("Ingrese el dni a buscar");
            posicion = Lista.BuscarEst(dnibuscado);
            if(posicion==-1){
                Mensajes.M1("El dni "+dnibuscado+" no existe en la lista");
            }else{
                est = Lista.RecuperarEst(posicion);
                ProcesosEstudiantes.MostrarEstudianteEnForma(est, vista);
            }
        }
        if(e.getSource()==vista.btnActualizar){
            est = ProcesosEstudiantes.LeerEstudiante(vista);
            Lista.ActualizarEst(posicion, est);
            this.ActualizarForma();
        }
        if(e.getSource()==vista.btnEliminar){
            int respuesta = Mensajes.M3("Confirmar!!!","Deseas eliminar?");
            if(respuesta==0){ // el boton SI ==> 0
                Lista.EliminarEst(posicion);
                this.ActualizarForma();
            }
        }
    }    
}
