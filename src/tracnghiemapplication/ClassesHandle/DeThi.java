/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.ClassesHandle;

import java.util.ArrayList;

/**
 *
 * @author SON
 */
public class DeThi implements java.io.Serializable {
    private String tenDeThi;
    private String loaiDeThi;
    private String namHoc;
    private String thoiGian;
    private ArrayList<CauHoi> dsCauHoi = new ArrayList<>();
    private double diemThi = 0;
    
    public DeThi() {

    }
    
    public String getTenDeThi() {
        return tenDeThi;
    }
    
    public String getLoaiDeThi() {
        return loaiDeThi;
    }
    
    public String getNamHoc() {
        return namHoc;
    }
    
    public String getThoiGian() {
        return thoiGian;
    }
    
    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }
    
    public void setLoaiDeThi(String loaiDeThi) {
        this.loaiDeThi = loaiDeThi;
    }
    
    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }
    
    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public ArrayList<CauHoi> getDSCauHoi() {
        return dsCauHoi;
    }
    
    public void themCauHoi(CauHoi cauHoi) {
        this.dsCauHoi.add(cauHoi);
    }
    
    public void xoaCauHoi(CauHoi cauHoi) {
        for(CauHoi ch : this.dsCauHoi) {
            if(ch.getCauHoi().equals(cauHoi.getCauHoi())) {
                dsCauHoi.remove(ch);
                break;
            }
        }
    }
    
    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }
    
    public double getDiemThi() {
        return this.diemThi;
    }
}
