package org.ulpgc.dacd.flight;

import org.ulpgc.dacd.persistence.SchemaInitializer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.ulpgc.dacd.analysis.FlightAnalysis;
import org.ulpgc.dacd.analysis.SpaceWeatherAnalysis;

public class Main {

    public static void main(String[] args) {

        try {
            SchemaInitializer.createTables();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FlightService service = new FlightService();
        FlightAnalysis flightAnalysis = new FlightAnalysis();
        SpaceWeatherAnalysis weatherAnalysis = new SpaceWeatherAnalysis();

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(2); // mejor 2 hilos

        System.out.println("Sistema iniciado correctamente");

        scheduler.scheduleAtFixedRate(
                service::execute,
                0,
                1,
                TimeUnit.HOURS
        );
        scheduler.scheduleAtFixedRate(
                flightAnalysis::runAnalysis,
                1,
                1,
                TimeUnit.HOURS
        );
        scheduler.scheduleAtFixedRate(
                weatherAnalysis::runAnalysis,
                1,
                1,
                TimeUnit.HOURS
        );
    }
}
