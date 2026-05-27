package Principal;
import Controlador.*;
import Vista.*;
import javax.swing.JFrame;
public class Main {
    public static void main(String args[]){
        FrmMenu fm = new FrmMenu();
        ControlMenu cm = new ControlMenu(fm);
        fm.setTitle("Menu de temas de AED....");
        fm.setVisible(true);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
