class Solution {
  public int longestConsecutive(int[] nums) {
    int ans = 0;
    Set<Integer> seen = new HashSet<>();
    for(int i:nums)
        seen.add(i);

    for (int num : nums) {
      // Num is the start of a sequence
      if (seen.contains(num - 1))
        continue;
      int length = 1;
      while (seen.contains(++num))
        ++length;
      ans = Math.max(ans, length);
    }

    return ans;
  }
}
