import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class InputExceptionHandle {
    public static int inputInt;
    public static String inputString;
    public static double inputDouble;



    public InputExceptionHandle(int inputInt, String inputString, double inputDouble) {
        this.inputInt = inputInt;
        this.inputString = inputString;
        this.inputDouble = inputDouble;
    }
    public static int inputIntHandle (){
        Scanner input = new Scanner(System.in);
        try {
            inputInt =input.nextInt();
            return inputInt;
        }catch (InputMismatchException e){
            System.out.println("geçerli bir değer girin");

        }
        input.reset();
        inputIntHandle();

        return inputInt;
    }
    public static double inputDoubleHandle (){
        Scanner input = new Scanner(System.in);
        try {
            inputDouble =input.nextDouble();
            return inputDouble;
        }catch (InputMismatchException e){
            System.out.println("geçerli bir değer girin");

        }
        input.reset();
        inputDoubleHandle();

        return inputDouble;
    }
    public static String inputStringHandle (){
        Scanner input = new Scanner(System.in);
        try {
            inputString =input.next();
            return inputString;
        }catch (InputMismatchException e){
            System.out.println("geçerli bir değer girin");

        }
        input.reset();
        inputStringHandle();

        return inputString;
    }


    public int getInputInt() {
        return inputInt;
    }

    public void setInputInt(int inputInt) {
        this.inputInt = inputInt;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public double getInputDouble() {
        return inputDouble;
    }

    public void setInputDouble(double inputDouble) {
        this.inputDouble = inputDouble;
    }
}
