package operators;

public class TypesofOperators {
	
	         public static void main (String[] args) 
	         {
	               
	             // Arithmetic operators 
	             int a = 10;
	             int b = 3;
	             System.out.println("a + b = " + (a + b));
	             System.out.println("a - b = " + (a - b));
	             System.out.println("a * b = " + (a * b));
	             System.out.println("a / b = " + (a / b));
	             System.out.println("a % b = " + (a % b));

//	         unary variables

	             // Using unary operators
	             System.out.println("Postincrement : " + (a++));
	             System.out.println("Preincrement : " + (++a));
	             System.out.println("Postdecrement : " + (b--));
	             System.out.println("Predecrement : " + (--b));
	 
	             
	             // Assignment operators
	             int f = 7;
	             System.out.println("f += 3: " + (f += 3));
	             System.out.println("f -= 2: " + (f -= 2));
	             System.out.println("f *= 4: " + (f *= 4));
	             System.out.println("f /= 3: " + (f /= 3));
	             System.out.println("f %= 2: " + (f %= 2));
	             System.out.println("f &= 0b1010: " + (f &= 0b1010));
	             System.out.println("f |= 0b1100: " + (f |= 0b1100));
	             System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
	             System.out.println("f <<= 2: " + (f <<= 2));
	             System.out.println("f >>= 1: " + (f >>= 1));
	             System.out.println("f >>>= 1: " + (f >>>= 1));
	             
	          // Relational Operators
	             int c = 5,result;

	             System.out.println("a > b: " + (a > b));
	             System.out.println("a < b: " + (a < b));
	             System.out.println("a >= b: " + (a >= b));
	             System.out.println("a <= b: " + (a <= b));
	             System.out.println("a == c: " + (a == c));
	             System.out.println("a != c: " + (a != c));

//	             booleann opertors
	             
	             boolean x = true;
	             boolean y = false;
	           
	             System.out.println("x && y: " + (x && y));
	             System.out.println("x || y: " + (x || y));
	             System.out.println("!x: " + (!x));
	             
	             
	          // ternary operator.
	                 result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	                 System.out.println("Max of three numbers = "+ result);
	                 
	                 
	              // bitwise operators
	                 
	                 
	                 
	                 int d = 0b1010;
	                 int e = 0b1100;
	               
	                 System.out.println("d & e : " + (d & e));
	                 System.out.println("d | e : " + (d | e));
	                 System.out.println("d ^ e : " + (d ^ e));
	                 System.out.println("~d : " + (~d));
	                 System.out.println("d << 2 : " + (d << 2));
	                 System.out.println("e >> 1 : " + (e >> 1));
	                 System.out.println("e >>> 1 : " + (e >>> 1));
	                 
	                 
	              // shift operators
	                 
	                 // Using left shift
	                 System.out.println("a<<1 : " + (a << 1));
	               
	                 // Using right shift
	                 System.out.println("a>>1 : " + (a >> 1));
	                 
	                 
	                 
//	                 instance operator
	                 
	                 Object TypesofOperators = null;
	                 operators.TypesofOperators ex = null;
					System.out.println(ex instanceof TypesofOperators );// false
	         }
	     }
	         
	         

