package Exercice1;


/*
*@author Mr Boka
*/

// Derived Class
public class XShape extends Shape {
    private String name;

    public XShape(String name) { // Default Constructor
        this.name = name;
    }

    // Overridden Method
    public String getName() {
        // write your code here
        return super.getName() + ", " + this.name;
    }

}


/*
*@author Mr Boka
*/
