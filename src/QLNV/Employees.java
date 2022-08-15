/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV;

/**
 *
 * @author THANH NGUYEN
 */
public class Employees {
    private String manv,hoten,email,sdt,hinh;
    private int luong;
    private boolean gioitinh;

    public Employees() {
    }

    public Employees(String manv, String hoten, String email, String sdt, String hinh, int luong, boolean gioitinh) {
        this.manv = manv;
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.hinh = hinh;
        this.luong = luong;
        this.gioitinh = gioitinh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
}
