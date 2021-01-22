package estrella;

public class GUI_RegisProducto extends javax.swing.JFrame {

    public GUI_RegisProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegisPro = new javax.swing.JPanel();
        LabelNombProduct = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FiledNombProd = new javax.swing.JTextField();
        FieldPrecioCompra = new javax.swing.JTextField();
        FieldPrecioVenta = new javax.swing.JTextField();
        FieldConcept = new javax.swing.JTextField();
        FieldFechaCadu = new javax.swing.JTextField();
        LabelConcept = new javax.swing.JLabel();
        LabelPreciComp = new javax.swing.JLabel();
        LabelPreciVen = new javax.swing.JLabel();
        LabelFechaCadu = new javax.swing.JLabel();
        FondoText1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText2 = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        FondoText5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegisPro.setBackground(new java.awt.Color(248, 248, 248));
        PanelRegisPro.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRegisPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNombProduct.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelNombProduct.setForeground(new java.awt.Color(0, 0, 0));
        LabelNombProduct.setText("Nombre del Producto");
        PanelRegisPro.add(LabelNombProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

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
        PanelRegisPro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FiledNombProd.setBackground(new java.awt.Color(232, 232, 232));
        FiledNombProd.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FiledNombProd.setForeground(new java.awt.Color(51, 51, 51));
        FiledNombProd.setBorder(null);
        PanelRegisPro.add(FiledNombProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, -1));

        FieldPrecioCompra.setBackground(new java.awt.Color(232, 232, 232));
        FieldPrecioCompra.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldPrecioCompra.setForeground(new java.awt.Color(51, 51, 51));
        FieldPrecioCompra.setBorder(null);
        PanelRegisPro.add(FieldPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, -1));

        FieldPrecioVenta.setBackground(new java.awt.Color(232, 232, 232));
        FieldPrecioVenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldPrecioVenta.setForeground(new java.awt.Color(51, 51, 51));
        FieldPrecioVenta.setBorder(null);
        PanelRegisPro.add(FieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        FieldConcept.setBackground(new java.awt.Color(232, 232, 232));
        FieldConcept.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldConcept.setForeground(new java.awt.Color(51, 51, 51));
        FieldConcept.setBorder(null);
        PanelRegisPro.add(FieldConcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        FieldFechaCadu.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaCadu.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaCadu.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaCadu.setBorder(null);
        PanelRegisPro.add(FieldFechaCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 180, -1));

        LabelConcept.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelConcept.setForeground(new java.awt.Color(0, 0, 0));
        LabelConcept.setText("Concepto");
        PanelRegisPro.add(LabelConcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        LabelPreciComp.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelPreciComp.setForeground(new java.awt.Color(0, 0, 0));
        LabelPreciComp.setText("Precio de compra");
        PanelRegisPro.add(LabelPreciComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        LabelPreciVen.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelPreciVen.setForeground(new java.awt.Color(0, 0, 0));
        LabelPreciVen.setText("Precio de venta");
        PanelRegisPro.add(LabelPreciVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        LabelFechaCadu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFechaCadu.setForeground(new java.awt.Color(0, 0, 0));
        LabelFechaCadu.setText("Fecha de Caducidad");
        PanelRegisPro.add(LabelFechaCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        FondoText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Añadir Producto");
        PanelRegisPro.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRegisPro.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        FondoText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

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

    public static void main(String args[]) {
        
        GUI_RegisProducto ventanaRegisProd = new GUI_RegisProducto();
        ventanaRegisProd.setBounds(0, 0, 1050, 600);
        ventanaRegisProd.setVisible(true);
        ventanaRegisProd.setResizable(false);
        ventanaRegisProd.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldConcept;
    private javax.swing.JTextField FieldFechaCadu;
    private javax.swing.JTextField FieldPrecioCompra;
    private javax.swing.JTextField FieldPrecioVenta;
    private javax.swing.JTextField FiledNombProd;
    private javax.swing.JLabel FondoText1;
    private javax.swing.JLabel FondoText2;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText5;
    private javax.swing.JLabel LabelConcept;
    private javax.swing.JLabel LabelFechaCadu;
    private javax.swing.JLabel LabelNombProduct;
    private javax.swing.JLabel LabelPreciComp;
    private javax.swing.JLabel LabelPreciVen;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRegisPro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}