import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		try{
			lock l = new lock();
		}catch(Exception ex){
			System.out.printf("sor");
			System.exit(-1);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a number: ");
		System.out.printf("Oh! I get %d!!", scanner.nextInt());
    }
}