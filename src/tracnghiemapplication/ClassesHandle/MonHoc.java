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
public class MonHoc implements java.io.Serializable {
    private String tenMonHoc;
    private String maMonHoc;
    private int soChuong;
    private String gioiThieuMonHoc;

    private ArrayList<CauHoi> dsCauHoi = new ArrayList<>();
    private ArrayList<DeThi> dsDeThi = new ArrayList<>();
    
    public MonHoc(String tenMonHoc, String maMonHoc, int soChuong, String gioiThieuMonHoc) {
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.soChuong = soChuong;
        this.gioiThieuMonHoc = gioiThieuMonHoc;
    }
    
    public void themDeThi(DeThi deThi) {
        this.dsDeThi.add(deThi);
    }
    
    public void xoaDeThi(DeThi deThi) {
        for(DeThi dt : this.dsDeThi) {
            if(dt.getTenDeThi().equals(deThi.getTenDeThi())) {
                this.dsDeThi.remove(dt);
                break;
            }
        }
    }
    
    public ArrayList<DeThi> getDeThi() {
        return dsDeThi;
    }
    
    public void  themCauHoi(CauHoi cauHoi) {
        this.dsCauHoi.add(cauHoi);
    }
    
    public void xoaCauHoi(CauHoi cauHoi) {
        for(CauHoi ch : this.dsCauHoi) {
            if(ch.getCauHoi().equals(cauHoi.getCauHoi())) {
                this.dsCauHoi.remove(ch);
                break;
            }
        }
    }
    
    public ArrayList<CauHoi> getDSCauHoi() {
        return this.dsCauHoi;
    }
    
    /*region get*/
    public String getTenMonHoc() {
        return tenMonHoc;
    }
    
    public String getMaMonHoc() {
        return maMonHoc;
    }
    
    public int getSoChuong() {
        return soChuong;
    }
    
    public String getGioiThieuMonHoc() {
        return gioiThieuMonHoc;
    }
    
    /*region set*/
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
    
    public void setSoChuong(int soChuong) {
        this.soChuong = soChuong;
    }
    
    public void setGioiThieuMonHoc(String gioiThieuMonHoc) {
        this.gioiThieuMonHoc = gioiThieuMonHoc;
    }
}
