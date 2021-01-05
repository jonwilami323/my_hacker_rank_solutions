import java.io.*;
import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes":"No");
        System.out.println(StringUtils.capitalize(A) + " " + StringUtils.capitalize(B));
    }
}
