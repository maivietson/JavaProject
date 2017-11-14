/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.ClassesHandle;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import tracnghiemapplication.UI.PanelCauHoiTuLuan;

/**
 *
 * @author SON
 */
public class CauHoiTuLuan extends CauHoi implements java.io.Serializable {
    private ArrayList<String> dapAn = new ArrayList<>();
    private ArrayList<String> dapAnDung = new ArrayList<>();
    
    public CauHoiTuLuan(String cauHoi, int soChuong, int doKho) {
        super(cauHoi, soChuong, doKho);
    }

    @Override
    public void setDapAn(ArrayList<String> dapAn) {
        this.dapAn.clear();
        this.dapAn.addAll(0, dapAn);
    }

    @Override
    public double tinhDiem(ArrayList<String> anwser) {
        ArrayList<String> tmpDAD = new ArrayList<>();
        for(String dad : dapAnDung) {
            tmpDAD.add(dad.toUpperCase());
        }
        if(tmpDAD.toString().equals(anwser.toString())) {
            super.setTraLoiDung(true);
            return super.getDiemDatDuoc();
        }
        return 0;
    }
    
    @Override
    public ArrayList<String> getDapAn() {
        return dapAn;
    }

    @Override
    public ArrayList<String> getDapAnDung() {
        return dapAnDung;
    }
    
    @Override
    public void setDapAnDung(ArrayList<String> dapAnDung) {
        this.dapAnDung.clear();
        this.dapAnDung.addAll(0, dapAnDung);
    }

    @Override
    public void inCauHoi(JTextArea jTextArea) {
        jTextArea.append(super.getCauHoi() + "\n");
    }

    @Override
    public void themDapAnDung(String dapAnDung) {
        this.dapAnDung.add(dapAnDung);
    }

    @Override
    public void xoaDapAnDung(String dapAnDung) {
        for(String da : this.dapAnDung) {
            if(da.equals(dapAnDung)) {
                this.dapAnDung.remove(da);
                break;
            }
        }
    }

    @Override
    public JPanel inCauHoi(int soCau) {
        PanelCauHoiTuLuan cauHoiTuLuan = new PanelCauHoiTuLuan();
        cauHoiTuLuan.setInit(soCau, super.getCauHoi());
        return cauHoiTuLuan;
    }
}
