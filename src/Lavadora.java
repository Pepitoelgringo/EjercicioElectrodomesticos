public class Lavadora extends  Electrodomesticos {
    private double precio;
    private boolean aguacaliente;

    public Lavadora(String tipoelectrodomestico, String marca, float potencia, double precio, boolean aguacaliente) {
        //Llama al contructor padre
        super(tipoelectrodomestico, marca, potencia);
        this.precio = precio;
        this.aguacaliente = aguacaliente;
    }

    public Lavadora(String tipoelectrodomestico, String marca, float potencia) {
        super(tipoelectrodomestico, marca, potencia);
    }

    public Lavadora(String marca, float potencia) {
        super(marca, potencia);
        this.aguacaliente=false;
    }

    public Lavadora(String marca, float potencia, double precio, boolean aguacaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguacaliente = aguacaliente;
    }
    public double  getConsumo (int horas) {
        if (!this.aguacaliente) { //agua fria

        } else { //agua caliente

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