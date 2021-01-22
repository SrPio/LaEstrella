package estrella;

import static estrella.GUI_Producto.PanelProduct;
import java.awt.BorderLayout;

public class GUI_PanelHome extends javax.swing.JFrame {

    public GUI_PanelHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentralHome = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCentralHome.setBackground(new java.awt.Color(248, 248, 248));

        NombreEmpresa.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        NombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        NombreEmpresa.setText("La Estrella");

        SubtitleEmpresa.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SubtitleEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        SubtitleEmpresa.setText("Variedades");

        TituloSeccionSuperior.setFont(new java.awt.Font("Microsoft JhengHei", 0, 21)); // NOI18N
        TituloSeccionSuperior.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionSuperior.setText("¿Que desea hacer?");

        BtnVerProduct.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnVerProduct.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnVerProduct.setText("Ver Productos");
        BtnVerProduct.setBorderPainted(false);
        BtnVerProduct.setContentAreaFilled(false);
        BtnVerProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerProduct.setFocusPainted(false);
        BtnVerProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVerProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerProductActionPerformed(evt);
            }
        });

        BtnVerClientes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnVerClientes.setText("Ver Clientes");
        BtnVerClientes.setBorderPainted(false);
        BtnVerClientes.setContentAreaFilled(false);
        BtnVerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerClientes.setFocusPainted(false);
        BtnVerClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MiniRecatanguloSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N

        TituloSeccionInferior.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        TituloSeccionInferior.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionInferior.setText("Caja y Reportes");

        TituloSeccionInferior2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 21)); // NOI18N
        TituloSeccionInferior2.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionInferior2.setText("¿Que desea hacer?");

        BtnRegisVent.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisVent.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisVent.setText("Registrar Venta");
        BtnRegisVent.setBorderPainted(false);
        BtnRegisVent.setContentAreaFilled(false);
        BtnRegisVent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisVent.setFocusPainted(false);
        BtnRegisVent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnRegisRepor.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisRepor.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisRepor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisRepor.setText("Registrar Reporte");
        BtnRegisRepor.setBorderPainted(false);
        BtnRegisRepor.setContentAreaFilled(false);
        BtnRegisRepor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisRepor.setFocusPainted(false);
        BtnRegisRepor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MiniRecatanguloInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N

        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageHome.png"))); // NOI18N

        javax.swing.GroupLayout PanelCentralHomeLayout = new javax.swing.GroupLayout(PanelCentralHome);
        PanelCentralHome.setLayout(PanelCentralHomeLayout);
        PanelCentralHomeLayout.setHorizontalGroup(
            PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubtitleEmpresa)
                            .addComponent(TituloSeccionSuperior)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BtnVerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(BtnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NombreEmpresa))
                    .addComponent(MiniRecatanguloSuperior)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(BtnRegisRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TituloSeccionInferior2))
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BtnRegisVent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MiniRecatanguloInferior)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(TituloSeccionInferior)))
                .addGap(13, 13, 13)
                .addComponent(ImagenHome))
        );
        PanelCentralHomeLayout.setVerticalGroup(
            PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(SubtitleEmpresa)
                                .addGap(20, 20, 20)
                                .addComponent(TituloSeccionSuperior)
                                .addGap(31, 31, 31)
                                .addComponent(BtnVerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(NombreEmpresa))
                            .addComponent(MiniRecatanguloSuperior))
                        .addGap(46, 46, 46)
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnRegisRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(TituloSeccionInferior2))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnRegisVent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MiniRecatanguloInferior)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TituloSeccionInferior))))
                    .addComponent(ImagenHome)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCentralHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PanelCentralHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerProductActionPerformed

        GUI_Producto ventanaProd = new GUI_Producto();
        ventanaProd.setSize(780, 570);
        ventanaProd.setLocation(30,60);

        PanelCentralHome.removeAll();
        PanelCentralHome.add(PanelProduct, BorderLayout.CENTER);
        PanelCentralHome.revalidate();
        PanelCentralHome.repaint();
    }//GEN-LAST:event_BtnVerProductActionPerformed

    public static void main(String args[]) {
        
        GUI_PanelHome ventanaPanelHome = new GUI_PanelHome();
        ventanaPanelHome.setBounds(0, 0, 1050, 600);
        ventanaPanelHome.setVisible(true);
        ventanaPanelHome.setResizable(false);
        ventanaPanelHome.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegisRepor;
    private javax.swing.JButton BtnRegisVent;
    private javax.swing.JButton BtnVerClientes;
    private javax.swing.JButton BtnVerProduct;
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JLabel MiniRecatanguloInferior;
    private javax.swing.JLabel MiniRecatanguloSuperior;
    private javax.swing.JLabel NombreEmpresa;
    public static javax.swing.JPanel PanelCentralHome;
    private javax.swing.JLabel SubtitleEmpresa;
    private javax.swing.JLabel TituloSeccionInferior;
    private javax.swing.JLabel TituloSeccionInferior2;
    private javax.swing.JLabel TituloSeccionSuperior;
    // End of variables declaration//GEN-END:variables
}
