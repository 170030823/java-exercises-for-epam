import java.io.*;
import java.util.*;
class Second{
public static void main(String args[]){
int i,j,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
int temp;
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;

}
}
}
System.out.print(a[0]+" "+a[1]+" "+a[n-2]+" "+a[n-1]);
}
}
