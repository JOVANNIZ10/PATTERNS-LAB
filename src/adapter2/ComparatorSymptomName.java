package adapter2;

import java.util.Comparator;

import domain.ISymptom;

public class ComparatorSymptomName implements Comparator<ISymptom>{

	@Override
	public int compare(ISymptom s1, ISymptom s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareToIgnoreCase(s2.getName());
	}

}
