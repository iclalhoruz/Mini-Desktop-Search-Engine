/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package searchengine;

import java.io.File;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static searchengine.ReadFile.readFile;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_panel = new javax.swing.JPanel();
        txt_file = new javax.swing.JTextField();
        btn_select = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_createBST = new javax.swing.JButton();
        btn_inorder = new javax.swing.JButton();
        btn_preOrder = new javax.swing.JButton();
        btn_postOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_orders = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_list = new javax.swing.JList<>();
        txt_ignoreList = new javax.swing.JTextField();
        btn_selectIgnore = new javax.swing.JButton();
        btn_addIgnore = new javax.swing.JButton();
        txtfield_ignore = new javax.swing.JTextField();
        btn_delete1 = new javax.swing.JButton();
        btn_delete2 = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea_search = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        base_panel.setBackground(new java.awt.Color(255, 255, 255));

        btn_select.setText("SELECT FILE");
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_createBST.setBackground(new java.awt.Color(102, 102, 102));
        btn_createBST.setForeground(new java.awt.Color(255, 255, 255));
        btn_createBST.setText("CREATE BST");
        btn_createBST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createBSTActionPerformed(evt);
            }
        });

        btn_inorder.setText("IN-ORDER");
        btn_inorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inorderActionPerformed(evt);
            }
        });

        btn_preOrder.setText("PRE-ORDER");
        btn_preOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_preOrderActionPerformed(evt);
            }
        });

        btn_postOrder.setText("POST-ORDER");
        btn_postOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_postOrderActionPerformed(evt);
            }
        });

        txt_orders.setEditable(false);
        txt_orders.setColumns(20);
        txt_orders.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txt_orders.setRows(5);
        jScrollPane2.setViewportView(txt_orders);

        txt_list.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(txt_list);

        btn_selectIgnore.setText("Select ignore");
        btn_selectIgnore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectIgnoreActionPerformed(evt);
            }
        });

        btn_addIgnore.setText("ADD IGNORE");
        btn_addIgnore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addIgnoreActionPerformed(evt);
            }
        });

        txtfield_ignore.setEditable(false);
        txtfield_ignore.setBackground(new java.awt.Color(204, 204, 204));

        btn_delete1.setText("DELETE");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });

        btn_delete2.setText("DELETE");
        btn_delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete2ActionPerformed(evt);
            }
        });

        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        txtArea_search.setEditable(false);
        txtArea_search.setColumns(20);
        txtArea_search.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtArea_search.setRows(5);
        jScrollPane4.setViewportView(txtArea_search);

        jScrollPane5.setViewportView(jScrollPane4);

        javax.swing.GroupLayout base_panelLayout = new javax.swing.GroupLayout(base_panel);
        base_panel.setLayout(base_panelLayout);
        base_panelLayout.setHorizontalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ignoreList, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfield_ignore, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_selectIgnore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addIgnore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(base_panelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(base_panelLayout.createSequentialGroup()
                                .addComponent(txt_file, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_select)))
                        .addGap(106, 106, 106))
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(47, 47, 47)
                        .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_inorder, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_preOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_postOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))))
            .addGroup(base_panelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btn_createBST, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(base_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        base_panelLayout.setVerticalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_file, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ignoreList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selectIgnore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_addIgnore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfield_ignore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(btn_createBST, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addComponent(btn_inorder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_preOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_postOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(base_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
       
       JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File imgfile = fc.getSelectedFile();
            if (imgfile != null) {
                String filepath = imgfile.getAbsolutePath();
                txt_file.setText(filepath);
            } else {
                JOptionPane.showMessageDialog(rootPane, imgfile);
            }
}
       
    }//GEN-LAST:event_btn_selectActionPerformed
    DefaultListModel model = new DefaultListModel();
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String curr_file = txt_file.getText();
        txt_list.setModel(model);
        
        
        model.addElement(curr_file);
        txt_file.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    
        BST<String> bst = new BST<>();
    private void btn_createBSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createBSTActionPerformed
        
        ignoreList = txtfield_ignore.getText();
        
        Set<String> bannedWords = ReadFile.readBannedWord(ignoreList);
        bst = new BST<>();
        // Create a JList and throw the model
        JList<String> myList = new JList<>(model);
        
        // Loop to get elements from model
        int size = model.getSize();
        for (int i = 0; i < size; i++) {
            String fileName = (String) model.getElementAt(i);
            readFile(fileName, bst, bannedWords);
        }
    
        

    }//GEN-LAST:event_btn_createBSTActionPerformed

    private void btn_inorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inorderActionPerformed
        String orderText = bst.inorder();
        StringBuilder formattedText = new StringBuilder(); //for fit-to-screen printing
        int wordCount = 0;
        int maxWordsPerLine = 20;

        for (String word : orderText.split(" -> ")) {
            formattedText.append(word).append(" -> ");
            wordCount++;
            if (wordCount % maxWordsPerLine == 0) {
            formattedText.append("\n");
    }
}

            txt_orders.setText(formattedText.toString());
    }//GEN-LAST:event_btn_inorderActionPerformed

    private void btn_selectIgnoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectIgnoreActionPerformed
        JFileChooser fc = new JFileChooser(); // To access files on the computer
       fc.showOpenDialog(fc);
       
       File imgfile = fc.getSelectedFile();
       String filepath = imgfile.getAbsolutePath(); // We get the extension of the selected file
       txt_ignoreList.setText(filepath);
    }//GEN-LAST:event_btn_selectIgnoreActionPerformed
    
    
    String ignoreList;
    private void btn_addIgnoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addIgnoreActionPerformed
         ignoreList = txt_ignoreList.getText();
       
        txt_ignoreList.setText("");
        txtfield_ignore.setText(ignoreList);
        
    }//GEN-LAST:event_btn_addIgnoreActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        
        int selectedIndex = txt_list.getSelectedIndex();
                if (selectedIndex != -1) {
                    model.remove(selectedIndex);
                    
                }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete2ActionPerformed
        txtfield_ignore.setText("");
    }//GEN-LAST:event_btn_delete2ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        txtArea_search.setText("");
        
        String searchWord = txt_search.getText();
        bst.print(bst.root, searchWord, txtArea_search);
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_preOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_preOrderActionPerformed
        String orderText = bst.preorder();
        StringBuilder formattedText = new StringBuilder();
        int wordCount = 0;
        int maxWordsPerLine = 20;

        for (String word : orderText.split(" -> ")) {
            formattedText.append(word).append(" -> ");
            wordCount++;
            if (wordCount % maxWordsPerLine == 0) {
            formattedText.append("\n");
    }
}

            txt_orders.setText(formattedText.toString());
    }//GEN-LAST:event_btn_preOrderActionPerformed

    private void btn_postOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_postOrderActionPerformed
        String orderText = bst.postorder();
        StringBuilder formattedText = new StringBuilder();
        int wordCount = 0;
        int maxWordsPerLine = 20;

        for (String word : orderText.split(" -> ")) {
            formattedText.append(word).append(" -> ");
            wordCount++;
            if (wordCount % maxWordsPerLine == 0) {
            formattedText.append("\n");
    }
}

            txt_orders.setText(formattedText.toString());
    }//GEN-LAST:event_btn_postOrderActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base_panel;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addIgnore;
    private javax.swing.JButton btn_createBST;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_delete2;
    private javax.swing.JButton btn_inorder;
    private javax.swing.JButton btn_postOrder;
    private javax.swing.JButton btn_preOrder;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_selectIgnore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtArea_search;
    private javax.swing.JTextField txt_file;
    private javax.swing.JTextField txt_ignoreList;
    private javax.swing.JList<String> txt_list;
    private javax.swing.JTextArea txt_orders;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txtfield_ignore;
    // End of variables declaration//GEN-END:variables
}
