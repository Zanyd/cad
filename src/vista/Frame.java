package vista;

import controlador.Controlador;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    public void addEventos() {
        Controlador controlador = new Controlador(this);
        miAbrir.addActionListener(controlador);
        miNuevo.addActionListener(controlador);
        miGuardar.addActionListener(controlador);
        bgFiguras.add(rbLinea);
        bgFiguras.add(rbTriangulo);
        bgFiguras.add(rbRectangulo);
        bgFiguras.add(rbPentagono);
        bgFiguras.add(rbPoligono);
        panelPrincipal.addMouseListener(controlador);
        spLado.addChangeListener(controlador);
        spG.addChangeListener(controlador);
        spB.addChangeListener(controlador);
        btMasRotar.addActionListener(controlador);
        btMenosRotar.addActionListener(controlador);
        btMasTamanio.addActionListener(controlador);
        btMenosTamanio.addActionListener(controlador);
        btMovimientoArriba.addActionListener(controlador);
        btMovimientoAbajo.addActionListener(controlador);
        btMovimientoDerecha.addActionListener(controlador);
        btMovimientoIzquierda.addActionListener(controlador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiguras = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbLinea = new javax.swing.JRadioButton();
        rbTriangulo = new javax.swing.JRadioButton();
        rbRectangulo = new javax.swing.JRadioButton();
        rbPentagono = new javax.swing.JRadioButton();
        lbContador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnColor = new javax.swing.JPanel();
        rbPoligono = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        spB = new javax.swing.JSpinner();
        spLado = new javax.swing.JSpinner();
        spG = new javax.swing.JSpinner();
        spR = new javax.swing.JSpinner();
        btMovimientoAbajo = new javax.swing.JButton();
        btMovimientoArriba = new javax.swing.JButton();
        btMovimientoDerecha = new javax.swing.JButton();
        btMovimientoIzquierda = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbFiguras = new javax.swing.JComboBox<>();
        panelPrincipal = new vista.Panel();
        btMasTamanio = new javax.swing.JButton();
        btMasRotar = new javax.swing.JButton();
        btMenosTamanio = new javax.swing.JButton();
        btMenosRotar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(25, 57, 106));
        jPanel1.setForeground(new java.awt.Color(25, 57, 106));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoitver_1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tecnmBlanco.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 120);

        rbLinea.setSelected(true);
        getContentPane().add(rbLinea);
        rbLinea.setBounds(10, 150, 20, 30);
        getContentPane().add(rbTriangulo);
        rbTriangulo.setBounds(10, 180, 20, 30);
        getContentPane().add(rbRectangulo);
        rbRectangulo.setBounds(10, 210, 20, 30);
        getContentPane().add(rbPentagono);
        rbPentagono.setBounds(10, 240, 21, 30);

        lbContador.setText("Puntos: 0");
        getContentPane().add(lbContador);
        lbContador.setBounds(20, 800, 60, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 480, 0, 0);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tamaño.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 700, 20, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rotar.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 660, 20, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 150, 50, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 210, 30, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pentagono.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 240, 30, 30);

        jLabel13.setText("Color:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 360, 40, 14);

        jLabel14.setText("B:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 450, 20, 20);

        jLabel15.setText("R:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 390, 20, 20);

        jLabel16.setText("G:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 420, 20, 20);

        jLabel17.setText("Figuras:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 130, 60, 14);

        pnColor.setBackground(new java.awt.Color(25, 57, 106));

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(pnColor);
        pnColor.setBounds(50, 360, 20, 20);
        getContentPane().add(rbPoligono);
        rbPoligono.setBounds(10, 270, 20, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/poligono.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 270, 30, 30);

        jLabel18.setText("L:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 300, 20, 20);

        spB.setModel(new javax.swing.SpinnerNumberModel(106, 0, 255, 1));
        getContentPane().add(spB);
        spB.setBounds(30, 450, 40, 20);

        spLado.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));
        getContentPane().add(spLado);
        spLado.setBounds(30, 300, 40, 20);

        spG.setModel(new javax.swing.SpinnerNumberModel(57, 0, 255, 1));
        getContentPane().add(spG);
        spG.setBounds(30, 420, 40, 20);

        spR.setModel(new javax.swing.SpinnerNumberModel(25, 0, 255, 1));
        getContentPane().add(spR);
        spR.setBounds(30, 390, 40, 20);

        btMovimientoAbajo.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaAbajo.png"))); // NOI18N
        btMovimientoAbajo.setText("ab");
        btMovimientoAbajo.setBorderPainted(false);
        btMovimientoAbajo.setContentAreaFilled(false);
        getContentPane().add(btMovimientoAbajo);
        btMovimientoAbajo.setBounds(40, 620, 20, 20);

        btMovimientoArriba.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaArriba.png"))); // NOI18N
        btMovimientoArriba.setText("a");
        btMovimientoArriba.setBorderPainted(false);
        btMovimientoArriba.setContentAreaFilled(false);
        getContentPane().add(btMovimientoArriba);
        btMovimientoArriba.setBounds(40, 580, 20, 20);

        btMovimientoDerecha.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaDerecha.png"))); // NOI18N
        btMovimientoDerecha.setText("d");
        btMovimientoDerecha.setBorderPainted(false);
        btMovimientoDerecha.setContentAreaFilled(false);
        getContentPane().add(btMovimientoDerecha);
        btMovimientoDerecha.setBounds(60, 600, 20, 20);

        btMovimientoIzquierda.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaIzquierda.png"))); // NOI18N
        btMovimientoIzquierda.setText("i");
        btMovimientoIzquierda.setBorderPainted(false);
        btMovimientoIzquierda.setContentAreaFilled(false);
        btMovimientoIzquierda.setName("i"); // NOI18N
        getContentPane().add(btMovimientoIzquierda);
        btMovimientoIzquierda.setBounds(20, 600, 20, 20);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangulo.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 180, 30, 30);

        jLabel3.setText("Transformaciones:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 520, 100, 14);

        cbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Figura..." }));
        cbFiguras.setToolTipText("");
        getContentPane().add(cbFiguras);
        cbFiguras.setBounds(10, 550, 90, 20);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(110, 130, 780, 690);

        btMasTamanio.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMasTamanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btMasTamanio.setText("+t");
        btMasTamanio.setBorderPainted(false);
        btMasTamanio.setContentAreaFilled(false);
        getContentPane().add(btMasTamanio);
        btMasTamanio.setBounds(40, 700, 30, 20);

        btMasRotar.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMasRotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btMasRotar.setText("+r");
        btMasRotar.setBorderPainted(false);
        btMasRotar.setContentAreaFilled(false);
        getContentPane().add(btMasRotar);
        btMasRotar.setBounds(40, 670, 30, 20);

        btMenosTamanio.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMenosTamanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btMenosTamanio.setText("-t");
        btMenosTamanio.setBorderPainted(false);
        btMenosTamanio.setContentAreaFilled(false);
        getContentPane().add(btMenosTamanio);
        btMenosTamanio.setBounds(70, 700, 30, 20);

        btMenosRotar.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMenosRotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btMenosRotar.setText("-r");
        btMenosRotar.setBorderPainted(false);
        btMenosRotar.setContentAreaFilled(false);
        getContentPane().add(btMenosRotar);
        btMenosRotar.setBounds(70, 670, 30, 20);

        jMenu1.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miNuevo.setText("Nuevo");
        jMenu1.add(miNuevo);
        jMenu1.add(jSeparator1);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miAbrir.setText("Abrir");
        jMenu1.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miGuardar.setText("Guardar");
        jMenu1.add(miGuardar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup bgFiguras;
    public javax.swing.JButton btMasRotar;
    public javax.swing.JButton btMasTamanio;
    public javax.swing.JButton btMenosRotar;
    public javax.swing.JButton btMenosTamanio;
    private javax.swing.JButton btMovimientoAbajo;
    private javax.swing.JButton btMovimientoArriba;
    private javax.swing.JButton btMovimientoDerecha;
    private javax.swing.JButton btMovimientoIzquierda;
    public javax.swing.JComboBox<String> cbFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JLabel lbContador;
    public javax.swing.JMenuItem miAbrir;
    public javax.swing.JMenuItem miGuardar;
    public javax.swing.JMenuItem miNuevo;
    public vista.Panel panelPrincipal;
    public javax.swing.JPanel pnColor;
    public javax.swing.JRadioButton rbLinea;
    public javax.swing.JRadioButton rbPentagono;
    public javax.swing.JRadioButton rbPoligono;
    public javax.swing.JRadioButton rbRectangulo;
    public javax.swing.JRadioButton rbTriangulo;
    public javax.swing.JSpinner spB;
    public javax.swing.JSpinner spG;
    public javax.swing.JSpinner spLado;
    public javax.swing.JSpinner spR;
    // End of variables declaration//GEN-END:variables
}
