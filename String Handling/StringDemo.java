public class StringDemo {

public static void main(String[] args) {

String str = "King"; // 1 - SCP
str.concat("Kohli");// appending at the end "King Kohli"
System.out.println(str); // King  - Strings are immutable

// thread safety - synchronized 
StringBuffer sb = new StringBuffer("Sachin");
sb.append(" Tendulkar");
System.out.println(sb);// ?   mutable

// not thread safe - 
StringBuilder sb1 = new StringBuilder("Sourav");
sb1.append(" Ganguly");
System.out.println(sb1);// mutable

}
}
