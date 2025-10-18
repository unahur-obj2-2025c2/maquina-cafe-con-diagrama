package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Maquina;

public class AgregarAzucar extends Comando{

    public AgregarAzucar(Maquina receptor) {
        super(receptor);
    }

    @Override
    protected void doEjecutar() {
        receptor.agregarAzucar();
    }

}
