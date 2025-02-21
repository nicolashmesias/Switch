package front;

public class PantallaArea extends javax.swing.JFrame {

	/**
	 * Creates new form PantallaArea
	 */
	public PantallaArea() {
		initComponents();
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
                bt1 = new javax.swing.JButton();
                bt2 = new javax.swing.JButton();
                bt3 = new javax.swing.JButton();
                bt5 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tx1.setBackground(new java.awt.Color(204, 255, 153));
                tx1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                tx1.setForeground(new java.awt.Color(1, 1, 1));
                tx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                tx1.setText("¿Que area quiere calcular?");
                tx1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                bt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt1.setText("Circulo");
                bt1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt1ActionPerformed(evt);
                        }
                });

                bt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt2.setText("Cuadrado");
                bt2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt2ActionPerformed(evt);
                        }
                });

                bt3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt3.setText("Triangulo");
                bt3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt3ActionPerformed(evt);
                        }
                });

                bt5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt5.setText("Regresar");
                bt5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt5ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addComponent(tx1)
                                .addGap(96, 96, 96))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
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

        private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
                Pantalla panta = new Pantalla();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		dispose();
        }//GEN-LAST:event_bt5ActionPerformed

        private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
                Circulo panta = new Circulo();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		dispose();
        }//GEN-LAST:event_bt1ActionPerformed

        private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
               Cuadrado panta = new Cuadrado();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		dispose();
        }//GEN-LAST:event_bt2ActionPerformed

        private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
                Triangulo panta = new Triangulo();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		dispose();
        }//GEN-LAST:event_bt3ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton bt1;
        private javax.swing.JButton bt2;
        private javax.swing.JButton bt3;
        private javax.swing.JButton bt5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel tx1;
        // End of variables declaration//GEN-END:variables
}
