/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidosp1;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private int[][] matrizCompleta;
    private int[][] matrizCompletaAux;
    private int minimo;
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jButton1.setText("Elegir imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("opcion1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("opcion2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
//        boolean flag1 = false;
//        try{
//            File abre;
//            JFileChooser file = new JFileChooser();
//            file.showOpenDialog(this);
//            abre = file.getSelectedFile();
//            if(abre!=null){     
//                FileReader archivos=new FileReader(abre);
//                String tipo = file.getTypeDescription(abre);
//                if(!(("Archivo PGM").equals(tipo))){
//                    JOptionPane.showMessageDialog(null, "El tipo del archivo no era una imagen", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                ImageIcon i = new ImageIcon(abre.getAbsolutePath()); 
//                Image img = i.getImage();
//                img = img.getScaledInstance(400, 800, java.awt.Image.SCALE_SMOOTH);
//                i = new ImageIcon(img);
//                JLabel imagen = new JLabel();
//                imagen.setIcon(i);
//                imagen.setBounds(0, 0,400,800);
//                this.jPanel1.add(imagen);
//                this.pack();
//                this.repaint();
//                flag1 = true;
//            }    
//        }
//        catch(IOException ex){
//            JOptionPane.showMessageDialog(null,ex+"" + "\nNo se ha encontrado el archivo", "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if (flag1) {
//            JOptionPane.showMessageDialog(null, "La imagen fue guardada con éxito");
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "El evento fue cancelado");
//        }


        //DATOS DE LA IMAGEN
 
        //P2: Los valores de los píxeles vienen en formato ASCII (es decir como cifras numéricas enteras entre 0 y 255).
        //P5: Los valores de los píxeles vienen en formato Binario (es decir la información de cada píxel viene expresada en un byte).
        String cadenaMagica;

        //Indica las dimensiones de la imagen. Ancho y alto.
        String dimensiones[] = new String[2];

        //Indica el valor máximo del nivel de gris.
        String nivelGris;

        //Representación de toda la imagen.
        String imagen = null;

        
        try {
            File abre;
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            abre = file.getSelectedFile();
            BufferedReader archivo = new BufferedReader(new FileReader(abre.getAbsolutePath()));

            cadenaMagica = archivo.readLine();
            System.out.println ("Cadena Magica: "+cadenaMagica);

            String a = archivo.readLine();
            System.out.println(a);
            dimensiones = archivo.readLine().split(" ");
            System.out.println ("Ancho: "+dimensiones[0]+" Alto: "+dimensiones[1]);

            minimo = Integer.parseInt(archivo.readLine());
            imagen = " ";

            String str = archivo.readLine();

            while(str!=null){
             imagen +=str;
             str = archivo.readLine();
            }
        }catch(Exception exc)
        {
         System.out.println ("Error leyendo archivo");
        }
        
        int alto = Integer.parseInt(dimensiones[1]);
        int ancho = Integer.parseInt(dimensiones[0]);
        this.matrizCompleta = new int[alto][ancho];
        this.matrizCompletaAux = new int[alto][ancho];
        int nivel = 0;
        for(int i=0 ; i<alto ; i++){
            for(int j=0 ; j<ancho ; j++){
                nivel = ((int)imagen.charAt(i*ancho+j));
                
                //Esto lo hago por el error para que sea un valor comprendido entre 0-255
                //No debería pasar esto.  
                if(nivel>this.minimo){
                    nivel = 255;
                }
                this.matrizCompleta[i][j] = nivel;
                this.matrizCompletaAux[i][j] = nivel;
            }
        }
        this.imprimirMatriz();
        System.out.println("lista las matrices");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   public void imprimirMatriz(){
       for (int i = 0; i < this.matrizCompleta.length; i++) {
           for (int j = 0; j < this.matrizCompleta[i].length; j++) {
               System.out.print(this.matrizCompleta[i][j]+" ");
           }
           System.out.println(" ");
       }
   }
   
   public void erosion(){
//       
//        for (int i = 0; i < this.matrizCompleta.length; i++) {
//            for (int j = 0; j < this.matrizCompleta[i].length; j++) {
//                int min = 
//            }
//        }
//       
//        for(int i=0; i<this.matrizCompleta; i++){
//            for(j=1; j<colu-1; j++){
//                    int min =255;
//                    int k[5];
//                    k[0] = dibu[i][j-1];
//                    k[1] = dibu[i-1][j];
//                    k[2] = dibu[i][j];
//                    k[3] = dibu[i][j+1];
//                    k[4] = dibu[i+1][j];
//                    int l;
//                    for(l=0;l<5;l++){
//                            if(k[l]<min){
//                                    min = k[l];
//                            }
//                    }
//                    otra[i][j]=min;
//            }
//        }
   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
