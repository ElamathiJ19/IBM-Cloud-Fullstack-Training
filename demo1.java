import java.util.*;

public class demo1{
    public static void main(String [] args){
       Scanner s=new Scanner(System.in);
       System.out.println( "enter your name:");
       String name=s.nextLine();
       char[]ch=name.toCharArray();
       ch[4]='/u0000';
       System.out.println(new String(ch));
    }
}