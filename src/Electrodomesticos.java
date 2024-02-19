//No se puede crear un objeto de una clase abstracta
public abstract class Electrodomesticos {
     String tipoelectrodomestico;
     String marca;
     int potencia;

    public Electrodomesticos(String tipoelectrodomestico, String marca, int potencia) {
        this.tipoelectrodomestico = tipoelectrodomestico;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomesticos() {
    }

    public abstract double getConsumo (int horas); //Solo se define, no tiene codigo.

    public  double getCosteConsumo(int horas, double costeHora) {
        return horas*costeHora;
    }

    public Electrodomesticos(String marca, int potencia) {
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}