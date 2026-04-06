package org.ulpgc.dacd.persistence;

import java.sql.Connection;
import java.sql.Statement;

public class SchemaInitializer {

    public static void createTables() throws Exception {

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS flights (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    icao TEXT,
                    callsign TEXT,
                    country TEXT,
                    altitude REAL,
                    last_update INTEGER
                )
            """);
        }
    }
}