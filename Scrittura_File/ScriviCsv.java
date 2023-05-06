package Scrittura_File;

import Classe_Conto.Conto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Sottoclasse che specializza l'esportazione in esportazione in .csv
 */
public class ScriviCsv extends ScritturaFile {
    /**
     *
     * @param Nomef Nome del file in cui andremo a esportare
     * @param lista Lista con aggiunta di voci a cui andremo a scrivere
     * @param tipo Se il file viene aperto e utilizzato in append
     * Metodo utilizzato per il polimorfismo
     */
    public void ScriviNormale(String Nomef, ArrayList<Conto> lista, boolean tipo)
    {
        try {
            File file = new File(Nomef+".csv");            //Apro il file passato
            FileWriter fw = new FileWriter(file, tipo);         //passo file e se scrivo in append
            pw = new PrintWriter(fw);               //Strumento con cui vado a scrivere su file

            //Scrittura su file di tutto il contenuto
            for (Conto conto : lista) {
                String Dat, Desc;
                int ammo;
                Dat = conto.getData();
                Desc = conto.getDescrizione();
                ammo = conto.getAmmontare();
                pw.println(Dat + "," + Desc + "," + ammo);              //Scrittura con dati separati da ,
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (RuntimeException e) {

        } finally
        {
            if (pw != null) {
                pw.close();
            }
        }
    }
}