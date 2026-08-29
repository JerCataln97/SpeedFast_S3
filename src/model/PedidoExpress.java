package model;

//Esta clase hereda de la clase Pedido
public class PedidoExpress extends Pedido {

    //Constructor
    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
    }

    //Sobrescritura del metodo asignarRepartidor()
    @Override
    public void asignarRepartidor() {
        System.out.println("Buscando repartidor más cercano y disponible...");
        System.out.println("Repartidor más cercano asignado.");
    }

    //Sobrescritura del metodo sobrecargado asignarRepartidor()
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    //Sobrescritura del metodo abstracto calcularTiempoEntrega()
    @Override
    public double calcularTiempoEntrega() {
        if (getDistanciaKm() > 5) {
            return 15;
        }
        return 10;
    }
}