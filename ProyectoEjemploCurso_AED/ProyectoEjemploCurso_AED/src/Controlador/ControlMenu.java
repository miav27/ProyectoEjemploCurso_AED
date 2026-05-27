package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JInternalFrame;
public class ControlMenu implements ActionListener{
     FrmMenu vista;
     public ControlMenu(FrmMenu fm){
         vista=fm;
         vista.itemArrayList.addActionListener(this);
         vista.itemListaEnlazada.addActionListener(this);
         
         vista.itemListaDobleEnlazada.addActionListener(this);
         
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.itemArrayList){
            Forma01 f = new Forma01();
            f.setTitle("REGISTRO DE ESTUDIANTES....");
            f.setVisible(true);           
            ControlEstudiante ce = new ControlEstudiante(f);
            MostrarInternalFrame(f);
        }
        if(e.getSource() == vista.itemListaEnlazada){
              FrmEmpleado fe =  new FrmEmpleado();
              fe.setTitle("Registro de Empleados....");
              ControlEmpleado ce = new ControlEmpleado(fe);
              MostrarInternalFrame(fe);
              fe.setVisible(true);            
        }
        
         if(e.getSource() == vista.itemListaDobleEnlazada){
              FrmAsistente fa =  new FrmAsistente();
              fa.setTitle("Registro de Asistente....");
              ControlAsistente ca = new ControlAsistente(fa);
              MostrarInternalFrame(fa);
              fa.setVisible(true);            
        }
        
        
        
        
        
    }//fin del action
    
    private void MostrarInternalFrame(JInternalFrame jif){
       
        vista.dspEscritorio.removeAll();
        vista.dspEscritorio.add(jif);   
        int x = (vista.dspEscritorio.getWidth() / 2) - (jif.getWidth() / 2);
        int y = (vista.dspEscritorio.getHeight() / 2) - (jif.getHeight() / 2);
        jif.setLocation(x, y);        
        vista.dspEscritorio.repaint();
        
    }      
}
