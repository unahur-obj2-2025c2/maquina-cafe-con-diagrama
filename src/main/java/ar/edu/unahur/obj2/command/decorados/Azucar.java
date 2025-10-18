package ar.edu.unahur.obj2.command.decorados;

public class Azucar extends Decorator{
    private Double precio;

    public Azucar(Double precio, Decorable decorado) {
        super(decorado);
        this.precio = precio;
    }

    @Override
    protected String doDisplay() {
        return "Azucar";
    }

    @Override
    protected Double precioExtra() {
        return precio;
    }

}
