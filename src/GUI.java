/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI.java
 *
 * Created on 25-Dec-2010, 3:20:45 PM
 */


import java.awt.Color;

public class GUI extends javax.swing.JFrame {
    //Communicator object
    Communicator communicator = null;
    //KeybindingController object
    KeybindingController keybindingController = null;

    /** Creates new form GUI */
    public GUI() {
   //     initComponents();
    //    createObjects();
        communicator.searchForPorts();
    //    keybindingController.toggleControls();
        keybindingController.bindKeys();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  

 /*   private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        communicator.connect();
        if (communicator.getConnected() == true)
        {
            if (communicator.initIOStream() == true)
            {
                communicator.initListener();
            }
        }
    }*///GEN-LAST:event_btnConnectActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        communicator.disconnect();
    }//GEN-LAST:event_btnDisconnectActionPerformed
    
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConnect;
    public javax.swing.JButton btnDisconnect;
    public javax.swing.JButton btnLeftAccel;
    public javax.swing.JButton btnLeftDecel;
    public javax.swing.JButton btnRightAccel;
    public javax.swing.JButton btnRightDecel;
  
    public javax.swing.JLabel lblLeft;
    public javax.swing.JLabel lblRight;
    public javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}
