# [TWO SUM](https://leetcode.com/problems/two-sum)

- Leetcode question number: 1
- Question Difficulty: Easy
- Data Structure: Array
- Optimal complexity
  - Time: O(n)
  - Space: O(n)

## Logic

### Brute Force Approach

- By using 2 loops
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### Optimal Approach

- Approach
  - We can reduce the time complexity to O(n) by using a hashmap in our solution
  - This requires a sacrifice in space complexity --> Increases to O(n)
  - While iterating through the array, check whether the current element is there in the hashmap as key
  - If not, store the complement of current element as key and the current index as value to the Hashmap
  - If yes, return the current index value and the index value stored in the hashmap corresponding to the complement value.
- Time Complexity: O(n)
- Space Complexity: O(n)

## Visual Representation

- Input Array: [6, 1, 5, 4]
- Target Value: 10

| Iteration | Index | Value | Hashmap               |
| --------- | ----- | ----- | --------------------- |
| 1         | 0     | 6     | {(4,0)}               |
| 2         | 1     | 1     | {(4,0), (9,1)}        |
| 3         | 2     | 5     | {(4,0), (9,1), (5,2)} |
| 4         | 3     | 4     | Key already present   |

- In the 4th iteration, we got the complement which was already there in the hashmap.
- Hence, we will return [0, 3] as the output.
