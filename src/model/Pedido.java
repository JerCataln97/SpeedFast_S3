package model;

import interfaces.*;
import java.util.ArrayList;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {

    //Historial de estados de los pedidos
    protected ArrayList<String> historial;

    //Atributos
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;
    protected double distanciaKm;

    //Constructor
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
        this.distanciaKm = distanciaKm;
        this.historial = new ArrayList<>();
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    //Metodo para mostrar los datos de los pedidos
    public void mostrarResumen() {
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    //Metodo abstracto para que las clases hijas calculen de manera diferente el tiempo de entrega
    public abstract double calcularTiempoEntrega();

    //Metodo que puede ser sobrescrito por las clases hijas
    public abstract void asignarRepartidor();

    //Sobrecarga del metodo asignarRepartidor, recibe nombreRepartidor
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    //Agrega el estado de los pedidos
    public void agregarHistorial(String estado) {
        historial.add(estado);
    }

    //Interfaz Despachable
    @Override
    public void despachar() {
        System.out.println("Pedido " + idPedido + " despachado correctamente.");
        System.out.println();

        // Registra estado en el historial
        agregarHistorial("Pedido despachado.");
    }

    //Interfaz Cancelable
    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido #" + idPedido);
        System.out.println("Pedido cancelado exitosamente.");
        System.out.println();

        // Registra estado en el historial
        agregarHistorial("Pedido cancelado.");
    }

    //Interfaz Rastreable
    @Override
    public void verHistorial() {

        System.out.println("---- Estado del pedido #" + idPedido + " ----");

        //Verifica que exista estados registrados
        if (historial.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            for (String estado : historial) {
                System.out.println("- " + estado);
            }
        }
    }
}