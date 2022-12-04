package Thrusdaylab;
import java.util.*;
public class copyarray {
public static void main(String[]args) {
int a[],b[],size;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the first array: ");
size=sc.nextInt();
a=new int[size];
b=new int[size];
System.out.println("Enter element of first array: ");
for(int i=0;i<size;i++) {

a[i]=sc.nextInt();
b[i]=a[i];
}
System.out.println("Elements of second array: ");
for(int i=0;i<size;i++) {

	System.out.print(b[i]+" ");
}
}
}
