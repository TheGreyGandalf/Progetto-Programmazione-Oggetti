//javac -cp ".\jOpenDocument.jar" .\Main\Main.java .\Struttura\CalcolaEntrate.java .\Classe_Conto\Con
//to.java  .\Struttura\MyPanel.java .\Struttura\tab.java .\Scrittura_File\ScritturaFile.java


package Main;

import Classe_Conto.Conto;
import Struttura.MyPanel;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Main da cui parte la lettura da file dei dati, se viene passato un file viene letto quello
 * In alternativa, in assenza di file da leggere viene fatto leggere il file dati.txt che contiene dati
 * di un utilizzo tipo
 */
public class Main {
    public static void main(String[] args) throws IOException {
        JFrame f = new JFrame("Programma Esame Oggetti");

        File fil;
        if (args.length!=0){                                            //in caso gli argomenti passati siano  non nulli
            fil=new File(args[1]);
        }else {                                                         //caso in cui gli argomenti passati siano nulli
            fil= new File("Struttura/dati"+".txt");                     //file da cui leggiamo i dati
        }

        Scanner scan =new Scanner((fil));

        //variabili per inserire i valori nell array
        String Dat, Desc;
        int ammo;

        ArrayList<Conto> arr =new ArrayList<>();
        while(scan.hasNextLine())                       //lettura e riempimento array
        {
            Dat= scan.nextLine();
            Desc= scan.nextLine();
            ammo= Integer.parseInt(scan.nextLine());
            Conto ogg= new Conto(Dat, Desc, ammo);
            arr.add(ogg);
        }

        MyPanel panel = new MyPanel(arr, fil);
        f.add(panel);
        f.pack();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
        //chiusura file di testo
        scan.close();
        
    }
}