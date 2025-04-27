public class Principal {
    public static void main (String[]args) {
        Pasajero pasajero = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado) {
            System.out.println("Reserva Exitosa.");
        } else {
            System.out.println("Reserva Fallida.");
        }

        System.out.println(vuelo.obtenerItinerario());
        System.out.println("Cancelando Reserva.");
        vuelo.cancelarReserva();
        System.out.println(vuelo.obtenerItinerario());
        vuelo.reservarAsiento("Mario González", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}
