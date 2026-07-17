import java.util.*;
public class demo {
    public static void main(String[] args) {
       
        System.out.print("hello");
        
        String name="Elamathi";
        System.out.println(name);
        char []ch=name.toCharArray();
        System.out.println(ch[0]);
        System.out.println(name.substring(3));

        String name2="Elamathi";
        System.out.println(name.equals(name2));
        System.out.println(name==name2);
        System.out.println(name.compareTo(name2));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("Ela", "elu"));
        System.out.println(name.charAt(2));
    }
}