
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.table.TableModel;
import java.
//import tab;

    public class MyPanel extends JPanel implements ActionListener {
        private JButton b;
        private JTextField txt, txt2;

        //private JTable t;

        private JLabel l;
        public MyPanel() {
            super();
            //this.setLayout(new BorderLayout());
            Vector v = new Vector();
            Conto c1 = new Conto("a", "a", 1);
            Conto c2 = new Conto("b", "b", 1);
            Conto c3 = new Conto("c", "c", 1);
            Conto c4 = new Conto("d", "d", 1);

            v.add(c1);
            v.add(c1);
            v.add(c2);
            v.add(c3);
            v.add(c4);

            TableModel dataModel = new tab(v);
            // crea la tabella
            JTable t = new JTable(dataModel);
            // aggiunge la tabella al pannello
            add(t);

            txt = new JTextField("", 25);
            add(txt);

            b= new JButton("Cliccami Tutto");
            add(b);
            b.addActionListener(this, v);
            b.addActionListener();

            l= new JLabel("Query fatta:");
            add(l);

            txt2= new JTextField("", 25);
            txt2.setEditable(false); // non modificabile
            add(txt2);

        }

        @Override
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

        }

    }
