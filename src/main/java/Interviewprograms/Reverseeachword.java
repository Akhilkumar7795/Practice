package Interviewprograms;

public class Reverseeachword {

	public static void main(String[] args) {

String str ="Mr akhil kumar";
String[] words=str.split(" ");
String revstring = " ";
for(String word:words) {
	String revword=" ";
	for(int i=word.length()-1;i>=0;i--) {
		 revword=revword+word.charAt(i);
	}
	revstring = revword+revstring;
}
System.out.println(revstring);
	}

}
