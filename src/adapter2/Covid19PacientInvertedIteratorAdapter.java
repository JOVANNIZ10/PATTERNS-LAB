package adapter2;

import java.util.ArrayList;
import java.util.List;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.ISymptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{
	private List <ISymptom> symptoms;
	private int currentIndex;
	
	public Covid19PacientInvertedIteratorAdapter (Covid19Pacient p) {
		this.symptoms = new ArrayList<>(p.getSymptoms());
		this.currentIndex = symptoms.size();
	}
	

	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		return symptoms.get(currentIndex--);
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return currentIndex >=0;
	}

	@Override
	public void goLast() {
		// TODO Auto-generated method stub
		currentIndex = symptoms.size()-1;
		
	}
	

}
