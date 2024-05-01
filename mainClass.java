class student {

    int rollNumber;
    String name;

    student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + rollNumber);
    }
}

public class mainClass {
    public static void main(String[] args) {

        student array[] = new student[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = new student(i, "P" + i);
        }

        for (int i = 0; i < array.length; i++) {
            array[i].display();
        }
    }
}