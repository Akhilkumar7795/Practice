package Interviewprograms;

public class Frequencyelementinarray {

	public static void main(String[] args) {

int a[]= {10,20,30,40,40,40,50,50,30};

for(int i=0;i<a.length;i++) {
	int count =1;
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]);
		count++;
		a[j]=0;
	}
if(a[i]!=0) {
	System.out.println("Element"+a[i]+"occurs"+count+"times");
}
}

	}

}
