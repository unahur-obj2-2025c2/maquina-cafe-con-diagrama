package ar.edu.unahur.obj2.command.decorados;

public abstract class Decorator implements Decorable{

    private Decorable decorado;

    public Decorator(Decorable decorado) {
        this.decorado = decorado;
    }

    @Override
    public String display() {
        return decorado.display() + " - " + this.doDisplay();
    }

    protected abstract String doDisplay();

    @Override
    public Double precio() {
        return decorado.precio() + this.precioExtra();
    }

    protected abstract Double precioExtra();

    
}
