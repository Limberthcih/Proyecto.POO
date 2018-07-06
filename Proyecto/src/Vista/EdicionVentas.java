/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
/**
 *
 * @author limberth
 */
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EdicionVentas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public EdicionVentas() {
        initComponents();
        
    }
    //----------------------
    public void activarCajaAgregarProducto(){
        jTextField4.setEnabled(true);
    }
    
    public void desactivarCajaAgregarProducto(){
        jTextField4.setEnabled(false);
    }
    
    public void resetCajaAgregarProducto(){
        jTextField4.setText("");
    }
    
    
    public void activarCajaEliminarProducto(){
        jTextField10.setEnabled(true);
    }
    
    public void desactivarCajaElminarProducto(){
        jTextField10.setEnabled(false);
    }
   
    public void resetCajaEliminarProducto(){
        jTextField10.setText("");
    }
   // --------------------------
    
    public void activarBotonAgregarProducto(){
        jButton2.setEnabled(true);
    }
    
    public void desactivarBotonAgregarProducto(){
        jButton2.setEnabled(false);
    }
    
    public void activarBotonEliminarProducto(){
        jButton5.setEnabled(true);
    }
    
    public void desactivarBotonElminarProducto(){
        jButton5.setEnabled(false);
    }
    //------------------
    
    public void agregarListenerBotonAceptar(ActionListener evento){
        jButton1.addActionListener(evento);
    }
   
    public void agregarListenerBotonAgregarProducto(ActionListener evento){
        jButton2.addActionListener(evento);
    }
   
    public void agregarListenerBotonEliminarProducto(ActionListener evento){
        jButton5.addActionListener(evento);
    }
   
    public void agregarListenerBotonBuscar(ActionListener evento){
        jButton3.addActionListener(evento);
    }
     
    public void agregarListenerBotonAceptarMejorCaso(ActionListener evento){
        jButton4.addActionListener(evento);
    }
   
    public void agregarListenerBotonAceptarErrorVenta(ActionListener evento){
        jButton7.addActionListener(evento);
    }
    
    public void agregarListenerBotonAceptarErrorCliente(ActionListener evento){
        jButton8.addActionListener(evento);
    }
    
    public void agregarListenerBotonAceptarErrorProducto(ActionListener evento){
        jButton9.addActionListener(evento);
    }
   //--------------------------
    public String obtenerClaveProductoAgregado(){
        return jTextField4.getText();
    } 
    
    public String obtenerClaveProductoEliminado(){
        return jTextField10.getText();
    } 

    public String obtenerRFC(){
       return jTextField5.getText();
    } 
    
    public String obtenerId(){
       return jTextField9.getText();
    } 
    
    //-------------------------
    public void establecerIdVenta(int numero){
        String contenido= "V"+numero; 
        this.jTextField5.setText(contenido);
    }
    
    public void establecerRFC(String contenido){
       this. jTextField5.setText(contenido);
    } 
    
    public void establecerRazonSocial(String contenido){
        this.jTextField6.setText(contenido);
    } 
    
    public void establecerDireccion(String contenido){
        this.jTextField7.setText(contenido);
    } 
    
    public void establecerTelefono(String contenido){
        this.jTextField8.setText(contenido);
    } 
    
    public void establecerSubtotal(String contenido){
        this.jTextField1.setText(contenido);
    } 
    
    public void establecerIVA(String contenido){
        this.jTextField2.setText(contenido);
    } 
    
    public void establecerTotal(String contenido){
        this.jTextField3.setText(contenido);
    } 
    
    public void establecerFecha(GregorianCalendar fecha){
        String contenido;
        contenido= fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR);
        jFormattedTextField1.setText(contenido);
    }
    
    //--------------------

    public void mostrarMensajeGuardado(){
        jDialog1.setVisible(true);
    }
    
    public void mostrarMensajeErrorVenta(){
        jDialog2.setVisible(true);
    }
    
     public void mostrarMensajeErrorCliente(){
        jDialog3.setVisible(true);
     }
        
    public void mostrarMensajeErrorProducto(){
        jDialog4.setVisible(true);
    }
    //---------------------
    
    public void ocultarMensajeGuardado(){
        jDialog1.setVisible(false);
    }
    
    public void ocultarMensajeErrorVenta(){
        jDialog2.setVisible(false);
    }
    
     public void ocultarMensajeErrorCliente(){
        jDialog3.setVisible(false);
     }
        
    public void ocultararMensajeErrorProducto(){
        jDialog4.setVisible(false);
    }
    
    
    //-----------------------
    
    public void ocultarCampos(){
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel12.setVisible(false);
        jFormattedTextField1.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField10.setVisible(false);
        jTable1.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton5.setVisible(false);
    }
    
    public void mostrarCampos(){
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel12.setVisible(true);
        jFormattedTextField1.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField10.setVisible(true);
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton5.setVisible(true);
    }
    //---------------------------
    public void deshabilitarBotonBuscar(){
        jButton3.setEnabled(false);
    }
    
    public void deshabilitarCajaId(){
        jTextField9.setEnabled(false);
    }
    
    public void habilitarBotonBuscar(){
        jButton3.setEnabled(true);
    }
    
    public void habilitarCajaId(){
        jTextField9.setEnabled(true);
    }
    //----------------------
    
    //-----------------------
    
   //* public void SetTabla(ArrayList<Venta> list){//aqui se agrega el nombre de la clase del modelo que se usará
    //    String Matriz[][]=new String[list.size()][1];
    //for (i=0;<list.size();i++){
        
    //}
   // }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(300, 200));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Venta editada.");

        jButton4.setText("Aceptar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jButton4))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialog2.setMinimumSize(new java.awt.Dimension(300, 200));
        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Venta no encontrada.");

        jButton7.setText("Aceptar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel13)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jDialog2.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialog3.setMinimumSize(new java.awt.Dimension(300, 200));
        jDialog3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Cliente no encontrado.");

        jButton8.setText("Dar de alta cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton8)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jDialog3.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialog4.setMinimumSize(new java.awt.Dimension(300, 200));
        jDialog4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Venta no encontrada.");

        jButton9.setText("Aceptar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel15)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jDialog4.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("RFC:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Datos del cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel6.setText("Razón social: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel8.setText("Teléfono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 670, 460));

        jButton1.setText("Guardar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, -1, -1));

        jLabel3.setText("Subtotal:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        jLabel2.setText("IVA\n");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, -1, -1));

        jLabel4.setText("Total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 80, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 80, -1));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 80, -1));

        jButton2.setText("+");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 40, -1));

        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 80, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, -1));

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 280, -1));

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 140, -1));

        jTextField8.setEditable(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Edición Venta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel10.setText("Id No.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 70, -1));

        jButton5.setText("-\n");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 40, -1));

        jTextField10.setEnabled(false);
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 80, -1));

        jLabel12.setText("Fecha:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/d"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 100, -1));

        jButton3.setText("Buscar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/515958.jpg"))); // NOI18N
        Fondo.setAutoscrolls(true);
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Fondo.setMaximumSize(new java.awt.Dimension(1400, 1080));
        Fondo.setMinimumSize(new java.awt.Dimension(1400, 1080));
        Fondo.setPreferredSize(new java.awt.Dimension(1400, 1080));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(EdicionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EdicionVentas vista= new EdicionVentas();
                vista.setVisible(true);
                vista.mostrarMensajeGuardado();
                
                //vista.cerrarVentana();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables


    
}
