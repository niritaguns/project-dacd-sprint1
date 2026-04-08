package org.ulpgc.dacd.control;

import org.ulpgc.dacd.model.Flight;
import java.util.List;

public interface FlightFeeder {
    List<Flight> fetchFlights();
}
