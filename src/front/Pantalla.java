package front;

public class Pantalla extends javax.swing.JFrame {

	/**
	 * Creates new form Pantalla
	 */
	public Pantalla() {
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

                jPanel2 = new javax.swing.JPanel();
                jFrame1 = new javax.swing.JFrame();
                jInternalFrame1 = new javax.swing.JInternalFrame();
                panel1 = new javax.swing.JPanel();
                tx1 = new javax.swing.JLabel();
                bt1 = new javax.swing.JButton();
                bt2 = new javax.swing.JButton();
                bt3 = new javax.swing.JButton();
                bt4 = new javax.swing.JButton();

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
                jFrame1.getContentPane().setLayout(jFrame1Layout);
                jFrame1Layout.setHorizontalGroup(
                        jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                );
                jFrame1Layout.setVerticalGroup(
                        jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                jInternalFrame1.setVisible(true);

                javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
                jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
                jInternalFrame1Layout.setHorizontalGroup(
                        jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                jInternalFrame1Layout.setVerticalGroup(
                        jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tx1.setBackground(new java.awt.Color(204, 255, 255));
                tx1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
                tx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                tx1.setText("¿Que quiere hacer?");
                tx1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                bt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt1.setText("Calcular Area");
                bt1.setAlignmentY(0.0F);
                bt1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
                bt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                bt1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt1ActionPerformed(evt);
                        }
                });

                bt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt2.setText("Calculadora");
                bt2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
                bt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                bt2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt2ActionPerformed(evt);
                        }
                });

                bt3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt3.setText("Conversion");
                bt3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
                bt3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                bt3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt3ActionPerformed(evt);
                        }
                });

                bt4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                bt4.setText("Salir");
                bt4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
                bt4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                bt4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                bt4ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(tx1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addContainerGap(93, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(133, 133, 133))
                );
                panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tx1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(bt1)
                                .addGap(29, 29, 29)
                                .addComponent(bt2)
                                .addGap(31, 31, 31)
                                .addComponent(bt3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(bt4)
                                .addGap(32, 32, 32))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
                PantallaArea panta = new PantallaArea();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		
		
        }//GEN-LAST:event_bt1ActionPerformed

        private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
                PantallaCalculadora panta = new PantallaCalculadora();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		
		
        }//GEN-LAST:event_bt2ActionPerformed

        private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
                PantallaConversion panta = new PantallaConversion();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
        }//GEN-LAST:event_bt3ActionPerformed

        private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
                System.exit(0);
        }//GEN-LAST:event_bt4ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton bt1;
        private javax.swing.JButton bt2;
        private javax.swing.JButton bt3;
        private javax.swing.JButton bt4;
        private javax.swing.JFrame jFrame1;
        private javax.swing.JInternalFrame jInternalFrame1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel panel1;
        private javax.swing.JLabel tx1;
        // End of variables declaration//GEN-END:variables
}
