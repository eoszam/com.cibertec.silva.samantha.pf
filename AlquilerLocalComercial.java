package problema2;

public class AlquilerLocalComercial extends Alquiler {
	private int mesesAlquiler;
    private int metraje;

    public AlquilerLocalComercial(int codigoCliente, String nombreCliente, int diasAlquiler, int mesesAlquiler, int metraje){
        super(diasAlquiler, codigoCliente, nombreCliente);
        this.mesesAlquiler = mesesAlquiler;
        this.metraje = metraje;
    }

    public int getMesesAlquiler(){
        return mesesAlquiler;
    }

    public void setMesesAlquiler(int mesesAlquiler){
        this.mesesAlquiler = mesesAlquiler;
    }

    public int getMetraje(){
        return metraje;
    }

    public void setMetraje(int metraje){
        this.metraje = metraje;
    }

    @Override
    public double costoAlquiler(){
        double costoMensual;
        switch (metraje) {
        case 100:
            costoMensual = 5000;
            break;
        case 150:
            costoMensual = 8000;
            break;
        case 200:
            costoMensual = 12000;
            break;
        default:
            costoMensual = 0;
            break;
    }
        return mesesAlquiler * costoMensual;
    }

    @Override
    public String caracterizar(){
        return getCodigoCliente()+" - "+getNombreCliente()+" - "+getDiasAlquiler()+" - "+costoAlquiler();
    }
}
