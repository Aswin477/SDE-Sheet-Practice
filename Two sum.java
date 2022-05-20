class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> res=new HashMap<> ();
        int arr[]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            if(res.containsKey(target-nums[i]))
            {
                arr[0]=res.get(target-nums[i]);
                arr[1]=i;
                return arr;
                
            }
             res.put(nums[i],i);
           
        }
         return arr;
    }
}
