//Author : Dheeraj Reddy Sandadi
public class Calculator {
        private int result;
   
        public Calculator() {
            result = 0;
        }
   
        public void add(int number1, int number2) {
            result = number1 + number2;
        }
   
        public void subtract(int number1, int number2) {
            result = number1 - number2;
        }
   
        public void multiply(int number1, int number2) {
            result = number1 * number2;
        }
        public void divsion(int number1, int number2){
            result =number1 / number2;
        }
        public int getResult() {
            return result;
        }
   
        public static void main(String[] args) {
            int num1 = 15, num2 = 5;
            Calculator calculator = new Calculator();
            System.out.println("Dheeraj Reddy Sandadi");
   
            calculator.add(num1, num2);
            System.out.println("The result of the addition is " + calculator.getResult());
   
            calculator.subtract(num1, num2);
            System.out.println("The result of the substraction is " + calculator.getResult());
   
            calculator.multiply(num1, num2);
            System.out.println("The result of the multiplication is " + calculator.getResult());
            calculator.divsion(num1, num2);
            System.out.println("The result of the division is " + calculator.getResult());
        }
    }