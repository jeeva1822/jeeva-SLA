package task5loops;

public interface Shape {

	void getarea();

	class Rectangle implements Shape {
	    private int length, width;
	    public Rectangle(int length, int width) { this.length = length; this.width = width; }
	    public int getArea() { return length * width; }
		@Override
		public void getarea() {
			// TODO Auto-generated method stub
			
		}
	}

	class Circle implements Shape {
	    private int radius;
	    public Circle(int radius) { this.radius = radius; }
	    public int getArea() { return (int) (Math.PI * radius * radius); }
		@Override
		public void getarea() {
			// TODO Auto-generated method stub
			
		}
	}

	class Triangle implements Shape {
	    private int base, height;
	    public Triangle(int base, int height) { this.base = base; this.height = height; }
	    public int getArea() { return (base * height) / 2; }
		@Override
		public void getarea() {
			// TODO Auto-generated method stub
			
		}
	}

	public class Main {
	    public static void main(String[] args) {
	        Shape[] shapes = { new Rectangle(10, 5), new Circle(7), new Triangle(6, 4) };
	        for (Shape shape : shapes) {
	            System.out.println(shape.getClass().getSimpleName() + " Area: " + shape.getArea());
	        }
	    }
	}

	int getArea();

}
