// Define the Jedi class
class Jedi {
    // Attributes
    String name;
    String lightsaberColor;

    // Constructor
    public Jedi(String name, String lightsaberColor) {
        this.name = name;
        this.lightsaberColor = lightsaberColor;
    }

    // Method to use the Force
    public void useForce() {
        System.out.println(name + " is using the Force.");
    }

    // Method to defend
    public void defend() {
        System.out.println(name + " is defending with their lightsaber.");
    }
}

public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        // Create objects (instances of the Jedi class)
        Jedi lukeSkywalker = new Jedi("Luke Skywalker", "blue");
        Jedi yoda = new Jedi("Yoda", "green");

        // Using methods on objects
        lukeSkywalker.useForce();   // Output: Luke Skywalker is using the Force.
        yoda.defend();              // Output: Yoda is defending with their lightsaber.
    }
}