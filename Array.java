import java.io.*;
import java.util.*;
class Array{
public static void main(String args[]){
int i;
int a[]={1,2,3,4,5,6,7,8,9,1};
double sum=0;
double avg;
for(i=0;i<10;i++){
sum=sum+a[i];
}
avg=sum/10;
System.out.println(sum+" "+avg+" ");
}
}