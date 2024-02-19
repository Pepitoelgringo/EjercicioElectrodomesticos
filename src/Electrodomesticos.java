//No se puede crear un objeto de una clase abstracta
public abstract class Electrodomesticos {
    private String tipoelectrodomestico;
    private String marca;
    private float potencia;

    public Electrodomesticos(String tipoelectrodomestico, String marca, float potencia) {
        this.tipoelectrodomestico = tipoelectrodomestico;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomesticos() {
    }

    public abstract double getConsumo (int horas); //Solo se define, no tiene codigo.

    public abstract double getCosteConsumo(int horas, double costeHora);

    public Electrodomesticos(String marca, float potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "tipoelectrodomestico='" + tipoelectrodomestico + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    public String getTipoelectrodomestico() {
        return tipoelectrodomestico;
    }

    public void setTipoelectrodomestico(String tipoelectrodomestico) {
        this.tipoelectrodomestico = tipoelectrodomestico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
}