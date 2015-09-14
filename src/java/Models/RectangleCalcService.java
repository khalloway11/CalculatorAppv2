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
public class RectangleCalcService implements CalculatorService {
    private double width;
    private double length;

    public RectangleCalcService(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double calculateArea(){
        return length * width;
    }
}
