/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

/**
 *
 * @author limberth
 */
public class AltaProducto extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public AltaProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/github-256-black.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BarrrasInferior = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Título = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Clave = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 90, 20));

        BarrrasInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/franja1.png"))); // NOI18N
        getContentPane().add(BarrrasInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 390, 130));

        jLabel1.setText("Descripción:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Registrar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 20));

        Título.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Título.setText("Alta Producto");
        getContentPane().add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel4.setText("Cantidad en almacen:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, -1));

        jLabel5.setText("Precio unitario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 200, -1));
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, -1));

        jLabel2.setText("Clave:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 20));

        Clave.setEditable(false);
        getContentPane().add(Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 130, 100, -1));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/515958.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarrrasInferior;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Clave;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel Título;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

      
    public String obtenerDescripcion(){
        return Descripcion.getText();
    } 
    public String obtenerPrecio(){
      return Precio.getText();
    }
    public String obtenerCantidad(){
        return Cantidad.getText();
    }
       
    
    public void agregarListenerBotonRegistrar(ActionListener evento){
        jButton2.addActionListener(evento);
    }
   
   public void agregarListenerBotonCancelar(ActionListener evento){
        jButton1.addActionListener(evento);
    }

    
    public void establecerClave(int numero){
        String contenido= "P"+numero;
        Clave.setText(contenido);
    }  
   
   public void establecerDescripcion(String contenido){
        Descripcion.setText(contenido);
    } 
    
    public void establecerPrecio(String contenido){
        Precio.setText(contenido);
    }
    public void establecerCantidad(String contenido){
        Cantidad.setText(contenido);
    }

}