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
public class TriangleCalcService implements CalculatorService{
    private double length;
    private double height;

    public TriangleCalcService(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return .5 * length * height;
    }
    
    
}
