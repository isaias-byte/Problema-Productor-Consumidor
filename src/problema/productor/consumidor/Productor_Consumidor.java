package problema.productor.consumidor;

import java.awt.Color;
import java.util.ArrayList;


public class Productor_Consumidor extends javax.swing.JFrame {
    ArrayList<String> productos = new ArrayList();   //Buffer
    HiloPrograma productor_consumidor = new HiloPrograma();
    String[] lista_productos = { "Papas", "Chicle", "Cacahuate", "Refresco", "Café", "Jabón", "Desodorante", "Leche", "Queso", "Mantequilla",
                                "Agua", "Paleta", "Tostadas", "Tortillas", "Cerveza", "Birote", "Hielo", "Azúcar", "Mayonesa", "Mermelada",
                                "Huevo", "Aceite", "Encendedor", "Frijoles", "Chiles", "Aluminio", "Yogur", "Pan", "Jamón", "Salchicha",
                                "Suero", "Rastrillo", "Shampoo", "Servilletas", "Pilas", "Té", "Chocolate", "Detergente", "Cloro", "Vasos",
                                "Platos", "Cerillos", "Cereal", "Palomitas", "Galletas", "Atún", "Medicamento", "Carbón", "Fibras", "Cinta"
                                };
    int indice_productor = 0;
    int indice_consumidor = 0;
    
    public Productor_Consumidor() {
        initComponents();
        
        //Configuración de la ventana
        this.setSize(600, 550);
        this.setResizable(false);
        this.setTitle("Productor-Consumidor");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(192, 220, 240));
        
        SetArrayList();                 //Asigna por defecto el valor "—", lo que quiere decir que no hay productos agregados
        productor_consumidor.start();   //Comienza a ejecutarse el hilo
    }
    
    private void SetArrayList() {
        for(int i = 0; i < 20; i++)
            productos.add(i, "—");
    }
    
    private int LanzamientoMoneda() {
        int numero_aleatorio = (int) (Math.floor(Math.random() * 2));   // 0 = Productor, 1 = Consumidor
        System.out.println("Lanzamiento Moneda: " + numero_aleatorio);
        return numero_aleatorio;
    }
    
    private int NumeroProductos() {
        int numero_aleatorio = (int) (Math.floor(Math.random() * 5) + 1);   //Números aleatorios del 1 - 4
        System.out.println("Número de Productos: " + numero_aleatorio);
        return numero_aleatorio;
    }
    
    //50 productos
    private void Producir(int veces) {
        for(int i = 0; i < veces; i++) {
            String producto_generado = lista_productos[(int) (Math.floor(Math.random() * lista_productos.length + 1))];
            productos.set(indice_productor, producto_generado);
            SetTextField(indice_productor, productos.get(indice_productor));
            indice_productor++;
        }
    }
    
    private void Consumir(int veces) {
        for(int i = 0; i < veces; i++) {
            productos.set(indice_consumidor, "—");
            SetTextField(indice_consumidor, productos.get(indice_consumidor));
            indice_consumidor++;
        }
    }

    private void SetTextField(int num, String txt) {
        switch (num) {
            case 1: txt1.setText(txt); break;
            case 2: txt2.setText(txt); break;
            case 3: txt3.setText(txt); break;
            case 4: txt4.setText(txt); break;
            case 5: txt5.setText(txt); break;
            case 6: txt6.setText(txt); break;
            case 7: txt7.setText(txt); break;
            case 8: txt8.setText(txt); break;
            case 9: txt9.setText(txt); break;
            case 10: txt10.setText(txt); break;
            case 11: txt11.setText(txt); break;
            case 12: txt12.setText(txt); break;
            case 13: txt13.setText(txt); break;
            case 14: txt14.setText(txt); break;
            case 15: txt15.setText(txt); break;
            case 16: txt16.setText(txt); break;
            case 17: txt17.setText(txt); break;
            case 18: txt18.setText(txt); break;
            case 19: txt19.setText(txt); break;
            case 20: txt20.setText(txt); break;
        }
    }
    
    public int GenerarTiempoHilo() {
        int tiempo_aleatorio = (int)(Math.floor(Math.random() * (5000 - 1000 + 1) + 1000));   //Generar números entre 1000 - 5000 (1 a 5 segundos)
        System.out.println("Tiempo: " + tiempo_aleatorio);
        
        return tiempo_aleatorio;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitulo.setText("Productor-Consumidor");

        txt1.setEditable(false);
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setText("—");
        txt1.setPreferredSize(new java.awt.Dimension(100, 30));

        txt2.setEditable(false);
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setText("—");
        txt2.setPreferredSize(new java.awt.Dimension(100, 30));

        txt3.setEditable(false);
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setText("—");
        txt3.setPreferredSize(new java.awt.Dimension(100, 30));

        txt4.setEditable(false);
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setText("—");
        txt4.setPreferredSize(new java.awt.Dimension(100, 30));

        txt5.setEditable(false);
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setText("—");
        txt5.setPreferredSize(new java.awt.Dimension(100, 30));

        txt6.setEditable(false);
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("—");
        txt6.setPreferredSize(new java.awt.Dimension(100, 30));

        txt7.setEditable(false);
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7.setText("—");
        txt7.setPreferredSize(new java.awt.Dimension(100, 30));

        txt8.setEditable(false);
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8.setText("—");
        txt8.setPreferredSize(new java.awt.Dimension(100, 30));

        txt9.setEditable(false);
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9.setText("—");
        txt9.setPreferredSize(new java.awt.Dimension(100, 30));

        txt10.setEditable(false);
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt10.setText("—");
        txt10.setPreferredSize(new java.awt.Dimension(100, 30));

        txt11.setEditable(false);
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.setText("—");
        txt11.setToolTipText("");
        txt11.setPreferredSize(new java.awt.Dimension(100, 30));

        txt12.setEditable(false);
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt12.setText("—");
        txt12.setPreferredSize(new java.awt.Dimension(100, 30));

        txt13.setEditable(false);
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setText("—");
        txt13.setPreferredSize(new java.awt.Dimension(100, 30));

        txt14.setEditable(false);
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt14.setText("—");
        txt14.setPreferredSize(new java.awt.Dimension(100, 30));

        txt15.setEditable(false);
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt15.setText("—");
        txt15.setPreferredSize(new java.awt.Dimension(100, 30));

        txt16.setEditable(false);
        txt16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt16.setText("—");
        txt16.setPreferredSize(new java.awt.Dimension(100, 30));

        txt17.setEditable(false);
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt17.setText("—");
        txt17.setPreferredSize(new java.awt.Dimension(100, 30));

        txt18.setEditable(false);
        txt18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt18.setText("—");
        txt18.setPreferredSize(new java.awt.Dimension(100, 30));

        txt19.setEditable(false);
        txt19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt19.setText("—");
        txt19.setPreferredSize(new java.awt.Dimension(100, 30));

        txt20.setEditable(false);
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt20.setText("—");
        txt20.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addGap(68, 68, 68)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private class HiloPrograma extends Thread {
        public void run() {
            int num_veces_comienzo = NumeroProductos();
            Producir(num_veces_comienzo);
            try {
                Thread.sleep(GenerarTiempoHilo());
            } catch (InterruptedException ex) {}
            
            while(true) {
                int quien_trabaja = LanzamientoMoneda();
                int num_veces = NumeroProductos();
                
                if(quien_trabaja == 0)
                    Producir(num_veces);
                else
                    Consumir(num_veces);
                
                try {
                    Thread.sleep(GenerarTiempoHilo());
                } catch (InterruptedException ex) {}
            }
        }
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
            java.util.logging.Logger.getLogger(Productor_Consumidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productor_Consumidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productor_Consumidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productor_Consumidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productor_Consumidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
