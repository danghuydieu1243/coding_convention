import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        System.out.print("Nhập số thứ nhất: ");  
        int num1 = scanner.nextInt();  
  
        System.out.print("Nhập số thứ hai: ");  
        int num2 = scanner.nextInt();  
  
        int sum = cong(num1, num2);  
        System.out.println("Tổng: " + sum);  
  
        int diff = tru(num1, num2);  
        System.out.println("Hiệu: " + diff);  
  
        int prod = multiply(num1, num2);  
        System.out.println("Tích: " + prod);  
  
        double quotient = divide(num1, num2);  
        System.out.println("Thương: " + quotient);  
  
        double avg = calculateaverage(num1, num2);  
        System.out.println("Trung bình: " + avg);  
  
        scanner.close();  
    }  
  
    public static int cong(int x, int y) {  
        return x + y;  
    }  
  
    public static int tru(int x, int y) {  
        return x - y;  
    }  
  
    public static int multiply(int x, int y) {  
        return x * y;  
    }  
  
    public static double divide(int x, int y) {  
        if (y == 0) {  
            throw new ArithmeticException("Không thể chia cho số 0.");  
        }  
        return (double) x / y;  
    }  
  
    public static double calculateaverage(int x, int y) {  
        return (x + y) / 2.0;  
    }  
}  
