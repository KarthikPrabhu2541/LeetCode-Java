class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int output[] = new int[nums.length];
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list);

        for (int i = 0; i <= nums.length-1 ; i++)
        {
            int n = 0;
            int index = list.indexOf( nums[i] );

            for (int j = index-1; j >= 0 ; j-- )
            {
                if (nums[i] > list.get(j) )
                    n++;
            }
                output[i] = n;
        }


        return output;
    }
}