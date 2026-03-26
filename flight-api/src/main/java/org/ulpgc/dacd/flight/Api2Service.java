package org.ulpgc.dacd.flight;

public class Api2Service {

    private final Api2Client client = new Api2Client();

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
