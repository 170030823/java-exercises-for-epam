import java.io.*;
import java.util.*;
class Minmax{
public static void main(String args[]){
int i,max=0,min=999;
int a[]={4,5,8,9,87,54};
for(i=0;i<6;i++){
if(a[i]<min)
min=a[i];
if(a[i]>max)
max=a[i];
}
System.out.println(max+" "+min+" ");
}
}