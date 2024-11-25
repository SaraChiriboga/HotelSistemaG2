package udla.schiribogamdamian.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Hotel {
    private String cualHotel = "Plaza Grande";
    private String ubicacionHotel = "Centro histórico";

    Cliente cliente1 = new Cliente();
    Reserva reserva1 = new Reserva();
    Pago pago = new Pago();
    Habitacion habitacion1 = new Habitacion();
    BufferedReader opcion = new BufferedReader(new InputStreamReader(System.in));

    public void iniciarSistema() throws IOException {
        System.out.println("========== Bienvenido al hotel Plaza Grande ==========");
        System.out.println("1. Crear reserva");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Mostrar reservas");
        System.out.println("4. Historial de pagos");
        int seleccion = Integer.parseInt(opcion.readLine());
        if (seleccion == 1){
            cliente1.registrarCliente();
            reserva1.creaReserva();
            habitacion1.registroHabitacion();
            reserva1.disponibilidad(1);
            reserva1.mostrarReservas();
            pago.realizarPago();
        } else if (seleccion == 2) {
            reserva1.cancelaReserva();
        }else if(seleccion == 3){
            reserva1.mostrarReservas();
        }else{
            pago.imprimirPagos();
        }
    }
}