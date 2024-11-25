package udla.schiribogamdamian.system;

import javax.swing.*;

public class Cliente{
    private String nombre;
    private String idCliente;
    private String correo;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void registrarCliente() {
        JOptionPane.showMessageDialog(null, "\t\tREGISTRO DE CLIENTE\n");
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        this.idCliente = JOptionPane.showInputDialog("ID cliente: ");
        this.telefono = JOptionPane.showInputDialog("Telefono: ");
        this.correo = JOptionPane.showInputDialog("Correo: ");
        JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente:\n" +
                "Nombre: " + this.nombre + "\n" +
                "ID Cliente: " + this.idCliente + "\n" +
                "Correo: " + this.correo + "\n" +
                "Teléfono: " + this.telefono);
    }
}