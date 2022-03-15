import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int[] nums = Arrays.stream(scan.nextLine().replaceAll("\s+$", "").split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.print("target : ");
        int target = scan.nextInt();
        int[] result = Solution.twoSum(nums, target);
        System.out.println("Output : " + (result.length < 2 ? "Not Found" : Arrays.toString(result)));
        scan.close();
    }
}
