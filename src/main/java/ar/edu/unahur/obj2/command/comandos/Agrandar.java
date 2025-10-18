package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Maquina;

public class Agrandar extends Comando{

    public Agrandar(Maquina receptor) {
        super(receptor);
    }

    @Override
    protected void doEjecutar() {
        receptor.agrandar();
    }
    
}
