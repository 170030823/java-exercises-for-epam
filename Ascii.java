import java.io.*;
import java.util.*;
class Ascii{
public static void main(String args[]){
int i,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
System.out.println((char)a[i]+" ");
}
}
}
