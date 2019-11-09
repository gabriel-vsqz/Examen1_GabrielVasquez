package examen.pkg1_gabrielvasquez;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * USERS
 * Leonardi
 * Diego
 * UNITEC
 * Gabriel
 * progra2
 * contra para todos 12345
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        tb_principal.disable();
        setLocationRelativeTo(null);
    }
    
    public Principal (String anything) {
        initComponents();
        
        username.disable();
        password.disable();
        enter.disable();
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_Libros.getModel();
        modelo.addElement(new Libro("The Maze Runner", "Un grupo de jovenes en un laberinto", 5, 3, "Acción", 600, "Primera", "James Dashner", 2012));
        modelo.addElement(new Libro("The Scorch Trials", "Un grupo de jovenes en un desierto", 5, 2, "Acción", 700, "Primera", "James Dashner", 2014));
        modelo.addElement(new Libro("The Death Cure", "Un grupo de jovenes en busca de una cura", 3, 1, "Acción", 650, "Segunda", "James Dashner", 2015));
        modelo.addElement(new Libro("The Eye of Minds", "La realidad no es lo que parece", 5, 3, "Acción", 600, "Primera", "James Dashner", 2016));
        modelo.addElement(new Libro("The Game of Lives", "La conclusión de la saga The Mortality Doctrine", 5, 2, "Acción", 800, "Tercera", "James Dashner", 2017));
        
        Usuario u = new Usuario("Leonardo", "12345", new Date(), 89000000, "leo@banegas", "Acción");
        Usuario x = new Usuario("Diego", "12345", new Date(), 89000000, "leo@banegas", "Historia");
        Usuario y = new Usuario("Gabriel", "12345", new Date(), 89000000, "leo@banegas", "Acción");
        Usuario t = new Usuario("progra2", "12345", new Date(), 89000000, "leo@banegas", "Romance");
        Usuario z = new Usuario("UNITEC", "12345", new Date(), 89000000, "leo@banegas", "Fantasía");
        usuarios.add(u);
        usuarios.add(x);
        usuarios.add(y);
        usuarios.add(t);
        usuarios.add(z);
        
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_principal = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        enter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        dc_born = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jb_createuser = new javax.swing.JButton();
        cb_favorito = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        js_puntaje = new javax.swing.JSpinner();
        js_copias = new javax.swing.JSpinner();
        cb_genre = new javax.swing.JComboBox<>();
        tf_valor = new javax.swing.JTextField();
        tf_author = new javax.swing.JTextField();
        tf_edicion = new javax.swing.JTextField();
        tf_publish = new javax.swing.JTextField();
        addbook = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cb_Libros = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_info = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        mybooks = new javax.swing.JButton();
        eliminate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_mybooks = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_recc = new javax.swing.JTextArea();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Virtual");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("LOGIN");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel20.setText("Usuario");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel21.setText("Contraseña");

        enter.setText("Ingresar");
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(239, 239, 239))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        tb_principal.addTab("Login", jPanel4);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Información de Usuario");

        jLabel1.setText("Nombre de Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setText("Número Telefónico");

        jLabel5.setText("Correo Electrónico");

        jLabel6.setText("Género Favorito de Lectura");

        jb_createuser.setText("Crear");
        jb_createuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_createuserMouseClicked(evt);
            }
        });

        cb_favorito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasía", "Romance", "Acción", "Historia" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dc_born, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cb_favorito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jb_createuser, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dc_born, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_favorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jb_createuser, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        tb_principal.addTab("Crear Usuario", jPanel2);

        jLabel8.setText("Título");

        jLabel9.setText("Descripción");

        jLabel10.setText("Puntaje");

        jLabel11.setText("Copias Disponibles");

        jLabel12.setText("Género");

        jLabel13.setText("Autor");

        jLabel14.setText("Edición");

        jLabel15.setText("Valor");

        jLabel16.setText("Año de Publicación");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Información del Libro");

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_descripcion);

        js_puntaje.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        js_copias.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cb_genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasía", "Romance", "Acción", "Historia" }));

        addbook.setText("Agregar Libro a Biblioteca");
        addbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(js_copias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_author, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_edicion))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_publish))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(98, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_publish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_copias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tb_principal.addTab("Crear Libro", jPanel3);

        cb_Libros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_LibrosItemStateChanged(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setText("Escoja el libro del cuál desea ver la información");

        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descripción", "Puntaje", "Copias Disp.", "Género", "Valor", "Edición", "Autor", "Año Publicación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_info.setRowHeight(70);
        jScrollPane3.setViewportView(table_info);

        limpiar.setText("Limpiar Tabla");
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });

        mod.setText("Modificar Libro");
        mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modMouseClicked(evt);
            }
        });

        mybooks.setText("Agregar a Mi Lista");
        mybooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mybooksMouseClicked(evt);
            }
        });

        eliminate.setText("Eliminar");
        eliminate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(cb_Libros, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(eliminate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(mybooks)
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mybooks, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        tb_principal.addTab("Libros", jPanel5);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mi Lista de Libros");

        ta_mybooks.setEditable(false);
        ta_mybooks.setColumns(20);
        ta_mybooks.setRows(5);
        jScrollPane4.setViewportView(ta_mybooks);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Recomendaciones");

        ta_recc.setColumns(20);
        ta_recc.setRows(5);
        jScrollPane2.setViewportView(ta_recc);

        update.setText("Actualizar");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(update)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update)))
                .addGap(26, 26, 26))
        );

        tb_principal.addTab("Mi Lista", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tb_principal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descripción", "Puntaje", "Copias Disp.", "Género", "Valor", "Edición", "Autor", "Año Publicación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }//GEN-LAST:event_limpiarMouseClicked

    private void cb_LibrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_LibrosItemStateChanged
        if (evt.getStateChange() == 2) {
            Libro book = (Libro) cb_Libros.getSelectedItem();
            Object[] newrow = {
                book.getTitle(),
                book.getDescripción(),
                book.getPuntaje(),
                book.getCopias(),
                book.getGenero(),
                book.getValor(),
                book.getEdicion(),
                book.getAutor(),
                book.getAño()
            };
            DefaultTableModel modelo = (DefaultTableModel) table_info.getModel();
            modelo.addRow(newrow);
            table_info.setModel(modelo);
        }
    }//GEN-LAST:event_cb_LibrosItemStateChanged

    private void addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbookMouseClicked
        String titulo, desc, edicion, genero, autor;
        int puntos, copias, año;
        double precio;
        try {
            titulo = tf_titulo.getText();
            desc = ta_descripcion.getText();
            puntos = (Integer)js_puntaje.getValue();
            copias = (Integer)js_copias.getValue();
            genero = (String)cb_genre.getSelectedItem();
            precio = Double.parseDouble(tf_valor.getText());
            edicion = tf_edicion.getText();
            autor = tf_author.getText();
            año = Integer.parseInt(tf_publish.getText());

            Libro book = new Libro(titulo, desc, puntos, copias, genero, precio, edicion, autor, año);
            libros.add(book);

            DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_Libros.getModel();
            dc.addElement(book.getTitle());
            cb_Libros.setModel(dc);

            JOptionPane.showMessageDialog(this, "El libro fue agregado exitosamente");
            
            tf_titulo.setText("");
            ta_descripcion.setText("");
            js_puntaje.setValue(1);
            js_copias.setValue(0);
            tf_valor.setText("");
            tf_edicion.setText("");
            tf_author.setText("");
            tf_publish.setText("");

        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error y no se pudo guardar el libro");
        }
    }//GEN-LAST:event_addbookMouseClicked

    private void modMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modMouseClicked
        if (table_info.getSelectedRow() >= 0){
            int modify = 0;
            while (modify != 10){
                try {
                    modify = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n1 - Título\n2 - Descripción\n"
                        + "3 - Puntaje\n4 - Copias Disponibles\n5 - Género\n6 - Valor\n7 - Edición\n8 - Autor\n9 - Año\n10 - Nada"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar una de las opciones propuestas");
                }
            }
            DefaultTableModel modelo = (DefaultTableModel) table_info.getModel();
            switch (modify) {
                case 1:
                    String t = JOptionPane.showInputDialog("Nuevo Título");
                    ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setTitle(t);
                    break;
                    
                case 2:
                    t = JOptionPane.showInputDialog("Nueva Descripción");
                    ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setDescripción(t);
                    break;
                    
                case 3:
                    try {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Puntaje"));
                        while (p > 1 && p > 5) {
                            JOptionPane.showMessageDialog(this, "El puntaje debe estar entre 1 y 5");
                            p = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Puntaje"));
                        }
                        ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setPuntaje(p);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Debe ingresar valores enteros");
                    }
                    break;
                    
                case 4:
                    try {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Número de Copias"));
                        ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setCopias(p);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Debe ingresar valores enteros");
                    }
                    break;
                    
                case 5:
                    t = JOptionPane.showInputDialog("Nuevo Género");
                    ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setGenero(t);
                    break;
                    
                case 6:
                    try {
                        Double v = Double.parseDouble(JOptionPane.showInputDialog("Nuevo Valor"));
                        ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setValor(v);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Debe ingresar valores double");
                    }
                    
                    break;
                    
                case 7:
                    t = JOptionPane.showInputDialog("Nueva Edición");
                    ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setEdicion(t);
                    break;
                    
                case 8:
                    t = JOptionPane.showInputDialog("Nuevo Autor");
                    ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setAutor(t);
                    break;
                    
                case 9:
                    try {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Año de Publicación"));
                        ((Libro)modelo.getValueAt(table_info.getSelectedRow(), table_info.getSelectedColumn())).setAño(p);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Debe ingresar valores enteros");
                    }
                    break;
            }
            table_info.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una casilla");
        }
    }//GEN-LAST:event_modMouseClicked

    private void jb_createuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_createuserMouseClicked
        String nombre, pass, correo, fave;
        int tel;
        Date fecha;
        try {
            nombre = tf_username.getText();
            pass = pf_password.getText();
            fecha = dc_born.getDate();
            tel = Integer.parseInt(tf_phone.getText());
            correo = tf_email.getText();
            fave = (String)cb_favorito.getSelectedItem();
            
            Usuario user = new Usuario(nombre, pass, fecha, tel, correo, fave);
            usuarios.add(user);

            JOptionPane.showMessageDialog(this, "El usuario fue registrado exitosamente");

            tf_username.setText("");
            pf_password.setText("");
            dc_born.setDate(null);
            tf_phone.setText("");
            tf_email.setText("");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error y no se pudo guardar el usuario");
        }
    }//GEN-LAST:event_jb_createuserMouseClicked

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked
        if( (username.getText().equals("Leonardo") || username.getText().equals("Diego") || username.getText().equals("Gabriel") || username.getText().equals("UNITEC") || username.getText().equals("progra2"))
                && password.getText().equals("12345")){
            JOptionPane.showMessageDialog(this, "Ha ingresado exitosamente");
            Principal p = new Principal("hola");
            dispose();
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no existe");
            username.setText("");
            password.setText("");
        }
    }//GEN-LAST:event_enterMouseClicked

    private void mybooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mybooksMouseClicked
        if (table_info.getSelectedRow() >= 0){
            Libro book = (Libro) cb_Libros.getSelectedItem();
            ta_mybooks.append(book.getTitle() + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un libro");
        }
    }//GEN-LAST:event_mybooksMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        for (Libro libro : libros) {
            if (libro.getGenero().equals(usuarios.get(0).getFavorito())){
                ta_recc.append(libro.getTitle());
            }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void eliminateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminateMouseClicked
        if (table_info.getSelectedRow() >= 0) {
            Libro book = (Libro) cb_Libros.getSelectedItem();
            DefaultTableModel modelo = (DefaultTableModel) table_info.getModel();
            modelo.removeRow(table_info.getSelectedRow());
            table_info.setModel(modelo);
            libros.remove(book);
            DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_Libros.getModel();
            dc.removeElement(book);
            cb_Libros.setModel(dc);
        }
    }//GEN-LAST:event_eliminateMouseClicked

    public static void main(String args[]) {
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbook;
    private javax.swing.JComboBox<String> cb_Libros;
    private javax.swing.JComboBox<String> cb_favorito;
    private javax.swing.JComboBox<String> cb_genre;
    private com.toedter.calendar.JDateChooser dc_born;
    private javax.swing.JButton eliminate;
    private javax.swing.JButton enter;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_createuser;
    private javax.swing.JSpinner js_copias;
    private javax.swing.JSpinner js_puntaje;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton mod;
    private javax.swing.JButton mybooks;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JTextArea ta_mybooks;
    private javax.swing.JTextArea ta_recc;
    private javax.swing.JTable table_info;
    private javax.swing.JTabbedPane tb_principal;
    private javax.swing.JTextField tf_author;
    private javax.swing.JTextField tf_edicion;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_publish;
    private javax.swing.JTextField tf_titulo;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tf_valor;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    
    ArrayList<Libro> libros = new ArrayList();
    ArrayList<Usuario> usuarios = new ArrayList();
}