package org.ulpgc.dacd.analysis;

import org.ulpgc.dacd.persistence.DatabaseManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SpaceWeatherAnalysis {

    public void runAnalysis() {

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement()) {

            // Media Kp
            ResultSet avgKp = stmt.executeQuery("SELECT AVG(kp_index) FROM space_weather");
            System.out.println("Media Kp: " + avgKp.getDouble(1));

            // Tormentas fuertes
            ResultSet storms = stmt.executeQuery("SELECT COUNT(*) FROM space_weather WHERE kp_index >= 5");
            System.out.println("Tormentas geomagnéticas fuertes: " + storms.getInt(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}