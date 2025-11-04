package iterator;

import java.util.Iterator;

import java.util.List;
import java.util.Set;
import java.util.Vector;

import domain.ISymptom;

public class Covid19PacientIterator implements Iterator{
	List<ISymptom> symptoms=new Vector<ISymptom>();
	int position=0;

	public Covid19PacientIterator(Set<ISymptom> s) {
		Iterator<ISymptom> i=s.iterator();
		while (i.hasNext())
			symptoms.add(i.next());
	}

	@Override
	public boolean hasNext() {
		return position<symptoms.size();
	}

	@Override
	public Object next() {
		ISymptom symptom=symptoms.get(position);
		position++;
		return symptom;
	}

}
