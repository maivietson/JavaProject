/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.ClassesHandle;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author SON
 */
public abstract class CauHoi implements java.io.Serializable {
    private String cauHoi;
    private int soChuong;
    private int doKho;
    private double diemDatDuoc;
    private boolean traLoiDung = false;
    
    public CauHoi(String cauHoi, int soChuong, int doKho) {
        this.cauHoi = cauHoi;
        this.soChuong = soChuong;
        this.doKho = doKho;
    }
    
    public boolean getTraLoiDung() {
        return this.traLoiDung;
    }
    
    public void setTraLoiDung(boolean traLoiDung) {
        this.traLoiDung = traLoiDung;
    }
    
    public String getCauHoi() {
        return cauHoi;
    }
    
    public int getSoChuong() {
        return soChuong;
    }
    
    public int getDoKho() {
        return doKho;
    }
    
    public double getDiemDatDuoc() {
        return diemDatDuoc;
    }
    
    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }
    
    public void setSoChuong(int soChuong) {
        this.soChuong = soChuong;
    }
    
    public void setDoKho(int doKho) {
        this.doKho = doKho;
    }
    
    public void setDiemDatDuoc(double diemDatDuoc) {
        this.diemDatDuoc = diemDatDuoc;
    }
    
    public abstract double tinhDiem(ArrayList<String> anwser);
    
    public abstract ArrayList<String> getDapAn();
    
    public abstract void setDapAn(ArrayList<String> dapAn);
    
    public abstract ArrayList<String> getDapAnDung();
    
    public abstract void setDapAnDung(ArrayList<String> dapAnDung);
    
    public abstract void themDapAnDung(String dapAnDung);
    
    public abstract void xoaDapAnDung(String dapAnDung);
    
    public abstract void inCauHoi(JTextArea jTextArea);
    
    public abstract JPanel inCauHoi(int soCau);
}
