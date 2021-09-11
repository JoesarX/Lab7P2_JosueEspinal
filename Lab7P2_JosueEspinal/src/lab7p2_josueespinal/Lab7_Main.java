/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_josueespinal;

import com.sun.tools.javac.Main;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class Lab7_Main extends javax.swing.JFrame {

    public ArrayList<Astronauta> astro = new ArrayList<Astronauta>();
    public ArrayList<Naves> naves = new ArrayList<Naves>();
    public ArrayList<Destino> dest = new ArrayList<Destino>();
    public ArrayList<Misiones> mis = new ArrayList<Misiones>();
    public int listaque;

    public Lab7_Main() throws IOException {
        initComponents();
        Astronauta a = new Astronauta("33441221", "Josue", "Espinal", "Espaniol",
                "Fisico", "Alto", 170, 2);
        Astronauta b = new Astronauta("123456789", "Luis", "Castro", "Honduras",
                "matematico", "enano", 140, 1);
        Naves nav = new Naves("Elxelsior", "CDA51676", 40000, 180000,
                15, 0, 2, 100, 200);
        Destino d = new Destino("La Luna", 300, dsuperficie.getText(), (int) dsaturacion.getValue());
        astro.add(b);
        astro.add(a);
        naves.add(nav);
        dest.add(d);
        ListaAstro as = new ListaAstro("./Astronautas.ast");
        as.cargarArchivo();
        as.setAstro(astro);
        System.out.println(as.getAstro());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListaDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        agregarNaves = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        nnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        npersonas = new javax.swing.JSpinner();
        ndespegue = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        naterrizaje = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        nvelocidad = new javax.swing.JSpinner();
        nconsumo = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ntanque = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        nreserva = new javax.swing.JSpinner();
        agregarAstro = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idbox1 = new javax.swing.JTextField();
        nombrebox1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        apellidobox1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nacionalidadbox1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        titulobox1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        contexturabox1 = new javax.swing.JTextArea();
        pesobox1 = new javax.swing.JSpinner();
        misionesbox1 = new javax.swing.JSpinner();
        agregarDestino = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        dnombre = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        dsuperficie = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        ddistancia = new javax.swing.JSpinner();
        dsaturacion = new javax.swing.JSpinner();
        SimulacionDialog = new javax.swing.JDialog();
        cbnave = new javax.swing.JComboBox<>();
        cbdestino = new javax.swing.JComboBox<>();
        cbastro = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        astrolista = new javax.swing.JList<>();
        SelectNave = new javax.swing.JLabel();
        SelectNave1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Tanquebar = new javax.swing.JProgressBar();
        reservabar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        SelectNave2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListaDialogLayout = new javax.swing.GroupLayout(ListaDialog.getContentPane());
        ListaDialog.getContentPane().setLayout(ListaDialogLayout);
        ListaDialogLayout.setHorizontalGroup(
            ListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(ListaDialogLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jButton3)
                .addGap(36, 36, 36)
                .addComponent(jButton4)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        ListaDialogLayout.setVerticalGroup(
            ListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Agregar Nave");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("ID:");

        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });

        nnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nnombreActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Nombre:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Personas:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Despegue:");

        jButton2.setText("AGREGAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel29.setText("Aterrizaje:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("Velocidad:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("Consumo:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("Cap. Tanque:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel33.setText("Cap. Reserva:");

        javax.swing.GroupLayout agregarNavesLayout = new javax.swing.GroupLayout(agregarNaves.getContentPane());
        agregarNaves.getContentPane().setLayout(agregarNavesLayout);
        agregarNavesLayout.setHorizontalGroup(
            agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarNavesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarNavesLayout.createSequentialGroup()
                        .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ndespegue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(naterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nvelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ntanque, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(nreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(agregarNavesLayout.createSequentialGroup()
                        .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(npersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(agregarNavesLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel7)))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        agregarNavesLayout.setVerticalGroup(
            agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarNavesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(npersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ndespegue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(naterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(nvelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(nconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(ntanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(nreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Agregar Astronauta");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("ID:");

        idbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbox1ActionPerformed(evt);
            }
        });

        nombrebox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrebox1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Nombre:");

        apellidobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidobox1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Apellido:");

        nacionalidadbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadbox1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("Nacionalidad:");

        titulobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulobox1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("Titulo:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("Peso:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("Misiones:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("Contextura:");

        jButton5.setText("AGREGAR");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        contexturabox1.setColumns(20);
        contexturabox1.setRows(5);
        jScrollPane3.setViewportView(contexturabox1);

        javax.swing.GroupLayout agregarAstroLayout = new javax.swing.GroupLayout(agregarAstro.getContentPane());
        agregarAstro.getContentPane().setLayout(agregarAstroLayout);
        agregarAstroLayout.setHorizontalGroup(
            agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarAstroLayout.createSequentialGroup()
                .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarAstroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarAstroLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombrebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarAstroLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarAstroLayout.createSequentialGroup()
                                .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(agregarAstroLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nacionalidadbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(agregarAstroLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(titulobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(agregarAstroLayout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(misionesbox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(pesobox1, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(agregarAstroLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarAstroLayout.setVerticalGroup(
            agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarAstroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(agregarAstroLayout.createSequentialGroup()
                        .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(idbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(nombrebox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(apellidobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(nacionalidadbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(pesobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarAstroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(titulobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(misionesbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Agregar Destino");

        dnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnombreActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("Nombre:");

        dsuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsuperficieActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel28.setText("Superficie:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel36.setText("Distancia:");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel37.setText("Saturacion:");

        jButton6.setText("AGREGAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarDestinoLayout = new javax.swing.GroupLayout(agregarDestino.getContentPane());
        agregarDestino.getContentPane().setLayout(agregarDestinoLayout);
        agregarDestinoLayout.setHorizontalGroup(
            agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarDestinoLayout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ddistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(agregarDestinoLayout.createSequentialGroup()
                        .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarDestinoLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dsuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarDestinoLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarDestinoLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel25))
                            .addGroup(agregarDestinoLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(dsaturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        agregarDestinoLayout.setVerticalGroup(
            agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarDestinoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(dnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(ddistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(dsuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(dsaturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        cbdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdestinoActionPerformed(evt);
            }
        });

        cbastro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbastroItemStateChanged(evt);
            }
        });

        jScrollPane4.setViewportView(astrolista);

        SelectNave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SelectNave.setText("Seleccione Nave");

        SelectNave1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SelectNave1.setText("Seleccione Tripulantes:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SIMULACION DE VUELO:");

        jButton1.setText("INICIAR SIMULACION:");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tanque Principal Consumido:");

        Tanquebar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TanquebarStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tanque Reserva Consumido:");

        SelectNave2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SelectNave2.setText("Seleccione Destino");

        javax.swing.GroupLayout SimulacionDialogLayout = new javax.swing.GroupLayout(SimulacionDialog.getContentPane());
        SimulacionDialog.getContentPane().setLayout(SimulacionDialogLayout);
        SimulacionDialogLayout.setHorizontalGroup(
            SimulacionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulacionDialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(SimulacionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SimulacionDialogLayout.createSequentialGroup()
                        .addGroup(SimulacionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reservabar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                            .addComponent(SelectNave1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tanquebar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SimulacionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbnave, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE)
                                .addComponent(cbdestino, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(SimulacionDialogLayout.createSequentialGroup()
                        .addGroup(SimulacionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectNave2)
                            .addComponent(SelectNave)
                            .addGroup(SimulacionDialogLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jButton1))
                            .addGroup(SimulacionDialogLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbastro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        SimulacionDialogLayout.setVerticalGroup(
            SimulacionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulacionDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(SelectNave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbnave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SelectNave2)
                .addGap(2, 2, 2)
                .addComponent(cbdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SelectNave1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tanquebar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservabar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenu2.setText("Modificar Elementos");

        jMenuItem1.setText("Astronautas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Naves");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Destinos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenu1.add(jMenu2);

        jMenuItem6.setText("Realizar Mision");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Resumen Misiones");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        listaque = 2;
        lista.setModel(new DefaultListModel<>());
        DefaultListModel l = (DefaultListModel) lista.getModel();
        l.clear();

        for (int i = 0; i < naves.size(); i++) {
            l.addElement(naves.get(i));
        }
        lista.setModel(l);
        mostrarLista();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        listaque = 1;
        lista.setModel(new DefaultListModel<>());
        DefaultListModel l = (DefaultListModel) lista.getModel();
        l.clear();

        for (int i = 0; i < astro.size(); i++) {
            l.addElement(astro.get(i));
        }
        lista.setModel(l);
        mostrarLista();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void nnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nnombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        int x = lista.getSelectedIndex();
        DefaultListModel l = (DefaultListModel) lista.getModel();

    }//GEN-LAST:event_listaMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (listaque == 1) {
            mostrarAddAstro();
        } else if (listaque == 2) {
            mostrarAddNave();
        } else {
            mostrarAddDestino();
        }

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Naves nav = new Naves(nnombre.getText(), nid.getText(), (int) ndespegue.getValue(), (int) naterrizaje.getValue(),
                (int) nvelocidad.getValue(), 0, (int) nconsumo.getValue(), (int) ntanque.getValue(), (int) nreserva.getValue());
        naves.add(nav);
        nnombre.setText("");
        nid.setText("");
        ndespegue.setValue(0);
        naterrizaje.setValue(0);
        nvelocidad.setValue(0);
        nconsumo.setValue(0);
        ntanque.setValue(0);
        nreserva.setValue(0);
        naves.add(nav);
        agregarNaves.setVisible(false);
        lista.setModel(new DefaultListModel<>());
        DefaultListModel l = (DefaultListModel) lista.getModel();
        l.clear();

        for (int i = 0; i < naves.size(); i++) {
            l.addElement(naves.get(i));
        }
        lista.setModel(l);

    }//GEN-LAST:event_jButton2MouseClicked

    private void idbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbox1ActionPerformed

    private void nombrebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrebox1ActionPerformed

    private void apellidobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidobox1ActionPerformed

    private void nacionalidadbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadbox1ActionPerformed

    private void titulobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulobox1ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        Astronauta a = new Astronauta(idbox1.getText(), nombrebox1.getText(), apellidobox1.getText(), nacionalidadbox1.getText(),
                titulobox1.getText(), contexturabox1.getText(), (int) pesobox1.getValue(), (int) misionesbox1.getValue());

        ListaAstro as = new ListaAstro("./Astronautas.ast");
        astro.add(a);
        as.cargarArchivo();
        as.setAstro(astro);
        JOptionPane.showMessageDialog(null, "Creado exitosamente");
        agregarNaves.setVisible(false);
        lista.setModel(new DefaultListModel<>());
        DefaultListModel l = (DefaultListModel) lista.getModel();
        System.out.println(astro.size());
        System.out.println(as.getAstro().size());
        for (int i = 0; i < astro.size(); i++) {
            l.addElement(astro.get(i));
        }
        lista.setModel(l);
        mostrarLista();
        agregarAstro.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdestinoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnombreActionPerformed

    private void dsuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsuperficieActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Destino d = new Destino(dnombre.getText(), (int) ddistancia.getValue(), dsuperficie.getText(), (int) dsaturacion.getValue());
        dest.add(d);
        dnombre.setText("");
        ddistancia.setValue(0);
        dsuperficie.setText("");
        dsaturacion.setValue(0);
        lista.setModel(new DefaultListModel<>());
        DefaultListModel l = (DefaultListModel) lista.getModel();
        l.clear();

        for (int i = 0; i < dest.size(); i++) {
            l.addElement(dest.get(i));
        }
        lista.setModel(l);
        agregarDestino.setVisible(false);

    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        listaque = 3;
        lista.setModel(new DefaultListModel<>());
        DefaultListModel l = (DefaultListModel) lista.getModel();
        l.clear();
        for (int i = 0; i < dest.size(); i++) {
            l.addElement(dest.get(i));
        }
        lista.setModel(l);
        mostrarLista();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) cbnave.getModel();
        for (int i = 0; i < naves.size(); i++) {
            modelo1.addElement(naves.get(i));
        }
        cbnave.setModel(modelo1);

        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cbdestino.getModel();
        for (int i = 0; i < dest.size(); i++) {
            modelo2.addElement(dest.get(i));
        }
        cbdestino.setModel(modelo2);

        DefaultComboBoxModel modelo3 = (DefaultComboBoxModel) cbastro.getModel();
        for (int i = 0; i < astro.size(); i++) {
            modelo3.addElement(astro.get(i));
        }
        cbastro.setModel(modelo3);

        mostrarSimulacion();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int recorrido = 0;
        int distancia = dest.get(cbdestino.getSelectedIndex()).getDistancia();
        int consumo = naves.get(cbnave.getSelectedIndex()).getConsumo();
        int tanque = naves.get(cbnave.getSelectedIndex()).getCombustible();
        int reserva = naves.get(cbnave.getSelectedIndex()).getReserva();
        System.out.println(distancia);
        System.out.println(consumo);
        System.out.println(tanque);
        System.out.println(reserva);
        ThreadTanque h = new ThreadTanque(Tanquebar, reservabar, consumo, tanque, distancia, reserva);
        Thread proceso1 = new Thread(h);
        proceso1.start();
        recorrido = consumo * tanque;
        int recorridoOG = recorrido;
        if (recorrido < distancia) {
            int opcion = JOptionPane.showConfirmDialog(null, "Segun los calculos, se quedara sin combustible, pero aun tiene reservas, desea usarlas: ");
            if (opcion == 0) {
                ThreadTanque p = new ThreadTanque(reservabar, consumo, reserva, (distancia - recorrido));
                Thread proceso2 = new Thread(p);
                proceso2.start();

                recorrido += reserva * consumo;
                if (recorrido >= distancia) {
                    JOptionPane.showMessageDialog(null, "LOGRO LLEGAR CON LAS RESERVAS. BUEN TRABAJO.\nHasta le sobro un " + ((((100 - (distancia - recorridoOG) * 100)) / reserva)) + "% del combustible de las reservas.");
                } else {
                    JOptionPane.showMessageDialog(null, "No le ajusto con el tanque de reserva, la mision fracaso!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Decidio no usar el tanque de reserva, la mision fracaso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "LOGRO LLEGAR SIN LAS RESERVAS. BUEN TRABAJO.\nHasta le sobro un "
                    + ((((100 - (distancia - recorridoOG) * 100)) / tanque)) + "% del combustible principal.");
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void TanquebarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TanquebarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TanquebarStateChanged

    private void cbastroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbastroItemStateChanged
        int pos = 0;


    }//GEN-LAST:event_cbastroItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (listaque == 1) {
            if (lista.getSelectedIndex() >= 0) {
                astro.remove(lista.getSelectedIndex());
                lista.setModel(new DefaultListModel<>());
                DefaultListModel l = (DefaultListModel) lista.getModel();
                l.clear();

                for (int i = 0; i < astro.size(); i++) {
                    l.addElement(astro.get(i));
                }
                lista.setModel(l);
                mostrarLista();
            } else {
                JOptionPane.showMessageDialog(ListaDialog, "Por favor eliga a una persona.");
            }

        } else if (listaque == 2) {
            if (lista.getSelectedIndex() >= 0) {
                naves.remove(lista.getSelectedIndex());
                lista.setModel(new DefaultListModel<>());
                DefaultListModel l = (DefaultListModel) lista.getModel();
                l.clear();

                for (int i = 0; i < naves.size(); i++) {
                    l.addElement(naves.get(i));
                }
                lista.setModel(l);
                mostrarLista();
            } else {
                JOptionPane.showMessageDialog(ListaDialog, "Por favor eliga a una nave.");
            }
        } else {
            if (lista.getSelectedIndex() >= 0) {
                dest.remove(lista.getSelectedIndex());
                lista.setModel(new DefaultListModel<>());
                DefaultListModel l = (DefaultListModel) lista.getModel();
                l.clear();
                for (int i = 0; i < dest.size(); i++) {
                    l.addElement(dest.get(i));
                }
                lista.setModel(l);
                mostrarLista();
            } else {
                JOptionPane.showMessageDialog(ListaDialog, "Por favor eliga a un destino.");
            }
        }


    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Lab7_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab7_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab7_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab7_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lab7_Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Lab7_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void mostrarLista() {
        ListaDialog.setModal(true);
        ListaDialog.pack();
        ListaDialog.setLocationRelativeTo(this);
        ListaDialog.setVisible(true);
    }

    public void mostrarSimulacion() {
        SimulacionDialog.setModal(true);
        SimulacionDialog.pack();
        SimulacionDialog.setLocationRelativeTo(this);
        SimulacionDialog.setVisible(true);
    }

    public void mostrarAddAstro() {
        agregarAstro.setModal(true);
        agregarAstro.pack();
        agregarAstro.setLocationRelativeTo(this);
        agregarAstro.setVisible(true);
    }

    public void mostrarAddNave() {
        agregarNaves.setModal(true);
        agregarNaves.pack();
        agregarNaves.setLocationRelativeTo(this);
        agregarNaves.setVisible(true);
    }

    public void mostrarAddDestino() {
        agregarDestino.setModal(true);
        agregarDestino.pack();
        agregarDestino.setLocationRelativeTo(this);
        agregarDestino.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ListaDialog;
    private javax.swing.JLabel SelectNave;
    private javax.swing.JLabel SelectNave1;
    private javax.swing.JLabel SelectNave2;
    private javax.swing.JDialog SimulacionDialog;
    private javax.swing.JProgressBar Tanquebar;
    private javax.swing.JDialog agregarAstro;
    private javax.swing.JDialog agregarDestino;
    private javax.swing.JDialog agregarNaves;
    private javax.swing.JTextField apellidobox1;
    private javax.swing.JList<String> astrolista;
    private javax.swing.JComboBox<String> cbastro;
    private javax.swing.JComboBox<String> cbdestino;
    private javax.swing.JComboBox<String> cbnave;
    private javax.swing.JTextArea contexturabox1;
    private javax.swing.JSpinner ddistancia;
    private javax.swing.JTextField dnombre;
    private javax.swing.JSpinner dsaturacion;
    private javax.swing.JTextField dsuperficie;
    private javax.swing.JTextField idbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista;
    private javax.swing.JSpinner misionesbox1;
    private javax.swing.JTextField nacionalidadbox1;
    private javax.swing.JSpinner naterrizaje;
    private javax.swing.JSpinner nconsumo;
    private javax.swing.JSpinner ndespegue;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField nnombre;
    private javax.swing.JTextField nombrebox1;
    private javax.swing.JSpinner npersonas;
    private javax.swing.JSpinner nreserva;
    private javax.swing.JSpinner ntanque;
    private javax.swing.JSpinner nvelocidad;
    private javax.swing.JSpinner pesobox1;
    private javax.swing.JProgressBar reservabar;
    private javax.swing.JTextField titulobox1;
    // End of variables declaration//GEN-END:variables
}
