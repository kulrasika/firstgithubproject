// String
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		
		String b = "Yellow";
		
		System.out.println("CharAt position 2:   a.charAt(2) :"+a.charAt(2));
		System.out.println("IndexOf character o in hello string:  a.indexOf(\"o\")  :"+a.indexOf("o"));
		
		
		System.out.println("Substring from position 2 to 4:   a.substring(2, 4)   :"+a.substring(2, 4));
		System.out.println("Substring from position 1 to end : a.subsctring(1)   :"+a.substring(2));
		
		System.out.println("Concat two strings a and b   :  a.concat(b) :"+ a.concat(b));
		
		System.out.println("String in Upper Case:  a.toUpperCase()"+a.toUpperCase());
		System.out.println("String in Lower Case:  b.toLowerCase()"+b.toLowerCase());
		String arr[] = a.split("e");
		System.out.println("Split string based on a character and create 2 strings. These need to captured to print:    a.split(\"e\")  \n String arr[] = a.split(\"e\");\n  "+arr[0]+"  :  "+arr[1]);
        System.out.println("Replace character of a string with another character:   a. replace(\"l\",\"y\")  :"+ a.replace("l", "y"));
        
        System.out.println(a.length());
     
		
		
		

	}


    }
    

