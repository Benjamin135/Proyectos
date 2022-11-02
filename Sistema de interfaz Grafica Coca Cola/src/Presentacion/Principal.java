package Presentacion;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    String nombreAdministrador = "";
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        menu.setBackground(new Color(0f,0f,0f,0f));
        textarea1.setText("\n  Aquí aparece el resultado del cálculo de las vacaciones.");
        nombreAdministrador = Bienvenida.texto;
        Lbl_Nombre.setText(nombreAdministrador);
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return icono;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_ApellidoP = new javax.swing.JTextField();
        Txt_ApellidoM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cbx_Departamento = new javax.swing.JComboBox<>();
        Cbx_Antiguedad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Lbl_Nombre = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        menuColorFondo = new javax.swing.JMenu();
        fondoRojo = new javax.swing.JMenuItem();
        fondoNegro = new javax.swing.JMenuItem();
        fondoMorado = new javax.swing.JMenuItem();
        menuNuevo = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuCalcular = new javax.swing.JMenu();
        menuVacaciones = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();
        creador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setBackground(new java.awt.Color(255, 0, 0));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(790, 600));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 0, 0));
        Panel.setForeground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(790, 600));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-coca.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos del trabajador para el cálculo de vacaciones");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Completo:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido Paterno:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido Materno:");

        Txt_Nombre.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(255, 0, 0));
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });

        Txt_ApellidoP.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Txt_ApellidoP.setForeground(new java.awt.Color(255, 0, 0));
        Txt_ApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ApellidoPKeyTyped(evt);
            }
        });

        Txt_ApellidoM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Txt_ApellidoM.setForeground(new java.awt.Color(255, 0, 0));
        Txt_ApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ApellidoMKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selecciona el Departamento:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selecciona la Antigüedad:");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Resultado del Cálculo:");

        Cbx_Departamento.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Cbx_Departamento.setForeground(new java.awt.Color(255, 0, 0));
        Cbx_Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Atención al Cliente", "Departamento de Logística", "Departamento de Gerencia" }));

        Cbx_Antiguedad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Cbx_Antiguedad.setForeground(new java.awt.Color(255, 0, 0));
        Cbx_Antiguedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1 año de servicio", "2 a 6 años de servicio", "7 o más años de servicio" }));

        textarea1.setEditable(false);
        textarea1.setColumns(20);
        textarea1.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        textarea1.setForeground(new java.awt.Color(255, 0, 0));
        textarea1.setRows(5);
        jScrollPane1.setViewportView(textarea1);

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("©2022 The Coca-Cola Company | Todos los derechos reservados");

        Lbl_Nombre.setFont(new java.awt.Font("Roboto Cn", 3, 25)); // NOI18N
        Lbl_Nombre.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Cbx_Antiguedad, 0, 260, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(Cbx_Departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cbx_Antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_ApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addGap(15, 15, 15))
        );

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 0, 0));

        menuOpciones.setBackground(new java.awt.Color(255, 255, 255));
        menuOpciones.setForeground(new java.awt.Color(255, 0, 0));
        menuOpciones.setText("Opciones");
        menuOpciones.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        menuColorFondo.setForeground(new java.awt.Color(255, 0, 0));
        menuColorFondo.setText("Color de fondo");
        menuColorFondo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        fondoRojo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        fondoRojo.setForeground(new java.awt.Color(255, 0, 0));
        fondoRojo.setText("Rojo");
        fondoRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoRojoActionPerformed(evt);
            }
        });
        menuColorFondo.add(fondoRojo);

        fondoNegro.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        fondoNegro.setForeground(new java.awt.Color(255, 0, 0));
        fondoNegro.setText("Negro");
        fondoNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoNegroActionPerformed(evt);
            }
        });
        menuColorFondo.add(fondoNegro);

        fondoMorado.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        fondoMorado.setForeground(new java.awt.Color(255, 0, 0));
        fondoMorado.setText("Morado");
        fondoMorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoMoradoActionPerformed(evt);
            }
        });
        menuColorFondo.add(fondoMorado);

        menuOpciones.add(menuColorFondo);

        menuNuevo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        menuNuevo.setForeground(new java.awt.Color(255, 0, 0));
        menuNuevo.setText("Nuevo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        menuOpciones.add(menuNuevo);

        menuSalir.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(255, 0, 0));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuOpciones.add(menuSalir);

        menu.add(menuOpciones);

        menuCalcular.setBackground(new java.awt.Color(255, 255, 255));
        menuCalcular.setForeground(new java.awt.Color(255, 0, 0));
        menuCalcular.setText("Calcular");
        menuCalcular.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        menuVacaciones.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        menuVacaciones.setForeground(new java.awt.Color(255, 0, 0));
        menuVacaciones.setText("Vacaciones");
        menuVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVacacionesActionPerformed(evt);
            }
        });
        menuCalcular.add(menuVacaciones);

        menu.add(menuCalcular);

        menuAcercaDe.setBackground(new java.awt.Color(255, 255, 255));
        menuAcercaDe.setForeground(new java.awt.Color(255, 0, 0));
        menuAcercaDe.setText("Acerca de");
        menuAcercaDe.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        creador.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        creador.setForeground(new java.awt.Color(255, 0, 0));
        creador.setText("El creador");
        creador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadorActionPerformed(evt);
            }
        });
        menuAcercaDe.add(creador);

        menu.add(menuAcercaDe);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_ApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoPKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_ApellidoPKeyTyped

    private void Txt_ApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoMKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_ApellidoMKeyTyped

    private void menuVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVacacionesActionPerformed
        String nombre = Txt_Nombre.getText();
        String apellidoP = Txt_ApellidoP.getText();
        String apellidoM = Txt_ApellidoM.getText();
        String departamento = Cbx_Departamento.getSelectedItem().toString();
        String antiguedad = Cbx_Antiguedad.getSelectedItem().toString();
        if (nombre.equals("") || apellidoP.equals("") || apellidoM.equals("")
            || departamento.equals(" ") || antiguedad.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos.", "Mensaje", 1);
        } else {
            if (departamento.equals("Atención al Cliente")) {
                if (antiguedad.equals("1 año de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 6 días de vacaciones.");
                }
                if (antiguedad.equals("2 a 6 años de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 14 días de vacaciones.");
                }
                if (antiguedad.equals("7 o más años de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 20 días de vacaciones.");
                }
            }
            if (departamento.equals("Departamento de Logística")) {
                if (antiguedad.equals("1 año de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 7 días de vacaciones.");
                }
                if (antiguedad.equals("2 a 6 años de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 15 días de vacaciones.");
                }
                if (antiguedad.equals("7 o más años de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 22 días de vacaciones.");
                }
            }
            if (departamento.equals("Departamento de Gerencia")) {
                if (antiguedad.equals("1 año de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 10 días de vacaciones.");
                }
                if (antiguedad.equals("2 a 6 años de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 20 días de vacaciones.");
                }
                if (antiguedad.equals("7 o más años de servicio")) {
                    textarea1.setText("\n  El trabajador " + nombre + " " + apellidoP + " " + apellidoM +
                                      "\n  quien labora en " + departamento + " con " + antiguedad + 
                                      "\n  recibe 30 días de vacaciones.");
                }
            }
        }
    }//GEN-LAST:event_menuVacacionesActionPerformed

    private void fondoRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoRojoActionPerformed
        Panel.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_fondoRojoActionPerformed

    private void fondoNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoNegroActionPerformed
        Panel.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_fondoNegroActionPerformed

    private void fondoMoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoMoradoActionPerformed
        Panel.setBackground(new Color(51,0,51));
    }//GEN-LAST:event_fondoMoradoActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        Txt_Nombre.setText("");
        Txt_ApellidoP.setText("");
        Txt_ApellidoM.setText("");
        Cbx_Departamento.setSelectedIndex(0);
        Cbx_Antiguedad.setSelectedIndex(0);
        textarea1.setText("\n  Aquí aparece el resultado del cálculo de las vacaciones.");
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        new Bienvenida().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void creadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadorActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Desarrollado por Benjamin Condori Vasquez\n" +
                                                "      www.youtube.com/BenjaminCV", "Mensaje", 1);
    }//GEN-LAST:event_creadorActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbx_Antiguedad;
    private javax.swing.JComboBox<String> Cbx_Departamento;
    private javax.swing.JLabel Lbl_Nombre;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField Txt_ApellidoM;
    private javax.swing.JTextField Txt_ApellidoP;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JMenuItem creador;
    private javax.swing.JMenuItem fondoMorado;
    private javax.swing.JMenuItem fondoNegro;
    private javax.swing.JMenuItem fondoRojo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenu menuCalcular;
    private javax.swing.JMenu menuColorFondo;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuVacaciones;
    private javax.swing.JTextArea textarea1;
    // End of variables declaration//GEN-END:variables
}
