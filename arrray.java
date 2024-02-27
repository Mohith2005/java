package demo;
import java.util.Scanner;
public class arrray {
    public static void main(String[] args) {
		int a[][]=new int[3][3];
                Scanner hu=new Scanner(System.in);
		System.out.println(a.length);
                for (int i=0;i<a.length;i++){
                    for(int j=0;j<a.length;j++){
                     System.out.println("Enter the value for the arrar of a for the index"+a[i][j]);
                     a[i][j]=hu.nextInt();
                    }
                }
                for (int i=0;i<a.length;i++){
                    for(int j=0;j<a.length;j++){
                     System.out.print(a[i][j]);
                         }
                System.out.println();
                }
    }
}
