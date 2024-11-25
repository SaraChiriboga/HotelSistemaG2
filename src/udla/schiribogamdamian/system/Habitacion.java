package udla.schiribogamdamian.system;

import javax.swing.*;
import java.util.List;

public class Habitacion extends Reserva{
    private int idHabitacion;
    private float precioHabitacion;
    private String modeloHabitacion;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getModeloHabitacion() {
        return modeloHabitacion;
    }

    public void setModeloHabitacion(String modeloHabitacion) {
        this.modeloHabitacion = modeloHabitacion;
    }

    public void registroHabitacion(){
        JOptionPane.showMessageDialog(null, "\t\tREGISTRO DE HABITACION");
        this.modeloHabitacion = JOptionPane.showInputDialog("Ingrese el modelo de la habitacion: ");
        this.idHabitacion = Integer.parseInt(JOptionPane.showInputDialog("ID habitacion: "));
        this.precioHabitacion = Float.parseFloat(JOptionPane.showInputDialog("Precio: "));
        JOptionPane.showMessageDialog(null, "Habitacion registrada exitosamente!");
        detalleHabitacion();
    }

    public void detalleHabitacion() {
        JOptionPane.showMessageDialog(null, "Detalles de la habitación:\n" +
                "ID: " + this.idHabitacion + "\n" +
                "Modelo: " + this.modeloHabitacion + "\n" +
                "Precio: " + this.precioHabitacion);
    }


}