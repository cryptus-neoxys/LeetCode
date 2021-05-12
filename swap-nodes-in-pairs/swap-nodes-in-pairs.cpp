/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
void pairSwaps(ListNode* head) {
    if (head != NULL && head->next != NULL) {
        int temp = head->val;
        head->val = head->next->val;
        head->next->val = temp;
        pairSwaps(head->next->next);
    }
}
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode * x = head;
        if( head == nullptr) return head;
        if(head->next == nullptr) return head;
        // head = head->next;
        pairSwaps(x);
        return head;
    }
};