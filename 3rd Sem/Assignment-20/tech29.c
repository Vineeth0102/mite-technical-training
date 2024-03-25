/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]


Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

*/

#include <stdio.h>
#include <stdlib.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *mergeTwoLists(struct ListNode *l1, struct ListNode *l2)
{
    struct ListNode *mergedList = NULL;
    struct ListNode **tail = &mergedList;

    while (l1 != NULL && l2 != NULL)
    {
        if (l1->val <= l2->val)
        {
            *tail = l1;
            l1 = l1->next;
        }
        else
        {
            *tail = l2;
            l2 = l2->next;
        }
        tail = &((*tail)->next);
    }

    *tail = (l1 != NULL) ? l1 : l2;

    return mergedList;
}

void printList(struct ListNode *head)
{
    while (head != NULL)
    {
        printf("%d ", head->val);
        head = head->next;
    }
    printf("\n");
}

struct ListNode *newNode(int val)
{
    struct ListNode *node = (struct ListNode *)malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

int main()
{
    struct ListNode *list1 = newNode(1);
    list1->next = newNode(2);
    list1->next->next = newNode(4);

    struct ListNode *list2 = newNode(1);
    list2->next = newNode(3);
    list2->next->next = newNode(4);

    printf("List 1: ");
    printList(list1);
    printf("List 2: ");
    printList(list2);

    struct ListNode *mergedList = mergeTwoLists(list1, list2);
    printf("Merged List: ");
    printList(mergedList);

    while (mergedList != NULL)
    {
        struct ListNode *temp = mergedList;
        mergedList = mergedList->next;
        free(temp);
    }

    return 0;
}
