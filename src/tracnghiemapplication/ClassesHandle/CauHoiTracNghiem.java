/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.ClassesHandle;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import tracnghiemapplication.UI.PanelCauHoiTracNghiem;

/**
 *
 * @author SON
 */
public class CauHoiTracNghiem extends CauHoi implements java.io.Serializable {
    private ArrayList<String> dapAn = new ArrayList<>();
    private ArrayList<String> dapAnDung = new ArrayList<>();
    
    public CauHoiTracNghiem(String cauHoi, int soChuong, int doKho) {
        super(cauHoi, soChuong, doKho);
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
    public void setDapAn(ArrayList<String> dapAn) {
        this.dapAn.clear();
        this.dapAn.addAll(0, dapAn);
    }

    @Override
    public double tinhDiem(ArrayList<String> anwser) {
        if(dapAnDung.toString().equals(anwser.toString())) {
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
    public void inCauHoi(JTextArea jTextArea) {
        char[] lbDapAn = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        int i = 0;
        jTextArea.append(super.getCauHoi() + "\n");
        for(String da : dapAn) {
            jTextArea.append(String.valueOf(lbDapAn[i]) + ". " + da + "\t");
            i++;
        }
        jTextArea.append("\n");
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
        PanelCauHoiTracNghiem cauHoiTracNghiem = new PanelCauHoiTracNghiem();
        cauHoiTracNghiem.setInit(soCau, super.getCauHoi(), dapAn);
        return cauHoiTracNghiem;
    }
}
