class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i =0;i< nums.length-1;i++)
        {
        for(int j = i+1;j<nums.length;j++)
        {
        if(nums[i]+nums[j]==target)
        {
        result[0] = i;
        result[1] = j;
        }
        }
        }
        return result;
    }
}
//solution2
/*
Runtime: 1 ms, faster than 99.90% of Java online submissions for Two Sum.
Memory Usage: 41.4 MB, less than 5.65% of Java online submissions for Two Sum.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       int [] result = new int[2];

      for(int i=0;i<nums.length;i++)
      {
        if(map.get(target-nums[i]) !=null)
        {
          result[0] = map.get(target-nums[i]) ;
          result[1] = i;
          return result;
        }
       map.put(nums[i],i);
      }
          return result;
    }

}
