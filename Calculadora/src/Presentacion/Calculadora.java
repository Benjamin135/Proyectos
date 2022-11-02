package Presentacion;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager(null);
    ScriptEngine se = sem.getEngineByName("JavaScript");
    String operacion = "";
    int xMouse, yMouse;
    boolean dark_mode = true;
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/calculator.png")));
    }
    
    public void añadirNumero(String digito) {
        txt_Operacion.setText(txt_Operacion.getText() + digito);
        switch (digito) {
            case "×":
                operacion = operacion + "*";
                break;
            case "÷":
                operacion = operacion + "/";
                break;
            default:
                operacion = operacion + digito;
                break;
        }
    }
    
    public void darkMode(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_pressed_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
        btn.setForeground(Color.decode("#9BB3A8"));
    }
    
    public void darkMode2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_pressed_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_pressed_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
        btn.setForeground(Color.decode("#00B587"));
    }
    
    public void darkLight(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_press.png")));
        btn.setForeground(new Color(49,60,70));
    }
    
    public void darkLight2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_press.png")));
        btn.setForeground(new Color(49,60,70));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        txt_Operacion = new javax.swing.JLabel();
        txt_Resultado = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        cambiar_tema = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        btn_9 = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(241, 253, 251));
        Panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel1MouseDragged(evt);
            }
        });
        Panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel1MousePressed(evt);
            }
        });
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Operacion.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        txt_Operacion.setForeground(new java.awt.Color(49, 60, 70));
        txt_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Panel1.add(txt_Operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 65, 310, 36));

        txt_Resultado.setFont(new java.awt.Font("Roboto", 1, 45)); // NOI18N
        txt_Resultado.setForeground(new java.awt.Color(49, 60, 70));
        txt_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Panel1.add(txt_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, 310, 49));

        minimize.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 204, 0));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("●");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        Panel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 20, 20));

        exit.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("●");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        Panel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 20, 20));

        cambiar_tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_cambiar.png"))); // NOI18N
        cambiar_tema.setBorder(null);
        cambiar_tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiar_tema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_temaActionPerformed(evt);
            }
        });
        Panel1.add(cambiar_tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 170));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_9.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_9.setForeground(new java.awt.Color(49, 60, 70));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        Panel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

        btn_borrar.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(49, 60, 70));
        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_borrar.setText("C");
        btn_borrar.setBorder(null);
        btn_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar.setFocusPainted(false);
        btn_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        Panel2.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_eliminar.setFont(new java.awt.Font("MS Gothic", 1, 30)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(49, 60, 70));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_eliminar.setText("←");
        btn_eliminar.setBorder(null);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setFocusPainted(false);
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        Panel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(49, 60, 70));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setBorder(null);
        btn_porcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        Panel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_dividir.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_dividir.setForeground(new java.awt.Color(49, 60, 70));
        btn_dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_dividir.setText("  ÷  ");
        btn_dividir.setBorder(null);
        btn_dividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dividir.setFocusPainted(false);
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_dividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        Panel2.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_multiplicar.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(49, 60, 70));
        btn_multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_multiplicar.setText("×");
        btn_multiplicar.setBorder(null);
        btn_multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_multiplicar.setFocusPainted(false);
        btn_multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_multiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        Panel2.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 50));

        btn_restar.setFont(new java.awt.Font("Roboto", 0, 35)); // NOI18N
        btn_restar.setForeground(new java.awt.Color(49, 60, 70));
        btn_restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_restar.setText("-");
        btn_restar.setBorder(null);
        btn_restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_restar.setFocusPainted(false);
        btn_restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_restar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });
        Panel2.add(btn_restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 50));

        btn_sumar.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_sumar.setForeground(new java.awt.Color(49, 60, 70));
        btn_sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_sumar.setText("+");
        btn_sumar.setBorder(null);
        btn_sumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sumar.setFocusPainted(false);
        btn_sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_sumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        Panel2.add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 50));

        btn_igual.setFont(new java.awt.Font("Roboto", 0, 40)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        Panel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 50));

        btn_7.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_7.setForeground(new java.awt.Color(49, 60, 70));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        Panel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        btn_8.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_8.setForeground(new java.awt.Color(49, 60, 70));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        Panel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        btn_6.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_6.setForeground(new java.awt.Color(49, 60, 70));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        Panel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        btn_5.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_5.setForeground(new java.awt.Color(49, 60, 70));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        Panel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        btn_4.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_4.setForeground(new java.awt.Color(49, 60, 70));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        Panel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_3.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_3.setForeground(new java.awt.Color(49, 60, 70));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        Panel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 50));

        btn_2.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_2.setForeground(new java.awt.Color(49, 60, 70));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        Panel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 50));

        btn_1.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_1.setForeground(new java.awt.Color(49, 60, 70));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        Panel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_punto.setFont(new java.awt.Font("Roboto Lt", 1, 30)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(49, 60, 70));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        Panel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 50));

        btn_0.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_0.setForeground(new java.awt.Color(49, 60, 70));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_press.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        Panel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        getContentPane().add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        añadirNumero("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        añadirNumero("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        añadirNumero("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        añadirNumero("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        añadirNumero("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        añadirNumero("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        añadirNumero("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        añadirNumero("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        añadirNumero("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        añadirNumero("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        añadirNumero("%");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        añadirNumero("÷");
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        añadirNumero("×");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed
        añadirNumero("-");
    }//GEN-LAST:event_btn_restarActionPerformed

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        añadirNumero("+");
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        añadirNumero(".");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try {
            if (!operacion.isEmpty()) {
                String resultado = se.eval(operacion).toString();
                txt_Resultado.setText(resultado);
            }
        } catch (ScriptException e) {
            if (!operacion.isEmpty()) {
                txt_Resultado.setText("Error");
            }
        }
//        txt_Resultado.setFont(new Font("Reboto", Font.BOLD, 45));
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (txt_Operacion.getText().length() > 0) {
            txt_Operacion.setText(txt_Operacion.getText().substring(0, txt_Operacion.getText().length() - 1));
            operacion = operacion.substring(0, operacion.length() - 1);
            if (!txt_Operacion.getText().isEmpty()) {
                if (txt_Operacion.getText().charAt(txt_Operacion.getText().length() - 1) != '+'
                    && txt_Operacion.getText().charAt(txt_Operacion.getText().length() - 1) != '-'
                    && txt_Operacion.getText().charAt(txt_Operacion.getText().length() - 1) != '×'
                    && txt_Operacion.getText().charAt(txt_Operacion.getText().length() - 1) != '÷') {
                    btn_igual.doClick(); 
                } else {
                    txt_Resultado.setText("");
                }
            } else {
                txt_Resultado.setText("");
            }
        } 
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        txt_Operacion.setText("");
        txt_Resultado.setText("");
        operacion = "";
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void cambiar_temaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_temaActionPerformed
        if (dark_mode) {
            Panel1.setBackground(Color.decode("#152740"));
            Panel2.setBackground(Color.decode("#243651"));
            txt_Operacion.setForeground(Color.decode("#00B587"));
            txt_Resultado.setForeground(Color.decode("#00B587"));
            cambiar_tema.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkMode.png")));
        
            darkMode(btn_1);
            darkMode(btn_2);
            darkMode(btn_3);
            darkMode(btn_4);
            darkMode(btn_5);
            darkMode(btn_6);
            darkMode(btn_7);
            darkMode(btn_8);
            darkMode(btn_9);
            darkMode(btn_0);
            darkMode(btn_punto);
            
            darkMode2(btn_borrar);
            darkMode2(btn_eliminar);
            darkMode2(btn_porcentaje);
            darkMode2(btn_dividir);
            darkMode2(btn_multiplicar);
            darkMode2(btn_restar);
            darkMode2(btn_sumar);
            
            btn_igual.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_igual_dark.png")));
            btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_igual_dark.png")));
            btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn5_dark.png")));
            btn_igual.setForeground(Color.decode("#152740"));
            
        } else {
            Panel1.setBackground(new Color(241,253,251));
            Panel2.setBackground(new Color(255,255,255));
            txt_Operacion.setForeground(new Color(49,60,70));
            txt_Resultado.setForeground(new Color(49,60,70));
            cambiar_tema.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn_cambiar.png")));
        
            darkLight(btn_1);           
            darkLight(btn_2);
            darkLight(btn_3);
            darkLight(btn_4);
            darkLight(btn_5);
            darkLight(btn_6);
            darkLight(btn_7);
            darkLight(btn_8);
            darkLight(btn_9);
            darkLight(btn_0);
            darkLight(btn_punto);
            
            darkLight2(btn_borrar);
            darkLight2(btn_eliminar);
            darkLight2(btn_porcentaje);
            darkLight2(btn_dividir);
            darkLight2(btn_multiplicar);
            darkLight2(btn_restar);
            darkLight2(btn_sumar);
            
            btn_igual.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3.png")));
            btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3.png")));
            btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn5.png")));
            btn_igual.setForeground(new Color(255,255,255));
        }
        dark_mode = !dark_mode;
    }//GEN-LAST:event_cambiar_temaActionPerformed

    private void Panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Panel1MousePressed

    private void Panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Panel1MouseDragged

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JButton cambiar_tema;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel txt_Operacion;
    private javax.swing.JLabel txt_Resultado;
    // End of variables declaration//GEN-END:variables
}
