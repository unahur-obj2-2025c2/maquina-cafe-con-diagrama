package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Maquina;

public class AgregarLeche extends Comando{

    public AgregarLeche(Maquina receptor) {
        super(receptor);
    }

    @Override
    protected void doEjecutar() {
        receptor.agregarLeche();
    }

}
