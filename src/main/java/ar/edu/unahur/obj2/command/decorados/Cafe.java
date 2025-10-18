package ar.edu.unahur.obj2.command.decorados;

public class Cafe implements Decorable{

    private Double precio;

    public Cafe(Double precio){
        this.precio = precio;
    }

    @Override
    public Double precio() {
        return precio;
    }

    @Override
    public String display() {
        return "Cafe";
    }

}
