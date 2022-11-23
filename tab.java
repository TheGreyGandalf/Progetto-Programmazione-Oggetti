import java.util.Vector;
public class tab {
/**
 * il numero di colonne
 */


/**
 * numero righe = dimensione del vettore
 */
    @Override
    public int getRowCount() {
        return v.size();
        }

/**
 * restituisce il contenuto di una cella
 */
    @Override
    public Object getValueAt(int row, int col) {
        // seleziona il libro
        Conto c = (Conto) v.elementAt(row);
        // la stringa corrispondente alla colonna
        switch (col) {
        case 0:
        return c.Data;
        case 1:
        return c.Descrizione;
        case 2:
        return c.Ammontare;
        default:
        return "";
        }


        }


    @Override
    public int getColumnCount() {
        return ColName.length;
    }
}