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
public class HandlingFile {
    public ArrayList<Object> readFile(String fileName) {
        ArrayList<Object> alObject = new ArrayList<>();
        boolean isnull = true;
        try {
            File dir = new File(".");
            File fin = new File(dir.getCanonicalPath() + File.separator + "FileData" + File.separator + fileName);
            FileInputStream fis = new FileInputStream(fin);
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.toString());
            Object obj = null;
            
            try {
                obj = ois.readObject();
                System.out.println(obj);
                alObject.add(obj);
                
                /*
                try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                while(isnull) {
                Object obj = null;
                try {
                System.out.println("try read");
                obj = ois.readObject();
                } catch (ClassNotFoundException ex) {
                }
                if(obj != null) {
                System.out.println("reading");
                alObject.add(obj);
                }
                else {
                System.out.println("no reading");
                isnull = false;
                }
                }
                ois.close();
                }
                */
                ois.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HandlingFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HandlingFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HandlingFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alObject;
    }
    
    public void writeObjectToFile(String fileName, ArrayList<Object> alObject) {
        try {
            FileOutputStream fos;
            File dir = new File(".");
            File fout = new File(dir.getCanonicalPath() + File.separator + "FileData" + File.separator + fileName);
            System.out.println(fout.toPath());
            if(fout.exists()) {
                fos = new FileOutputStream(fout, false);
            }
            else {
                fout.getParentFile().mkdirs();
                fout.createNewFile();
                fos = new FileOutputStream(fout);
            }
            
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for(Object obj : alObject) {
                    oos.writeObject(obj);
                }
                oos.close();
            }
        } catch (IOException ex) {
            //Logger.getLogger(HandlingFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteFile(String fileName) {
        try {
            File dir = new File(".");
            File directory = new File(dir.getCanonicalPath() + File.separator + "SourceData" + File.separator + fileName);
            if(directory.isDirectory()) {
                File[] files = directory.listFiles();
                if(null != files) {
                    for (File file : files) {
                        if (file.isDirectory()) {
                            deleteFile(file.getPath());
                        } else {
                            file.delete();
                        }
                    }
                }
                directory.delete();
            }
        } catch (IOException ex) {
            Logger.getLogger(HandlingFile.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}
