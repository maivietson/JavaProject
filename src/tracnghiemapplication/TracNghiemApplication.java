/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication;

import javax.swing.JFrame;
import tracnghiemapplication.UI.UIChucNang;

/**
 *
 * @author SON
 */
public class TracNghiemApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UIChucNang chucNang = new UIChucNang();
        chucNang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chucNang.setVisible(true);
    }
    
}
