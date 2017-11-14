/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.ClassesHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SON
 */
public class FileObject {
    public ArrayList<Object> readObjectFrFile(String fileName) {
        ArrayList<Object> alObject = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("storeData/MonHoc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true) {
                Object obj = null;
                obj = ois.readObject();
                if(obj != null) {
                    alObject.add(obj);
                } else {
                    break;
                }
            }
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FileObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alObject;
    }
    
    public void writeObjectToFile(String fileName, ArrayList<Object> alObject) {
        try {
            FileOutputStream fos;
            File fout = new File("storeData/" + fileName);
            
            if(fout.exists()) {
                fos = new FileOutputStream(fout, false);
            }
            else {
                fout.getParentFile().mkdirs();
                fout.createNewFile();
                fos = new FileOutputStream(fout);
            }
            
            //FileOutputStream fos = new FileOutputStream("storeData/" + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Object obj : alObject) {
                oos.writeObject(obj);
            }
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateObjectInFile(String fileName, Object objectUpdate) {
        ArrayList<Object> tmpAlObject = new ArrayList<>();
        tmpAlObject = readObjectFrFile(fileName);
        for(Object obj : tmpAlObject) {
            if(((MonHoc)obj).getTenMonHoc().equals(((MonHoc)objectUpdate).getTenMonHoc())) {
                tmpAlObject.add(tmpAlObject.indexOf(obj), objectUpdate);
                tmpAlObject.remove(tmpAlObject.indexOf(obj));
                break;
            }
        }
        writeObjectToFile(fileName, tmpAlObject);
    }
}
