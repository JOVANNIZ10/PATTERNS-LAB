package adapter2;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {
    public static void main(String[] args) {
        // Crear paciente
        Covid19Pacient pacient = new Covid19Pacient("aitor", 35);

        pacient.setSymptomFactory(new SymptomFactory());


        pacient.addSymptomByName("fiebre", 5);
        pacient.addSymptomByName("tos seca", 4);
        pacient.addSymptomByName("diarrea", 2);

        
        ShowPacientTableGUI gui = new ShowPacientTableGUI(pacient);
        gui.setPreferredSize(new java.awt.Dimension(300, 200));
        gui.pack();
        gui.setVisible(true);
    }
}

