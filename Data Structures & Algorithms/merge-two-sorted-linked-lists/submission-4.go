/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
    // iterate through lists
    curr1 := list1
    curr2 := list2

    temp := &ListNode{}
    newHead := temp

    for curr1 != nil && curr2 != nil {
        if curr1.Val < curr2.Val {
            newHead.Next = curr1
            curr1 = curr1.Next
        } else  {
            newHead.Next = curr2
            curr2 = curr2.Next
        }
        newHead = newHead.Next
    }


    if curr1 == nil {
        newHead.Next = curr2
    } else if curr2 == nil {
        newHead.Next = curr1
    }

    return temp.Next
}
