###Array
+ 二分法相关：
    - BinarySearch [704](https://leetcode.cn/problems/binary-search/)
    - 搜索插入位置 SearchInsert [35](https://leetcode.cn/problems/search-insert-position/)
    - 查找元素第一个和最后一个范围SearchRange [34](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/)
    - 一个数的平方根Sqrt [69](https://leetcode.cn/problems/sqrtx/)
    - 是否有效完全平方数IsPerfectSquare [367](https://leetcode.cn/problems/valid-perfect-square/)
+ 移除元素：
  - RemoveElement [27](https://leetcode.cn/problems/remove-element/)
  - RemoveDuplicates [26](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
  - MoveZeroes [283](https://leetcode.cn/problems/move-zeroes/)
  - BackspaceCompare [844](https://leetcode.cn/problems/backspace-string-compare/)
    
  



###一些细节：
  - 暴力法：removeElement的暴力法，第二个for循环中把后面的元素挪到前面来之后，要把i--一下
    ，因为还没有检测的一个i换到上一个元素了，所以i要到上一个重新检测，否则会出错。
  - 双指针法：（也是removeElement的双指针）fastIndex作为for循环的index，
    slowIndex从0开始，给slowIndex赋一次值，slowIndex就++一次。