import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //A1

        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }


    }
}

//A2
class DivideByZero {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

//A3
class DivideByZero1 {

    public static void main(String[] args) {


        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }

    }
}

//A4

class Test1 {

    public static void cat(File named) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(named, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException fnf) {
            System.err.println("File: " + named + " not found.");
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException io) {
                }
            }
        }
    }

    public static void main(String[] args) {
        cat(new File("r"));
        cat(new File("d://bb"));


    }
}

//A5: Create three new types of exceptions. Write a class with a method that throws all three.

class Exception1 extends NullPointerException {

}

class Exception2 extends ArithmeticException {
}

class Exception3 extends SQLException {
}

class TestEx {

    static public void someMethod(String m) throws Exception1, Exception2, Exception3 {
        System.out.println("Something");
    }

    public static void main(String[] args) {

        try {
            someMethod("0");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
/*

class Exception1 extends NullPointerException {

}

class Exception2 extends ArithmeticException {
}

class Exception3 extends SQLException {
}

class TestEx {


    public void resomException(String exceptionName) throws Exception1, Exception2, Exception3 {
        try {
            if (exceptionName.equals("First")) {
                throw new Exception1();
            } else if (exceptionName.equals("second")) {
                throw new Exception2();
            } else {
                throw new Exception3();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        TestEx testEx = new TestEx();
        try {
            testEx.resomException("t");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }


}*/

