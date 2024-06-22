public class StringMethodsAndConstructors {
    public static void main(String[] args) {
        String str1 = "Hello, World!"; 
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str2 = new String(charArray);
        String str3 = new String("Java Programming"); 
        
        System.out.println("str1: " + str1);
        System.out.println("Length of str1: " + str1.length());
        
        System.out.println("str2: " + str2);
        System.out.println("Character at index 2 in str2: " + str2.charAt(2)); 
        
        System.out.println("str3: " + str3);
        System.out.println("Substring from index 5 to end in str3: " + str3.substring(5)); 
        
        System.out.println("Index of 'Prog' in str3: " + str3.indexOf("Prog")); 
        System.out.println("Replacing 'Java' with 'Python': " + str3.replace("Java", "Python")); 
        System.out.println("Lowercase str1: " + str1.toLowerCase()); 
        System.out.println("Uppercase str2: " + str2.toUpperCase());
        System.out.println("Trimming leading and trailing spaces from '   Java   ': " + "   Java   ".trim());
        
        String str4 = "Java";
        String str5 = "java";
        
        System.out.println("Comparing str4 and str5: " + str4.equals(str5)); 
        System.out.println("Concatenating str4 and str5: " + str4.concat(str5)); 
    }
}
