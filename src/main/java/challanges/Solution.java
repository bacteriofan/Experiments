package challanges;

import org.junit.jupiter.api.Test;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int result[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            int difference = Math.abs(target - nums[i]);


            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == difference && j!= i) {
                    result[1] = j;
                    break;
                }
            }
            break;
        }
        return result;
    }

    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }


//        String result = "";
//        for (int i = ch.length-1; i >= 0; i--) {
//            result = result.concat(String.valueOf(ch[i]));
//        }
//      return Integer.parseInt(result);
    }


    public boolean isPalindrome(int x) {
        try {
            String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
            return (Integer.parseInt(reversed) == x) ? true : false;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Test
    public void test() {
        System.out.println(isPalindrome(-121));
    }
}
