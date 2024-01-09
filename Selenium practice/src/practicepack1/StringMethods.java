package practicepack1;

import java.util.ArrayList;

public class StringMethods {

	public static void main(String[] args) {
		/*char[] ch= {'A','H','n','s','x','o','f','e','b','k','r'};
		String all=new String(ch);
		System.out.println(all); */    //String is also working as array of characters
		
		//to find index no from  given string value
		/*String index="microsoft.com123@#$%"; 
		char ch=index.charAt(14);
		System.out.println(ch);*/ // find any index no from given String value 
		 
//		        OR
		
		/*String key="Naveen Polishetty";
		int size=key.length();
		System.out.println("length of the string size is "+      size);
		//to access first character
		System.out.println(key.charAt(0));
		//to access last character
		System.out.println(key.charAt(size-1));*/
		
//		to find odd numvers of characters from given string
		/*String str="Welcome to javapoint portal";
		for(int i=0;i<=str.length()-1;i++) {
			if(i%2!=0) {
				System.out.println("Char at  "  +i+   "place   "+str.charAt(i));
			}
		}*/

//		counting frequency of character in a string
		/*String str = "Welcome to Javatpoint portal";
		int len=str.length();
		System.out.println("the lenght of the string is  "+len);
        int count = 0;  
        for (int i=0; i<=len-1; i++) {  
            if(str.charAt(i) == 'o') {  
                 count++; 
            }  
        }  
        System.out.println("Frequency of t is: "+count);  */
//		indexOff
		/*String letter="my name is srikanth";
		System.out.println(letter.indexOf("name"));*/
//      Concatenation
     	/*String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);*/
//      isEmpty()
		/*String s1="";
		String s2="RANA DAGGUPATY";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());*/
//      join()
		 
			/*String joinString1=String.join("-", "welcome","to","the","javapoint")  ;
			System.out.println(joinString1);  */
//      length()
		/*String s1="javatpoint";  
		String s2="python";  
		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+s2.length());*///6 is the length of python string 
//       replace()		
		/*String s1="my name is khan my name is java";  
		String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString); */
//      	trim()
		/*String str="  safiya    125    ";
		System.out.println(str.trim());*/
//     equals()
		/*String str1="Naveen PoliSHETTy";
		String str2="nAVEEN POLIshettY";
		String str3="RRR";
		String str4="RRR";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str4.equals(str4));*/
		
//equalIgnoreCse()
		/*String str1="Naveen PoliSHETTy";
		String str2="nAVEEN POLIshettY";
		String str3="RRR";
		String str4="Rrr";
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str4.equalsIgnoreCase(str4));*/
		
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
			 
        
         
    }  
	}


