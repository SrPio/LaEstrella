package estrella;

import java.awt.Color;
import javax.swing.ImageIcon;

public class GUIHome extends javax.swing.JFrame {

    //Iconos Selected
    ImageIcon iconobtn = new ImageIcon("src/Images/BtnHomeSele.png");
    ImageIcon iconobtn2 = new ImageIcon("src/Images/BtnClienSele.png");
    ImageIcon iconobtn3 = new ImageIcon("src/Images/BtnCajaSele.png");
    ImageIcon iconobtn4 = new ImageIcon("src/Images/BtnInventSele.png");
    ImageIcon iconobtn5 = new ImageIcon("src/Images/BtnAjusSele.png");
    
    //Iconos No selected
    ImageIcon iconobtnNS = new ImageIcon("src/Images/BtnHomeWH.png");
    ImageIcon iconobtnNS2 = new ImageIcon("src/Images/BtnClienWH.png");
    ImageIcon iconobtnNS3 = new ImageIcon("src/Images/BtnCajaWH.png");
    ImageIcon iconobtnNS4 = new ImageIcon("src/Images/btnInventWH.png");
    ImageIcon iconobtnNS5 = new ImageIcon("src/Images/BtnAjusWH.png");
    
    public GUIHome() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        PanelPrincipal.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        HomeBTN = new javax.swing.JButton();
        ClientesBTN = new javax.swing.JButton();
        CajaBTN = new javax.swing.JButton();
        InventarioBTN = new javax.swing.JButton();
        AjusBTN = new javax.swing.JButton();
        BarraLateral = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
        NombreEmpresa = new javax.swing.JLabel();
        SubtitleEmpresa = new javax.swing.JLabel();
        TituloSeccionSuperior = new javax.swing.JLabel();
        BtnVerProduct = new javax.swing.JButton();
        BtnVerClientes = new javax.swing.JButton();
        MiniRecatanguloSuperior = new javax.swing.JLabel();
        TituloSeccionInferior = new javax.swing.JLabel();
        TituloSeccionInferior2 = new javax.swing.JLabel();
        BtnRegisVent = new javax.swing.JButton();
        BtnRegisRepor = new javax.swing.JButton();
        MiniRecatanguloInferior = new javax.swing.JLabel();
        ImagenHome = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1244, 710));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonExit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 30, -1, -1));

        HomeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnHomeSele.png"))); // NOI18N
        HomeBTN.setBorderPainted(false);
        HomeBTN.setContentAreaFilled(false);
        HomeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBTN.setFocusPainted(false);
        HomeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeBTNMousePressed(evt);
            }
        });
        PanelPrincipal.add(HomeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 200, -1, -1));

        ClientesBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnClienWH.png"))); // NOI18N
        ClientesBTN.setBorderPainted(false);
        ClientesBTN.setContentAreaFilled(false);
        ClientesBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClientesBTN.setFocusPainted(false);
        ClientesBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClientesBTNMousePressed(evt);
            }
        });
        PanelPrincipal.add(ClientesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 260, -1, -1));

        CajaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnCajaWH.png"))); // NOI18N
        CajaBTN.setBorderPainted(false);
        CajaBTN.setContentAreaFilled(false);
        CajaBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CajaBTN.setFocusPainted(false);
        CajaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaBTNMousePressed(evt);
            }
        });
        PanelPrincipal.add(CajaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 320, -1, -1));

        InventarioBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnInventWH.png"))); // NOI18N
        InventarioBTN.setBorderPainted(false);
        InventarioBTN.setContentAreaFilled(false);
        InventarioBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventarioBTN.setFocusPainted(false);
        InventarioBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InventarioBTNMousePressed(evt);
            }
        });
        PanelPrincipal.add(InventarioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 380, -1, -1));

        AjusBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnAjusWH.png"))); // NOI18N
        AjusBTN.setBorderPainted(false);
        AjusBTN.setContentAreaFilled(false);
        AjusBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AjusBTN.setFocusPainted(false);
        AjusBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AjusBTNMousePressed(evt);
            }
        });
        PanelPrincipal.add(AjusBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 590, -1, -1));

        BarraLateral.setBackground(new java.awt.Color(248, 248, 248));
        BarraLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BarraLateral.png"))); // NOI18N
        BarraLateral.setToolTipText("");
        PanelPrincipal.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 28, -1, -1));

        PanelCentral.setBackground(new java.awt.Color(248, 248, 248));
        PanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreEmpresa.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        NombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        NombreEmpresa.setText("La Estrella");
        PanelCentral.add(NombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        SubtitleEmpresa.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SubtitleEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        SubtitleEmpresa.setText("Variedades");
        PanelCentral.add(SubtitleEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        TituloSeccionSuperior.setFont(new java.awt.Font("Microsoft JhengHei", 0, 21)); // NOI18N
        TituloSeccionSuperior.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionSuperior.setText("¿Que desea hacer?");
        PanelCentral.add(TituloSeccionSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        BtnVerProduct.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnVerProduct.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnVerProduct.setText("Ver Productos");
        BtnVerProduct.setBorderPainted(false);
        BtnVerProduct.setContentAreaFilled(false);
        BtnVerProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerProduct.setFocusPainted(false);
        BtnVerProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelCentral.add(BtnVerProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 80));

        BtnVerClientes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnVerClientes.setText("Ver Clientes");
        BtnVerClientes.setBorderPainted(false);
        BtnVerClientes.setContentAreaFilled(false);
        BtnVerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerClientes.setFocusPainted(false);
        BtnVerClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelCentral.add(BtnVerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, 80));

        MiniRecatanguloSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N
        PanelCentral.add(MiniRecatanguloSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        TituloSeccionInferior.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        TituloSeccionInferior.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionInferior.setText("Caja y Reportes");
        PanelCentral.add(TituloSeccionInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        TituloSeccionInferior2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 21)); // NOI18N
        TituloSeccionInferior2.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionInferior2.setText("¿Que desea hacer?");
        PanelCentral.add(TituloSeccionInferior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        BtnRegisVent.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisVent.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisVent.setText("Registrar Venta");
        BtnRegisVent.setBorderPainted(false);
        BtnRegisVent.setContentAreaFilled(false);
        BtnRegisVent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisVent.setFocusPainted(false);
        BtnRegisVent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelCentral.add(BtnRegisVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 180, 80));

        BtnRegisRepor.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisRepor.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisRepor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisRepor.setText("Registrar Reporte");
        BtnRegisRepor.setBorderPainted(false);
        BtnRegisRepor.setContentAreaFilled(false);
        BtnRegisRepor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisRepor.setFocusPainted(false);
        BtnRegisRepor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelCentral.add(BtnRegisRepor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, 80));

        MiniRecatanguloInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N
        PanelCentral.add(MiniRecatanguloInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageHome.png"))); // NOI18N
        PanelCentral.add(ImagenHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        PanelPrincipal.add(PanelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 1050, 600));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FondoApp.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1233, 710));
        PanelPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HomeBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBTNMousePressed

        HomeBTN.setIcon(iconobtn);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
    }//GEN-LAST:event_HomeBTNMousePressed

    private void ClientesBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtn2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
    }//GEN-LAST:event_ClientesBTNMousePressed

    private void CajaBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtn3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
    }//GEN-LAST:event_CajaBTNMousePressed

    private void InventarioBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtn4);
        AjusBTN.setIcon(iconobtnNS5);
    }//GEN-LAST:event_InventarioBTNMousePressed

    private void AjusBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjusBTNMousePressed
        
        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtn5);
    }//GEN-LAST:event_AjusBTNMousePressed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
  /*      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
*/
        GUIHome ventanaHome = new GUIHome();
        ventanaHome.setBounds(0, 0, 1244, 710);
        ventanaHome.setVisible(true);
        ventanaHome.setResizable(false);
        ventanaHome.setLocationRelativeTo(null);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GUIHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjusBTN;
    private javax.swing.JLabel BarraLateral;
    private javax.swing.JButton BtnRegisRepor;
    private javax.swing.JButton BtnRegisVent;
    private javax.swing.JButton BtnVerClientes;
    private javax.swing.JButton BtnVerProduct;
    private javax.swing.JButton CajaBTN;
    private javax.swing.JButton ClientesBTN;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton HomeBTN;
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JButton InventarioBTN;
    private javax.swing.JLabel MiniRecatanguloInferior;
    private javax.swing.JLabel MiniRecatanguloSuperior;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel SubtitleEmpresa;
    private javax.swing.JLabel TituloSeccionInferior;
    private javax.swing.JLabel TituloSeccionInferior2;
    private javax.swing.JLabel TituloSeccionSuperior;
    private javax.swing.JButton botonX;
    private javax.swing.JButton botonX1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
