package model;

//Esta clase hereda de la clase Pedido
public class PedidoComida extends Pedido {

    //Constructor
    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
    }

    //Sobrescritura del metodo asignarRepartidor()
    @Override
    public void asignarRepartidor() {
        System.out.println("Buscando repartidor con mochila térmica...");
        System.out.println("Repartidor con mochila térmica encontrado.");
    }

    //Sobrescritura del metodo sobrecargado asignarRepartidor()
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    //Sobrescritura del metodo abstracto calcularTiempoEntrega()
    @Override
    public double calcularTiempoEntrega() {
        return 15 + (2 * getDistanciaKm());
    }
}