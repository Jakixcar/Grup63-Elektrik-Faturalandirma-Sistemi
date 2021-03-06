/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_elektrik_veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ABRA
 */
public class MusteriEkle extends javax.swing.JFrame {
    
    static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    static final String USER = "SYSTEM";
    static final String PASS = "ankaramessi78";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
   public void Connect(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proje_Elektrik_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hata Burada");
        } catch (SQLException ex) {
            Logger.getLogger(Proje_Elektrik_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hata Burada");
        }
   }
    /**
     * Creates new form MusteriEkle
     */
    String city;
    String personel_isim,personel_soyisim,cinsiyet,pno,sifre;
             
    public MusteriEkle(String ad, String soyad, String gender, String city, String no, String sifre) {
        Connect();
        initComponents();
        this.setLocationRelativeTo(null);
        this.city = city;
        this.personel_isim = ad;
        this.personel_soyisim = soyad;
        this.cinsiyet = gender;
        this.pno =no;
        this.sifre = sifre;
        if(null != city)switch (city) {
            case "Ankara":
                ilce_secici.addItem("Çankaya");
                ilce_secici.addItem("Yenimahalle");
                ilce_secici.addItem("Altındağ");
                ilce_secici.addItem("Keçiören");
                break;
            case "Kayseri":
                ilce_secici.addItem("Kocasinan");
                ilce_secici.addItem("Melikgazi");
                ilce_secici.addItem("Felahiye");
                break;
            case "Karabük":
                ilce_secici.addItem("Merkez");
                ilce_secici.addItem("Safranbolu");
                break;
            case "Konya":
                ilce_secici.addItem("Selçuklu");
                ilce_secici.addItem("Ereğli");  
                break;
            case "Zonguldak":
                ilce_secici.addItem("Zonguldak");
                ilce_secici.addItem("Karadeniz Ereğli");
                ilce_secici.addItem("Kilimli");
                break;
            default:
                break;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ad_secici = new javax.swing.JTextField();
        soyad_secici = new javax.swing.JTextField();
        sifre_secici = new javax.swing.JPasswordField();
        ilce_secici = new javax.swing.JComboBox<>();
        cinsiyet_secici = new javax.swing.JComboBox<>();
        ekleme_yap = new java.awt.Button();
        cikis_yap = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(92, 60, 146));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 213, 198));
        jLabel1.setText("Ekleme Ekranı");

        jLabel2.setForeground(new java.awt.Color(162, 213, 198));
        jLabel2.setText("Ekleyeceğiniz müşterinin;");

        jLabel3.setForeground(new java.awt.Color(162, 213, 198));
        jLabel3.setText("Adı:");

        jLabel4.setForeground(new java.awt.Color(162, 213, 198));
        jLabel4.setText("Soyadı:");

        jLabel5.setForeground(new java.awt.Color(162, 213, 198));
        jLabel5.setText("Cinsiyeti:");

        jLabel6.setForeground(new java.awt.Color(162, 213, 198));
        jLabel6.setText("İlçesi:");

        jLabel7.setForeground(new java.awt.Color(162, 213, 198));
        jLabel7.setText("Şifresi:");

        cinsiyet_secici.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        ekleme_yap.setActionCommand("Ekleme Yap");
        ekleme_yap.setBackground(new java.awt.Color(215, 38, 49));
        ekleme_yap.setLabel("Ekleme Yap");
        ekleme_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleme_yapActionPerformed(evt);
            }
        });

        cikis_yap.setActionCommand("Geri Gel");
        cikis_yap.setBackground(new java.awt.Color(215, 38, 49));
        cikis_yap.setLabel("Geri Gel");
        cikis_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_yapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ad_secici)
                            .addComponent(soyad_secici, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(sifre_secici)
                            .addComponent(ilce_secici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cinsiyet_secici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cikis_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ekleme_yap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cikis_yap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ad_secici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(soyad_secici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cinsiyet_secici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ilce_secici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sifre_secici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(ekleme_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
    int count = 1;
    String plaka,kod;
    private void ekleme_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleme_yapActionPerformed
        
        try{
            pst = con.prepareStatement("select * from musteri where street = ?");
            pst.setString(1, ilce_secici.getSelectedItem().toString());
            rs = pst.executeQuery();
            while(rs.next())
                count++;            
        }catch (SQLException ex) {
            Logger.getLogger(PersonelEkran.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hata Burada 311111");
            }
        
        if(null != this.city)switch (this.city) {
            case "Ankara":
                plaka = "06";
        switch (ilce_secici.getSelectedIndex()) {
            case 0:
                kod = "01";
                break;
            case 1:
                kod = "02";
                break;
            case 2:
                kod = "03";
                break;
            case 3:
                kod = "04";
                break;
            default:
                break;
        }
                break;
            case "Kayseri":
                plaka = "38";
        switch (ilce_secici.getSelectedIndex()) {
            case 0:
                kod = "01";
                break;
            case 1:
                kod = "02";
                break;
            case 2:
                kod = "03";
                break;
            default:
                break;
        }
                break;
            case "Karabük":
                plaka = "78";
                if(ilce_secici.getSelectedIndex() == 0)
                    kod = "01";
                else if(ilce_secici.getSelectedIndex() == 1)
                    kod = "02";
                break;
            case "Konya":
                plaka = "42";
                if(ilce_secici.getSelectedIndex() == 0)
                    kod = "01";
                else if(ilce_secici.getSelectedIndex() == 1)
                    kod = "02";
                break;
            case "Zonguldak":
                plaka = "67";
        switch (ilce_secici.getSelectedIndex()) {
            case 0:
                kod = "01";
                break;
            case 1:
                kod = "02";
                break;
            case 2:
                kod = "03";
                break;
            default:
                break;
        }
                break;
            default:
                break;
        }
        String s = String.format("%05d",(count));
        String cece = plaka+kod+s;
        System.out.println(cece);
        if(ad_secici.getText().isEmpty() || soyad_secici.getText().isEmpty() || sifre_secici.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Ad, soyad veya şifre kısımlar boş bırakılamaz.");
        }else{    
        try{ 
            String msql = "INSERT INTO musteri(clientNo,fName,lName,gender,mCity,street,yearsPast,billQuantity,lastDate,status,sifre)values(?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(msql);
            pst.setString(1, cece);
            pst.setString(2, ad_secici.getText());
            pst.setString(3, soyad_secici.getText());
            pst.setString(4, cinsiyet_secici.getSelectedItem().toString());
            pst.setString(5, this.city);
            pst.setString(6, ilce_secici.getSelectedItem().toString());
            pst.setInt(7, 0);
            pst.setInt(8, 0);
            pst.setString(9, null);
            pst.setString(10, "ACTIVE");
            pst.setString(11, sifre_secici.getText());
            pst.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(PersonelEkran.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hata Burada 311111");
            }
        
        JOptionPane.showMessageDialog(this,"Ekleme başarıyla gerçekleştirildi.");
        PersonelEkran yenipersonelekran = new PersonelEkran(personel_isim,personel_soyisim,cinsiyet,city,pno,sifre);
        this.dispose();
        yenipersonelekran.setVisible(true);
        }    
    }//GEN-LAST:event_ekleme_yapActionPerformed

    private void cikis_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_yapActionPerformed
        PersonelEkran yenipersonelekran = new PersonelEkran(personel_isim,personel_soyisim,cinsiyet,city,pno,sifre);
        this.dispose();
        yenipersonelekran.setVisible(true);
    }//GEN-LAST:event_cikis_yapActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_secici;
    private java.awt.Button cikis_yap;
    private javax.swing.JComboBox<String> cinsiyet_secici;
    private java.awt.Button ekleme_yap;
    private javax.swing.JComboBox<String> ilce_secici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField sifre_secici;
    private javax.swing.JTextField soyad_secici;
    // End of variables declaration//GEN-END:variables
}
