package OopsConcept;

import java.util.*;

public class Shape {
    private String type;
    private String color;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("circle", "red"));
        shapes.add(new Shape("rectangle", "blue"));
        shapes.add(new Shape("circle", "green"));
        shapes.add(new Shape("triangle", "red"));
        shapes.add(new Shape("circle", "blue"));

        Map<String, Integer> typeCounts = new HashMap<>();
        for (Shape shape : shapes) {
            String type = shape.getType();
            if (typeCounts.containsKey(type)) {
                typeCounts.put(type, typeCounts.get(type) + 1);
            } else {
                typeCounts.put(type, 1);
            }
        }

        for (String type : typeCounts.keySet()) {
            int count = typeCounts.get(type);
            System.out.println(type + ": " + count);
        }
    }
}

