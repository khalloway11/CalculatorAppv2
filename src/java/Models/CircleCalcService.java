/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.CalculatorService;

/**
 *
 * @author Keiji
 */
public class CircleCalcService implements CalculatorService {
    private static double PI = Math.PI;
    private double radius;

    public CircleCalcService(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        CircleCalcService.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return PI * (Math.pow(radius, 2));
    }
    
}
