package Interviewprograms;

public class removespecialcharacters {

	public static void main(String[] args) {

   String str = "ak@$%&(*&^%&%";
   
// Regular expression to match special characters
   String regex = "[^a-zA-Z0-9\\s]";

String replac=str.replaceAll(regex, "");
System.out.println(replac);
	}
	
}
