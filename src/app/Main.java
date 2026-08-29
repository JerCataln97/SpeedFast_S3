package app;

import model.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> historial2 = new ArrayList<>();

        //Crea los pedidos
        Pedido pCom = new PedidoComida(1123, "Los Maitenes 987", "Comida", 13);
        Pedido pEnc = new PedidoEncomienda(1224, "Los Alerces 143", "Encomienda", 8);
        Pedido pExp = new PedidoExpress(1325, "Alameda 456", "Express", 23);

        System.out.println("----------------------------------------");
        System.out.println("              SPEED FAST                ");
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.println("[PEDIDO COMIDA]");

        //Muestra los datos del pedido
        pCom.mostrarResumen();

        //Muestra el tiempo de entrega
        System.out.println("Tiempo estimado de entrega: " + pCom.calcularTiempoEntrega() + " minutos");

        //Asignación automática
        pCom.asignarRepartidor();

        //Asignación manual mediante sobrecarga
        pCom.asignarRepartidor("Alberto Castro");

        //Despacha el pedido
        pCom.despachar();

        //Agrega el pedido al historial
        historial2.add("- Pedido Comida #" + pCom.getIdPedido() + " - entregado por Alberto Castro");

        //Utiliza interfaz Rastreable
        pCom.verHistorial();

        System.out.println("----------------------------------------");

        System.out.println("[PEDIDO ENCOMIENDA]");

        pEnc.mostrarResumen();

        System.out.println("Tiempo estimado de entrega: " + pEnc.calcularTiempoEntrega() + " minutos");

        //Asignación automática
        pEnc.asignarRepartidor();

        //Asignación manual mediante sobrecarga
        pEnc.asignarRepartidor("Miguel Contreras");

        //Despacha el pedido
        pEnc.despachar();

        //Agrega el pedido al historial
        historial2.add("- Pedido Encomienda #" + pEnc.getIdPedido() + " - entregado por Miguel Contreras");

        //Utiliza interfaz Rastreable
        pEnc.verHistorial();

        System.out.println("----------------------------------------");

        System.out.println("[PEDIDO EXPRESS]");

        pExp.mostrarResumen();

        System.out.println("Tiempo estimado de entrega: " + pExp.calcularTiempoEntrega() + " minutos");

        //Asignación automática
        pExp.asignarRepartidor();

        //Asignación manual mediante sobrecarga
        pExp.asignarRepartidor("Matias Navarro");

        //Cancela el pedido
        pExp.cancelar();

        //Agrega el pedido al historial
        historial2.add("- Pedido Express #" + pExp.getIdPedido() + " - Cancelado"
        );

        //Utiliza interfaz Rastreable
        pExp.verHistorial();

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("               HISTORIAL                ");
        System.out.println("----------------------------------------");
        System.out.println();

        for (String registro : historial2) {
            System.out.println(registro);
        }
    }
}
