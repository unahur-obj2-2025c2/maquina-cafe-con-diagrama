package ar.edu.unahur.obj2.command.decorados;

public class Leche extends Decorator {
    private Double precio;

    public Leche(Double precio, Decorable decorado) {
        super(decorado);
        this.precio = precio;
    }

    @Override
    protected String doDisplay() {
        return "Leche";
    }

    @Override
    protected Double precioExtra() {
        return precio;
    }
}
