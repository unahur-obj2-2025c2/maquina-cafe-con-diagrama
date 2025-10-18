package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Maquina;
import ar.edu.unahur.obj2.command.decorados.Decorable;

public abstract class Comando implements Ejecutable{
    protected Maquina receptor;
    private Decorable ultimo;

    public Comando(Maquina receptor) {
        this.receptor = receptor;
        this.ultimo = receptor.getCafeBase();
    }

    @Override
    public void ejecutar() {
        ultimo = receptor.getCafeBase();
        this.doEjecutar();
    }

    protected abstract void doEjecutar();

    @Override
    public void deshacer() {
        receptor.setCafeBase(ultimo);
    }
}
