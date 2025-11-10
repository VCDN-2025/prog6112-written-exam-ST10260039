

import question2.ProductSales;



public class ProductSalesGUI extends javax.swing.JFrame { 

    
    public ProductSalesGUI() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnLoad = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblYearsProcessed = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setName("txtOutput"); // NOI18N
        jScrollPane1.setViewportView(txtOutput);

        btnLoad.setText("Load Product Data");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnSave.setText("Save Product Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblYearsProcessed.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(btnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblYearsProcessed)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnLoad)
                .addGap(9, 9, 9)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblYearsProcessed)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         
try (java.io.FileWriter writer = new java.io.FileWriter("data.txt")) {
    // Create a FileWriter to write to "data.txt"
    // The try-with-resources ensures the writer is automatically closed

    // Write a header to the file
    writer.write("DATA LOG\n------------------------\n");

    // Write the contents of the text area (sales report) to the file
    writer.write(txtOutput.getText());

    // Show confirmation dialog to the user
    javax.swing.JOptionPane.showMessageDialog(this, "Data saved to data.txt");

} catch (Exception e) {
    // If any error occurs during file writing, show an error dialog
    javax.swing.JOptionPane.showMessageDialog(this, "Error saving file.");
}


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
      

    // Sales data for two years
    int[] year1 = {300, 150, 600};
    int[] year2 = {250, 200, 600};

    // Combine both years into one array
    int[] combined = new int[year1.length + year2.length];
    System.arraycopy(year1, 0, combined, 0, year1.length);
    System.arraycopy(year2, 0, combined, year1.length, year2.length);

    // Create ProductSales object and set sales limit
    ProductSales sales = new ProductSales(combined);
    int limit = 300;

    // Build report string
    StringBuilder report = new StringBuilder();
    report.append("Sales Year: 2020 & 2021\n");
    report.append("Total Sales: ").append(sales.getTotalSales()).append("\n");
    report.append("Average Sales: ").append((int) sales.getAverageSales()).append("\n");
    report.append("Sales over limit: ").append(sales.getSalesOverLimit(limit)).append("\n");
    report.append("Sales under limit: ").append(sales.getSalesUnderLimit(limit)).append("\n");

    // Display report in GUI
    txtOutput.setText(report.toString());
    lblYearsProcessed.setText("Years Processed: 2");


    }//GEN-LAST:event_btnLoadActionPerformed
private void menuBar1Performed(java.awt.event.ActionEvent evt) {
    System.exit(0);
}

public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        new ProductSalesGUI().setVisible(true);
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblYearsProcessed;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

}