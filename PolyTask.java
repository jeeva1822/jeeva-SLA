package newpack;

    class Person {    	
    private String name;
    private int age;
    private String country;
    // Getter for the  name
    public String getName() {
        return name;
    }
          // Setter for the  name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for ageof person
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    // Getter for country
    public String getCountry() {
        return country;
    }
    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person();   
    }
}
public class PolyTask {
	public static void main(String[] args) {
			        Person person = new Person();
			        // Setting values
			        person.setName("Jeeva");
			        person.setAge(21);
			        person.setCountry("INDIA");
			        // Getting values
			        System.out.println("Name: " + person.getName());
			        System.out.println("Age: " + person.getAge());
			        System.out.println("Country: " + person.getCountry());
			    }
			}
