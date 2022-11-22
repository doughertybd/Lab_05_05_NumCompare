public class Main {
    public static void main(String[] args) {
        int numberOne =1;
        int numberTwo =3;
        System.out.println("Please enter two numbers to be compared: " + numberOne + " and " + numberTwo);
        if (numberOne==numberTwo){
            System.out.println("The two numbers you entered are the same");
        } else if (numberOne>numberTwo) {
            System.out.println("the first number, " + numberOne + ", is bigger than " + numberTwo);
        }
        else if (numberOne<numberTwo) {
            System.out.println("the first number, " + numberOne + ", is less than " + numberTwo);
        }
        else{
            System.out.println("You did not type a valid number");
        }
    }
}