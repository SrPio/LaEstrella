package estrella;

import static estrella.Conexion.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GUI_RegisCliente extends javax.swing.JFrame {

    public GUI_RegisCliente() {
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

        PanelRegisPro = new javax.swing.JPanel();
        Labelid_client = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FiledId_client = new javax.swing.JTextField();
        FieldApellido = new javax.swing.JTextField();
        FieldDeuda = new javax.swing.JTextField();
        FieldNombre = new javax.swing.JTextField();
        FieldTelefono = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelApellido = new javax.swing.JLabel();
        LabelDeuda = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        FondoText1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText2 = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        FondoText5 = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        FondoText6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegisPro.setBackground(new java.awt.Color(248, 248, 248));
        PanelRegisPro.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRegisPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Labelid_client.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        Labelid_client.setForeground(new java.awt.Color(0, 0, 0));
        Labelid_client.setText("Id Cliente");
        PanelRegisPro.add(Labelid_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelRegisPro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FiledId_client.setBackground(new java.awt.Color(232, 232, 232));
        FiledId_client.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FiledId_client.setForeground(new java.awt.Color(51, 51, 51));
        FiledId_client.setBorder(null);
        PanelRegisPro.add(FiledId_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, -1));

        FieldApellido.setBackground(new java.awt.Color(232, 232, 232));
        FieldApellido.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldApellido.setForeground(new java.awt.Color(51, 51, 51));
        FieldApellido.setBorder(null);
        PanelRegisPro.add(FieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        FieldDeuda.setBackground(new java.awt.Color(232, 232, 232));
        FieldDeuda.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldDeuda.setForeground(new java.awt.Color(51, 51, 51));
        FieldDeuda.setBorder(null);
        PanelRegisPro.add(FieldDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        FieldNombre.setBackground(new java.awt.Color(232, 232, 232));
        FieldNombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        FieldNombre.setBorder(null);
        PanelRegisPro.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, -1));

        FieldTelefono.setBackground(new java.awt.Color(232, 232, 232));
        FieldTelefono.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldTelefono.setForeground(new java.awt.Color(51, 51, 51));
        FieldTelefono.setBorder(null);
        PanelRegisPro.add(FieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 180, -1));

        LabelNombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        LabelNombre.setText("Nombre");
        PanelRegisPro.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        LabelApellido.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelApellido.setForeground(new java.awt.Color(0, 0, 0));
        LabelApellido.setText("Apellido");
        PanelRegisPro.add(LabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        LabelDeuda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelDeuda.setForeground(new java.awt.Color(0, 0, 0));
        LabelDeuda.setText("Deuda");
        PanelRegisPro.add(LabelDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        LabelTelefono.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LabelTelefono.setText("Telefono");
        PanelRegisPro.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        FondoText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Registrar Cliente");
        PanelRegisPro.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRegisPro.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        FondoText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        LabelDireccion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        LabelDireccion.setText("Direccion");
        PanelRegisPro.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        FieldDireccion.setBackground(new java.awt.Color(232, 232, 232));
        FieldDireccion.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldDireccion.setForeground(new java.awt.Color(51, 51, 51));
        FieldDireccion.setBorder(null);
        PanelRegisPro.add(FieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 180, -1));

        FondoText6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Funcion Costo promedio Ponderado
        Connection con = null;

        try {

            con = getConection();
            ps = con.prepareStatement("INSERT INTO cliente(id_cliente, nombre, apellido, telefono, deuda, direccion) VALUES (?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(FiledId_client.getText()));
            ps.setString(2, FieldNombre.getText());
            ps.setString(3, FieldApellido.getText());
            ps.setString(4, FieldTelefono.getText());
            ps.setInt(5, Integer.parseInt(FieldDeuda.getText()));
            ps.setString(6, FieldDireccion.getText());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Cliente");
                //System.out.println("Error al Guardar Producto");
            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GUI_RegisCliente ventanaRegisCliente = new GUI_RegisCliente();
        ventanaRegisCliente.setBounds(0, 0, 1050, 600);
        ventanaRegisCliente.setVisible(true);
        ventanaRegisCliente.setResizable(false);
        ventanaRegisCliente.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldDeuda;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JTextField FiledId_client;
    private javax.swing.JLabel FondoText1;
    private javax.swing.JLabel FondoText2;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText5;
    private javax.swing.JLabel FondoText6;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelDeuda;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel Labelid_client;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRegisPro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
