package Tools;

//Importations:



import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


    public class ModelJTable extends AbstractTableModel{

        private String[] nomsColonnes;
        private Object[][] rows;

        @Override
        public String getColumnName(int column) {
            return nomsColonnes[column];
        }

        @Override
        public int getRowCount() {
            return rows.length;
        }

        @Override
        public int getColumnCount() {
            return nomsColonnes.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return rows[rowIndex][columnIndex];
        }
    }

