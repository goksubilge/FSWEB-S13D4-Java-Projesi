package com.bilge.model;

public class Point {
    private int x;
    private int y;

    // EK COUNTER
    public static int counter;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        logCounter();
        return Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2));
    }
    public double distance(int a, int b){
        logCounter();
        return Math.sqrt(Math.pow(getX() - a,2) + Math.pow(getY() - b,2));
    }
    public double distance(Point p) {
        logCounter();
        if (p!= null) {
        return Math.sqrt(Math.pow(getX() - p.x , 2) + Math.pow(getY() - p.y , 2));
        }
        return distance();
    }

    // EK VOID COUNTER
    public void logCounter() {
    counter++;
    }

}
