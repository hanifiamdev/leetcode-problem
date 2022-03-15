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
        // Solusi 1
        //int[] result = Solution.twoSum(nums, target);
        // Solusi 2
        int[] result = Solution2.twoSum(nums, target);
        System.out.println("Output : " + (result.length < 2 ? "No solution found!" : Arrays.toString(result)));
        scan.close();
    }
}
