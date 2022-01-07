
package Form;

// Importaciones correspondientes
import javax.swing.JOptionPane;

// Heredando de la clase javax.swing.JFrame
public class RegisterGUI extends javax.swing.JFrame {

    // Constructor de la clase
    public RegisterGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // Instancia de la clase "MethodsSQL"
    MethodsSQL metodos = new MethodsSQL();

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registro = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lineaUsuario = new javax.swing.JSeparator();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lineaNombre = new javax.swing.JSeparator();
        apellido = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lineaApellido = new javax.swing.JSeparator();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lineatelefono = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        txtUsuario4 = new javax.swing.JTextField();
        lineaUsuario4 = new javax.swing.JSeparator();
        correo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lineaCorreo = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        lineaContraseña = new javax.swing.JSeparator();
        Rcontraseña2 = new javax.swing.JLabel();
        lineaContraseña2 = new javax.swing.JSeparator();
        btnRegistrarse = new javax.swing.JButton();
        txtContraseña2 = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(432, 727));
        jPanel1.setMinimumSize(new java.awt.Dimension(432, 727));
        jPanel1.setPreferredSize(new java.awt.Dimension(432, 727));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro.setFont(new java.awt.Font("Roboto Black", 3, 36)); // NOI18N
        registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registro.setText("REGISTRO");
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, 40));

        usuario.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(153, 153, 153));
        usuario.setText("Nombre de usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, 20));

        txtUsuario.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtUsuario.setToolTipText(null);
        txtUsuario.setActionCommand("<Not Set>");
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 20));
        jPanel1.add(lineaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 10));

        nombre.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(153, 153, 153));
        nombre.setText("Nombre");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 20));

        txtNombre.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.setActionCommand("<Not Set>");
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 20));
        jPanel1.add(lineaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 260, 10));

        apellido.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        apellido.setForeground(new java.awt.Color(153, 153, 153));
        apellido.setText("Apellidos");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 20));

        txtApellidos.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtApellidos.setToolTipText("");
        txtApellidos.setActionCommand("<Not Set>");
        txtApellidos.setBorder(null);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 260, 20));
        jPanel1.add(lineaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 260, 10));

        telefono.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        telefono.setForeground(new java.awt.Color(153, 153, 153));
        telefono.setText("Número de teléfono");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 20));

        txtTelefono.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtTelefono.setToolTipText("");
        txtTelefono.setActionCommand("<Not Set>");
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 260, 20));
        jPanel1.add(lineatelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 260, 10));

        usuario4.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        usuario4.setForeground(new java.awt.Color(153, 153, 153));
        usuario4.setText("Nombre de usuario");
        jPanel1.add(usuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, 20));

        txtUsuario4.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtUsuario4.setToolTipText("");
        txtUsuario4.setActionCommand("<Not Set>");
        txtUsuario4.setBorder(null);
        txtUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 20));
        jPanel1.add(lineaUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 10));

        correo.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        correo.setForeground(new java.awt.Color(153, 153, 153));
        correo.setText("Correo electrónico");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 140, 20));

        txtCorreo.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtCorreo.setToolTipText("");
        txtCorreo.setActionCommand("<Not Set>");
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 260, 20));
        jPanel1.add(lineaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 260, 10));

        contraseña.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        contraseña.setForeground(new java.awt.Color(153, 153, 153));
        contraseña.setText("Contraseña");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 140, 20));
        jPanel1.add(lineaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 260, 10));

        Rcontraseña2.setFont(new java.awt.Font("Roboto Medium", 3, 12)); // NOI18N
        Rcontraseña2.setForeground(new java.awt.Color(153, 153, 153));
        Rcontraseña2.setText("Confirmar contraseña");
        jPanel1.add(Rcontraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 140, 20));
        jPanel1.add(lineaContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 260, 10));

        btnRegistrarse.setBackground(new java.awt.Color(155, 96, 227));
        btnRegistrarse.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 190, 40));

        txtContraseña2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtContraseña2.setBorder(null);
        txtContraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseña2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 250, 10));

        txtContraseña.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 250, 10));

        atras.setBackground(new java.awt.Color(255, 255, 255));
        atras.setFont(new java.awt.Font("Roboto Black", 3, 36)); // NOI18N
        atras.setText("<-");
        atras.setBorder(null);
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed

    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed

    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario4ActionPerformed

    }//GEN-LAST:event_txtUsuario4ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed

    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
         
        // Condición que cubre si el usuario presiona enviar con los campos vacios
        if (txtUsuario.getText().isEmpty() && txtNombre.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos para poder registrarte.");

            // previene que el usuario deja la casilla Nommbre de usuario vacia.
        } else if (txtUsuario.getText().isEmpty()) {

            usuario.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "El campo 'Nombre de usuario' no puede estar vacio");
            usuario.setForeground(new java.awt.Color(153, 153, 153));

            // previene que el usuario deja la casilla Nommbre vacia.
        } else if (txtNombre.getText().isEmpty()) {

            nombre.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "El campo 'Nombre' no puede estar vacio, inserte su nombre.");
            nombre.setForeground(new java.awt.Color(153, 153, 153));

            // previene que el usuario deja la casilla Apellidos de usuario vacia.
        } else if (txtApellidos.getText().isEmpty()) {

            apellido.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "El campo 'Apellido' no puede estar vacio, inserte su apellido.");
            apellido.setForeground(new java.awt.Color(153, 153, 153));

            // previene que el usuario deja la casilla Teléfono de usuario vacia.
        } else if (txtTelefono.getText().isEmpty()) {

            telefono.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "El campo 'Teléfono' no puede estar vacio, inserte su teléfono.");
            telefono.setForeground(new java.awt.Color(153, 153, 153));

            // previene que el usuario deja la casilla Correo de usuario vacia.
        } else if (txtCorreo.getText().isEmpty()) {

            correo.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "El campo 'Correo electrónico' no puede estar vacio, inserte un su correo eléctronico");
            correo.setForeground(new java.awt.Color(153, 153, 153));

            // previene que el usuario deja la casilla Contraseña de usuario vacia.
        } else if (txtContraseña.getText().isEmpty()) {

            txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "El campo 'Contraseña' no puede estar vacio, inserte una contraseña");
            txtContraseña.setForeground(new java.awt.Color(153, 153, 153));

            // previene que el usuario no confirme la contraseña
        } else if (txtContraseña2.getText().isEmpty()) {

            txtContraseña2.setForeground(new java.awt.Color(0, 0, 0));
            JOptionPane.showMessageDialog(this, "Debe confirmar su contraseña, inserte un su contraseña nuevamente.");
            txtContraseña2.setForeground(new java.awt.Color(153, 153, 153));

            // Condición que asegura que las contaseñas coincidan.
        } else if (!txtContraseña.getText().equals(txtContraseña2.getText())) {

            txtContraseña.setForeground(new java.awt.Color(255, 51, 51));
            txtContraseña2.setForeground(new java.awt.Color(255, 51, 51));

            contraseña.setForeground(new java.awt.Color(0, 0, 0));
            Rcontraseña2.setForeground(new java.awt.Color(0, 0, 0));

            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden, por favor ingresa una contraseña correcta");

            txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
            txtContraseña2.setForeground(new java.awt.Color(0, 0, 0));

            contraseña.setForeground(new java.awt.Color(153, 153, 153));
            Rcontraseña2.setForeground(new java.awt.Color(153, 153, 153));

            // Si llena correctamente todos los campos porcede al registro en la BD
        } else {
             // Llamada al método guardar
            int i = metodos.guardar(txtUsuario.getText(), txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), txtCorreo.getText(), txtContraseña.getText());
             
            // Dependiendo de si se realiza o no el registro procederá según estas condiciones.
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Su registro se ha realizado correctamente");
                LoginGUI ventana = new LoginGUI();
                ventana.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha podido realizar su registro, asegurese de que sus datos sean legítimos e intente con otro usuario");
            }

        }

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtContraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseña2ActionPerformed
     
    }//GEN-LAST:event_txtContraseña2ActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
     
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        LoginGUI ventana = new LoginGUI();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rcontraseña2;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton atras;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator lineaApellido;
    private javax.swing.JSeparator lineaContraseña;
    private javax.swing.JSeparator lineaContraseña2;
    private javax.swing.JSeparator lineaCorreo;
    private javax.swing.JSeparator lineaNombre;
    private javax.swing.JSeparator lineaUsuario;
    private javax.swing.JSeparator lineaUsuario4;
    private javax.swing.JSeparator lineatelefono;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel registro;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario4;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario4;
    // End of variables declaration//GEN-END:variables
}