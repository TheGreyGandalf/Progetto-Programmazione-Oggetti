
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.Vector;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
//import tab;
    public class MyPanel extends JPanel implements ActionListener, DocumentListener {
        private JButton b;

        private Conto[] lista;
        tab tm = new tab(lista);
        private JTextField txt, txt2;

        //private JTable t;

        private JLabel l;

    /**
     *
     * @param listaConto= La lista che contiene i dati che si andranno a leggere da stream di File
     */
    public MyPanel(Conto[] listaConto) {
            //super();

            //this.setLayout(new BorderLayout());
            //Vector v = new Vector();
            this.lista=listaConto;
            /*
            Conto c1 = new Conto("a", "a", 1);
            Conto c2 = new Conto("b", "b", 1);
            Conto c3 = new Conto("c", "c", 1);
            Conto c4 = new Conto("d", "d", 1);

            v.add(c1);
            v.add(c1);
            v.add(c2);
            v.add(c3);
            v.add(c4);*/

            //TableModel dataModel = new tab(lista);
            // crea la tabella
            JTable t = new JTable(tm);
            // aggiunge la tabella al pannello


            JPanel pTab = new JPanel();
            //pTab.setLayout(new BorderLayout());
            pTab.add(t);
            pTab.add(t.getTableHeader());
            this.add(pTab);

            txt = new JTextField("", 25);
            pTab.add(txt);

            b= new JButton("Cliccami Tutto");
            pTab.add(b);
            b.addActionListener(this);
            b.addActionListener(this);

            l= new JLabel("Query fatta:");
            pTab.add(l);

            txt2= new JTextField("", 25);
            txt2.setEditable(false); // non modificabile
            pTab.add(txt2);

        }

       /* @Override
        public void actionPerformed(ActionEvent e, Vector vector) {
            String key = this.txt.getText();
            for (int i=0; i<vector.size(); i++)
            {
                if (vector.contains(key))
                {
                    this.txt2.setText("Trovato " + vector.elementAt(i) + " " + vector.elementAt(i+1));
                    return;
                }
                this.txt2.setText("NESSUNA CORRISPONDENZA TROVATA");
            }

        }*/

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
