package udla.schiribogamdamian.system;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Pago {
    private String idPago;
    private String metodoPago;
    private float total;
    private LocalDate fechaPago;
    private List<String> historialpagos = new ArrayList<>();

    LocalDate fecha = LocalDate.now(); //para registro de fecha

    //realizar pago
    public void realizarPago(){
        this.total = Float.parseFloat(JOptionPane.showInputDialog("Total de la reserva: "));
        this.metodoPago = JOptionPane.showInputDialog("Metodo de pago: ");
        this.fechaPago = fecha;
        this.idPago = JOptionPane.showInputDialog("ID de pago: ");

        StringBuilder pago = new StringBuilder();
        pago.append(total).append("\t").append(metodoPago).append("\t").append(fechaPago).append("\t").append(idPago);

        historialpagos.add(pago.toString());
    }

    //imprimir historial
    public void imprimirPagos(){
        historialpagos.forEach(System.out::println);
    }
}
