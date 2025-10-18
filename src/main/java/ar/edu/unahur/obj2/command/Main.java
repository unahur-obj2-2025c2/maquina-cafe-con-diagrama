package ar.edu.unahur.obj2.command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Maquina maquina = new Maquina(1000.0);
        Invoker invoker = new Invoker(maquina);
        Character opcion;

        do { 
            menu(maquina);
            opcion = sc.nextLine().toUpperCase().charAt(0);
            invoker.ejecutarComando(opcion);
        } while (opcion != 'Q');

        System.out.println("El importe a pagar es: "+ maquina.cobrar());
        sc.close();
    }

    private static void menu(Maquina maquina) {

        System.out.print("""
        === MENÚ MÁQUINA DE CAFÉ ===
        Pedido Actual: %s
        A - Agregar Azúcar
        X - Agrandar el Café
        L - Agregar Leche
        U - Deshacer última acción
        Q - Terminar
        Seleccione una opción:
        """.formatted(maquina.display()));

    }
}