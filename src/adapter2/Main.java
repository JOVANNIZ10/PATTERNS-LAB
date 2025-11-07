package adapter2;

import java.util.Comparator;
import java.util.Iterator;

import adapter.Sorting;
import domain.Covid19Pacient;
import domain.ISymptom;
import factory.SymptomFactory;

public class Main {
    public static void main(String[] args) {
        // Crear paciente
        Covid19Pacient pacient = new Covid19Pacient("aitor", 35);

        pacient.setSymptomFactory(new SymptomFactory());

        //5 sintoma ezarri
        pacient.addSymptomByName("fiebre", 5);
        pacient.addSymptomByName("tos seca", 4);
        pacient.addSymptomByName("diarrea", 2);
        pacient.addSymptomByName("astenia", 3);
        pacient.addSymptomByName("cefalea", 1);
        
        //Pazientea invertedIterator modura egokitu
        Covid19PacientInvertedIteratorAdapter adapter = new Covid19PacientInvertedIteratorAdapter(pacient);
        
        //Bi Comparator sortu
        ComparatorSymptomName name = new ComparatorSymptomName();
        ComparatorSeverityIndex severityIndex = new ComparatorSeverityIndex();
        
        //Lehenengo deia Sorting.sortedIterator-ekin (izenaren arabera)
        Iterator it1 = Sorting.sortedIterator(adapter, (Comparator<Object>) (Comparator<?>) name);
        while (it1.hasNext()) {
        	ISymptom s = (ISymptom) it1.next();
        	System.out.println(s.getName()+s.getSeverityIndex());
        }
        
      //Bigarren deia Sorting.sortedIterator-ekin (severity index-aren arabera)
        adapter.goLast();
        Iterator it2 = Sorting.sortedIterator(adapter, (Comparator<Object>) (Comparator<?>) severityIndex);
        while (it2.hasNext()) {
        	ISymptom s = (ISymptom) it2.next();
        	System.out.println(s.getName()+s.getSeverityIndex());
        }
        
        ShowPacientTableGUI gui = new ShowPacientTableGUI(pacient);
        gui.setPreferredSize(new java.awt.Dimension(300, 200));
        gui.pack();
        gui.setVisible(true);
    }
}

