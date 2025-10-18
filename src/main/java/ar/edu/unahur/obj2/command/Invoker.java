package ar.edu.unahur.obj2.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ar.edu.unahur.obj2.command.comandos.Agrandar;
import ar.edu.unahur.obj2.command.comandos.AgregarAzucar;
import ar.edu.unahur.obj2.command.comandos.AgregarLeche;
import ar.edu.unahur.obj2.command.comandos.Ejecutable;

public class Invoker {

    private Maquina maquina;
    private HashMap<Character, Ejecutable> comandos = new HashMap<>();
    private List<Ejecutable> historial = new ArrayList<>();

    public Invoker(Maquina maquina) {
        this.maquina = maquina;
        comandos.put('A', new AgregarAzucar(maquina));
        comandos.put('L', new AgregarLeche(maquina));
        comandos.put('X', new Agrandar(maquina));
    }

    public void ejecutarComando(Character opcion){
        if(comandos.containsKey(opcion)){
            Ejecutable comando = comandos.get(opcion);
            if(!historial.contains(comando)){
                historial.add(comando);
                comando.ejecutar();
            }
        } else {
            if (opcion.equals('U')) {
                this.deshacer();
            }
        }
    }

    public void deshacer(){
        if(!historial.isEmpty()){
            Ejecutable ultimoComando = historial.get(historial.size() - 1);
            ultimoComando.deshacer();
            historial.remove(ultimoComando);
        }

    }

}
