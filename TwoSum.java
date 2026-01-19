import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int want = target - current;
            if(map.containsKey(want)){
                return new int[]{map.get(want),i};
            }
            map.put(current,i);
        }
        return new int[]{};
    }
}
