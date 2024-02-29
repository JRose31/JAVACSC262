import java.util.ArrayList;

class JavaArrays {
    public static void main(String[] args) {

        // Initializing both lists
        ArrayList<Double> grades = new ArrayList<Double>();
        Float[] gpa = new Float[5];

        // Printing the variables show the 
        // ArrayList as an empty list (brackets)
        // Java Array as an object

        System.out.println("Array List: " + grades + " Array: " + gpa);       
        
        // Adding elements to an ArrayList vs Java Array
        grades.add(92.3);
        gpa[0] = 3.2f;

        System.out.println("Array List: " + grades.get(0) + " Array: " + gpa[0]); 

        //Replacing elements in ArrayList vs Java Array
        grades.set(0, 76.5);
        gpa[0] = 2.3f;

        System.out.println("Array List: " + grades.get(0) + " Array: " + gpa[0]); 


    };
};
