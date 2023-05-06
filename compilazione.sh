declare i=${1:-}
javac -cp ":./jOpenDocument.jar:org.jopendocument.dom.spreadsheet.jar:org.jopendocument.dom.OOUtils.jar" Main/Main.java Scrittura_File/ScritturaFile.java Scrittura_File/ScriviCsv.java Struttura/tab.java Struttura/MyPanel.java Classe_Conto/Conto.java Struttura/CalcolaEntrate.java
java -cp ":./jOpenDocument.jar:org.jopendocument.dom.spreadsheet.jar:org.jopendocument.dom.OOUtils.jar" Main/Main $i
rm Classe_Conto/*.class Main/*.class Scrittura_File/*.class Struttura/*.class
unset i
