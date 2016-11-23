package Ingles;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NewJFrame extends javax.swing.JFrame {

    public static ConsultasBD consultasBD = new ConsultasBD();
    int vida, posicion;
    ImageIcon img;
    Musica Music = new Musica();
    boolean pp = false;
    //boolean crono = false;
    String N = "", N2 = "";

    public NewJFrame() {
        initComponents();
        jTabbedPane2.setEnabledAt(1, false);
        jTabbedPane2.setEnabledAt(2, false);
        jTabbedPane2.setEnabledAt(3, false);
        jLabel5.setVisible(false);
        jLabel11.setVisible(false);
        jPcompletar.setVisible(false);
        jPimagenes.setVisible(false);
        jPtraducir.setVisible(false);
        jPotro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPcompletar = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPimagenes = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPtraducir = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPotro = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton4 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Final ICO-19");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel1.setText("Nombre de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 166, -1));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 106, -1));

        jTextField1.setText("Ingrese nombre de usuario");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 181, -1));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 173, -1));

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 2, 18)); // NOI18N
        jLabel8.setText("Crear nueva cuenta");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 173, -1));

        jButton3.setText("Iniciar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 160, 30));

        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 480, 280));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ingles/pokemon.jpg"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        jTabbedPane2.addTab("Login", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel4.setText("Nombre de usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, 170));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 720, 270));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 130, -1));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 130, -1));

        jPasswordField2.setText("jPasswordField2");
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 130, -1));

        jPasswordField3.setText("jPasswordField3");
        jPasswordField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseClicked(evt);
            }
        });
        jPanel2.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 130, -1));

        jLabel9.setText("Ingresar contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        jLabel10.setText("Repetir contraseña");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jButton2.setText("Completar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Nombre de usuario no disponible");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 180, -1));

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Las contraseñas no coinciden");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 180, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 130, -1));

        jLabel12.setText("Id Jugador");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel13.setText("Juegos jugados");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, -1, -1));

        jLabel14.setText("Juegos ganados");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, -1, -1));

        jLabel15.setText("Juegos perdidos");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, -1, -1));

        jTextField2.setEditable(false);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 60, -1));

        jTextField3.setEditable(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 60, -1));

        jTextField4.setEditable(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 60, -1));

        jButton1.setText("PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 150, 80));

        jTabbedPane2.addTab("Usuario", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ingles/mapa.jpg"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1010, 673));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ingles/heart.gif"))); // NOI18N
        jLabel18.setText("      3");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 110));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ingles/DADO.gif"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 80));

        jLayeredPane1.setOpaque(true);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton5.setText("Help Cost 1 life");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcompletarLayout = new javax.swing.GroupLayout(jPcompletar);
        jPcompletar.setLayout(jPcompletarLayout);
        jPcompletarLayout.setHorizontalGroup(
            jPcompletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcompletarLayout.createSequentialGroup()
                .addGroup(jPcompletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcompletarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPcompletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPcompletarLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPcompletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPcompletarLayout.setVerticalGroup(
            jPcompletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcompletarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel25.setText("jLabel25");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setText("jLabel25");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setText("jLabel25");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setText("jLabel25");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setText("jLabel29");

        javax.swing.GroupLayout jPimagenesLayout = new javax.swing.GroupLayout(jPimagenes);
        jPimagenes.setLayout(jPimagenesLayout);
        jPimagenesLayout.setHorizontalGroup(
            jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPimagenesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPimagenesLayout.createSequentialGroup()
                        .addGroup(jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPimagenesLayout.setVerticalGroup(
            jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPimagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPimagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel30.setText("Traduce la siguiente palabra");

        jLabel34.setText("jLabel34");

        javax.swing.GroupLayout jPtraducirLayout = new javax.swing.GroupLayout(jPtraducir);
        jPtraducir.setLayout(jPtraducirLayout);
        jPtraducirLayout.setHorizontalGroup(
            jPtraducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtraducirLayout.createSequentialGroup()
                .addGroup(jPtraducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPtraducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPtraducirLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel30)))
                    .addGroup(jPtraducirLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPtraducirLayout.setVerticalGroup(
            jPtraducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPtraducirLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jProgressBar1.setOrientation(1);

        jButton4.setText("Iniciar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPotroLayout = new javax.swing.GroupLayout(jPotro);
        jPotro.setLayout(jPotroLayout);
        jPotroLayout.setHorizontalGroup(
            jPotroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPotroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPotroLayout.setVerticalGroup(
            jPotroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPotroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPotroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPotroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(98, 98, 98))
                    .addGroup(jPotroLayout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPcompletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPtraducir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPotro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPcompletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPtraducir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPotro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jPcompletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPimagenes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPtraducir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPotro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, 250));

        jLabel32.setText("Pause");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 60));

        jLabel33.setText("Stop");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 80));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ingles/fondo2.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        jLabel20.setText("Turnos jugados");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTabbedPane2.addTab("Game", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        habilitardatos(true);
        jTabbedPane2.setEnabledAt(1, true);
        jTabbedPane2.setSelectedIndex(1);
        JOptionPane.showMessageDialog(null, "Ingresa tus datos");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtNombre.getText().isEmpty() || txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los recuadros", "Campo(s)", JOptionPane.WARNING_MESSAGE);
        } else if (jPasswordField2.getText() == null ? jPasswordField3.getText() == null : jPasswordField2.getText().equals(jPasswordField3.getText())) {
            jLabel11.setVisible(false);
            Datos aux = consultasBD.buscarPorId(Integer.parseInt(txtId.getText()));
            if (aux != null) {
                JOptionPane.showMessageDialog(this, "Id en uso elija otro");
            } else {
                consultasBD.insertarJugador(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtUsuario.getText(), jPasswordField3.getText(), 0, 0, 0);
                JOptionPane.showMessageDialog(this, "Registro existoso inicie seción para continuar");
                jTabbedPane2.setSelectedIndex(0);
                jTabbedPane2.setEnabledAt(1, false);
            }
        } else {
            jLabel11.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        jPasswordField2.setText("");
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jPasswordField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseClicked
        jPasswordField3.setText("");
    }//GEN-LAST:event_jPasswordField3MouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char e = evt.getKeyChar();
        if (Character.isLetter(e)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextField1.getText().isEmpty() || jPasswordField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los recuadros", "Campo(s)", JOptionPane.WARNING_MESSAGE);
        } else {
            Datos aux = consultasBD.Login(jTextField1.getText());
            if (aux != null) {
                if (aux.getN_Usuario().equals(jTextField1.getText()) && aux.getContraseña().equals(jPasswordField1.getText())) {
                    jTabbedPane2.setEnabledAt(1, true);
                    jTabbedPane2.setTitleAt(1, aux.getN_Usuario());
                    habilitardatos(false);

                    txtId.setText(Integer.toString(aux.getIdJugador()));
                    txtNombre.setText(aux.getNombre());
                    txtUsuario.setText(aux.getN_Usuario());
                    jTextField2.setText(Integer.toString(aux.getN_D_J()));
                    jTextField3.setText(Integer.toString(aux.getN_D_J_G()));
                    jTextField4.setText(Integer.toString(aux.getN_D_J_P()));

                    img = new ImageIcon("src/img/pause.png");
                    jLabel32.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_SMOOTH)));
                    img = new ImageIcon("src/img/stop.png");
                    jLabel33.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_SMOOTH)));

                    //********* Carga la imagen de perfil
                    String sFichero = ("src/imgperfil/" + txtNombre.getText() + txtId.getText() + ".jpg");
                    File fichero = new File(sFichero);
                    if (fichero.exists()) {
                        img = new ImageIcon(sFichero);
                    } else {
                        img = new ImageIcon("src/img/naruto.jpg");
                    }
                    jLabel6.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));

                    //*carga imagen de portada
                    sFichero = ("src/imgportada/" + txtNombre.getText() + txtId.getText() + ".jpg");
                    fichero = new File(sFichero);
                    if (fichero.exists()) {
                        img = new ImageIcon(sFichero);
                    } else {
                        img = new ImageIcon("src/imgportada/default.jpg");
                    }
                    jLabel7.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));

                    //*********
                    jTabbedPane2.setSelectedIndex(1);
                    jTabbedPane2.setEnabledAt(0, false);
                    JOptionPane.showMessageDialog(this, "Seción iniciada");
                } else {
                    JOptionPane.showMessageDialog(this, "El usurio y/o la contraseña pueden ser incorrectas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
                jLabel8.setForeground(Color.RED);
                getToolkit().beep();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed


    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (txtId.isEditable()) {
            JOptionPane.showMessageDialog(this, "Primero inicie seción");
        } else {
            try {
                JOptionPane.showMessageDialog(null, "Ingresar Foto");
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Seleccione una imagen");
                FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG", "jpg");
                chooser.setFileFilter(filtroImagen);
                int flag = chooser.showOpenDialog(null);
                if (flag == JFileChooser.APPROVE_OPTION) {
                    File fo = chooser.getSelectedFile();
                    img = new ImageIcon(fo.getAbsolutePath());
                    jLabel6.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
                    File source = new File(fo.getAbsolutePath());
                    File dest = new File("src/imgperfil/" + txtNombre.getText() + txtId.getText() + ".jpg");
                    copyFileUsingFileChannels(source, dest);
                }
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jLabel21.setVisible(false);
        Random rnd = new Random();
        int b = (int) (rnd.nextDouble() * 6 + 1); // Dado
        JOptionPane.showMessageDialog(null, "El dado cayo en " + b);
        posicion += b;
        if (posicion == 5 || posicion == 12 || posicion == 15 || posicion == 17
                || posicion == 22 || posicion == 26 || posicion == 29 || posicion == 37) {  //Serpiente o escalera
            Snake(posicion);
        }
        if (posicion >= 40) {
            GameOver(true);
        } else {
            tipo_de_juego(posicion);
        }
        jLayeredPane1.setVisible(true);

    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        posicion = 0;
        vida = 3;
        jLabel18.setText("      " + vida);
        jLayeredPane1.setVisible(false);
        jButton1.setVisible(false);
        jLabel21.setVisible(true);
        jTabbedPane2.setEnabledAt(3, true);
        jTabbedPane2.setSelectedIndex(3);
        //********* Carga el sonido
        Music.Play("src/songs/Studiopolis.mp3");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        if (pp == true) {
            Music.Resume();
            img = new ImageIcon("src/img/pause.png");
            pp = false;
        } else {
            Music.Pause();
            img = new ImageIcon("src/img/play.png");
            pp = true;
        }
        jLabel32.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        Music.Stop();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        if (N.equals(jTextField5.getText())) {
            vidas(1);
        } else {
            vidas(0);
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        N2 = "1";
        if (N.equals(N2)) {
            vidas(1);
        } else {
            vidas(0);
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        N2 = "0";
        if (N.equals(N2)) {
            vidas(1);
        } else {
            vidas(0);
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        N2 = "2";
        if (N.equals(N2)) {
            vidas(1);
        } else {
            vidas(0);
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        N2 = "3";
        if (N.equals(N2)) {
            vidas(1);
        } else {
            vidas(0);
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int n = jProgressBar1.getValue();
        n += 4;
        /*if (crono == false) {
        crono = true;
        cronometro();
        }*/
        if (n >= 101) {
            vidas(2);
            n = 0;
            jProgressBar1.setValue(n);
            //crono = false;
        } else {
            jProgressBar1.setValue(n);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (vida >= 2) {
            vidas(0);
            jButton5.setVisible(false);
            jLabel31.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "vidas insuficientes");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        this.jButton3ActionPerformed(evt);
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        if (N.equals(jTextField6.getText())) {
            vidas(1);
            jTextField6.setText("");
        } else {
            vidas(0);
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (txtId.isEditable()) {
            JOptionPane.showMessageDialog(this, "Primero inicie seción");
        } else {
            try {
                JOptionPane.showMessageDialog(null, "Ingresar Foto");
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Seleccione una imagen");
                FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG", "jpg");
                chooser.setFileFilter(filtroImagen);
                int flag = chooser.showOpenDialog(null);
                if (flag == JFileChooser.APPROVE_OPTION) {
                    File fo = chooser.getSelectedFile();
                    img = new ImageIcon(fo.getAbsolutePath());
                    jLabel7.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    File source = new File(fo.getAbsolutePath());
                    File dest = new File("src/imgportada/" + txtNombre.getText() + txtId.getText() + ".jpg");
                    copyFileUsingFileChannels(source, dest);
                }
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    public void Snake(int p) {
        if (p == 5) {
            posicion = 11;
        } else if (p == 15) {
            posicion = 19;
        } else if (p == 22) {
            posicion = 27;
        } else if (p == 26) {
            posicion = 36;
        } else if (p == 12) {
            posicion = 6;
        } else if (p == 17) {
            posicion = 10;
        } else if (p == 29) {
            posicion = 21;
        } else if (p == 37) {
            posicion = 31;
        }
        JOptionPane.showMessageDialog(null, "Se movio a la posición " + posicion);
    }

    public boolean habilitardatos(boolean b) {
        jLabel9.setVisible(b);
        jPasswordField2.setVisible(b);
        jLabel10.setVisible(b);
        jPasswordField3.setVisible(b);
        jButton2.setVisible(b);
        txtId.setEditable(b);
        txtNombre.setEditable(b);
        txtUsuario.setEditable(b);
        return b;
    }

    public void buscarPorId(int id) {
        Datos aux = consultasBD.buscarPorId(id);
        if (aux != null) {
            txtId.setText("" + aux.getIdJugador());
            txtNombre.setText(aux.getNombre());
            txtUsuario.setText(aux.getN_Usuario());
            jTextField2.setText(Integer.toString(aux.getN_D_J()));
            jTextField3.setText(Integer.toString(aux.getN_D_J_G()));
            jTextField4.setText(Integer.toString(aux.getN_D_J_P()));
        } else {
            JOptionPane.showMessageDialog(this, "No encontrado");
        }
    }

    public void tipo_de_juego(int n) {
        String Tipo = "";
        if (n == 1 || n == 5 || n == 9 || n == 13 || n == 17 || n == 21 || n == 25 || n == 29 || n == 33 || n == 37) {
            Tipo = "Blue";
        } else if (n == 2 || n == 6 || n == 10 || n == 14 || n == 18 || n == 22 || n == 26 || n == 30 || n == 34 || n == 38) {
            Tipo = "Yellow";
        } else if (n == 3 || n == 7 || n == 11 || n == 15 || n == 19 || n == 23 || n == 27 || n == 31 || n == 35 || n == 39) {
            Tipo = "Green";
        } else if (n == 4 || n == 8 || n == 12 || n == 16 || n == 20 || n == 24 || n == 28 || n == 32 || n == 36) {
            Tipo = "Red";
        }
        switch (Tipo) {
            case "Blue":
                jPcompletar.setVisible(true);
                jPimagenes.setVisible(false);
                jPtraducir.setVisible(false);
                jPotro.setVisible(false);
                JuegoCompletar();
                break;
            case "Yellow":
                jPcompletar.setVisible(false);
                jPimagenes.setVisible(true);
                jPtraducir.setVisible(false);
                jPotro.setVisible(false);
                JuegoImagenes();
                break;
            case "Green":
                jPcompletar.setVisible(false);
                jPimagenes.setVisible(false);
                jPtraducir.setVisible(true);
                jPotro.setVisible(false);
                traduce();
                break;
            case "Red":
                jPcompletar.setVisible(false);
                jPimagenes.setVisible(false);
                jPtraducir.setVisible(false);
                jPotro.setVisible(true);
                jLabel21.setVisible(true);
                jProgressBar1.setValue(0);
                break;
        }
    }

    public void vidas(int gp) {
        if (gp == 2) {
            vida++;
            jLabel21.setVisible(true);
            JOptionPane.showMessageDialog(null, "Very Good");
            jLayeredPane1.setVisible(false);
        } else if (gp == 1) {
            jLabel21.setVisible(true);
            JOptionPane.showMessageDialog(null, "Very Good");
            jLayeredPane1.setVisible(false);
        } else if (gp == 0) {
            vida--;
            JOptionPane.showMessageDialog(null, "Bad");
            if (vida == 0) {
                GameOver(false);
            }
        }
        jLabel18.setText("      " + vida);
    }

    public void JuegoCompletar() {
        Random rnd = new Random();
        int r = (int) (rnd.nextDouble() * 50 + 1);
        NewInterface aux = consultasBD.SinImagen(r);
        N = aux.getWord();
        jTextField5.setText(aux.obtenerDatos());
        jLabel24.setText("Palabra a completar: " + jTextField5.getText());
        //Pista
        jLabel31.setVisible(false);
        jButton5.setVisible(true);
        img = new ImageIcon("src/ImagesW/" + aux.getIdWord() + "_" + aux.getWord() + ".jpg");
        jLabel31.setIcon(new ImageIcon(img.getImage().getScaledInstance(105, 105, Image.SCALE_REPLICATE)));

    }

    public void traduce() {
        Random rnd = new Random();
        int r = (int) (rnd.nextDouble() * 50 + 1);
        NewInterface aux = consultasBD.SinImagen(r);
        jLabel34.setText(aux.getWord());
        N = aux.getTraduccion();
    }

    public void JuegoImagenes() {
        Random rnd = new Random();
        int x[] = new int[4];
        int rand;
        NewInterface aux;

        for (int i = 0; i <= 3; i++) {
            rand = (int) (rnd.nextDouble() * 50 + 1);
            x[i] = rand;
            if (i == 0) {
                aux = consultasBD.ConImagen(rand);
                img = new ImageIcon("src/ImagesW/" + aux.obtenerDatos());
                jLabel25.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_SMOOTH)));
            } else if (i == 1) {
                aux = consultasBD.ConImagen(rand);
                img = new ImageIcon("src/ImagesW/" + aux.obtenerDatos());
                jLabel26.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_SMOOTH)));
            } else if (i == 2) {
                aux = consultasBD.ConImagen(rand);
                img = new ImageIcon("src/ImagesW/" + aux.obtenerDatos());
                jLabel27.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_SMOOTH)));
            } else if (i == 3) {
                aux = consultasBD.ConImagen(rand);
                img = new ImageIcon("src/ImagesW/" + aux.obtenerDatos());
                jLabel28.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        rand = (int) (rnd.nextDouble() * 3 + 0);
        aux = consultasBD.ConImagen(x[rand]);
        jLabel29.setText("Select " + aux.getWord());
        N = Integer.toString(rand);
    }

    public void GameOver(boolean go) {
        img = new ImageIcon("src/img/Game-Over.jpg");
        jLabel23.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_SMOOTH)));
        JOptionPane.showMessageDialog(null, "Game Over");
        Music.Stop();
        Datos aux = consultasBD.buscarPorId(Integer.parseInt(txtId.getText()));
        if (go == false) {
            Music.Play("src/songs/GameOver.mp3");
            consultasBD.modificarJugador(aux.getIdJugador(), aux.getNombre(), aux.getN_Usuario(), aux.getContraseña(), aux.getN_D_J() + 1, aux.getN_D_J_G(), aux.getN_D_J_P() + 1);
        } else {
            Music.Play("src/songs/Winner.mp3");
            consultasBD.modificarJugador(aux.getIdJugador(), aux.getNombre(), aux.getN_Usuario(), aux.getContraseña(), aux.getN_D_J() + 1, aux.getN_D_J_G() + 1, aux.getN_D_J_P());
        }
        jTabbedPane2.setEnabledAt(3, false);
        jTabbedPane2.setSelectedIndex(2);
        jButton1.setVisible(true);
    }

    /* public void cronometro() {
    for (int segundos = 0; segundos < 6; segundos++) {
    try {
    Thread.sleep(1000); //retraso de un segundo
    } catch (InterruptedException e) {
    }
    System.out.println(segundos);
    }
    }*/

    private static void copyFileUsingFileChannels(File source, File dest) throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPanel jPcompletar;
    private javax.swing.JPanel jPimagenes;
    private javax.swing.JPanel jPotro;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel jPtraducir;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
