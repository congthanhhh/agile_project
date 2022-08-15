/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLNV;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author THANH NGUYEN
 */
public class frmQLNV extends javax.swing.JFrame {
    ArrayList<Employees> list = new ArrayList<>();
    int current = 0;
//    String header[] = {"Manv","Hoten","Email","Luong","Sodt","Gioitinh","Hinh"};
//    DefaultTableModel tblmodel = new DefaultTableModel(header,0);
    
    
    public frmQLNV() {
        initComponents();
        setLocationRelativeTo(null);
        loadEmployee();

    }
//    public void initTable() {
//    String header[] = {"Manv","Hoten","Email","Luong","Sodt","Gioitinh"};
//        tblmodel=new DefaultTableModel(header,0);
//        tblEmployee.setModel(tblmodel);
//    }
    public void loadEmployee() {
        try {
            String sql ="select * from Employees";
            Connection con = DatabaseHeper.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            list.clear();
            while(rs.next()) {
                Employees emp = new Employees();
                emp.setManv(rs.getString("manv"));
                emp.setHoten(rs.getString("hoten"));
                emp.setEmail(rs.getString("email"));
                emp.setLuong(rs.getInt("luong"));
                emp.setSdt(rs.getString("sdt"));
                emp.setGioitinh(rs.getBoolean("Gioitinh"));
                emp.setHinh(rs.getString("hinh"));
                list.add(emp);
               
            }
            con.close(); ps.close();
            DefaultTableModel tblModel = (DefaultTableModel) tblEmployee.getModel();
            tblModel.setRowCount(0);
            for (Employees e : list) {
                Object[] row = new Object[] {
                  e.getManv(),
                  e.getHoten(),
                  e.getEmail(),
                  e.getLuong(),
                  e.getSdt(),
                  e.isGioitinh(),
                  e.getHinh(),
                };
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
//        try {
//            String sql = "Select * from Employees";
//            Connection con = DatabaseHeper.openConnection();
//            PreparedStatement ps = con.prepareStatement(sql);
//            
//            ResultSet rs = ps.executeQuery();
//
//            tblmodel.setRowCount(0);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("manv"));
//                v.add(rs.getString("hoten"));
//                v.add(rs.getString("email"));
//                v.add(rs.getString("luong"));
//                v.add(rs.getString("Sdt"));
//                v.add(rs.getString("Gioitinh"));
//                v.add(rs.getString("Hinh"));
//                
//                tblmodel.addRow(v);
//            }
//            tblEmployee.setModel(tblmodel);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    public void updateHinh(String image) {
        ImageIcon image1 = new ImageIcon("src\\QLNV\\Icon\\"+image);
//        ImageIcon image1 = new ImageIcon("E:\\NetBeans_Code\\Ontap\\src\\QLNV\\Icon\\"+image);
        Image im = image1.getImage();
        ImageIcon icon = new ImageIcon(im.getScaledInstance(
                lblImage.getWidth(), lblImage.getHeight(), im.SCALE_SMOOTH));
        lblImage.setIcon(icon);
    }
    public void showDetail() {
//        txtmanv.setText((String) tblEmployee.getValueAt(current,0));
//        txtHoten.setText((String) tblEmployee.getValueAt(current,1));
//        txtEmail.setText((String) tblEmployee.getValueAt(current,2));
//        txtLuong.setText((String) tblEmployee.getValueAt(current,3));
//        txtSdt.setText((String) tblEmployee.getValueAt(current,4));
//         Boolean gt = Boolean.parseBoolean((String) tblEmployee.getValueAt(current,5));
//        if(gt==true) {
//            rdoMale.setSelected(true);
//        }else {
//            rdoFemale.setSelected(true);
//        }
//        updateHinh(tblEmployee.getValueAt(current,6).toString());

        current = tblEmployee.getSelectedRow();
        Employees emp = list.get(current);
        txtmanv.setText(emp.getManv());
        txtHoten.setText(emp.getHoten());
        txtEmail.setText(emp.getEmail());
        txtLuong.setText(""+emp.getLuong());
        txtSdt.setText(emp.getSdt());
        rdoMale.setSelected(emp.isGioitinh()==true);
        rdoFemale.setSelected(emp.isGioitinh()==false);
        updateHinh(tblEmployee.getValueAt(current,6).toString());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnSxten = new javax.swing.JButton();
        btnSxLuong = new javax.swing.JButton();
        btnFrist = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Manv");

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Họ tên");

        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Email");

        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Lương");

        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Sdt");

        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Giới tính");

        txtmanv.setForeground(new java.awt.Color(0, 153, 153));

        txtHoten.setForeground(new java.awt.Color(0, 153, 153));

        txtEmail.setForeground(new java.awt.Color(0, 153, 153));

        txtLuong.setForeground(new java.awt.Color(0, 153, 153));

        txtSdt.setForeground(new java.awt.Color(0, 153, 153));

        buttonGroup1.add(rdoMale);
        rdoMale.setForeground(new java.awt.Color(0, 153, 153));
        rdoMale.setText("Nam");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setForeground(new java.awt.Color(0, 153, 153));
        rdoFemale.setText("Nu");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSave.setBackground(new java.awt.Color(153, 255, 255));
        btnSave.setForeground(new java.awt.Color(255, 102, 102));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/icons8-save-24.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(153, 255, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 102, 102));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/icons8-update-24.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 255, 255));
        btnDelete.setForeground(new java.awt.Color(255, 102, 102));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/icons8-delete-24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 255, 255));
        btnExit.setForeground(new java.awt.Color(255, 102, 102));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/icons8-cancel-25.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnOpen.setBackground(new java.awt.Color(153, 255, 255));
        btnOpen.setForeground(new java.awt.Color(255, 102, 102));
        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/open.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(153, 255, 255));
        btnNew.setForeground(new java.awt.Color(255, 102, 102));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/icons8-new-24.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        txtSearch.setForeground(new java.awt.Color(0, 153, 153));

        btnSearch.setBackground(new java.awt.Color(153, 255, 255));
        btnSearch.setForeground(new java.awt.Color(255, 102, 102));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Manv");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnSearch))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        tblEmployee.setForeground(new java.awt.Color(0, 153, 153));
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Manv", "Họ tên", "Email", "Lương", "Sdt", "Giới tính", "Hình"
            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        btnSxten.setBackground(new java.awt.Color(153, 255, 255));
        btnSxten.setForeground(new java.awt.Color(255, 102, 102));
        btnSxten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/sort.png"))); // NOI18N
        btnSxten.setText("Sort Name");
        btnSxten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSxtenActionPerformed(evt);
            }
        });

        btnSxLuong.setBackground(new java.awt.Color(153, 255, 255));
        btnSxLuong.setForeground(new java.awt.Color(255, 102, 102));
        btnSxLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/ascending-sort.png"))); // NOI18N
        btnSxLuong.setText("Sort Salary");
        btnSxLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSxLuongActionPerformed(evt);
            }
        });

        btnFrist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/Button-First-icon.png"))); // NOI18N
        btnFrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFristActionPerformed(evt);
            }
        });

        btnpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/Button-Rewind-icon.png"))); // NOI18N
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/Button-Fast-Forward-icon.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLNV/Icon/Button-Last-icon.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmanv)
                                        .addComponent(txtHoten)
                                        .addComponent(txtEmail)
                                        .addComponent(txtLuong)
                                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(rdoMale)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(11, 11, 11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSxLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSxten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnFrist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnpre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdoMale)
                    .addComponent(rdoFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSxten, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSxLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFrist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLast))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String sql = "insert into Employees values(?,?,?,?,?,?,?)";
            Connection con = DatabaseHeper.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, txtmanv.getText());
            ps.setString(2, txtHoten.getText());
            ps.setString(3, txtEmail.getText());
            ps.setString(4, txtLuong.getText());
            ps.setString(5, txtSdt.getText());
            ps.setBoolean(6, (rdoMale.isSelected()==true)?true:false);
            ps.setString(7, lblImage.getText());
//            ps.setString(7, "Luffy.jpg");
            
            int kq = ps.executeUpdate();
            if(kq==1) {
                JOptionPane.showMessageDialog(this, "Save thanh cong");
            }else {
                JOptionPane.showMessageDialog(this,"Save that bai");
            }
            con.close(); ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadEmployee();
        lblImage.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    public void findByMnv() {
        Employees emp = new Employees();
        try {
            String sql ="select * from Employees where Manv = ?";
            Connection con = DatabaseHeper.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,txtSearch.getText());
            ResultSet rs = ps.executeQuery();
            list.clear();
            
            if(rs.next()) {
                emp.setManv(rs.getString("manv"));
                emp.setHoten(rs.getString("hoten"));
                emp.setEmail(rs.getString("email"));
                emp.setLuong(rs.getInt("luong"));
                emp.setSdt(rs.getString("sdt"));
                emp.setGioitinh(rs.getBoolean("Gioitinh"));
                emp.setHinh(rs.getString("hinh"));
                list.add(emp);
            }else{
                JOptionPane.showMessageDialog(this,"Khong tim thay nv");
                loadEmployee();
            }
            con.close(); ps.close();
            DefaultTableModel tblModel = (DefaultTableModel) tblEmployee.getModel();
            tblModel.setRowCount(0);
            for (Employees e : list) {
                Object[] row = new Object[] {
                  e.getManv(),
                  e.getHoten(),
                  e.getEmail(),
                  e.getLuong(),
                  e.getSdt(),
                  e.isGioitinh(),
                  e.getHinh(),
                };
                tblModel.addRow(row);
            }
        txtmanv.setText(emp.getManv());
        txtHoten.setText(emp.getHoten());
        txtEmail.setText(emp.getEmail());
        txtLuong.setText(""+emp.getLuong());
        txtSdt.setText(emp.getSdt());
        rdoMale.setSelected(emp.isGioitinh()==true);
        rdoFemale.setSelected(emp.isGioitinh()==false);
        updateHinh(tblEmployee.getValueAt(current,6).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        loadEmployee();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    
        public void orderByName() {
            
            try {
                String sql = "select * from Employees order by hoten desc";
                Connection con = DatabaseHeper.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                list.clear();
                while (rs.next()) {
                Employees emp = new Employees();
                emp.setManv(rs.getString("manv"));
                emp.setHoten(rs.getString("hoten"));
                emp.setEmail(rs.getString("email"));
                emp.setLuong(rs.getInt("luong"));
                emp.setSdt(rs.getString("sdt"));
                emp.setGioitinh(rs.getBoolean("Gioitinh"));
                emp.setHinh(rs.getString("hinh"));
                list.add(emp);
                }
                con.close(); ps.close();
                DefaultTableModel tblModel = (DefaultTableModel) tblEmployee.getModel();
            tblModel.setRowCount(0);
            for (Employees e : list) {
                Object[] row = new Object[] {
                  e.getManv(),
                  e.getHoten(),
                  e.getEmail(),
                  e.getLuong(),
                  e.getSdt(),
                  e.isGioitinh(),
                  e.getHinh(),
                };
                tblModel.addRow(row);
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }   
    public void orderBySalary() {
        try {
                String sql = "select * from Employees order by luong desc";
                Connection con = DatabaseHeper.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                list.clear();
                while (rs.next()) {
                Employees emp = new Employees();
                emp.setManv(rs.getString("manv"));
                emp.setHoten(rs.getString("hoten"));
                emp.setEmail(rs.getString("email"));
                emp.setLuong(rs.getInt("luong"));
                emp.setSdt(rs.getString("sdt"));
                emp.setGioitinh(rs.getBoolean("Gioitinh"));
                emp.setHinh(rs.getString("hinh"));
                list.add(emp);
                }
                con.close(); ps.close();
                DefaultTableModel tblModel = (DefaultTableModel) tblEmployee.getModel();
            tblModel.setRowCount(0);
            for (Employees e : list) {
                Object[] row = new Object[] {
                  e.getManv(),
                  e.getHoten(),
                  e.getEmail(),
                  e.getLuong(),
                  e.getSdt(),
                  e.isGioitinh(),
                  e.getHinh(),
                };
                tblModel.addRow(row);
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    private void btnSxLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSxLuongActionPerformed
        orderBySalary();

    }//GEN-LAST:event_btnSxLuongActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        showDetail();
        lblImage.setText("");
        
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        JFileChooser fileChooser = new JFileChooser("src\\QLNV\\Icon");
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            try {
                lblImage.setText(""+fileChooser.getSelectedFile().getName());
                updateHinh(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblImageMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        findByMnv();
    }//GEN-LAST:event_btnSearchActionPerformed
    public void newEmp() {
        txtmanv.setText("");
        txtHoten.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        txtSdt.setText("");
        buttonGroup1.clearSelection();
        lblImage.setText("");
        txtSearch.setText("");
        updateHinh(null);
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        newEmp();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Do you want to update?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(ret==JOptionPane.NO_OPTION){
           return;
       } 
        try {
            String sql = "update Employees set hoten=?,email=?,luong=?,sdt=?,gioitinh=?,hinh=?"+" where manv = ?";
            Connection con = DatabaseHeper.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(7, txtmanv.getText());
            ps.setString(1, txtHoten.getText());
            ps.setString(2, txtEmail.getText());
            ps.setString(3, txtLuong.getText());
            ps.setString(4, txtSdt.getText());
            ps.setBoolean(5, (rdoMale.isSelected()==true)?true:false);
            ps.setString(6, lblImage.getText());
//            ps.setString(7, "Luffy.jpg");
            
            int kq = ps.executeUpdate();
            if(kq==1) {
                JOptionPane.showMessageDialog(this, "Update thanh cong");
            }else {
                JOptionPane.showMessageDialog(this,"Update that bai");
            }
            con.close(); ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadEmployee();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int ret = JOptionPane.showConfirmDialog(this,"Do you want to delete?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(ret==JOptionPane.NO_OPTION){
           return;
       }
        try {
            String sql = "delete from Employees where manv=?";
            Connection con = DatabaseHeper.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, txtmanv.getText());
//            ps.setString(7, "Luffy.jpg");
            
            int kq = ps.executeUpdate();
            if(kq==1) {
                JOptionPane.showMessageDialog(this, "Delete thanh cong");
            }else {
                JOptionPane.showMessageDialog(this,"Delete that bai");
            }
            con.close(); ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadEmployee();
        
        btnNewActionPerformed(evt);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        current = list.size()-1;
        tblEmployee.setRowSelectionInterval(current,current);
        showDetail();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFristActionPerformed
        current = 0;
        tblEmployee.setRowSelectionInterval(current,current);
        showDetail();
    }//GEN-LAST:event_btnFristActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        if(current>0) {
            current--;
            tblEmployee.setRowSelectionInterval(current,current);
            showDetail();
        }
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(current<list.size()-1) {
            current++;
            tblEmployee.setRowSelectionInterval(current,current);
            showDetail();
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnSxtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSxtenActionPerformed
        orderByName();
//        loadEmployee();
    }//GEN-LAST:event_btnSxtenActionPerformed

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFrist;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSxLuong;
    private javax.swing.JButton btnSxten;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtmanv;
    // End of variables declaration//GEN-END:variables
}
