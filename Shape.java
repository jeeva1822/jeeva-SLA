package newpack;

public enum Shape {
	
	
	        CIRCLE,
	        SQUARE,
	        RECTANGLE,
	        TRIANGLE,
	        PENTAGON;
	  

	    public static void main(String[] args) {
	        Shape myShape = Shape.PENTAGON;

	        switch (myShape) {
	            case CIRCLE:
	                System.out.println("You selected a CIRCLE.");
	                break;
	            case SQUARE:
	                System.out.println("You selected a SQUARE.");
	                break;
	            case RECTANGLE:
	                System.out.println("You selected a RECTANGLE.");
	                break;
	            case TRIANGLE:
	                System.out.println("You selected a TRIANGLE.");
	                break;
	            case PENTAGON:
	                System.out.println("You selected a PENTAGON.");
	                break;
	            default:
	                System.out.println("Unknown shape.");
	        }
	    }
	}

