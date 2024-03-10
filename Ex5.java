public class Ex5 {
    public static void main (String[] args) {
        cartesianGrid();
    }
    public static void cartesianGrid () {

        // Declaration of 4 vertices.
        int x1 = 0, y1 = 0;
        int x2 = 4, y2 = 0;
        int x3 = 4, y3 = 4;
        int x4 = 0, y4 = 4;

        // Finding the 2 sides, perimeter and area, keeping in different variables
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double side4 = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));

        double perimeter = side1 + side2 + side3 + side4;

        // Finding the diagonal to divide the quadrilateral into 2 triangles
        double diagonal = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y2, 2));

        // Finding Semi perimeters of the 2 triangles for the use of Heron's formula
        double semiPerimeter1 = (side1 + side2 + diagonal) / 2;
        double semiPerimeter2 = (side3 + side4 + diagonal) / 2;

        // Using Heron's formula
        double area1 = Math.sqrt(semiPerimeter1 * (semiPerimeter1 - side1) * (semiPerimeter1 - side2) * (semiPerimeter1 - diagonal));
        double area2 = Math.sqrt(semiPerimeter2 * (semiPerimeter2 - side3) * (semiPerimeter2 - side4) * (semiPerimeter2 - diagonal));

        // Adding 2 areas to get the total answer
        double totalArea = area1 + area2;


        // Printing the results
        System.out.println("Vertices of the quadrilateral:");
        System.out.println("Vertex 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Vertex 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Vertex 3: (" + x3 + ", " + y3 + ")");
        System.out.println("Vertex 4: (" + x4 + ", " + y4 + ")");
        System.out.println("1st side: " + side1);
        System.out.println("2nd side: " + side2);
        System.out.println("3rd side: " + side3);
        System.out.println("4th side: " + side4);
        System.out.printf("Diagonal: ");
        System.out.printf("%.2f", diagonal);
        System.out.printf("\n1st Semi Perimeter: ");
        System.out.printf("%.2f", semiPerimeter1);
        System.out.printf("\n2nd Semi Perimeter: ");
        System.out.printf("%.2f", semiPerimeter2);
        System.out.println("\nPerimeter: " + perimeter);
        System.out.printf("The 1st Semi Area after the Heron's Formula: ");
        System.out.printf("%.2f", area1);
        System.out.printf("\nThe 2nd Semi Area after the Heron's Formula: ");
        System.out.printf("%.2f", area2);
        System.out.printf("\nArea: ");
        System.out.printf("%.2f", totalArea);



        // x1 0 in binary: 0000. Takes 4 bits of memory
        // y1 0 in binary: 0000. Takes 4 bits of memory
        // x2 4 in binary: 0100. Takes 4 bits of memory
        // y2 0 in binary: 0000. Takes 4 bits of memory
        // x3 4 in binary: 0100. Takes 4 bits of memory
        // y3 4 in binary: 0100. Takes 4 bits of memory
        // x4 0 in binary: 0000. Takes 4 bits of memory
        // y4 4 in binary: 0100. Takes 4 bits of memory
        // side1, side2, side3, side4 4 in binary: 00000100. Takes 8 bits of memory
        // diagonal 5.66 stored in double. Takes 8 bits of memory
        // Perimeter 16 in binary: 00010000. Stored in double. Takes 8 bits of memory.
        // Semi Perimeter 1 and Semi Perimeter 2 stored in double. Take 8 bits of memory each
        // Semi Areas 1 and 2 obtained after the application of Heron's formula. Stored in Double.
        // Take 8 bits of memory each of them.
        // Area 16 in binary: 10000
    }
}
