package com.javacourse.exercises;

interface Operation {
    int perform(int x, int y);
}

// Complete the classes below by implementing the Operation interface and providing your own implementation of the perform method.
class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        // Write your code here
        return x+y;
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        // Write your code here
        return x-y;
    }
}

class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        // Write your code here
        if(y==0){
            return -1;
        }
        else{
            return x/y;
        }
    }
}

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

// TODO: Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 

class Circle extends Shape{
    private double radius = 5.0;
    
    public Circle(String name,double radius ){
        super(name);
        this.radius = radius;
    }
    
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

// TODO: Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 
class Rectangle extends Shape{
    private double length = 0;
    private double width = 0;
    public Rectangle(String name,double length,double width){
        super(name);
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
}


public class ArithmeticOperations {

	public static void main(String[] args) {
		// Prueba para la clase Add
        Operation suma = new Add();
        int resultadoSuma = suma.perform(10, 5);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        // Prueba para la clase Subtract
        Operation resta = new Subtract();
        int resultadoResta = resta.perform(20, 8);
        System.out.println("Resultado de la resta: " + resultadoResta);

        // Prueba para la clase Divide
        Operation division = new Divide();
        int resultadoDivision = division.perform(15, 3);
        System.out.println("Resultado de la división: " + resultadoDivision);

        // Prueba para la clase Circle
        Circle circulo = new Circle("Círculo", 7.0);
        circulo.displayInfo();

        // Prueba para la clase Rectangle
        Rectangle rectangulo = new Rectangle("Rectángulo", 10.0, 6.0);
        rectangulo.displayInfo();

	}

}
