package factory;

import domain.ISymptom;

public interface ISymptomFactory {
	public ISymptom createSymptom(String symptomName);
}
