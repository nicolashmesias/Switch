/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package front;

import logica.Area;

/**
 *
 * @author nikom
 */
public class Circulo extends javax.swing.JFrame {
	private Area cir;

	/**
	 * Creates new form Circulo
	 */
	public Circulo() {
		initComponents();
		cir = new Area();
		
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                tx1 = new javax.swing.JLabel();
                tx2 = new javax.swing.JLabel();
                tx3 = new javax.swing.JLabel();
                bt1 = new javax.swing.JButton();
                txt1 = new javax.swing.JTextField();
                txt2 = new javax.swing.JTextField();
                bt2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tx1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                tx1.setText("Area del circulo");

                tx2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                tx2.setText("Area");

                tx3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                tx3.setText("Ingrese el radio");

                bt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt1.setText("Calcular");
                bt1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt1ActionPerformed(evt);
                        }
                });

                txt2.setEditable(false);

                bt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt2.setText("Regresar");
                bt2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(174, 174, 174)
                                                .addComponent(tx1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(tx2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(bt2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(tx3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(bt1)
                                                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(31, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tx1)
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tx3)
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(bt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tx2))
                                .addGap(32, 32, 32)
                                .addComponent(bt2)
                                .addGap(31, 31, 31))
                );

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

        private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
               PantallaArea panta = new PantallaArea();
	       panta.setVisible(true);
	       panta.setLocationRelativeTo(null);
	       dispose();
	       
        }//GEN-LAST:event_bt2ActionPerformed

        private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
                try{
			double radio = Double.parseDouble(txt1.getText());
			cir.setRadio(radio);
			cir.circulo();
			txt2.setText(String.valueOf(cir.getArea()));
		}
		catch(NumberFormatException ex){
			txt2.setText("no se puede ingresar letras");
			
		}
        }//GEN-LAST:event_bt1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton bt1;
        private javax.swing.JButton bt2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel tx1;
        private javax.swing.JLabel tx2;
        private javax.swing.JLabel tx3;
        private javax.swing.JTextField txt1;
        private javax.swing.JTextField txt2;
        // End of variables declaration//GEN-END:variables
}
