public class StringMethodsAndConstructors {
    public static void main(String[] args) {
        // String constructors
        String str1 = "Hello, World!"; // String literal
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str2 = new String(charArray); // Using char array constructor
        String str3 = new String("Java Programming"); // Using string constructor

        // String methods
        System.out.println("str1: " + str1);
        System.out.println("Length of str1: " + str1.length()); // Length method

        System.out.println("str2: " + str2);
        System.out.println("Character at index 2 in str2: " + str2.charAt(2)); // charAt method

        System.out.println("str3: " + str3);
        System.out.println("Substring from index 5 to end in str3: " + str3.substring(5)); // substring method

        System.out.println("Index of 'Prog' in str3: " + str3.indexOf("Prog")); // indexOf method
        System.out.println("Replacing 'Java' with 'Python': " + str3.replace("Java", "Python")); // replace method

        System.out.println("Lowercase str1: " + str1.toLowerCase()); // toLowerCase method
        System.out.println("Uppercase str2: " + str2.toUpperCase()); // toUpperCase method

        System.out.println("Trimming leading and trailing spaces from '   Java   ': " + "   Java   ".trim()); // trim method

        String str4 = "Java";
        String str5 = "java";
        System.out.println("Comparing str4 and str5: " + str4.equals(str5)); // equals method

        System.out.println("Concatenating str4 and str5: " + str4.concat(str5)); // concat method
    }
}
