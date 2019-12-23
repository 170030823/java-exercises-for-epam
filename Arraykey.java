import java.io.*;
import java.util.*;
class Arraykey{
public static void main(String args[]){
int i,n,key,flag=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[5];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
key=sc.nextInt();
for(i=0;i<n;i++){
if(key==a[i]){
flag=1;
break;
}
}
if(flag==1)
{
System.out.println(i+1);
}
else{
System.out.println("-1");
}
}
}
