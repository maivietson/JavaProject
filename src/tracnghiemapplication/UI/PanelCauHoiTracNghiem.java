/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.UI;

import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author SON
 */
public class PanelCauHoiTracNghiem extends javax.swing.JPanel {
    public ArrayList<JRadioButton> dsRadioButton = new ArrayList<>();
    /**
     * Creates new form UICauHoi
     */
    public PanelCauHoiTracNghiem() {
        initComponents();
    }
    
    public void setInit(int soCau, String cauHoi, ArrayList<String> dapAn) {
        jLBCau.setText("Câu " + String.valueOf(soCau));
        jTACauHoi.setText(cauHoi);
        jPanelDapAn.setLayout(new BoxLayout(jPanelDapAn, BoxLayout.Y_AXIS));
        for(String da : dapAn) {
            JRadioButton jRB = new JRadioButton(da);
            jRB.setFont(jRB.getFont().deriveFont(14));
            jPanelDapAn.add(jRB);
            jPanelDapAn.validate();
            jPanelDapAn.repaint();
            dsRadioButton.add(jRB);
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

        jLBCau = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTACauHoi = new javax.swing.JTextArea();
        jPanelDapAn = new javax.swing.JPanel();

        setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLBCau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLBCau.setText("Câu 1 :");
        jLBCau.setPreferredSize(new java.awt.Dimension(200, 17));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTACauHoi.setEditable(false);
        jTACauHoi.setColumns(20);
        jTACauHoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTACauHoi.setLineWrap(true);
        jTACauHoi.setRows(4);
        jTACauHoi.setWrapStyleWord(true);
        jTACauHoi.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTACauHoi);

        javax.swing.GroupLayout jPanelDapAnLayout = new javax.swing.GroupLayout(jPanelDapAn);
        jPanelDapAn.setLayout(jPanelDapAnLayout);
        jPanelDapAnLayout.setHorizontalGroup(
            jPanelDapAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDapAnLayout.setVerticalGroup(
            jPanelDapAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBCau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(jPanelDapAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLBCau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDapAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBCau;
    public javax.swing.JPanel jPanelDapAn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTACauHoi;
    // End of variables declaration//GEN-END:variables
}
