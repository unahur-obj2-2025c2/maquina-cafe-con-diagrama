package ar.edu.unahur.obj2.command.decorados;

public class Agrandado extends Decorator{
    private Double precio;

    public Agrandado(Double precio, Decorable decorado) {
        super(decorado);
        this.precio = precio;
    }

    @Override
    protected String doDisplay() {
        return "Agrandado";
    }

    @Override
    protected Double precioExtra() {
        return precio;
    }
}
