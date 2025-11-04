package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import factory.ISymptomFactory;


public class Medicament {
	private String name;
	private List<ISymptom> symptoms=new ArrayList<ISymptom>();
	private ISymptomFactory symptomFactory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Medicament(String name) {
		super();
		this.name = name;
	}

	public ISymptom addSymptomByName(String symptom){
		ISymptom s=null;
		s=symptomFactory.createSymptom(symptom);
		if (s!=null) {
			symptoms.add(s);
		}
		return s;

	}
	
	public void removeSymptom(ISymptom s){
		symptoms.remove(s);

	}
	public Iterator<ISymptom> getSymptoms() {
		return symptoms.iterator();
	}
	public ISymptom getSymptomByName(String symptomName) {
		Iterator<ISymptom> i= symptoms.iterator();
		ISymptom s=null;
		while (i.hasNext()) {
			s=i.next();
			if (s!=null && s.getName().compareTo(symptomName)==0) return s;
		}
		return null;	
	}
	public ISymptom removeSymptomByName(String symptomName) {
		ISymptom s=getSymptomByName(symptomName);
		if (s!=null)removeSymptom(s);
		return s;
	}	
		
	}
