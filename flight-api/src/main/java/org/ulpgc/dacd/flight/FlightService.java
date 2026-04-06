package org.ulpgc.dacd.flight;

public class FlightService {

    private final FlightClient client = new FlightClient();

    public void execute() {

        String json = client.fetchFlights();

        if (json != null) {
            System.out.println("Datos recibidos:");
            System.out.println(json.substring(0, 200)); // solo preview
        } else {
            System.out.println("Error obteniendo datos");
        }
    }
}
