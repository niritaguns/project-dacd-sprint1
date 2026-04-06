package org.ulpgc.dacd.flight;

public class Main {

    public static void main(String[] args) {

        FlightService service = new FlightService();
        service.execute();
        System.out.println("Sistema funcionando correctamente");
    }
}

