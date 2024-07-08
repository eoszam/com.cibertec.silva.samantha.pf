package problema2;

public class AlquilerAirbnb extends Alquiler{

    private int tarifaDiaria;

    public AlquilerAirbnb(int codigoCliente, String nombreCliente, int diasAlquiler, int tarifaDiaria){
        super(diasAlquiler, codigoCliente, nombreCliente);
        this.tarifaDiaria = tarifaDiaria;
    }

    public int getTarifaDiaria(){
        return tarifaDiaria;
    }

    public void setTarifaDiaria(int tarifaDiaria){
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public double costoAlquiler(){
        return getDiasAlquiler() * tarifaDiaria;
    }

    @Override
    public String caracterizar(){
        return getCodigoCliente()+" - "+getNombreCliente()+" - "+getDiasAlquiler()+ " - " + getTarifaDiaria();
    }
}