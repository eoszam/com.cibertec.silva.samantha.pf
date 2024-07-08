package clase;

public class Ingeniero {
	private String nombre;
	private int edad;
	private double tarifa;
	private int horasTrabajo;
	
	public Ingeniero(String nombre, int edad, double tarifa, int horasTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tarifa = tarifa;
        this.horasTrabajo = horasTrabajo;
    }

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getTarifa() {
		return tarifa;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}
	
}
