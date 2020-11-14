/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Fichas.*;
import static FileManager.FileManager.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author XT
 */
public class Creador extends javax.swing.JFrame {
    public ArrayList<Object> personajes = (ArrayList)readObject("C:/Users/XT/Documents/personajes.g");

    /**
     * Creates new form Creador
     */
    public Creador() {
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtfDaño = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        txtfNombre = new javax.swing.JTextField();
        txtfVida = new javax.swing.JTextField();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        txtfNivel = new javax.swing.JTextField();
        txtfCampos = new javax.swing.JTextField();
        lblNombre5 = new javax.swing.JLabel();
        btbBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(470, 510));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(186, 221, 134));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CREADOR");
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 221, 134), 3));
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(120, 20, 288, 72);
        getContentPane().add(txtfDaño);
        txtfDaño.setBounds(240, 140, 147, 30);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(186, 221, 134));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(150, 90, 84, 41);

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contacto", "Rango", "Volador", "Heroe", "Bestia" }));
        getContentPane().add(cbTipo);
        cbTipo.setBounds(140, 350, 260, 50);

        btnGuardar.setBackground(new java.awt.Color(15, 17, 26));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(186, 221, 134));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 221, 134), 3));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(290, 410, 150, 40);

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(186, 221, 134));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("Daño");
        getContentPane().add(lblNombre1);
        lblNombre1.setBounds(160, 130, 84, 41);

        lblNombre2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(186, 221, 134));
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre2.setText("Campos");
        getContentPane().add(lblNombre2);
        lblNombre2.setBounds(150, 250, 84, 41);
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(240, 100, 147, 30);
        getContentPane().add(txtfVida);
        txtfVida.setBounds(240, 180, 147, 30);

        lblNombre3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(186, 221, 134));
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre3.setText("Imagen");
        getContentPane().add(lblNombre3);
        lblNombre3.setBounds(150, 290, 84, 41);

        lblNombre4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(186, 221, 134));
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre4.setText("Vida");
        getContentPane().add(lblNombre4);
        lblNombre4.setBounds(160, 170, 84, 41);
        getContentPane().add(txtfNivel);
        txtfNivel.setBounds(240, 220, 147, 30);
        getContentPane().add(txtfCampos);
        txtfCampos.setBounds(240, 260, 147, 30);

        lblNombre5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(186, 221, 134));
        lblNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre5.setText("Nivel");
        getContentPane().add(lblNombre5);
        lblNombre5.setBounds(160, 210, 84, 41);

        btbBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btbBuscar.setText("Buscar");
        getContentPane().add(btbBuscar);
        btbBuscar.setBounds(240, 300, 150, 23);

        btnCancelar.setBackground(new java.awt.Color(15, 17, 26));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(186, 221, 134));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 221, 134), 3));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(100, 410, 150, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCreador.png"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 530, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String nombre = txtfNombre.getText();
        int daño = Integer.parseInt(txtfDaño.getText());
        int vida = Integer.parseInt(txtfVida.getText());
        int nivel = Integer.parseInt(txtfNivel.getText());
        int campos = Integer.parseInt(txtfCampos.getText());
        JFileChooser fcCreador = new JFileChooser();
        fcCreador.setVisible(true);
        
        
        //imagen
        String tipo = (String) cbTipo.getSelectedItem();
        if(tipo.equals("Contacto")){
            guerrerosContacto guerrero = new guerrerosContacto(vida,campos,nombre,daño,nivel,true);
            personajes.add(guerrero);
            writeObject(guerrero, "C:/Users/XT/Documents/"+guerrero.Nombre+".g");
            System.out.println("Nombre "+guerrero.Nombre+" Vida "+guerrero.Vida+" Nivel "+guerrero.nivelAparicion+" Campos "+guerrero.Campos+" Daño "+guerrero.Damage);
        }
        else if(tipo.equals("Rango")){
            guerrerosAlcance guerrero = new guerrerosAlcance(vida,campos,nombre,daño,nivel,true);
            personajes.add(guerrero);
            writeObject(personajes, "C:/Users/XT/Documents/personajes.g");
        }
        else if(tipo.equals("Volador")){
            guerrerosAereos guerrero = new guerrerosAereos(vida,campos,nombre,daño,nivel,true);
            personajes.add(guerrero);
            writeObject(personajes, "C:/Users/XT/Documents/personajes.g");
        }
        else if(tipo.equals("Heroe")){
            guerrerosHeroes guerrero = new guerrerosHeroes(vida,campos,nombre,daño,nivel,true);
            personajes.add(guerrero);
            writeObject(personajes, "C:/Users/XT/Documents/personajes.g");
        }
        else if(tipo.equals("Bestia")){
            guerrerosBestias guerrero = new guerrerosBestias(vida,campos,nombre,daño,nivel,true);
            personajes.add(guerrero);
            writeObject(personajes, "C:/Users/XT/Documents/personajes.g");
        }
        
       // JFrame menu = new Menu();
        //menu.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        JFrame menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Creador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creador().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfCampos;
    private javax.swing.JTextField txtfDaño;
    private javax.swing.JTextField txtfNivel;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfVida;
    // End of variables declaration//GEN-END:variables
}
