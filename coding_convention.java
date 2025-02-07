import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        System.out.print("Nhập số thứ nhất: ");  
        int num1 = scanner.nextInt();  
  
        System.out.print("Nhập số thứ hai: ");  
        int num2 = scanner.nextInt();  
  
        int sum = add(num1, num2);  
        System.out.println("Tổng: " + sum);  
  
        int diff = subtract(num1, num2);  
        System.out.println("Hiệu: " + diff);  
  
        int prod = multiply(num1, num2);  
        System.out.println("Tích: " + prod);  
  
        double quotient = divide(num1, num2);  
        System.out.println("Thương: " + quotient);  
  
        double avg = calculateaverage(num1, num2);  
        System.out.println("Trung bình: " + avg);  
  
        scanner.close();  
    }  
  
    public static int add(int num1, int num2) {  
        return num1 + num2;  
    }  
  
    public static int subtract(int num1, int num2) {  
        return num1 - num2;  
    }  
  
    public static int multiply(int num1, int num2) {  
        return num1 * num2;  
    }  
  
    public static double divide(int num1, int num2) {  
        if (num2 == 0) {  
            throw new ArithmeticException("Không thể chia cho số 0.");  
        }  
        return (double) num1 / num2;  
    }  
  
    public static double calculateaverage(int num1, int num2) {  
        return (num1 + num2) / 2.0;  
    }  
}  
