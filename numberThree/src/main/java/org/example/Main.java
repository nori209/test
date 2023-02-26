package org.example;


public class Main {
    public static void main(String args[]) {
        Vector1 vector = new Vector1(5,5,5);
        System.out.println("Длинна вектора равна: " + vector.length());
    }
}
class Vector1 {
    private double x;
    private double y;
    private double z;

    public Vector1(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }
}







