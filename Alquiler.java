package problema2;

public abstract class Alquiler implements Caracterizable {
	private int diasAlquiler;
	private int codigoCliente;
    private String nombreCliente;

    public Alquiler(int diasAlquiler, int codigoCliente, String nombreCliente) {
        this.diasAlquiler = diasAlquiler;
    	this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;

    }
    public int getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    public abstract double costoAlquiler();
    
	public String caracterizar() {
	
		return getCodigoCliente()+" - "+getNombreCliente()+" - "+getDiasAlquiler();
	}

}
