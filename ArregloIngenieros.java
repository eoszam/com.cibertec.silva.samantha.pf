package arreglo;

import clase.Ingeniero;

public class ArregloIngenieros {
	private Ingeniero[] ingenieros;

    public ArregloIngenieros(Ingeniero[] ingenieros) {
        this.ingenieros = ingenieros;
    }

   
    public double tarifaPromedio() {
        int count = 0;
        double suma = 0;


        for (Ingeniero ingeniero : ingenieros) {
           
            if (ingeniero.getEdad() > 40) {
                suma += ingeniero.getTarifa();
                count++;
            }
        }
        
        if (count > 0) {
            return suma / count;
        } else {
            return 0;
        }
    }
    
    public String nombrePrimerIngenieroMenorQue100() {
       
        for (Ingeniero ingeniero : ingenieros) {
           
            if (ingeniero.getHorasTrabajo() < 100) {
                return ingeniero.getNombre();
            }
        }

        return null;
    }
}
