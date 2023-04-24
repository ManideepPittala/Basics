package OopsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getBreadth() {
        return breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public double getPerimeter() {
        return 2 * (length + breadth);
    }



    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(4.0, 5.0));
        rectangles.add(new Rectangle(6.0, 3.0));
        rectangles.add(new Rectangle(2.0, 7.0));
        rectangles.add(new Rectangle(8.0, 1.0));
        rectangles.add(new Rectangle(5.0, 4.0));
        
        Rectangle maxAreaRectangle = Collections.max(rectangles, Comparator.comparing(Rectangle::getArea));
        
        System.out.println("Details of rectangle with largest area:");
        System.out.println("Length: " + maxAreaRectangle.getLength());
        System.out.println("Breadth: " + maxAreaRectangle.getBreadth());
        System.out.println("Area: " + maxAreaRectangle.getArea());
        System.out.println("Perimeter: " + maxAreaRectangle.getPerimeter());
    }
}

