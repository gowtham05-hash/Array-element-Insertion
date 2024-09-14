import java.util.Scanner;

public class Array_elements_insert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your array size: ") ;
		int n = input.nextInt();
		int[] number = new int[n];
		System.out.print("Enter your array elements are: ");
		for(int i=0;i<n;i++) {
			number[i]=input.nextInt();
			
			}
		
		System.out.print("Which position you want to insert: ");
		int indexposition = input.nextInt();
		System.out.print("Enter your insert element: ");
		int insertvalue = input.nextInt();
		input.close();
		System.out.println("New array: ");
		for(int i = number.length-1;i>indexposition;i--) {
			number[i]=number[i-1];
		}
		number[indexposition]=insertvalue;
		for(int i =0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		}

}