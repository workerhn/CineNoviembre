/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author flores
 */
public class AnimacionSalas extends javax.swing.JFrame implements ActionListener {
    
    private List<Image> p = new LinkedList<>();
    private List<Image> p2 = new LinkedList<>();
    private ImageIcon img = new ImageIcon("imagenes/personaje_opt.png");
    private Image imagen = img.getImage();
    private Timer timer;
    private final int DELAY = 2000;
    private int i,j;
    private int contador = 0, cont = 0;

    /**
     * Creates new form AnimacionSalas
     * @param sala
     * @param cantidad1
     * @param sala2
     * @param cantidad2
     */
    
    public AnimacionSalas(int sala, int cantidad1,  int sala2, int cantidad2, boolean ir){
        initComponents();
        
        
        if(cantidad1 > 0 )
            for(int i = 0; i < cantidad1; i++){
                p.add(getImagen());
            }
       if(cantidad2 > 0)
              for(int i = 0; i < cantidad2; i++){
                p2.add(getImagen());
            }
       i = p.size()-1;
       j = p2.size()-1;
       
       if(ir){
        timer = new Timer(DELAY, this);
        timer.start();
       }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(  !p.isEmpty()){
            p.remove(i);
            i--;
            contador = p.size();
        }
        if( !p2.isEmpty()){
            p2.remove(j);
            j--;
            cont = p2.size();
        }
        
        repaint();
    }

    public AnimacionSalas() {
        initComponents();
        
    }
    
    public Image getImagen()
    {
        return imagen;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        int i = 0;
        lblPersonas.setText("Personas en fila 1: " + contador);
        lblPersonas2.setText("Personas en fila 2: " + cont);
      //  g.drawImage(imagen, 50, 50, null);
        int x = getWidth() - 100, y = 250;
        
        for( Image im : p){
           g.drawImage(p.get(i), x, y, null);
           x -= 125;
           i++;
        }
        
        int k = 0;
         int x2 = getWidth() - 100, y2 = 500;
         for( Image im : p2){
           g.drawImage(p2.get(k), x2, y2, null);
           x2 -= 125;
           k++;
        }
    }
    
    
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPersonas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPersonas2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sala de Espera");
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(840, 260, 170, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/4pelicula.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(880, 50, 140, 210);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/3pelicula.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 50, 140, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/2pelicula.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 70, 140, 190);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/1pelicula.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 80, 150, 160);

        jLabel2.setFont(new java.awt.Font("IrisUPC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTRADA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1230, 310, 130, 30);

        lblPersonas.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblPersonas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblPersonas.setPreferredSize(new java.awt.Dimension(170, 20));
        getContentPane().add(lblPersonas);
        lblPersonas.setBounds(540, 10, 200, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/5peliucla.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1120, 50, 130, 210);

        lblPersonas2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblPersonas2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblPersonas2.setPreferredSize(new java.awt.Dimension(170, 20));
        getContentPane().add(lblPersonas2);
        lblPersonas2.setBounds(250, 10, 190, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/ladrillos super mejor.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(720, 40, 700, 240);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/ladrillos super mejor.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 40, 730, 240);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel23.setText("jLabel11");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(10, 520, 170, 180);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel24.setText("jLabel11");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(130, 520, 170, 180);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel25.setText("jLabel11");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(250, 520, 170, 180);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel27.setText("jLabel11");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(1080, 520, 170, 180);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel28.setText("jLabel11");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(370, 520, 170, 180);

        jLabel10.setFont(new java.awt.Font("IrisUPC", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ENTRADA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1230, 580, 130, 30);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel29.setText("jLabel11");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(490, 520, 170, 180);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel30.setText("jLabel11");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(610, 520, 170, 180);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel31.setText("jLabel11");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(730, 520, 170, 180);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel32.setText("jLabel11");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(850, 520, 170, 180);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel33.setText("jLabel11");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(970, 520, 170, 180);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel16.setText("jLabel11");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 260, 170, 180);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel13.setText("jLabel11");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(960, 260, 170, 180);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel17.setText("jLabel11");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(720, 260, 170, 180);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel18.setText("jLabel11");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(600, 260, 170, 180);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel19.setText("jLabel11");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(480, 260, 170, 180);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel20.setText("jLabel11");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(360, 260, 170, 180);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel21.setText("jLabel11");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(240, 260, 170, 180);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel22.setText("jLabel11");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(120, 260, 170, 180);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(500, 280, 450, 80);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 280, 450, 80);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/varenda.png"))); // NOI18N
        jLabel39.setText("jLabel11");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(1080, 260, 170, 180);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(950, 280, 450, 80);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(510, 540, 450, 80);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(0, 280, 50, 80);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel36);
        jLabel36.setBounds(960, 540, 450, 80);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(70, 540, 450, 80);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/alfombra roja.jpg"))); // NOI18N
        getContentPane().add(jLabel38);
        jLabel38.setBounds(0, 540, 70, 80);

        jLabel5.setFont(new java.awt.Font("IrisUPC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTRADA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1270, 310, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AnimacionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimacionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimacionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimacionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimacionSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPersonas;
    private javax.swing.JLabel lblPersonas2;
    // End of variables declaration//GEN-END:variables
}