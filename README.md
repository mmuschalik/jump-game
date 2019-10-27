## Jump Game II

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

### Example:
```
solve([2,3,1,1,4]) = 2
```

The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.

This question was posed on leetcode.com. My solution is written in Scala 3 and I used ZIO for the effect system.