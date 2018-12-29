package com.carriel.souleyman.Model.HomeShop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * write on line
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();
}
