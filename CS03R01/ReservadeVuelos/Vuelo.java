public class Vuelo {
    final String codigoVuelo;
    String Destino;
    String HoraSalida;
    Pasajero asientoReservado= null;

    public Vuelo (String codigoVuelo, String destino, String horaSalida){

        this.codigoVuelo = codigoVuelo;
        this.Destino = destino;
        this.HoraSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }
public boolean reservarAsiento (String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero (nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
}
public void cancelarReserva() {
    asientoReservado = null;
}

public String obtenerItinerario() {
    String info = " Itinerario del Vuelo: ";
    info += " Código: " + codigoVuelo;
    info += " Destino: " + Destino;
    info += " Salida: " + HoraSalida;
    if (asientoReservado != null) {
        info += " Pasajero: " + asientoReservado.nombre;
    } else {
        info += " Pasajero: [Sin Reserva] " ;
    }
    return info;
}
}