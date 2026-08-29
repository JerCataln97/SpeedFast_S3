package model;

//Esta clase hereda de la clase Pedido
public class PedidoEncomienda extends Pedido {

    //Constructor
    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
    }

    //Sobrescritura del metodo asignarRepartidor()
    @Override
    public void asignarRepartidor() {
        System.out.println("Validando peso y embalaje de la encomienda...");
        System.out.println("Peso y embalaje validados correctamente.");
    }

    //Sobrescritura del metodo sobrecargado asignarRepartidor()
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    //Sobrescritura del metodo abstracto calcularTiempoEntrega()
    @Override
    public double calcularTiempoEntrega() {
        return 20 + (1.5 * getDistanciaKm());
    }
}