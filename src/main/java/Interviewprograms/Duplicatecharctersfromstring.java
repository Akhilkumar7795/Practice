package Interviewprograms;

public class Duplicatecharctersfromstring {

	public static void main(String[] args) {

    String str="coconut";
   int a[]=new int[126];
   for(int i=0;i<str.length();i++) {
	   a[str.charAt(i)]=a[str.charAt(i)]+1;
   }
for(int i=0;i<a.length;i++) {
	if(a[i]>1) {
		//System.out.println((char)i +"  repeated   " +  a[i] +"   times");
		System.out.println((char)i);
	}
}
}}
