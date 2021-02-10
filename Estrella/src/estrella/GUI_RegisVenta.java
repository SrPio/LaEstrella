package estrella;

import static estrella.Conexion.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GUI_RegisVenta extends javax.swing.JFrame {

    public GUI_RegisVenta() {
        initComponents();
    }

    PreparedStatement ps, ps2;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegisVent = new javax.swing.JPanel();
        BtnRegisVent = new javax.swing.JButton();
        FieldCosto = new javax.swing.JTextField();
        FieldHora = new javax.swing.JTextField();
        FieldIdCliente = new javax.swing.JTextField();
        LabelCostoTotal = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelidCliente = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        FondoText5 = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        FieldFechaComp = new javax.swing.JTextField();
        FondoText6 = new javax.swing.JLabel();
        FieldCantidad = new javax.swing.JTextField();
        LabelCantidad = new javax.swing.JLabel();
        FondoText7 = new javax.swing.JLabel();
        IdProducto = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        FondoText9 = new javax.swing.JLabel();
        LabelCostoTotal1 = new javax.swing.JLabel();
        IdVenta = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LabelidVenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegisVent.setBackground(new java.awt.Color(248, 248, 248));
        PanelRegisVent.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRegisVent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegisVent.setBackground(new java.awt.Color(248, 248, 248));
        BtnRegisVent.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnRegisVent.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnRegisVent.setText("Registrar");
        BtnRegisVent.setBorderPainted(false);
        BtnRegisVent.setContentAreaFilled(false);
        BtnRegisVent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisVent.setFocusPainted(false);
        BtnRegisVent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegisVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisVentActionPerformed(evt);
            }
        });
        PanelRegisVent.add(BtnRegisVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FieldCosto.setBackground(new java.awt.Color(232, 232, 232));
        FieldCosto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCosto.setForeground(new java.awt.Color(51, 51, 51));
        FieldCosto.setBorder(null);
        PanelRegisVent.add(FieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, -1));

        FieldHora.setBackground(new java.awt.Color(232, 232, 232));
        FieldHora.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldHora.setForeground(new java.awt.Color(51, 51, 51));
        FieldHora.setBorder(null);
        PanelRegisVent.add(FieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        FieldIdCliente.setBackground(new java.awt.Color(232, 232, 232));
        FieldIdCliente.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        FieldIdCliente.setBorder(null);
        PanelRegisVent.add(FieldIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 180, -1));

        LabelCostoTotal.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCostoTotal.setForeground(new java.awt.Color(0, 0, 0));
        LabelCostoTotal.setText("Costo Total");
        PanelRegisVent.add(LabelCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        LabelHora.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(0, 0, 0));
        LabelHora.setText("Hora de la Venta");
        PanelRegisVent.add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        LabelidCliente.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelidCliente.setForeground(new java.awt.Color(0, 0, 0));
        LabelidCliente.setText("Id Cliente");
        PanelRegisVent.add(LabelidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Registar Venta");
        PanelRegisVent.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRegisVent.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        FondoText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        LabelFecha.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        LabelFecha.setText("Fecha de la Venta");
        PanelRegisVent.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        FieldFechaComp.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaComp.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaComp.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaComp.setBorder(null);
        PanelRegisVent.add(FieldFechaComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 180, -1));

        FondoText6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        FieldCantidad.setBackground(new java.awt.Color(232, 232, 232));
        FieldCantidad.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCantidad.setForeground(new java.awt.Color(51, 51, 51));
        FieldCantidad.setBorder(null);
        PanelRegisVent.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        LabelCantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        LabelCantidad.setText("Cantidad");
        PanelRegisVent.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        FondoText7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        IdProducto.setBackground(new java.awt.Color(232, 232, 232));
        IdProducto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        IdProducto.setForeground(new java.awt.Color(51, 51, 51));
        IdProducto.setBorder(null);
        PanelRegisVent.add(IdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, -1));

        estado.setBackground(new java.awt.Color(232, 232, 232));
        estado.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        estado.setForeground(new java.awt.Color(51, 51, 51));
        estado.setText("Activo");
        estado.setBorder(null);
        PanelRegisVent.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 180, -1));

        FondoText9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        LabelCostoTotal1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCostoTotal1.setForeground(new java.awt.Color(0, 0, 0));
        LabelCostoTotal1.setText("Id Producto");
        PanelRegisVent.add(LabelCostoTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        IdVenta.setBackground(new java.awt.Color(232, 232, 232));
        IdVenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        IdVenta.setForeground(new java.awt.Color(51, 51, 51));
        IdVenta.setBorder(null);
        PanelRegisVent.add(IdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 180, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVent.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        LabelidVenta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelidVenta.setForeground(new java.awt.Color(0, 0, 0));
        LabelidVenta.setText("Id Venta");
        PanelRegisVent.add(LabelidVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisVent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisVentActionPerformed

        Connection con = null;

        try {

            con = getConection();
            ps = con.prepareStatement("INSERT INTO ventas(codigo, cantidad, costo_total, estado, id_cliente, hora, fecha) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(IdVenta.getText()));
            ps.setInt(2, Integer.parseInt(FieldCantidad.getText()));
            ps.setInt(3, Integer.parseInt(FieldCosto.getText()));
            ps.setString(4, estado.getText());
            ps.setInt(5, Integer.parseInt(FieldIdCliente.getText()));
            ps.setString(6, FieldHora.getText());
            ps.setString(7, FieldFechaComp.getText());

            int res = ps.executeUpdate();

            ps2 = con.prepareStatement("INSERT INTO producto_ventas(id_producto, codigo_venta) VALUES (?,?)");
            ps2.setInt(1, Integer.parseInt(IdProducto.getText()));
            ps2.setInt(2, Integer.parseInt(IdVenta.getText()));
            
            int res2 = ps2.executeUpdate();
            
            if (res > 0 && res2 > 0) {
                JOptionPane.showMessageDialog(null, "Venta Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar la Venta");
              //  System.out.println("Error al Guardar Producto");
            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_BtnRegisVentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GUI_RegisVenta ventanaRegisVenta = new GUI_RegisVenta();
        ventanaRegisVenta.setBounds(0, 0, 1050, 600);
        ventanaRegisVenta.setVisible(true);
        ventanaRegisVenta.setResizable(false);
        ventanaRegisVenta.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegisVent;
    private javax.swing.JTextField FieldCantidad;
    private javax.swing.JTextField FieldCosto;
    private javax.swing.JTextField FieldFechaComp;
    private javax.swing.JTextField FieldHora;
    private javax.swing.JTextField FieldIdCliente;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText5;
    private javax.swing.JLabel FondoText6;
    private javax.swing.JLabel FondoText7;
    private javax.swing.JLabel FondoText9;
    private javax.swing.JTextField IdProducto;
    private javax.swing.JTextField IdVenta;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCostoTotal;
    private javax.swing.JLabel LabelCostoTotal1;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelidCliente;
    private javax.swing.JLabel LabelidVenta;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRegisVent;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField estado;
    // End of variables declaration//GEN-END:variables
}
