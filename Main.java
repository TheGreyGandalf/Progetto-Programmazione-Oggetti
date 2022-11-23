import java.awt.*;
import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Programma Esame Oggetti");
        Conto [] listaConto = new Conto [3];

        listaConto[0] = new Conto("Giacomo", "Cabri", 12345);
        listaConto[1] = new Conto("Mario", "Rossi", 543345);
        listaConto[2] = new Conto("Carlo", "Bianchi", 25844);
        MyPanel panel = new MyPanel(listaConto);
        f.add(panel);
        f.pack();
        //f.setBounds(300,300, 300,300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
}
