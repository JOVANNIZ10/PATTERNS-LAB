package adapter2;

import java.util.Comparator;

import domain.ISymptom;

public class ComparatorSeverityIndex implements Comparator<ISymptom>{

	@Override
	public int compare(ISymptom s1, ISymptom s2) {
		// TODO Auto-generated method stub
		return Double.compare(s1.getSeverityIndex(), s2.getSeverityIndex());
	}

}
