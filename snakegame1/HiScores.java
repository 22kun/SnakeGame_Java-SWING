/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame1;
import java.sql.*;
import ModuloConexao.Conexao;
import javax.swing.JOptionPane;
/**
 *
 * @author artur_wmbyu0n
 */
public class HiScores extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public HiScores() {
        initComponents();
        conexao = Conexao.conector();
        consultar1();
        consultar2();
        consultar3();
        consultar4();
        consultar5();
        consultar6();
        consultar7();
        consultar8();
        consultar9();
        consultar10();
    }

    private void consultar1(){
        String sql = "select * from hiscore ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser1.setText(rs.getString(1));
               txtScore1.setText(rs.getString(2));
               
            }
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar2(){
        String sql = "select * from hiscore where score < " + txtScore1.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser2.setText(rs.getString(1));
               txtScore2.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar3(){
        String sql = "select * from hiscore where score < " + txtScore2.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser3.setText(rs.getString(1));
               txtScore3.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    
    private void consultar4(){
        String sql = "select * from hiscore where score < " + txtScore3.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser4.setText(rs.getString(1));
               txtScore4.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar5(){
        String sql = "select * from hiscore where score < " + txtScore4.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser5.setText(rs.getString(1));
               txtScore5.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar6(){
        String sql = "select * from hiscore where score < " + txtScore5.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser6.setText(rs.getString(1));
               txtScore6.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar7(){
        String sql = "select * from hiscore where score < " + txtScore6.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser7.setText(rs.getString(1));
               txtScore7.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar8(){
        String sql = "select * from hiscore where score < " + txtScore7.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser8.setText(rs.getString(1));
               txtScore8.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
        }
    }
    
    private void consultar9(){
        String sql = "select * from hiscore where score < " + txtScore8.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser9.setText(rs.getString(1));
               txtScore9.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
           
        }
    }
    
    private void consultar10(){
        String sql = "select * from hiscore where score < " + txtScore9.getText() + " ORDER BY score DESC LIMIT 10";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
               txtUser10.setText(rs.getString(1));
               txtScore10.setText(rs.getString(2));
                  
            } 
            
        } catch(Exception e){
            
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUser1 = new javax.swing.JLabel();
        txtUser2 = new javax.swing.JLabel();
        txtUser3 = new javax.swing.JLabel();
        txtUser4 = new javax.swing.JLabel();
        txtUser5 = new javax.swing.JLabel();
        txtUser6 = new javax.swing.JLabel();
        txtUser7 = new javax.swing.JLabel();
        txtUser8 = new javax.swing.JLabel();
        txtUser9 = new javax.swing.JLabel();
        txtUser10 = new javax.swing.JLabel();
        txtScore1 = new javax.swing.JLabel();
        txtScore2 = new javax.swing.JLabel();
        txtScore3 = new javax.swing.JLabel();
        txtScore4 = new javax.swing.JLabel();
        txtScore5 = new javax.swing.JLabel();
        txtScore6 = new javax.swing.JLabel();
        txtScore7 = new javax.swing.JLabel();
        txtScore8 = new javax.swing.JLabel();
        txtScore9 = new javax.swing.JLabel();
        txtScore10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Snake");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pixel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Snake");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pixel");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Top 10");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Score");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("1º");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("2º");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("3º");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("4º");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("5º");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("6º");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("7º");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("8º");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("9º");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("10º");

        txtUser1.setBackground(new java.awt.Color(255, 255, 255));
        txtUser1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser1.setForeground(new java.awt.Color(255, 255, 255));
        txtUser1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser1.setText("User 1");

        txtUser2.setBackground(new java.awt.Color(255, 255, 255));
        txtUser2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser2.setForeground(new java.awt.Color(255, 255, 255));
        txtUser2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser2.setText("User 2");

        txtUser3.setBackground(new java.awt.Color(255, 255, 255));
        txtUser3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser3.setForeground(new java.awt.Color(255, 255, 255));
        txtUser3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser3.setText("    ");

        txtUser4.setBackground(new java.awt.Color(255, 255, 255));
        txtUser4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser4.setForeground(new java.awt.Color(255, 255, 255));
        txtUser4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser4.setText(" ");

        txtUser5.setBackground(new java.awt.Color(255, 255, 255));
        txtUser5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser5.setForeground(new java.awt.Color(255, 255, 255));
        txtUser5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser5.setText(" ");

        txtUser6.setBackground(new java.awt.Color(255, 255, 255));
        txtUser6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser6.setForeground(new java.awt.Color(255, 255, 255));
        txtUser6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser6.setText(" ");

        txtUser7.setBackground(new java.awt.Color(255, 255, 255));
        txtUser7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser7.setForeground(new java.awt.Color(255, 255, 255));
        txtUser7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser7.setText(" ");

        txtUser8.setBackground(new java.awt.Color(255, 255, 255));
        txtUser8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser8.setForeground(new java.awt.Color(255, 255, 255));
        txtUser8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser8.setText(" ");

        txtUser9.setBackground(new java.awt.Color(255, 255, 255));
        txtUser9.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser9.setForeground(new java.awt.Color(255, 255, 255));
        txtUser9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser9.setText(" ");

        txtUser10.setBackground(new java.awt.Color(255, 255, 255));
        txtUser10.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtUser10.setForeground(new java.awt.Color(255, 255, 255));
        txtUser10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser10.setText(" ");

        txtScore1.setBackground(new java.awt.Color(255, 255, 255));
        txtScore1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore1.setForeground(new java.awt.Color(0, 255, 0));
        txtScore1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore1.setText("User 1");

        txtScore2.setBackground(new java.awt.Color(255, 255, 255));
        txtScore2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore2.setForeground(new java.awt.Color(0, 255, 0));
        txtScore2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore2.setText("User 2");

        txtScore3.setBackground(new java.awt.Color(255, 255, 255));
        txtScore3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore3.setForeground(new java.awt.Color(0, 255, 0));
        txtScore3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore3.setText("       ");

        txtScore4.setBackground(new java.awt.Color(255, 255, 255));
        txtScore4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore4.setForeground(new java.awt.Color(0, 255, 0));
        txtScore4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore4.setText("     ");

        txtScore5.setBackground(new java.awt.Color(255, 255, 255));
        txtScore5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore5.setForeground(new java.awt.Color(0, 255, 0));
        txtScore5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore5.setText("    ");

        txtScore6.setBackground(new java.awt.Color(255, 255, 255));
        txtScore6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore6.setForeground(new java.awt.Color(0, 255, 0));
        txtScore6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore6.setText("     ");

        txtScore7.setBackground(new java.awt.Color(255, 255, 255));
        txtScore7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore7.setForeground(new java.awt.Color(0, 255, 0));
        txtScore7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore7.setText("    ");

        txtScore8.setBackground(new java.awt.Color(255, 255, 255));
        txtScore8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore8.setForeground(new java.awt.Color(0, 255, 0));
        txtScore8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore8.setText("     ");

        txtScore9.setBackground(new java.awt.Color(255, 255, 255));
        txtScore9.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore9.setForeground(new java.awt.Color(0, 255, 0));
        txtScore9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore9.setText(" ");

        txtScore10.setBackground(new java.awt.Color(255, 255, 255));
        txtScore10.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtScore10.setForeground(new java.awt.Color(0, 255, 0));
        txtScore10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtScore10.setText("     ");

        jButton1.setText("<----");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel16)
                                                                .addGap(10, 10, 10)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel15)
                                                            .addGap(10, 10, 10)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addGap(10, 10, 10)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(10, 10, 10)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(10, 10, 10)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(10, 10, 10)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUser4)
                                            .addComponent(txtUser5)
                                            .addComponent(txtUser6)
                                            .addComponent(txtUser7)
                                            .addComponent(txtUser8)
                                            .addComponent(txtUser9)
                                            .addComponent(txtUser10)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUser3)))))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtScore4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtScore3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtScore2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtScore1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUser1)
                    .addComponent(txtScore1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUser2)
                    .addComponent(txtScore2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUser3)
                    .addComponent(txtScore3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUser4)
                    .addComponent(txtScore4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtUser5)
                    .addComponent(txtScore5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUser6)
                    .addComponent(txtScore6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtUser7)
                    .addComponent(txtScore7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtUser8)
                    .addComponent(txtScore8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUser9)
                    .addComponent(txtScore9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtUser10)
                    .addComponent(txtScore10))
                .addContainerGap(62, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HiScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HiScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HiScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HiScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtScore1;
    private javax.swing.JLabel txtScore10;
    private javax.swing.JLabel txtScore2;
    private javax.swing.JLabel txtScore3;
    private javax.swing.JLabel txtScore4;
    private javax.swing.JLabel txtScore5;
    private javax.swing.JLabel txtScore6;
    private javax.swing.JLabel txtScore7;
    private javax.swing.JLabel txtScore8;
    private javax.swing.JLabel txtScore9;
    private javax.swing.JLabel txtUser1;
    private javax.swing.JLabel txtUser10;
    private javax.swing.JLabel txtUser2;
    private javax.swing.JLabel txtUser3;
    private javax.swing.JLabel txtUser4;
    private javax.swing.JLabel txtUser5;
    private javax.swing.JLabel txtUser6;
    private javax.swing.JLabel txtUser7;
    private javax.swing.JLabel txtUser8;
    private javax.swing.JLabel txtUser9;
    // End of variables declaration//GEN-END:variables
}
