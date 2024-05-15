//Method Overloading

import java.util.Scanner;

public class may8 {

    public static void main(String[] args) {
        // Example example = new Example();
        // System.out.println(example.multiply(8, 10));
        // System.out.println(example.multiply(1.0f, 2.0f));

        childClass child = new childClass();
        child.show();
    }
}

class Example {
    int multiply(int a, int b) {
        return a * b;
    }

    float multiply(float a, float b) {
        return a * b;
    }
}

// Method Overriding

class parentClass {
    void show() {
        System.out.println("Parent CLASS");
    }
}

class childClass extends parentClass {
    void show() {
        System.out.println("Child CLASS");
    };
}

// create a base class named shape with methods to calcluate area and perimeter
// then create subsclasses for different shapes like circle and rectangle make
// use of method overriding

class shape {
    float area(int radius) {
        float result = (3.14) * radius * radius;   
        return result;
    }

    int area(int length, int breath) {
        return length * breath;
    }

    int perimeter(int length, int breath) {
        return 2*(length+breath);
    }

    int perimeter(int radius) {
        return 2 * (3.14) * radius;
    }
}