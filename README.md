###Array01
+ 二分法相关：
    - *5.17* BinarySearch [704](https://leetcode.cn/problems/binary-search/)
    - 搜索插入位置 SearchInsert [35](https://leetcode.cn/problems/search-insert-position/)
    - 查找元素第一个和最后一个范围SearchRange [34](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/)
    - 一个数的平方根Sqrt [69](https://leetcode.cn/problems/sqrtx/)
    - 是否有效完全平方数IsPerfectSquare [367](https://leetcode.cn/problems/valid-perfect-square/)
+ 移除元素(双指针)：
    - *5.21* RemoveElement [27](https://leetcode.cn/problems/remove-element/)
    - *5.22* RemoveDuplicates [26](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
    - MoveZeroes [283](https://leetcode.cn/problems/move-zeroes/)
    - BackspaceCompare [844](https://leetcode.cn/problems/backspace-string-compare/)
+ 有序数组的平方：
    - SortedSquares977 [977](https://leetcode.cn/problems/squares-of-a-sorted-array/)
+ 长度最小子数组(滑动窗口)：
    - *5.23* MinSubArrayLen [209](https://leetcode.cn/problems/minimum-size-subarray-sum/)
    - *5.24* TotalFruit [904](https://leetcode.cn/problems/fruit-into-baskets/)
    - MinWindow [76](https://leetcode.cn/problems/minimum-window-substring/)
+ 螺旋数组：
    - SpiralOrder [54](https://leetcode.cn/problems/spiral-matrix/)
    - GenerateMatrix [59](https://leetcode.cn/problems/spiral-matrix-ii/)
    
  
###ListNode02
+ 删除链表元素
    - *5.25* RemoveElements [203](https://leetcode.cn/problems/remove-linked-list-elements/)
    - *5.26* DesignLinkedList [707](https://leetcode.cn/problems/design-linked-list/)
    - ReverseList [206](https://leetcode.cn/problems/reverse-linked-list/)
    - *6.7凌晨1:45* SwapPairs [24](https://leetcode.cn/problems/swap-nodes-in-pairs/)
    - *6.9* RemoveNthFromEnd [19](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/)
    - *6.10* GetIntersectionNode [02.07](https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/)
    - DetectCycle [142](https://leetcode.cn/problems/linked-list-cycle-ii/)
      

###Hash03
+ 哈希表
    - IsAnagram [242](https://leetcode.cn/problems/valid-anagram/)
  
  
    


###一些细节：
  - 大家不必太在意leetcode上执行用时，打败多少多少用户，这个就是一个玩具，非常不准确。 
    做题的时候自己能分析出来时间复杂度就可以了，至于leetcode上执行用时，大概看一下就行，
    只要达到最优的时间复杂度就可以了， 一样的代码多提交几次可能就击败百分之百了.....
  - 暴力法：removeElement的暴力法，第二个for循环中把后面的元素挪到前面来之后，要把i--一下
    ，因为还没有检测的一个i换到上一个元素了，所以i要到上一个重新检测，否则会出错。
  - 双指针法：（也是removeElement的双指针）fastIndex作为for循环的index，
    slowIndex从0开始，给slowIndex赋一次值，slowIndex就++一次。
  - 链表中翻转k个节点，需要从dummy开始翻转，因为这样的数量才是对的。每翻转一小段，要和下一次的开头连起来。
    