import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        // Test out the Divide() function
        try {
            double result1 = Divide(10, 2);
            System.out.println("Result 1: " + result1);

            double result2 = Divide(5, 0);
            System.out.println("Result 2: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test out the CheckFileExtension() function
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            try {
                int points = CheckFileExtension(fileName);
                System.out.println(student + ": " + points + " points");
            } catch (InvalidFileException e) {
                System.out.println(student + ": " + e.getMessage());
            }
        }
    }

    public static double Divide(double x, double y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return x / y;
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    public static int CheckFileExtension(String fileName) throws InvalidFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileException("File name is null or empty");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}

class InvalidFileException extends Exception {
    public InvalidFileException(String message) {
        super(message);
    }
}
