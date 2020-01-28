import java.util.Scanner;
import java.util.Arrays;
class ArrayFun
{
public static void main(String ar[])
{
int arr[]={10,20,30,40,50,60,70};
int arr1[]={10,20,30,40,50};
int key=30;
System.out.println("Integer Array as List : "+Arrays.asList(arr));
System.out.println(+key+" is found at index : "+Arrays.binarySearch(arr,key));
System.out.println("Compare : "+Arrays.compare(arr,arr1));
System.out.println("CompareUnsigned : "+Arrays.compareUnsigned(arr,arr1));
}
}