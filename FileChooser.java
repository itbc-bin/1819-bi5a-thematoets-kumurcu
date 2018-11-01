/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCcalculator;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Functie: Het in beeld krijgen van de FileChooser om bestanden te kunnen kiezen
 * @author Pinar Kubra Kumurcu
 * Version: 1.0
 * Date: 01-11-2018
 */
public class FileChooser {
    
    /**
     * Dit is de naam van het bestand.
     */
    public static String filename;

    /**
     * Dit is de pad van de bestandsnaam.
     */
    public static String pad;

    /**
     * Hiermee krijg je de FileChooser in beeld, zodat er een bestand gekozen kan worden. 
     * het geselecteerde bestand komt in beeld en de bestandsNaam wordt getoond. 
     */
    public static void Chooser() {
        try {
            JFileChooser Chooser = new JFileChooser();
            int returnValue = Chooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = Chooser.getSelectedFile();
                filename = selectedFile.getName();
                pad = selectedFile.getAbsolutePath();
            } 
        } catch (NullPointerException e){
            System.out.println("Er is geen bestand geselecteerd! Kies een bestand."); //indien er geen bestand gekozen is. 
            JOptionPane.showMessageDialog(null, "Er is geen pad opgegeven naar het bestand!");
        }
    }

    /**
     * @return Filepath
     */
    public String getPath() {
        return pad;
    }

    /**
     * @return Filename
     */
    public String getFileName() {
        return filename;
    }
    
}
