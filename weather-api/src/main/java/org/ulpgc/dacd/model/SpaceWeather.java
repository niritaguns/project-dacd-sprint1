package org.ulpgc.dacd.model;

public class SpaceWeather {

    private final String eventType;
    private final double kpIndex;
    private final String startTime;
    private final String endTime;
    private final String source;
    private final long capturedAt;

    public SpaceWeather(String eventType, double kpIndex, String startTime,
                        String endTime, String source, long capturedAt) {
        this.eventType = eventType;
        this.kpIndex = kpIndex;
        this.startTime = startTime;
        this.endTime = endTime;
        this.source = source;
        this.capturedAt = capturedAt;
    }

    public String getEventType() { return eventType; }
    public double getKpIndex() { return kpIndex; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public String getSource() { return source; }
    public long getCapturedAt() { return capturedAt; }
}