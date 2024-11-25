package udla.schiribogamdamian.system;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reserva extends Cliente {
    private int numhabitacion;
    private String fechain; //atributos
    private String fechaout;
    private boolean estado = false;
    private String idreserva;
    private Pago pago;
    private List<String> reservas = new ArrayList<>();

    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); //lector

    public int getNumhabitacion() {
        return numhabitacion;
    }

    public void setNumhabitacion(int numhabitacion) {
        this.numhabitacion = numhabitacion;
    }

    public List<String> getReservas(List<String> reservas) {
        return reservas;
    }

    public void setReservas(String reservacion) {
        reservas.add(reservacion);
    }

    public String getFechain() {
        return fechain;
    }

    public void setFechain(String fechain) {
        this.fechain = fechain;
    }

    public String getFechaout() {
        return fechaout;
    }

    public void setFechaout(String fechaout) {
        this.fechaout = fechaout;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void disponibilidad(int ocupado){
        if (ocupado == 1){setEstado(true);}
    }
    public void creaReserva() throws IOException {
        setNumhabitacion(Integer.parseInt(JOptionPane.showInputDialog("Numero de habitacion: ")));
        setFechain(JOptionPane.showInputDialog("Fecha de entrada: "));
        setFechaout(JOptionPane.showInputDialog("Fecha de salida: "));

        setIdreserva(JOptionPane.showInputDialog("ID de reserva: "));
        JOptionPane.showMessageDialog(null, "Reservación éxitosa!");

        StringBuilder reservacion = new StringBuilder();
        reservacion.append(getNumhabitacion()). append("\t").append(getFechain()). append("\t").append(getFechaout()).append("\t").append(getIdreserva());
        String reservacreada = reservacion.toString();
        setReservas(reservacreada);
    }

    public void cancelaReserva() throws IOException {
        ListIterator<String> iterador = reservas.listIterator();

        String busca = JOptionPane.showInputDialog("Nombre de quien reserva: ");
        while(iterador.hasNext()){
            if (iterador.next().equals(busca)){
                iterador.remove();
            }
        }
    }

    public void mostrarReservas(){
        reservas.forEach(System.out::println);
    }
}
