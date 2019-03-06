
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author r618b
 */
public class WinDialogo extends Dialogo implements MetodosComunes {

 
    @Override
    public void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
