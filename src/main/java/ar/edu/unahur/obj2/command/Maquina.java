package ar.edu.unahur.obj2.command;

import ar.edu.unahur.obj2.command.decorados.Agrandado;
import ar.edu.unahur.obj2.command.decorados.Azucar;
import ar.edu.unahur.obj2.command.decorados.Cafe;
import ar.edu.unahur.obj2.command.decorados.Decorable;
import ar.edu.unahur.obj2.command.decorados.Leche;

public class Maquina {
    private Decorable cafeBase;
    private Double precioLeche = 200.0;
    private Double precioAzucar = 100.0;
    private Double precioPorAgrandar = 300.0;

    public Maquina(Double precio){
        cafeBase = new Cafe(precio);
    }

    public void agregarLeche(){
        cafeBase = new Leche(precioLeche, cafeBase);
    }    

    public void agregarAzucar(){
        cafeBase = new Azucar(precioAzucar, cafeBase);
    }

    public void agrandar(){
        cafeBase = new Agrandado(precioPorAgrandar, cafeBase);
    }

    public Double cobrar(){
        return cafeBase.precio();
    }

    public String display(){
        return cafeBase.display();
    }

    public Decorable getCafeBase(){
        return cafeBase;
    }

    public void setCafeBase(Decorable cafeBase){
        this.cafeBase = cafeBase;
    }
}
