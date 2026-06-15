package com.example.backend.util;

public class Time {
    public static float timeStarted = System.nanoTime(); // Time of application start

    /**
     * Returns the elapsed time in seconds since the application started.
     * @author Gabriel
     */
    public static float getTime() {
        return (float)((System.nanoTime() - timeStarted) * 1E-9);
    }
}