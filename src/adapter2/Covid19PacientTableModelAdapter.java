package adapter2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.ISymptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] { "Symptom", "Weight" };
	private List<ISymptom> symptomList;

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient = p;
		this.symptomList = new ArrayList<>(p.getSymptoms());
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int i) {
		return columnNames[i];
	}

	public int getRowCount() {
		return symptomList.size();
	}

	public Object getValueAt(int row, int col) {
		ISymptom symptom = symptomList.get(row);
		switch (col) {
		case 0:
			return symptom.getName();
		case 1:
			return pacient.getWeight(symptom);
		default:
			return null;
		}
	}

}
