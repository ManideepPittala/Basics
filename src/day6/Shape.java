package day6;


public class Shape {
    private String type;
    private double dimension1;
    private double dimension2;

    public Shape(String type, double dimension1, double dimension2) {
        this.type = type;
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public String getType() {
        return type;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public double calculateArea() {
        if (type.equals("rectangle")) {
            return dimension1 * dimension2;
        } else if (type.equals("triangle")) {
            return 0.5 * dimension1 * dimension2;
        } else {
            return -1.0;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape rectangle = new Shape("rectangle", 5.0, 10.0);
	        double rectangleArea = rectangle.calculateArea();
	        System.out.println("Rectangle area: " + rectangleArea);

	        Shape triangle = new Shape("triangle", 4.0, 8.0);
	        double triangleArea = triangle.calculateArea();
	        System.out.println("Triangle area: " + triangleArea);

	}

}
