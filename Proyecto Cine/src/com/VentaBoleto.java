/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author flores
 */
public class VentaBoleto extends javax.swing.JFrame {
    private final int PRECIO_SALA1 = 50;
    private final int PRECIO_SALA2 = 55;
    private final int ASIENTOS = 25;
    private List<Integer> asientosS1 = new ArrayList<>();
    private List<Integer> asientosS2 = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>(); // para mostrar los asientos actuales de Sala 1
    private List<Integer> temp2 = new ArrayList<>(); // para mostrar los asientos actuales de Sala 2
    private double cambio = 0.0;
    private  volatile int total = 0, total2 = 0;
    private int cont1 = 0, cont2 = 0;
    private int contaBoletos = 0, contaBoletos2 = 0;

    // total de sala 1 y sala 2
    private int totalS1 = 0, totalS2 = 0;
    private double totalGeneral = 0.0;

    private final List<JButton> botones = new ArrayList<>();
    private final List<JButton> botones2 = new ArrayList<>();

    /**
     * Creates new form VentaBoleto
     */
    public VentaBoleto() {
        initComponents();

        // Inicializar todos los botones de sala 1
        for(int i=0; i < 25; i++)
        {
            botones.add(new JButton("S: " + (i+1)));
        }

        // Inicializar todos los botones de sala 2
        for(int i=0; i < 25; i++)
        {
            botones2.add(new JButton("S: " + (i+1)));
        }

        init();
    }

    private void habilitarSalas(){

         if(cbSala.getSelectedIndex() == 0)
            for(int k=0; k <= botones.size()-1; k++){
              botones.get(k).setEnabled(true);
              botones2.get(k).setEnabled(false);

             }

          else
            for(int k=0; k <= botones2.size()-1; k++){
                botones.get(k).setEnabled(false);
                botones2.get(k).setEnabled(true);
            }

    }


    private void init()
    {
        /**************************************************/
        //              NO TOUCH!!
        // Es la asignacion de las peliculas para cada sala
        if(cbSala.getSelectedIndex() == 0){
            lblPeliculas.setText("Atomic Blonde");
        }else{
            lblPeliculas.setText("Avengers 4");
        }
        /************************************************/

        // Layout de los paneles 1 y 2
        //Es el numero de columnas y filas para las butacas
        GridLayout gl = new GridLayout();
        gl.setColumns(5);
        gl.setRows(5);
        gl.setHgap(5);
        gl.setVgap(5);

        panel1.setLayout(gl);
        panel2.setLayout(gl);

        // Agregar los botones en sala 1
        //Esto es para las propiedaddes de los botones de cada sala y que todos tengan el mismo tamaño
        for(int i = 0; i < botones.size(); i++){
            add(botones.get(i));

            /***********************************************/
            /****************Sala 1************************/

            // modificamos el actionlistener aqui
            botones.get(i).addActionListener(e-> {
                 Object key = e.getSource();
            // Operaciones para el panel1
            for(int k=0; k <= botones.size()-1; k++){
               if(cbSala.getSelectedIndex() == 0){
                   botones.get(k).setEnabled(true);
                   botones2.get(k).setEnabled(false);
                }


                    if(key.equals(botones.get(k))){

                        botones.get(k).setEnabled(false);
                        temp.add(k+1);
                        asientosS1.add(k);
                        contaBoletos++;

                        // Mostramos el precio para Sala1
                        int valor = Integer.parseInt(cbSala.getSelectedItem().toString());

                        if(valor == 1 ){
                            cont1++;
                            int precio = cont1 * PRECIO_SALA1;
                            lblPrecio.setText( "" + precio );
                            total = precio;
                            lblBoletos.setText("" + cont1);
                            lblAsientos.setText("" + temp);
                            lblTotal.setText("" + total);
                            } // fin de if valor ==1
                    }
                }
            }); // e lambda

        panel1.add(botones.get(i));
        }

        // Agregar los botones en sala 2
        for(int i = 0; i < botones2.size(); i++){
            add(botones2.get(i));

            /*******************************************/
            /******************Sala 2******************/

            botones2.get(i).addActionListener(e->{
                 Object key = e.getSource();
                // operaciones para el panel2
                // Elegir los asientos de la sala 2
                for(int k=0; k <= botones2.size()-1; k++){
                    if(cbSala.getSelectedIndex() == 1){
                       botones.get(k).setEnabled(false);
                       botones2.get(k).setEnabled(true);
                    }


                        if(key.equals(botones2.get(k))){
                            botones2.get(k).setEnabled(false);
                            temp2.add(k+1);
                            asientosS2.add(k);

                             int valor = Integer.parseInt(cbSala.getSelectedItem().toString());

                             if(valor == 2 ){
                                contaBoletos2++;
                                 System.out.println("boletos s2 " + contaBoletos2);
                                 cont2++;
                                int precio = cont2 * PRECIO_SALA2;
                                total2 = precio;

                                lblPrecio.setText( " " + precio );
                                lblBoletos.setText("" + cont2);
                                lblAsientos.setText("" + temp2);
                                lblTotal.setText("" + total2);
                            } // fin de if valor == 2
                        }// fin de else
                }// fin de for
                    });
            panel2.add(botones2.get(i));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnVentanaFilas = new javax.swing.JButton();
        btnImprimirBoleto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbCajero = new javax.swing.JComboBox<>();
        cbSala = new javax.swing.JComboBox<>();
        cbTanda = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        lblAsientos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        lblCambio = new javax.swing.JTextField();
        cbxAvanzar = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lblPeliculas = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        lblBoletos = new javax.swing.JLabel();
        btnReiniciarAsientos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta Boleto");
        setPreferredSize(new java.awt.Dimension(1200, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        btnVentanaFilas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVentanaFilas.setText("Visualizar Filas de Personas");
        btnVentanaFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaFilasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentanaFilas);
        btnVentanaFilas.setBounds(10, 500, 195, 40);

        btnImprimirBoleto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirBoleto.setText("Imprimir Boleto");
        btnImprimirBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirBoletoActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimirBoleto);
        btnImprimirBoleto.setBounds(260, 500, 140, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 110, 0, 2);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos Sala 1"));
        getContentPane().add(panel1);
        panel1.setBounds(450, 70, 350, 390);
        panel1.getAccessibleContext().setAccessibleName("ASIENTOS SALA 1 ");

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos Sala 2"));
        getContentPane().add(panel2);
        panel2.setBounds(800, 70, 350, 390);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cambio:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 410, 70, 20);

        cbCajero.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbCajero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Angie", "Alejandro", "Gerardo", "Kevin", "Jeffry" }));
        getContentPane().add(cbCajero);
        cbCajero.setBounds(80, 80, 110, 30);

        cbSala.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cbSala.setName("cbxSala"); // NOI18N
        cbSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalaActionPerformed(evt);
            }
        });
        getContentPane().add(cbSala);
        cbSala.setBounds(80, 120, 70, 30);

        cbTanda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbTanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4:00 - 6:00 PM", "6:00 - 8:00 PM", "8:00 - 10:00 PM" }));
        getContentPane().add(cbTanda);
        cbTanda.setBounds(80, 160, 120, 30);

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblPrecio);
        lblPrecio.setBounds(110, 290, 60, 20);

        lblAsientos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblAsientos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblAsientos);
        lblAsientos.setBounds(110, 320, 150, 20);

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblTotal);
        lblTotal.setBounds(70, 410, 64, 30);

        txtPago.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPago);
        txtPago.setBounds(200, 410, 64, 30);

        lblCambio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        getContentPane().add(lblCambio);
        lblCambio.setBounds(340, 410, 67, 30);

        cbxAvanzar.setText("Avanzar");
        cbxAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAvanzarActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAvanzar);
        cbxAvanzar.setBounds(190, 460, 65, 23);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Tanda:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 160, 50, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Cajero:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 90, 50, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 400, 400, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 70, 280, 10);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Película:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 200, 60, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Cant Boletos:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 260, 90, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Precio:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(60, 290, 50, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Pos. Asiento:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(20, 320, 90, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Total:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(30, 410, 40, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Pago:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(160, 410, 40, 20);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(20, 250, 290, 20);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(230, 500, 40, 40);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(20, 350, 260, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(30, 450, 400, 2);

        lblPeliculas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblPeliculas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblPeliculas);
        lblPeliculas.setBounds(80, 200, 200, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Sala:");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(30, 130, 40, 20);

        btnReporte.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte);
        btnReporte.setBounds(890, 500, 130, 40);

        lblBoletos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblBoletos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblBoletos);
        lblBoletos.setBounds(110, 260, 70, 20);

        btnReiniciarAsientos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnReiniciarAsientos.setText("Nueva Tanda");
        btnReiniciarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarAsientosActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciarAsientos);
        btnReiniciarAsientos.setBounds(1030, 500, 120, 40);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VENTA DE BOLETO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 0, 280, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/35eb7d5bce221d9392feb1e426ba48af--wallpaper-azul-color-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(730, 0, 500, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/35eb7d5bce221d9392feb1e426ba48af--wallpaper-azul-color-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/35eb7d5bce221d9392feb1e426ba48af--wallpaper-azul-color-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 490, 740, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/35eb7d5bce221d9392feb1e426ba48af--wallpaper-azul-color-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 490, 500, 60);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(20, 230, 290, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Proyecto Cine/tickets.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 110, 140, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Ya esta no tocar!!!
    private void btnVentanaFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaFilasActionPerformed
        // TODO add your handling code here:
        int s1 = Integer.parseInt(cbSala.getSelectedItem().toString());
        int s2 = Integer.parseInt(cbSala.getSelectedItem().toString());
        new AnimacionSalas( s1, asientosS1.size(), s2, asientosS2.size(), cbxAvanzar.isSelected() ).setVisible(true);

        if(cbxAvanzar.isSelected()){
            asientosS1.removeAll(asientosS1);
            asientosS2.removeAll(asientosS2);
        }
    }//GEN-LAST:event_btnVentanaFilasActionPerformed
    // NO TOCAR
    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();

        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
            evt.consume();
            repaint();
        }
    }//GEN-LAST:event_txtPagoKeyTyped
    // NO TOCAR
    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:

        int v = Integer.parseInt(txtPago.getText());

        if( v < total -1 || v < total2-1 ){
            JOptionPane.showMessageDialog(null, "El efectivo es insuficiente!");
            txtPago.setText("");
            return;
        }else{
            //totalGeneral += getTotal();
            double vuelto = 0.0;

            if(cbSala.getSelectedIndex() == 0){
                totalS1 += getTotal();
                double  vuelto1 = v - getTotal();
                cambio = vuelto1;
                lblCambio.setText("" + vuelto1);
                totalGeneral += total;
            }else{
                totalS2 += total2;
                double  vuelto2 = v - total2;
                cambio = vuelto2;
                lblCambio.setText("" + vuelto2);
                totalGeneral += total2;
            }

        }
    }//GEN-LAST:event_txtPagoActionPerformed
    // NO TOCAR
    private void btnImprimirBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirBoletoActionPerformed

        //Las peliculas de las salas.
        if("".equals(txtPago.getText())){
            JOptionPane.showMessageDialog(null, "Error, pago no se a efectuado!");
         return;
        }

        String peli = "";
        if(cbSala.getSelectedItem().toString().equals("1")){
            peli = "Star Wars 8";
        }else{
            peli = "Toy Story 4";
        }

        if(cbSala.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"CINE PIRATAS"
            + "\nCajero: " + cbCajero.getSelectedItem().toString()
            + "\nSala: "+ cbSala.getSelectedItem().toString()
            + "\nTanda: " + cbTanda.getSelectedItem().toString()
            + "\nPelicula: " + lblPeliculas.getText()
            + "\nBoletos: " + cont1
            + "\nPosicion de Asientos: " + temp.toString()
            + "\nTotal: "  + getTotal()
            + "\nPago: " + txtPago.getText()
            + "\nCambio: " + cambio);
        }else
        {
               JOptionPane.showMessageDialog(null,"CINE PIRATAS"
            + "\nCajero: " + cbCajero.getSelectedItem().toString()
            + "\nSala: "+ cbSala.getSelectedItem().toString()
            + "\nTanda: " + cbTanda.getSelectedItem().toString()
            + "\nPelicula: " + lblPeliculas.getText()
            + "\nBoletos: " + cont2
            + "\nPosicion de Asientos: " + temp2
            + "\nTotal: "  + total2
            + "\nPago: " + txtPago.getText()
            + "\nCambio: " + cambio);
        }
        lblAsientos.setText("");
        lblTotal.setText("");
        lblBoletos.setText("");
        lblPrecio.setText("");
        txtPago.setText("");
        lblCambio.setText("");

        total = 0;
        cont1=0;
        cont2=0;

        temp.removeAll(temp);
        temp2.removeAll(temp2);
    }//GEN-LAST:event_btnImprimirBoletoActionPerformed
    // NO TOCAR
    private void cbSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalaActionPerformed
        // TODO add your handling code here:

        if(cbSala.getSelectedIndex() == 0){
            lblPeliculas.setText("Atomic Blonde");

        }else{
            lblPeliculas.setText("Avengers 4");
        }


    }//GEN-LAST:event_cbSalaActionPerformed
    // NO TOCAR
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:

        StringBuilder salas = new StringBuilder();
        salas.append("Sala 1\n");
        salas.append("Boletos Vendidos: " + contaBoletos + "\n");
        salas.append("Precio: L.50.00\n");
        salas.append("Total Sala 1: " + totalS1 + "\n");

        salas.append("\n\nSala 2");
        salas.append("\nBoletos Vendidos: " + contaBoletos2);
        salas.append("\nPrecio: L.55.00");
        salas.append("\nTotal Sala 2: " + totalS2);

        salas.append("\n\nTotal General: " + totalGeneral);

        ReporteArchivo rpa = new ReporteArchivo();
        rpa.crearReporte("reporte.txt", contaBoletos, totalS1, contaBoletos2, totalS2, totalGeneral);

        JOptionPane.showMessageDialog(null, salas);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void cbxAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAvanzarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAvanzarActionPerformed
    // NO TOCAR
    private void btnReiniciarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarAsientosActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < botones.size(); i++){
            botones.get(i).setEnabled(true);
            botones2.get(i).setEnabled(true);
        }

        cont1=0;
        cont2=0;
        total=0;
        asientosS1.removeAll(asientosS1);
        asientosS2.removeAll(asientosS2);
        temp.removeAll(temp);
        temp2.removeAll(temp2);
    }//GEN-LAST:event_btnReiniciarAsientosActionPerformed

    public List<Integer> getAsientosS1()
    {
        return asientosS1;
    }

    public List<Integer> getASientosS2()
    {
        return asientosS2;
    }


    public double getTotal()
    {
        return total;
    }

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
            java.util.logging.Logger.getLogger(VentaBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirBoleto;
    private javax.swing.JButton btnReiniciarAsientos;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVentanaFilas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCajero;
    private javax.swing.JComboBox<String> cbSala;
    private javax.swing.JComboBox<String> cbTanda;
    private javax.swing.JCheckBox cbxAvanzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAsientos;
    private javax.swing.JLabel lblBoletos;
    private javax.swing.JTextField lblCambio;
    private javax.swing.JLabel lblPeliculas;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
