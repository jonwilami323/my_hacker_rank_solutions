import java.util.Scanner;

public class subStringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;
        String subString = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length()-k+1; i++) {

            subString = s.substring(i, i+k);
            //Compare
            if (smallest.compareTo(subString) >= 0) {
                smallest = subString;
            }
            if (largest.compareTo(subString) <= 0) {
                largest = subString;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
