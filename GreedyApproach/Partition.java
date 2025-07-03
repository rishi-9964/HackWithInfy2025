import java.util.Arrays;

public class Partition {
  public int arrayPairSum(int[] nums) {
    int ans = 0;

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i += 2)
      ans += nums[i];

    return ans;
  }
  public static void main(String[] args) {
    Partition ap = new Partition();
    int[] nums = {1, 4, 3, 2};
    System.out.println(ap.arrayPairSum(nums)); 
  }
}