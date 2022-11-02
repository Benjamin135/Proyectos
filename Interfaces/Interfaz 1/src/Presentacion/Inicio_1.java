package Presentacion;

import Negocio.Mover;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;

public class Inicio_1 extends javax.swing.JFrame {

    public MigLayout layout;
    Mover mover = new Mover();

    public Inicio_1() {
        this.setUndecorated(true);
        initComponents();
//        panel.setLayer(menu, JLayeredPane.MODAL_LAYER);
//        panel.setLayer(card_panel, JLayeredPane.DEFAULT_LAYER);
//        panel.setLayout(layout);
//        panel.add(menu, "pos 0 0 100% 100%", 0);
//        panel.add(card_panel, "pos 50 50 100% 100%", 0);
        this.setLocationRelativeTo(null);
//        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        menu = new Librerias.PanelRound();
        panel_imagen = new Librerias.PanelRound();
        rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_almacen = new button.MyButton();
        btn_grafico = new button.MyButton();
        btn_venta = new button.MyButton();
        btn_acceso = new button.MyButton();
        btn_acerca = new button.MyButton();
        btn_salir = new button.MyButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_usuario = new button.MyButton();
        btn_cerrar = new button.MyButton();
        card_panel = new javax.swing.JPanel();
        panel_usuario = new javax.swing.JPanel();
        rSFotoSquareResize1 = new rojerusan.RSFotoSquareResize();
        panel_login = new Librerias.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        btn_ingresar = new button.MyButton();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        check_mostrar = new javax.swing.JCheckBox();
        panel_venta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panel_almacen = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panel_grafico = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panel_acceso = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panel_acerca = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_menu = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(35, 35, 35));
        panel.setForeground(new java.awt.Color(0, 0, 0));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(27, 27, 27));
        menu.setRoundBottomLeft(27);
        menu.setRoundTopLeft(27);
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_imagen.setBackground(new java.awt.Color(56, 56, 56));
        panel_imagen.setRoundBottomLeft(20);
        panel_imagen.setRoundBottomRight(20);
        panel_imagen.setRoundTopLeft(20);
        panel_imagen.setRoundTopRight(20);
        panel_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelCircleImage1.setColorBorde(new java.awt.Color(45, 235, 201));
        rSPanelCircleImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profile.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
        rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
        rSPanelCircleImage1Layout.setHorizontalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        rSPanelCircleImage1Layout.setVerticalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        panel_imagen.add(rSPanelCircleImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 110));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");
        panel_imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        panel_imagen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, 20));

        menu.add(panel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 220, 130));

        btn_almacen.setBackground(new java.awt.Color(27, 27, 27));
        btn_almacen.setForeground(new java.awt.Color(255, 255, 255));
        btn_almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cubo (2).png"))); // NOI18N
        btn_almacen.setText("       Almacen");
        btn_almacen.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_almacen.setColor(new java.awt.Color(27, 27, 27));
        btn_almacen.setColorClick(new java.awt.Color(102, 102, 102));
        btn_almacen.setColorOver(new java.awt.Color(56, 56, 56));
        btn_almacen.setRadius(15);
        btn_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_almacenActionPerformed(evt);
            }
        });
        menu.add(btn_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, 220, 40));

        btn_grafico.setBackground(new java.awt.Color(27, 27, 27));
        btn_grafico.setForeground(new java.awt.Color(255, 255, 255));
        btn_grafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tendencia.png"))); // NOI18N
        btn_grafico.setText("       Grafico");
        btn_grafico.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_grafico.setColor(new java.awt.Color(27, 27, 27));
        btn_grafico.setColorClick(new java.awt.Color(102, 102, 102));
        btn_grafico.setColorOver(new java.awt.Color(56, 56, 56));
        btn_grafico.setRadius(15);
        btn_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_graficoActionPerformed(evt);
            }
        });
        menu.add(btn_grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, 40));

        btn_venta.setBackground(new java.awt.Color(27, 27, 27));
        btn_venta.setForeground(new java.awt.Color(255, 255, 255));
        btn_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolsa-de-la-compra.png"))); // NOI18N
        btn_venta.setText("        Ventas");
        btn_venta.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_venta.setColor(new java.awt.Color(27, 27, 27));
        btn_venta.setColorClick(new java.awt.Color(102, 102, 102));
        btn_venta.setColorOver(new java.awt.Color(56, 56, 56));
        btn_venta.setRadius(15);
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });
        menu.add(btn_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 345, 220, 40));

        btn_acceso.setBackground(new java.awt.Color(27, 27, 27));
        btn_acceso.setForeground(new java.awt.Color(255, 255, 255));
        btn_acceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        btn_acceso.setText("        Acceso");
        btn_acceso.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_acceso.setColor(new java.awt.Color(27, 27, 27));
        btn_acceso.setColorClick(new java.awt.Color(102, 102, 102));
        btn_acceso.setColorOver(new java.awt.Color(56, 56, 56));
        btn_acceso.setRadius(15);
        btn_acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accesoActionPerformed(evt);
            }
        });
        menu.add(btn_acceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 40));

        btn_acerca.setBackground(new java.awt.Color(27, 27, 27));
        btn_acerca.setForeground(new java.awt.Color(255, 255, 255));
        btn_acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-informacion (1).png"))); // NOI18N
        btn_acerca.setText("        Acerca de");
        btn_acerca.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_acerca.setColor(new java.awt.Color(27, 27, 27));
        btn_acerca.setColorClick(new java.awt.Color(102, 102, 102));
        btn_acerca.setColorOver(new java.awt.Color(56, 56, 56));
        btn_acerca.setRadius(15);
        btn_acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acercaActionPerformed(evt);
            }
        });
        menu.add(btn_acerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 435, 220, 40));

        btn_salir.setBackground(new java.awt.Color(45, 235, 201));
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Exit");
        btn_salir.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_salir.setColor(new java.awt.Color(45, 235, 201));
        btn_salir.setColorClick(new java.awt.Color(45, 235, 201));
        btn_salir.setColorOver(new java.awt.Color(100, 205, 187));
        btn_salir.setRadius(15);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        menu.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 220, 40));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/programming-language (1).png"))); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 130));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DASHBOARD");
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 20));

        btn_usuario.setBackground(new java.awt.Color(27, 27, 27));
        btn_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (1).png"))); // NOI18N
        btn_usuario.setText("       Usuario");
        btn_usuario.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_usuario.setColor(new java.awt.Color(27, 27, 27));
        btn_usuario.setColorClick(new java.awt.Color(102, 102, 102));
        btn_usuario.setColorOver(new java.awt.Color(56, 56, 56));
        btn_usuario.setRadius(15);
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });
        menu.add(btn_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, 40));

        btn_cerrar.setBackground(new java.awt.Color(27, 27, 27));
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove-button (1).png"))); // NOI18N
        btn_cerrar.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_cerrar.setColor(new java.awt.Color(27, 27, 27));
        btn_cerrar.setColorClick(new java.awt.Color(102, 102, 102));
        btn_cerrar.setColorOver(new java.awt.Color(56, 56, 56));
        btn_cerrar.setRadius(15);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        menu.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        panel.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 720));

        card_panel.setBackground(new java.awt.Color(35, 35, 35));
        card_panel.setLayout(new java.awt.CardLayout());

        panel_usuario.setBackground(new java.awt.Color(35, 35, 35));
        panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSFotoSquareResize1.setColorBotonRemover(new java.awt.Color(255, 255, 255));
        rSFotoSquareResize1.setImagenDefault(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profile.png"))); // NOI18N
        panel_usuario.add(rSFotoSquareResize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 310, 430));

        panel_login.setBackground(new java.awt.Color(27, 27, 27));
        panel_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 235, 201)));
        panel_login.setRoundBottomLeft(15);
        panel_login.setRoundBottomRight(15);
        panel_login.setRoundTopLeft(15);
        panel_login.setRoundTopRight(15);
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/locked-padlock- (3).png"))); // NOI18N
        panel_login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, 80));

        btn_ingresar.setBackground(new java.awt.Color(45, 235, 201));
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorderColor(new java.awt.Color(27, 27, 27));
        btn_ingresar.setColor(new java.awt.Color(45, 235, 201));
        btn_ingresar.setColorClick(new java.awt.Color(45, 235, 201));
        btn_ingresar.setColorOver(new java.awt.Color(100, 205, 187));
        btn_ingresar.setRadius(15);
        panel_login.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 360, 230, 40));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login");
        panel_login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, 40));

        txt_usuario.setBackground(new java.awt.Color(56, 56, 56));
        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(null);
        panel_login.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 180, 230, 30));

        txt_password.setBackground(new java.awt.Color(56, 56, 56));
        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(null);
        panel_login.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 250, 230, 30));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        panel_login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 70, 20));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario:");
        panel_login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 155, 70, 20));

        check_mostrar.setBackground(new java.awt.Color(27, 27, 27));
        check_mostrar.setForeground(new java.awt.Color(153, 153, 153));
        check_mostrar.setText("Mostrar");
        check_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_mostrarActionPerformed(evt);
            }
        });
        panel_login.add(check_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, -1, -1));

        panel_usuario.add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 340, 430));

        card_panel.add(panel_usuario, "card2");

        panel_venta.setBackground(new java.awt.Color(35, 35, 35));
        panel_venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Panel venta");
        panel_venta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 140, 40));

        card_panel.add(panel_venta, "card3");

        panel_almacen.setBackground(new java.awt.Color(35, 35, 35));
        panel_almacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Panel almacen");
        panel_almacen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 190, 40));

        card_panel.add(panel_almacen, "card4");

        panel_grafico.setBackground(new java.awt.Color(35, 35, 35));
        panel_grafico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Panel grafico");
        panel_grafico.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 160, 40));

        card_panel.add(panel_grafico, "card5");

        panel_acceso.setBackground(new java.awt.Color(35, 35, 35));
        panel_acceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Panel acceso");
        panel_acceso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 160, 40));

        card_panel.add(panel_acceso, "card6");

        panel_acerca.setBackground(new java.awt.Color(35, 35, 35));
        panel_acerca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Panel acerca de");
        panel_acerca.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, 40));

        card_panel.add(panel_acerca, "card7");

        panel.add(card_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1120, 650));

        btn_menu.setBackground(new java.awt.Color(35, 35, 35));
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu (1).png"))); // NOI18N
        btn_menu.setBorderColor(new java.awt.Color(35, 35, 35));
        btn_menu.setColor(new java.awt.Color(35, 35, 35));
        btn_menu.setColorClick(new java.awt.Color(102, 102, 102));
        btn_menu.setColorOver(new java.awt.Color(56, 56, 56));
        btn_menu.setRadius(15);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        panel.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        mover.animar(menu);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        mover.animar(menu);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
        mover.hidePanel(panel_usuario, panel_almacen, panel_grafico, panel_venta, panel_acceso, panel_acerca);
        panel_usuario.setVisible(true);
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_almacenActionPerformed
        mover.hidePanel(panel_usuario, panel_almacen, panel_grafico, panel_venta, panel_acceso, panel_acerca);
        panel_almacen.setVisible(true);
    }//GEN-LAST:event_btn_almacenActionPerformed

    private void btn_graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_graficoActionPerformed
        mover.hidePanel(panel_usuario, panel_almacen, panel_grafico, panel_venta, panel_acceso, panel_acerca);
        panel_grafico.setVisible(true);
    }//GEN-LAST:event_btn_graficoActionPerformed

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
        mover.hidePanel(panel_usuario, panel_almacen, panel_grafico, panel_venta, panel_acceso, panel_acerca);
        panel_venta.setVisible(true);
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void btn_accesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accesoActionPerformed
        mover.hidePanel(panel_usuario, panel_almacen, panel_grafico, panel_venta, panel_acceso, panel_acerca);
        panel_acceso.setVisible(true);
    }//GEN-LAST:event_btn_accesoActionPerformed

    private void btn_acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acercaActionPerformed
        mover.hidePanel(panel_usuario, panel_almacen, panel_grafico, panel_venta, panel_acceso, panel_acerca);
        panel_acerca.setVisible(true);
    }//GEN-LAST:event_btn_acercaActionPerformed

    private void check_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_mostrarActionPerformed
        if (check_mostrar.isSelected()) {
            txt_password.setEchoChar((char)0);
        } else {
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_check_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btn_acceso;
    private button.MyButton btn_acerca;
    private button.MyButton btn_almacen;
    private button.MyButton btn_cerrar;
    private button.MyButton btn_grafico;
    private button.MyButton btn_ingresar;
    private button.MyButton btn_menu;
    private button.MyButton btn_salir;
    private button.MyButton btn_usuario;
    private button.MyButton btn_venta;
    private javax.swing.JPanel card_panel;
    private javax.swing.JCheckBox check_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Librerias.PanelRound menu;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_acceso;
    private javax.swing.JPanel panel_acerca;
    private javax.swing.JPanel panel_almacen;
    private javax.swing.JPanel panel_grafico;
    private Librerias.PanelRound panel_imagen;
    private Librerias.PanelRound panel_login;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JPanel panel_venta;
    private rojerusan.RSFotoSquareResize rSFotoSquareResize1;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
