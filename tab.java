import java.util.Vector;
import javax.swing.table.AbstractTableModel;
public class tab extends AbstractTableModel {
    private Conto[] arrayConto;
    //private Vector v;

    public tab(Conto[] C) {
        //this.v = v; // inizializzato con il vettore
        this.arrayConto=C;
    }
/**
 * il numero di colonne
 */


/**
 * numero righe = dimensione del vettore
 */
    @Override
    public int getRowCount() {
        if(arrayConto == null) return 0;
        return arrayConto.length;
        }


    /**
     *
     * @param row        the row whose value is to be queried
     * @param col     the column whose value is to be queried
     */
    @Override
    public Object getValueAt(int row, int col) {
        // seleziona il libro
        switch (col)
        {
            case 0: return arrayConto[row].getData();
            case 1: return arrayConto[row].getDescrizione();
            case 2: return arrayConto[row].getAmmontare();
        }
        return "";
        }

    /**
     *
     * Funzione che assegna il numero di clonne che sono necessare alla tabella per visualizzare i dati richiesti
     */
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public boolean isCellEditable(/*Object valore,*/ int row, int col) {
        // celle editabili


        /*if (col == 2)
            b.Data = ((Integer)valore).intValue();
        if (col == 3)
            b.price = ((Float)valore).floatValue();*/

        //fireTableDataChanged();
        return true;
    }

}