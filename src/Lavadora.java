public class Lavadora extends  Electrodomesticos {
     double precio;
     boolean aguacaliente;

    public Lavadora(String tipoelectrodomestico, String marca, int potencia, double precio, boolean aguacaliente) {
        //Llama al contructor padre
        super(tipoelectrodomestico, marca, potencia);
        this.precio = precio;
        this.aguacaliente = aguacaliente;
    }

    public Lavadora(String tipoelectrodomestico, String marca, int potencia) {
        super(tipoelectrodomestico, marca, potencia);
    }

    public Lavadora(String marca, int potencia) {
        super(marca, potencia);
        this.aguacaliente=false;
    }

    public Lavadora(String marca, int potencia, double precio, boolean aguacaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguacaliente = aguacaliente;
    }
    public double  getConsumo (int horas) {
        int consumo;
        if (!this.aguacaliente) { //agua fria
            return  horas*this.potencia;
        } else { //agua caliente
            return horas*(this.potencia+this.potencia)*0.2;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguacaliente() {
        return aguacaliente;
    }

    public void setAguacaliente(boolean aguacaliente) {
        this.aguacaliente = aguacaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguacaliente=" + aguacaliente +
                '}';
    }
}