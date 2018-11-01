/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCcalculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;



/**
 * Functie: Het inlezen van het bestand dat gekozen is. 
 * @author Pinar Kubra Kumurcu
 * Version: 1.0
 * Date 1-11-2018
 */
public class FileReader extends FileChooser {
    
    
        private static BufferedReader inFile;

    /**
     * Waar het bestand zich bevind. 
     */
    public String header;



    /**
     *Het deze functie wordt het bestand ingelezen. Er is gebruik gemaakt van try-catch om Exception Handling af te vangen.
     * Wanneer exception handling aanwezig is, verschijnt er een pop-up. 
     * @param file
     * @return
     */
    public String FileReader(String file) { //het bestand(nama) wordt in beeld gebracht/geopend/ingelezen. 
        try{
            String line;
            inFile = new BufferedReader(new java.io.FileReader(file));
            String fileContents = "";
            file = fileContents;
            while ((line = inFile.readLine()) != null) {
                if (line.contains(">")) {
                    System.out.println("De regel met: > is overgeslagen!");
                    header += line;
                    

                }
                else {
                file += line;
                }
            }
            
            inFile.close();
        } catch (FileNotFoundException fnfe) { //Custom exceptions dat verschijnen indien er problemen ontstaan.
            System.out.println("Het bestand is niet gevonden!");
            JOptionPane.showMessageDialog(null, "Het geselecteerde bestand is niet gevonden", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            System.out.println("Er is een fout opgestreden bij het lezen van de zin!");
            JOptionPane.showMessageDialog(null, "Er heeft zich een input/output error voorgedaan", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println("Onbekende fout: Raadpleeg een expert!");
        }
        return file;
    }

    /**
     *
     * @return
     */
    public String getHeader() {
        return header;
    }
    
}
