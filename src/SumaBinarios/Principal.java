package SumaBinarios;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Principal extends javax.swing.JFrame {
    
    public int posicion = 1;
    public int numero1 = 0;
    public int numero2 = 0;
    public int numero3 = 0;
    
    public int focus = 1;
    public int acarreo = 0;
    public String resultado = "";
    public int numeroMasLargo = 0;
    public boolean visible1;
    public boolean visible2;
    public boolean visible3;
    int posicionX;
    int posicionY;
    public int opcion = 0;


    public Principal() {
        initComponents();
        
        setResizable(false);
        setSize(760, 390);
        setLocationRelativeTo(null);
        setTitle("Ventana Principal");
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        panelUnBit.setVisible(false);
        panelComparadores.setVisible(false);
        visible1 = false;
        panelSumaCompuesta.setVisible(false);
        visible2 = false;
        panelCuatroBits.setVisible(false);
        visible3 = false;
       
        lblprimerresultado.setVisible(false);
        lblcorrecion.setVisible(false);
        jSeparator2.setVisible(false);
        btncorregir.setVisible(false);
        lblmensaje.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        lblresultadobcd.setVisible(false);
        lblresultadobcd1.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        panelAyuda.setVisible(false);
        
        panelAyuda3.setSize(500, 1750);
        
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JLabel();
        panelAyuda = new javax.swing.JPanel();
        btnSalirAyuda = new javax.swing.JButton();
        tb_ayuda = new javax.swing.JTabbedPane();
        scrollUno = new javax.swing.JScrollPane();
        panelAyuda1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        scrollDos = new javax.swing.JScrollPane();
        panelAyuda2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelAyuda3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        panelUnBit = new javax.swing.JPanel();
        btnValorCero = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        lblAcarreo = new javax.swing.JLabel();
        lblSignoSuma1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblNumero3 = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        btnValorUno = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblSignoSuma = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelCuatroBits = new javax.swing.JPanel();
        lblmensaje = new javax.swing.JLabel();
        lblBinario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblresultadobcd = new javax.swing.JLabel();
        lblresultadobcd1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btncorregir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblSignoSuma4 = new javax.swing.JLabel();
        lblBinario1 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        lblSignoSuma3 = new javax.swing.JLabel();
        lblcorrecion = new javax.swing.JLabel();
        lblprimerresultado = new javax.swing.JLabel();
        lblSignoSuma2 = new javax.swing.JLabel();
        btnCalcular2 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        lblPrimerDigito = new javax.swing.JLabel();
        lblSegundoDigito = new javax.swing.JLabel();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        lblBinario2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelSumaCompuesta = new javax.swing.JPanel();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        lblResultado1 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        btnCalcular1 = new javax.swing.JButton();
        txtNumero3 = new javax.swing.JTextField();
        txtNumero4 = new javax.swing.JTextField();
        lblResultado3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDecimal = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelComparadores = new javax.swing.JPanel();
        lblResultadoABinario = new javax.swing.JLabel();
        lblResultadoBBinario = new javax.swing.JLabel();
        txtResultadoADecimal1 = new javax.swing.JTextField();
        lblprimer_numerocompA = new javax.swing.JTextField();
        lblsegundo_numerocompA = new javax.swing.JTextField();
        lblsegundo_numerocompB = new javax.swing.JTextField();
        lblprimer_numerocompB = new javax.swing.JTextField();
        txtResultadoBDecimal = new javax.swing.JTextField();
        CalcularSuma = new javax.swing.JButton();
        lblSignoSuma5 = new javax.swing.JLabel();
        lblSignoSuma6 = new javax.swing.JLabel();
        lblSignoSuma7 = new javax.swing.JLabel();
        lblSignoSuma8 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblImagenEntrada = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCalculoRapido = new javax.swing.JButton();
        btnPorpasos = new javax.swing.JButton();
        btnPorpasos1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnComparadores = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        lblFondo.setBackground(new java.awt.Color(255, 255, 255));
        lblFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 172, 34), 2, true));
        lblFondo.setEnabled(false);
        lblFondo.setMaximumSize(new java.awt.Dimension(0, 0));
        lblFondo.setMinimumSize(new java.awt.Dimension(0, 0));
        lblFondo.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAyuda.setBackground(new java.awt.Color(255, 255, 255));
        panelAyuda.setAutoscrolls(true);
        panelAyuda.setRequestFocusEnabled(false);
        panelAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirAyuda.setBackground(new java.awt.Color(152, 172, 34));
        btnSalirAyuda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalirAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAyuda.setText("X");
        btnSalirAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirAyudaMouseClicked(evt);
            }
        });
        btnSalirAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAyudaActionPerformed(evt);
            }
        });
        panelAyuda.add(btnSalirAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 0, -1, 28));

        tb_ayuda.setBackground(new java.awt.Color(255, 255, 255));
        tb_ayuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        tb_ayuda.setForeground(new java.awt.Color(255, 255, 255));
        tb_ayuda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tb_ayuda.setOpaque(true);
        tb_ayuda.setPreferredSize(new java.awt.Dimension(300, 300));
        tb_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tb_ayudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tb_ayudaMouseExited(evt);
            }
        });

        scrollUno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelAyuda1.setBackground(new java.awt.Color(255, 255, 255));
        panelAyuda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelAyuda1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Ingreso de datos");
        panelAyuda1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 190, 30));
        panelAyuda1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 460, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresoDatos1Bit.png"))); // NOI18N
        panelAyuda1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 190));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Resultados");
        panelAyuda1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultados1Bit.png"))); // NOI18N
        panelAyuda1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 470, 320));

        scrollUno.setViewportView(panelAyuda1);

        tb_ayuda.addTab("Suma un bit", scrollUno);

        scrollDos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34)));
        scrollDos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelAyuda2.setBackground(new java.awt.Color(255, 255, 255));
        panelAyuda2.setForeground(new java.awt.Color(255, 255, 255));
        panelAyuda2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelAyuda2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panelAyuda2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresoDatos4Bits.png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelAyuda2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 460, 410));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Resultados4Bits.png"))); // NOI18N
        panelAyuda2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 460, 420));
        panelAyuda2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 920, 470, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Ingreso de datos");
        panelAyuda2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tablero4Bits.png"))); // NOI18N
        panelAyuda2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, 430));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Resultados");
        panelAyuda2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 940, 190, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correccion4Bits.png"))); // NOI18N
        panelAyuda2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1480, 460, 300));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Aplica corrección");
        panelAyuda2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1450, 220, 30));
        panelAyuda2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1430, 470, 20));

        scrollDos.setViewportView(panelAyuda2);

        tb_ayuda.addTab("Suma cuatro bits", scrollDos);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelAyuda3.setBackground(new java.awt.Color(255, 255, 255));
        panelAyuda3.setPreferredSize(new java.awt.Dimension(490, 1750));
        panelAyuda3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionTipoSuma.png"))); // NOI18N
        panelAyuda3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 440, 190));
        panelAyuda3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 440, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setText("Selección tipo de suma");
        panelAyuda3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setText("Ingreso de datos en decimal");
        panelAyuda3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 320, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/complejaDecimal.png"))); // NOI18N
        panelAyuda3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 440, 200));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Ingreso de datos en binario");
        panelAyuda3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 320, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/complejaBinario.png"))); // NOI18N
        panelAyuda3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 440, 300));
        panelAyuda3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 890, 440, 10));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setText("Resultado suma decimal");
        panelAyuda3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 911, 280, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("Resultado suma binaria");
        panelAyuda3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1320, 280, 30));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultadoDecimal.png"))); // NOI18N
        panelAyuda3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1030, 440, 280));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("<html><body>En el caso de la suma en decimal obtenemos<br>en la parte izquiera el resultado en decimal<br>y a la derecha el resultado en binario.</body></html>");
        panelAyuda3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 950, 370, 70));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("<html><body>De igual manera en la suma binaria vemos<br>en la parte izquiera el resultado en decimal<br>y a la derecha el resultado en binario.</body></html>");
        panelAyuda3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1360, 370, 70));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultadoBinario.png"))); // NOI18N
        panelAyuda3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1440, 440, 290));

        jScrollPane1.setViewportView(panelAyuda3);

        tb_ayuda.addTab("Suma compleja", jScrollPane1);

        panelAyuda.add(tb_ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 310));

        getContentPane().add(panelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 51, 507, 311));

        panelUnBit.setBackground(new java.awt.Color(255, 255, 255));
        panelUnBit.setRequestFocusEnabled(false);
        panelUnBit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValorCero.setBackground(new java.awt.Color(152, 172, 34));
        btnValorCero.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnValorCero.setForeground(new java.awt.Color(255, 255, 255));
        btnValorCero.setText("0");
        btnValorCero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValorCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorCeroActionPerformed(evt);
            }
        });
        panelUnBit.add(btnValorCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 70, 50));

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Primer bit");
        lblTitulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelUnBit.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 20));

        lblAcarreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAcarreo.setText("Acarreo:  ");
        panelUnBit.add(lblAcarreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 120, 30));

        lblSignoSuma1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma1.setText("+");
        panelUnBit.add(lblSignoSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 30, 30));

        btnCalcular.setBackground(new java.awt.Color(152, 172, 34));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("=");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        panelUnBit.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 80, 50));

        btnLimpiar.setBackground(new java.awt.Color(152, 172, 34));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelUnBit.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, 50));

        lblNumero3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNumero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelUnBit.add(lblNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 50, 50));

        lblNumero1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelUnBit.add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, 50));

        btnValorUno.setBackground(new java.awt.Color(152, 172, 34));
        btnValorUno.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnValorUno.setForeground(new java.awt.Color(255, 255, 255));
        btnValorUno.setText("1");
        btnValorUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValorUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorUnoActionPerformed(evt);
            }
        });
        panelUnBit.add(btnValorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, 50));

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResultado.setText("Resultado:  ");
        panelUnBit.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 120, 30));

        lblTitulo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Segundo bit");
        panelUnBit.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        lblSignoSuma.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma.setText("+");
        panelUnBit.add(lblSignoSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 30, 30));

        lblNumero2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelUnBit.add(lblNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 50, 50));

        lblTitulo4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("Acarreo");
        panelUnBit.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 90, 20));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelUnBit.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 509, 310));

        getContentPane().add(panelUnBit, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 51, 510, 311));

        panelCuatroBits.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblmensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmensaje.setText("No necesita correción");
        lblmensaje.setToolTipText("");
        panelCuatroBits.add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 70));

        lblBinario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBinario.setText("Binario: ");
        panelCuatroBits.add(lblBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Correción");
        panelCuatroBits.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("BCD");
        panelCuatroBits.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblresultadobcd.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblresultadobcd.setForeground(new java.awt.Color(214, 200, 14));
        lblresultadobcd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCuatroBits.add(lblresultadobcd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, 30));

        lblresultadobcd1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblresultadobcd1.setForeground(new java.awt.Color(214, 200, 14));
        lblresultadobcd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCuatroBits.add(lblresultadobcd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Suma BCD");
        panelCuatroBits.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Acarreo anterior");
        panelCuatroBits.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, -1));

        btncorregir.setBackground(new java.awt.Color(152, 172, 34));
        btncorregir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncorregir.setForeground(new java.awt.Color(255, 255, 255));
        btncorregir.setText("Corregir");
        btncorregir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncorregirActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btncorregir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 30));
        panelCuatroBits.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 100, -1));
        panelCuatroBits.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 260, -1));

        lblSignoSuma4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma4.setText("+");
        panelCuatroBits.add(lblSignoSuma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 30, 30));

        lblBinario1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBinario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCuatroBits.add(lblBinario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, 40));

        lblResultado2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblResultado2.setForeground(new java.awt.Color(214, 200, 14));
        lblResultado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelCuatroBits.add(lblResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 50));

        lblSignoSuma3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma3.setText("=");
        panelCuatroBits.add(lblSignoSuma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 30));

        lblcorrecion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcorrecion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCuatroBits.add(lblcorrecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, 30));

        lblprimerresultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblprimerresultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCuatroBits.add(lblprimerresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, 30));

        lblSignoSuma2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma2.setText("+");
        panelCuatroBits.add(lblSignoSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 30, 30));

        btnCalcular2.setBackground(new java.awt.Color(152, 172, 34));
        btnCalcular2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCalcular2.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular2.setText("=");
        btnCalcular2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnCalcular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 60, 40));

        btnLimpiar2.setBackground(new java.awt.Color(152, 172, 34));
        btnLimpiar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 140, 70));

        lblPrimerDigito.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPrimerDigito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrimerDigito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelCuatroBits.add(lblPrimerDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        lblSegundoDigito.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblSegundoDigito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSegundoDigito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelCuatroBits.add(lblSegundoDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 50, 50));

        btnOcho.setBackground(new java.awt.Color(152, 172, 34));
        btnOcho.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 70, 70));

        btnNueve.setBackground(new java.awt.Color(152, 172, 34));
        btnNueve.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 70, 70));

        btnCuatro.setBackground(new java.awt.Color(152, 172, 34));
        btnCuatro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 70, 70));

        btnCinco.setBackground(new java.awt.Color(152, 172, 34));
        btnCinco.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 70, 70));

        btnSeis.setBackground(new java.awt.Color(152, 172, 34));
        btnSeis.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 70, 70));

        btnUno.setBackground(new java.awt.Color(152, 172, 34));
        btnUno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 70, 70));

        btnDos.setBackground(new java.awt.Color(152, 172, 34));
        btnDos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 70, 70));

        btnCero.setBackground(new java.awt.Color(152, 172, 34));
        btnCero.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 70, 70));

        btnSiete.setBackground(new java.awt.Color(152, 172, 34));
        btnSiete.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, 70));

        btnTres.setBackground(new java.awt.Color(152, 172, 34));
        btnTres.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        panelCuatroBits.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 70, 70));

        lblBinario2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBinario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCuatroBits.add(lblBinario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        jLabel5.setOpaque(true);
        panelCuatroBits.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 310));

        jLabel8.setText("000001");
        panelCuatroBits.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel10.setText("jLabel10");
        panelCuatroBits.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        getContentPane().add(panelCuatroBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 51, 507, 307));

        panelSumaCompuesta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumero1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumero1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumero1FocusGained(evt);
            }
        });
        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero1KeyTyped(evt);
            }
        });
        panelSumaCompuesta.add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 290, 40));

        txtNumero2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumero2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumero2FocusGained(evt);
            }
        });
        txtNumero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero2KeyTyped(evt);
            }
        });
        panelSumaCompuesta.add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 290, 40));

        lblResultado1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblResultado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelSumaCompuesta.add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 290, 40));

        btnLimpiar1.setBackground(new java.awt.Color(152, 172, 34));
        btnLimpiar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        panelSumaCompuesta.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 50));

        btnCalcular1.setBackground(new java.awt.Color(152, 172, 34));
        btnCalcular1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCalcular1.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular1.setText("=");
        btnCalcular1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });
        panelSumaCompuesta.add(btnCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 200, 50));

        txtNumero3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumero3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumero3FocusGained(evt);
            }
        });
        txtNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero3ActionPerformed(evt);
            }
        });
        txtNumero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero3KeyTyped(evt);
            }
        });
        panelSumaCompuesta.add(txtNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 40));

        txtNumero4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumero4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumero4FocusGained(evt);
            }
        });
        txtNumero4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero4KeyTyped(evt);
            }
        });
        panelSumaCompuesta.add(txtNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 40));

        lblResultado3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblResultado3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelSumaCompuesta.add(lblResultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("¿Que deseas sumar?");
        panelSumaCompuesta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        btnDecimal.setBackground(new java.awt.Color(152, 172, 34));
        btnDecimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimal.setText("Decimal");
        btnDecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        panelSumaCompuesta.add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        btnBinario.setBackground(new java.awt.Color(152, 172, 34));
        btnBinario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBinario.setForeground(new java.awt.Color(255, 255, 255));
        btnBinario.setText("Binario");
        btnBinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });
        panelSumaCompuesta.add(btnBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        jLabel6.setOpaque(true);
        panelSumaCompuesta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 310));

        getContentPane().add(panelSumaCompuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 51, 511, 310));

        panelComparadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelComparadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResultadoABinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelComparadores.add(lblResultadoABinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 120, 50));

        lblResultadoBBinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        panelComparadores.add(lblResultadoBBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 120, 50));

        txtResultadoADecimal1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtResultadoADecimal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        txtResultadoADecimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoADecimal1ActionPerformed(evt);
            }
        });
        panelComparadores.add(txtResultadoADecimal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 50, 50));

        lblprimer_numerocompA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblprimer_numerocompA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblprimer_numerocompA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        lblprimer_numerocompA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblprimer_numerocompAActionPerformed(evt);
            }
        });
        panelComparadores.add(lblprimer_numerocompA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        lblsegundo_numerocompA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblsegundo_numerocompA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblsegundo_numerocompA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        lblsegundo_numerocompA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsegundo_numerocompAActionPerformed(evt);
            }
        });
        panelComparadores.add(lblsegundo_numerocompA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, 50));

        lblsegundo_numerocompB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblsegundo_numerocompB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblsegundo_numerocompB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        lblsegundo_numerocompB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsegundo_numerocompBActionPerformed(evt);
            }
        });
        panelComparadores.add(lblsegundo_numerocompB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 50));

        lblprimer_numerocompB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblprimer_numerocompB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblprimer_numerocompB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        lblprimer_numerocompB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblprimer_numerocompBActionPerformed(evt);
            }
        });
        panelComparadores.add(lblprimer_numerocompB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 50));

        txtResultadoBDecimal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtResultadoBDecimal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        txtResultadoBDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoBDecimalActionPerformed(evt);
            }
        });
        panelComparadores.add(txtResultadoBDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 50));

        CalcularSuma.setBackground(new java.awt.Color(152, 172, 34));
        CalcularSuma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CalcularSuma.setForeground(new java.awt.Color(255, 255, 255));
        CalcularSuma.setText("Sumar ");
        CalcularSuma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        CalcularSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularSumaActionPerformed(evt);
            }
        });
        panelComparadores.add(CalcularSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 80, 40));

        lblSignoSuma5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma5.setText("+");
        panelComparadores.add(lblSignoSuma5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, 30));

        lblSignoSuma6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma6.setText("=");
        panelComparadores.add(lblSignoSuma6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 30));

        lblSignoSuma7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma7.setText("=");
        panelComparadores.add(lblSignoSuma7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 30, 30));

        lblSignoSuma8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSignoSuma8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoSuma8.setText("+");
        panelComparadores.add(lblSignoSuma8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 30, 30));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setOpaque(true);
        panelComparadores.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 310));

        getContentPane().add(panelComparadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 51, 511, 307));

        lblImagenEntrada.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        lblImagenEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bienvenido.jpg"))); // NOI18N
        lblImagenEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34)));
        getContentPane().add(lblImagenEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 510, 310));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        jPanel2.setLayout(null);

        btnCalculoRapido.setBackground(new java.awt.Color(152, 172, 34));
        btnCalculoRapido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalculoRapido.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculoRapido.setText("Suma compleja");
        btnCalculoRapido.setToolTipText("Suma compleja");
        btnCalculoRapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculoRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoRapidoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalculoRapido);
        btnCalculoRapido.setBounds(-10, 310, 270, 50);

        btnPorpasos.setBackground(new java.awt.Color(152, 172, 34));
        btnPorpasos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPorpasos.setForeground(new java.awt.Color(255, 255, 255));
        btnPorpasos.setText("Suma de cuatro bits");
        btnPorpasos.setToolTipText("Suma de cuatro bits");
        btnPorpasos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPorpasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorpasosActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorpasos);
        btnPorpasos.setBounds(-10, 250, 270, 50);

        btnPorpasos1.setBackground(new java.awt.Color(152, 172, 34));
        btnPorpasos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPorpasos1.setForeground(new java.awt.Color(255, 255, 255));
        btnPorpasos1.setText("Suma de un bit");
        btnPorpasos1.setToolTipText("Suma de un bit");
        btnPorpasos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPorpasos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorpasos1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorpasos1);
        btnPorpasos1.setBounds(-10, 190, 270, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUTS.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 6, 230, 120);

        btnComparadores.setBackground(new java.awt.Color(152, 172, 34));
        btnComparadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComparadores.setForeground(new java.awt.Color(255, 255, 255));
        btnComparadores.setText("Comparadores");
        btnComparadores.setToolTipText("Comparadores");
        btnComparadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComparadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparadoresActionPerformed(evt);
            }
        });
        jPanel2.add(btnComparadores);
        btnComparadores.setBounds(-10, 130, 270, 50);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 250, 390));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("©Todos los derechos reservados Andres Rangel - Johan Viancha - Desarrollo de Sistemas Informaticos");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(11, 5, 510, 14);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 520, 30));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 172, 34), 2, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(152, 172, 34));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 0, 70, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/interrogacion.png"))); // NOI18N
        jLabel16.setToolTipText("Panel Ayuda");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(420, 15, 20, 20);

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("                               Suma de Números Binarios");
        lblTitulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34), 2));
        lblTitulo1.setOpaque(true);
        lblTitulo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTitulo1MouseDragged(evt);
            }
        });
        lblTitulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTitulo1MousePressed(evt);
            }
        });
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(-240, 1, 760, 50);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(0, 60, 260, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 520, 50));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 172, 34)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculoRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoRapidoActionPerformed
//        CalculoRapido calculoRapido = new CalculoRapido();
//        calculoRapido.setVisible(true);
        //this.setVisible(false);
        
        limpiar();
        
        if(visible2 == false){
           panelSumaCompuesta.setVisible(true);
           panelUnBit.setVisible(false);
           panelUnBit.repaint();
           panelCuatroBits.setVisible(false);
           panelCuatroBits.repaint();
           visible2 = true;
           visible1 = false;
           visible3 = false;
       }
        
        panelAyuda.setVisible(false);
        
    }//GEN-LAST:event_btnCalculoRapidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Esta seguro que desea salir?", "Cerrar Programa", 0, 0, null, 
            botones, this);
        if(eleccion == JOptionPane.YES_OPTION){
            System.exit(0);
        }else if(eleccion == JOptionPane.NO_OPTION){
            System.out.println("Se cancelo el cierre");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPorpasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorpasosActionPerformed
       
       limpiar();
       
       if(visible3 == false){
           panelCuatroBits.setVisible(true);
           panelSumaCompuesta.setVisible(false);
           panelSumaCompuesta.repaint();
           panelUnBit.setVisible(false);
           panelUnBit.repaint();
           visible3 = true;
           visible2 = false;
           visible1 = false;
        }
       
       panelAyuda.setVisible(false);
       
    }//GEN-LAST:event_btnPorpasosActionPerformed

    private void btnValorCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorCeroActionPerformed
        
        if(posicion == 1){
            lblNumero1.setText("0");
            posicion++;
        }else if(posicion == 2){
            lblNumero2.setText("0");
            posicion++;
        }
        else if (posicion == 3){
            lblNumero3.setText("0");
            posicion++;
        }
        
    }//GEN-LAST:event_btnValorCeroActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        lblResultado.setText("Resultado:  ");
        lblAcarreo.setText("Acarreo:  ");

        if(!lblNumero2.getText().equals("") && !lblNumero1.getText().equals("") && !lblNumero3.getText().equals("")){
            if((numero1 == 0 && numero2 == 1 && numero3 == 0 ) || (numero1 == 1 && numero2 == 0 && numero3 == 0) || (numero1 == 0 && numero2 == 0 && numero3 == 1)){
                lblResultado.setText(lblResultado.getText() + "1");
                lblAcarreo.setText(lblAcarreo.getText() + "0");
            }else if((numero1 == 1 && numero2 == 1 && numero3 == 0) || (numero1 == 1 && numero2 == 0 && numero3==1) || (numero1 == 0 && numero2 == 1 && numero3==1)){
                lblResultado.setText(lblResultado.getText() + "0");
                lblAcarreo.setText(lblAcarreo.getText() + "1");
            }else if(numero1 == 1 && numero2 == 1 && numero3 == 1){
                lblResultado.setText(lblResultado.getText() + "1");
                lblAcarreo.setText(lblAcarreo.getText() + "1");
            }else{
                lblResultado.setText(lblResultado.getText() + "0");
                lblAcarreo.setText(lblAcarreo.getText() + "0");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar los tres campos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnValorUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorUnoActionPerformed
        
        if(posicion == 1){
            lblNumero1.setText("1");
            posicion++;
            numero1 = 1;
        }else if(posicion == 2){
            lblNumero2.setText("1");
            posicion++;
            numero2 = 1;
        }

        else if (posicion == 3){

            lblNumero3.setText("1");
            posicion++;
            numero3 = 1;
        }
        
    }//GEN-LAST:event_btnValorUnoActionPerformed

    private void txtNumero1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumero1FocusGained

        focus = 1;
    }//GEN-LAST:event_txtNumero1FocusGained

    private void txtNumero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyTyped

        char car = evt.getKeyChar();
        if((car < '0' || car > '1')) evt.consume();
    }//GEN-LAST:event_txtNumero1KeyTyped

    private void txtNumero2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumero2FocusGained

        focus = 2;
    }//GEN-LAST:event_txtNumero2FocusGained

    private void txtNumero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyTyped

        char car = evt.getKeyChar();
        if((car < '0' || car > '1')) evt.consume();
    }//GEN-LAST:event_txtNumero2KeyTyped

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed

        limpiar();
        
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed

        ArrayList<String> result = new ArrayList();
        try{
         
            if(opcion == 1 ){
                result =  SumaBinarios(txtNumero1.getText(),txtNumero2.getText(),opcion);
               lblResultado3.setText(result.get(0));
               lblResultado1.setText(result.get(1));
            }
            if(opcion == 2){
                result =  SumaBinarios(txtNumero3.getText(),txtNumero4.getText(),opcion);
               lblResultado3.setText(result.get(0));
               lblResultado1.setText(result.get(1));
              
            }
           
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Limite para decimal: 9 digitos.\nLimite para binario: 25 digitos.");
        }
        
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void btnPorpasos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorpasos1ActionPerformed
        
        limpiar();
        
        if(visible1 == false){
           panelUnBit.setVisible(true);
           panelSumaCompuesta.setVisible(false);
           panelSumaCompuesta.repaint();
           panelCuatroBits.setVisible(false);
           panelCuatroBits.repaint();
           visible1 = true;
           visible2 = false;
           visible3 = false;
        }
        
        panelAyuda.setVisible(false);
        
    }//GEN-LAST:event_btnPorpasos1ActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
        
        ArrayList<String> result = new ArrayList();
     
        if(!lblBinario1.getText().equals("") && !lblBinario2.getText().equals("")){
            result = SumaBinarios(lblBinario1.getText(),lblBinario2.getText(),3);
                          
            lblResultado2.setText(result.get(1));
            lblBinario.setText("Binario: " + result.get(2));
            
         
            if(Integer.parseInt(result.get(1)) >  9){
                         
                lblprimerresultado.setVisible(true);
                lblcorrecion.setVisible(true);
                jSeparator2.setVisible(true);
                btncorregir.setVisible(true);
                lblmensaje.setVisible(false);
                jLabel7.setVisible(true);
                jLabel9.setVisible(true);
                lblresultadobcd.setVisible(true);
                lblprimerresultado.setText(result.get(0));
                lblcorrecion.setText("0110");
               

            }

            else{
               
                lblprimerresultado.setVisible(false);
                lblcorrecion.setVisible(false);
                jSeparator2.setVisible(false);
                btncorregir.setVisible(false);
                lblmensaje.setVisible(true);
                jLabel7.setVisible(false);
                jLabel9.setVisible(false);
                lblresultadobcd.setVisible(false);


            }
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "Debes llenar los dos campos");
            
        }
    
        
    }//GEN-LAST:event_btnCalcular2ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        
        limpiar(); 
        
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        
        llenarPanel(0, posicion, DecimalABinario(0));
        
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        
        llenarPanel(1, posicion, DecimalABinario(1));
        
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        
        llenarPanel(2, posicion, DecimalABinario(2));
        
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        
        llenarPanel(3, posicion, DecimalABinario(3));
        
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        
        llenarPanel(4, posicion, DecimalABinario(4));
        
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        
        llenarPanel(5, posicion, DecimalABinario(5));
        
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        
        llenarPanel(6, posicion, DecimalABinario(6));
        
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        
        llenarPanel(7, posicion, DecimalABinario(7));
        
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        
        llenarPanel(8, posicion, DecimalABinario(8));
        
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        
        llenarPanel(9, posicion, DecimalABinario(9));
        
    }//GEN-LAST:event_btnNueveActionPerformed

    private void txtNumero3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumero3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero3FocusGained

    private void txtNumero3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero3KeyTyped
        
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        
    }//GEN-LAST:event_txtNumero3KeyTyped

    private void txtNumero4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumero4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero4FocusGained

    private void txtNumero4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero4KeyTyped
        
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        
    }//GEN-LAST:event_txtNumero4KeyTyped

    private void lblTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitulo1MousePressed
        
        posicionX = evt.getX();
        posicionY = evt.getY();
        
    }//GEN-LAST:event_lblTitulo1MousePressed

    private void lblTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitulo1MouseDragged
        
        int nuevoX = evt.getXOnScreen();
        int nuevoY = evt.getYOnScreen();

        this.setLocation(nuevoX - posicionX, nuevoY - posicionY);
        
    }//GEN-LAST:event_lblTitulo1MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        
        posicionX = evt.getX();
        posicionY = evt.getY();
        
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        
        int nuevoX = evt.getXOnScreen();
        int nuevoY = evt.getYOnScreen();

        this.setLocation(nuevoX - posicionX, nuevoY - posicionY);
        
    }//GEN-LAST:event_jLabel2MouseDragged

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        
        limpiar();

        decimal();
        opcion = 2;
        
        txtNumero3.setEditable(true);
        txtNumero4.setEditable(true);
        
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        
        limpiar();
        
        binario();
        opcion = 1;
        
        txtNumero1.setEditable(true);
        txtNumero2.setEditable(true);
        
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void txtNumero3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero3KeyPressed
    validartamaño(evt,txtNumero3,7);
        
    }//GEN-LAST:event_txtNumero3KeyPressed

    private void txtNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero3ActionPerformed

    private void txtNumero4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero4KeyPressed
           validartamaño(evt,txtNumero4,7);

    }//GEN-LAST:event_txtNumero4KeyPressed

    private void txtNumero1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyPressed
      validartamaño(evt,txtNumero1,25);
    }//GEN-LAST:event_txtNumero1KeyPressed

    private void txtNumero2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyPressed
       validartamaño(evt,txtNumero2,25);
    }//GEN-LAST:event_txtNumero2KeyPressed

    private void btncorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncorregirActionPerformed
        
       lblresultadobcd1.setVisible(true);
       jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        String numero1 = lblprimerresultado.getText();
        String numero2 = lblcorrecion.getText();
        char acarreo = '0';
        String resultadoFin = "";
        String array_resul[] = new String[4];
        for (int i = 3; i >= 0; i--) {
                    
                  
                    if((numero1.charAt(i) == '0' && numero2.charAt(i) == '1' && acarreo == '0' ) || (numero1.charAt(i) == '1' && numero2.charAt(i) == '0' && acarreo == '0') || (numero1.charAt(i) == '0' && numero2.charAt(i) == '0' && acarreo == '1')){
                        array_resul[i] = "1";
                        acarreo = '0';
                        
                        
                    }else if((numero1.charAt(i) == '1' && numero2.charAt(i) == '1' && acarreo == '0') || (numero1.charAt(i) == '1' && numero2.charAt(i) == '0' && acarreo=='1') || (numero1.charAt(i) == '0' && numero2.charAt(i) == '1' && acarreo=='1')){
                        
                        array_resul[i] = "0";
                        acarreo = '1';
                            
                    }else if(numero1.charAt(i) == '1' && numero2.charAt(i) == '1' && acarreo == '1'){
                        array_resul[i] = "1";
                        acarreo = '1';
                    }else{
                        array_resul[i] = "0";
                        acarreo = '0';
                    }
                    
                     resultadoFin =  array_resul[i] + resultadoFin;
                                               
        }
        
        lblresultadobcd.setText(resultadoFin);
                    
        lblresultadobcd1.setText("0001");
        
    
       
            
        
    }//GEN-LAST:event_btncorregirActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        
        panelAyuda.setVisible(true);
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btnSalirAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAyudaActionPerformed
        
        panelAyuda.setVisible(false);
        
    }//GEN-LAST:event_btnSalirAyudaActionPerformed

    private void btnSalirAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirAyudaMouseClicked
        
        
        
    }//GEN-LAST:event_btnSalirAyudaMouseClicked

    private void tb_ayudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ayudaMouseEntered
        

        
    }//GEN-LAST:event_tb_ayudaMouseEntered

    private void tb_ayudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ayudaMouseExited
        

        
    }//GEN-LAST:event_tb_ayudaMouseExited

    private void txtResultadoBDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoBDecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoBDecimalActionPerformed

    private void lblprimer_numerocompBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblprimer_numerocompBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblprimer_numerocompBActionPerformed

    private void btnComparadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparadoresActionPerformed
    
         limpiar();
          panelUnBit.setVisible(false);
          panelSumaCompuesta.setVisible(false);
          panelSumaCompuesta.repaint();
          panelCuatroBits.setVisible(false);
          panelCuatroBits.repaint();
          panelComparadores.setVisible(true);
    }//GEN-LAST:event_btnComparadoresActionPerformed

    private void CalcularSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularSumaActionPerformed

        ArrayList<String> resultA = new ArrayList();
        ArrayList<String> resultB = new ArrayList();


        String num1A = DecimalABinario(Integer.parseInt(lblprimer_numerocompA.getText()));
        String num2A = DecimalABinario(Integer.parseInt(lblsegundo_numerocompA.getText()));
        
        String num1B = DecimalABinario(Integer.parseInt(lblprimer_numerocompB.getText()));
        String num2B = DecimalABinario(Integer.parseInt(lblsegundo_numerocompB.getText()));

        resultA =  SumaBinarios(num1A,num2A,3);
        
        resultB =  SumaBinarios(num1B,num2B,3);

        /*System.out.println(SumaBinarios(result.get(1),num2A,3));
        result =  SumaBinarios(num1B,num2B3);

        
        System.out.println(SumaBinarios(num1A,num2A,3));
        System.out.println(SumaBinarios(num1B,num2B,3));   */    
        
        
    }//GEN-LAST:event_CalcularSumaActionPerformed

    private void txtResultadoADecimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoADecimal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoADecimal1ActionPerformed

    private void lblprimer_numerocompAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblprimer_numerocompAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblprimer_numerocompAActionPerformed

    private void lblsegundo_numerocompAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsegundo_numerocompAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsegundo_numerocompAActionPerformed

    private void lblsegundo_numerocompBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsegundo_numerocompBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsegundo_numerocompBActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    //----------------------------------------------------------------------------------------------
    
    public void llenarPanel(int numero, int ps, String resultadoBinario){
        
        switch(ps){
            case 1: 
                lblPrimerDigito.setText(String.valueOf(numero));
                lblBinario1.setText(resultadoBinario);
                posicion++;
                break;
            case 2:
                lblSegundoDigito.setText(String.valueOf(numero));
                lblBinario2.setText(resultadoBinario);
                posicion++;
                break;
        }
        
    }
    
    public int binarioADecimal(String numero){
        
        int longitud = numero.length();
        double contador = 0;
        double acumulador = 0;
        char caracter;
        String caracterString;
        
        for(int i = longitud; i > 0; i--){
            caracter = numero.charAt(i-1);
            caracterString = Character.toString(caracter);
            acumulador += Integer.parseInt(caracterString) * (Math.pow(2, contador));
            contador = contador + 1;
            
        }
        int decimalSalida = (int)acumulador;
        return decimalSalida;
        
    }
    
    public String DecimalABinario(int numero){
        
        resultado = "";
        
        double base[] = new double[25];
        int arregloBinario[] = new int[25];
        
        for(int i = 0; i < base.length; i++){
            base[i] = Math.pow(2, i);
            arregloBinario[i] = 0;
        }
        
        for(int i = 24; i >= 0; i--){
            if(base[i] <= numero){
                arregloBinario[i] = 1;
                numero -= base[i];
            }
            resultado = resultado + arregloBinario[i];
        }
        
        String resultadoFinal = (String) resultado.replaceFirst("^0*", "");

        if(visible3 == true){
            
            switch(resultadoFinal.length()){
                case 0:
                    resultadoFinal = "0000";
                    break;
                case 1:
                    resultadoFinal = "000" + resultadoFinal;
                    break;
                case 2:
                    resultadoFinal = "00" + resultadoFinal;
                    break;
                case 3:
                    resultadoFinal = "0" + resultadoFinal;
                    break;
            }
        }
        

        
        return resultadoFinal;

    }
    
    
     
    
    public void validartamaño(KeyEvent evt, JTextField txt, int limite){
        
        if(txt.getText().length() == limite){
                 
            txt.setEditable(false);
            
            if(evt.getKeyCode() == 8)
            
            txt.setEditable(true);
        }
    }
    
    
       public ArrayList<String> SumaBinarios(String numero1,String numero2, int opcion){
       
        ArrayList<String> resultadosF = new ArrayList();
    
            switch (opcion) {
            case 1:
                acarreo = 0;
                numeroMasLargo = 0;
                char[] valores1 = new char[26];
                char[] valores2 = new char[26];
                for(int i = 0; i < 26; i++){
                    valores1[i] = '0';
                    valores2[i] = '0';
                }   if(!numero1.equals("") && !numero2.equals("")){
                    
                    int longitud1 = numero1.length();
                    int longitud2 = numero2.length();
                    int contador1 = longitud1;
                    int contador2 = longitud2;
                    
                    for(int i = 0; i < longitud1; i++){
                        valores1[i] = numero1.charAt(contador1-1);
                        contador1--;
                    }
                    
                    for(int i = 0; i < longitud2; i++){
                        valores2[i] = numero2.charAt(contador2-1);
                        contador2--;
                    }
                    
                    if(numero1.length() > numero2.length()){
                        numeroMasLargo = numero1.length();
                    }else if(numero1.length() < numero2.length()){
                        numeroMasLargo = numero1.length();
                    }else{
                        numeroMasLargo = numero2.length();
                    }
                    
                    for(int i = 0; i < numeroMasLargo+1; i++){
                        String contenedor1 = Character.toString(valores1[i]);
                        String contenedor2 = Character.toString(valores2[i]);
                        int final1 = Integer.parseInt(contenedor1);
                        int final2 = Integer.parseInt(contenedor2);
                        
                        if((final1 + final2) == 0 && acarreo == 0){
                            resultado = "0" + resultado;
                            acarreo = 0;
                        }else if((final1 + final2) == 0 && acarreo == 1){
                            resultado = "1" + resultado;
                            acarreo = 0;
                        }else if((final1 + final2) == 1 && acarreo == 0){
                            resultado = "1" + resultado;
                            acarreo = 0;
                        }else if((final1 + final2) == 1 && acarreo == 1){
                            resultado = "0" + resultado;
                            acarreo = 1;
                        }else if((final1 + final2) == 2 && acarreo == 0){
                            resultado = "0" + resultado;
                            acarreo = 1;
                        }else if((final1 + final2) == 2 && acarreo == 1){
                            resultado = "1" + resultado;
                            acarreo = 1;
                        }
                    }
                    
                    String result_final = (String) resultado.replaceFirst("^0*", "");
                                                     
                    int decimal = binarioADecimal(result_final);
                    String decimalFinal = Integer.toString(decimal);
                    
                    
                    resultadosF.add(decimalFinal);
                    resultadosF.add(result_final);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Debes llenar los dos campos 1");
                }   resultado = "";
                break;
            case 2:
                try{
                    if(!numero1.equals("") && !numero2.equals("")){
                        
                        int suma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                                         
                        resultadosF.add(String.valueOf(suma));
                        resultadosF.add(DecimalABinario(suma));
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Debes llenar los dos campos");
                    }
                    
                    resultado = "";
                    
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Limite para decimal: 9 digitos.\nLimite para binario: 25 digitos");
                } 
              break;
            case 3:
                String array_resul [] = new String[4]; 
                String resultadoFin = "";
                String primerdigito = "";
  
                int cont = 1;

                char acarreo = '0';
                if(!numero1.equals("") && !numero2.equals("")){
                
                for (int i = 3; i >= 0; i--) {
                    
                  
                    if((numero1.charAt(i) == '0' && numero2.charAt(i) == '1' && acarreo == '0' ) || (numero1.charAt(i) == '1' && numero2.charAt(i) == '0' && acarreo == '0') || (numero1.charAt(i) == '0' && numero2.charAt(i) == '0' && acarreo == '1')){
                        array_resul[i] = "1";
                        acarreo = '0';
                        
                        
                    }else if((numero1.charAt(i) == '1' && numero2.charAt(i) == '1' && acarreo == '0') || (numero1.charAt(i) == '1' && numero2.charAt(i) == '0' && acarreo=='1') || (numero1.charAt(i) == '0' && numero2.charAt(i) == '1' && acarreo=='1')){
                        
                        array_resul[i] = "0";
                        acarreo = '1';
                            
                    }else if(numero1.charAt(i) == '1' && numero2.charAt(i) == '1' && acarreo == '1'){
                        array_resul[i] = "1";
                        acarreo = '1';
                    }else{
                        array_resul[i] = "0";
                        acarreo = '0';
                    }
                    
                    resultadoFin =  array_resul[i] + resultadoFin;
                    
                    if(i==0 && cont == 1){
                                          
                        cont++;
                        if(binarioADecimal(resultadoFin) > 9 || acarreo == '1'){    
                            resultadosF.add(String.valueOf(resultadoFin));
                            primerdigito = "0001";
                            i = 4;                             
                            numero1 = resultadoFin;
                            resultadoFin = "";
                            acarreo = '0';                    
                            //Se debe sumar ahora con el 6
                            numero2 = "0110";
                        }
                        
                        else{
                            
                          resultadosF.add("");
                        }
                        
                    }
                }
               
                  
                    int decimal = Integer.parseInt(String.valueOf(binarioADecimal(primerdigito)) + String.valueOf(binarioADecimal(resultadoFin)));
                  
                    resultadosF.add(String.valueOf(decimal));
                    resultadosF.add(String.valueOf(DecimalABinario(decimal)));
                    
                }
                
            else{
               JOptionPane.showMessageDialog(null, "Debes llenar los tres campos");
           }
                    
                    
                    
                break;
                    
            default:
                break;
        }
        
        return resultadosF;
        
         
    }
    
    
    public void decimal(){
        
        Color verde = new Color(152,172,34);
        
        btnDecimal.setBackground(Color.WHITE);
        btnDecimal.setForeground(verde);
        btnBinario.setBackground(verde);
        btnBinario.setForeground(Color.WHITE);
        txtNumero1.setEnabled(false);
        txtNumero2.setEnabled(false);
        txtNumero3.setEnabled(true);
        txtNumero4.setEnabled(true);
        
    }
    
    public void binario(){
        
        Color verde = new Color(152,172,34);
        
        btnBinario.setBackground(Color.WHITE);
        btnBinario.setForeground(verde);
        btnDecimal.setBackground(verde);
        btnDecimal.setForeground(Color.WHITE);
        txtNumero3.setEnabled(false);
        txtNumero4.setEnabled(false);
        txtNumero1.setEnabled(true);
        txtNumero2.setEnabled(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularSuma;
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JButton btnCalculoRapido;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnComparadores;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorpasos;
    private javax.swing.JButton btnPorpasos1;
    private javax.swing.JButton btnSalirAyuda;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton btnValorCero;
    private javax.swing.JButton btnValorUno;
    private javax.swing.JButton btncorregir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblAcarreo;
    private javax.swing.JLabel lblBinario;
    private javax.swing.JLabel lblBinario1;
    private javax.swing.JLabel lblBinario2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagenEntrada;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblPrimerDigito;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblResultado3;
    private javax.swing.JLabel lblResultadoABinario;
    private javax.swing.JLabel lblResultadoBBinario;
    private javax.swing.JLabel lblSegundoDigito;
    private javax.swing.JLabel lblSignoSuma;
    private javax.swing.JLabel lblSignoSuma1;
    private javax.swing.JLabel lblSignoSuma2;
    private javax.swing.JLabel lblSignoSuma3;
    private javax.swing.JLabel lblSignoSuma4;
    private javax.swing.JLabel lblSignoSuma5;
    private javax.swing.JLabel lblSignoSuma6;
    private javax.swing.JLabel lblSignoSuma7;
    private javax.swing.JLabel lblSignoSuma8;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblcorrecion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JTextField lblprimer_numerocompA;
    private javax.swing.JTextField lblprimer_numerocompB;
    private javax.swing.JLabel lblprimerresultado;
    private javax.swing.JLabel lblresultadobcd;
    private javax.swing.JLabel lblresultadobcd1;
    private javax.swing.JTextField lblsegundo_numerocompA;
    private javax.swing.JTextField lblsegundo_numerocompB;
    private javax.swing.JPanel panelAyuda;
    private javax.swing.JPanel panelAyuda1;
    private javax.swing.JPanel panelAyuda2;
    private javax.swing.JPanel panelAyuda3;
    private javax.swing.JPanel panelComparadores;
    private javax.swing.JPanel panelCuatroBits;
    private javax.swing.JPanel panelSumaCompuesta;
    private javax.swing.JPanel panelUnBit;
    private javax.swing.JScrollPane scrollDos;
    private javax.swing.JScrollPane scrollUno;
    private javax.swing.JTabbedPane tb_ayuda;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtNumero3;
    private javax.swing.JTextField txtNumero4;
    private javax.swing.JTextField txtResultadoADecimal1;
    private javax.swing.JTextField txtResultadoBDecimal;
    // End of variables declaration//GEN-END:variables

    public void limpiar(){
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        lblresultadobcd.setVisible(false);
        lblprimerresultado.setVisible(false);
        lblcorrecion.setVisible(false);
        lblresultadobcd.setText("");
        lblresultadobcd1.setText("");
        lblresultadobcd1.setVisible(false);
        lblprimerresultado.setText("");
        lblcorrecion.setText("");
        jSeparator2.setVisible(false);
        btncorregir.setVisible(false);
        lblmensaje.setVisible(false);
        acarreo = 0;
        numeroMasLargo = 0;
        posicion = 1;
        numero1 = 0;
        numero2 = 0;
        numero3 = 0;
        lblNumero1.setText("");
        lblNumero2.setText("");
        lblNumero3.setText("");
        lblResultado.setText("Resultado:  ");
        lblAcarreo.setText("Acarreo:  ");
        lblPrimerDigito.setText("");
        lblSegundoDigito.setText("");
        lblResultado2.setText("");
        lblBinario.setText("Binario: ");
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtNumero3.setText("");
        txtNumero4.setText("");
        lblResultado1.setText("");
        lblResultado3.setText("");
        lblBinario1.setText("");
        lblBinario2.setText("");
        txtNumero1.setEnabled(false);
        txtNumero2.setEnabled(false);
        txtNumero3.setEnabled(false);
        txtNumero4.setEnabled(false);
        
        Color verde = new Color(152,172,34);
        
        btnBinario.setBackground(verde);
        btnBinario.setForeground(Color.WHITE);
        btnDecimal.setBackground(verde);
        btnDecimal.setForeground(Color.WHITE);
        opcion = 0;
    }
    
}
