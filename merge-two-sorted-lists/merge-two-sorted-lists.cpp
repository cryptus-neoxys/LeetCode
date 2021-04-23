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
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* res = new ListNode();
        ListNode* ans = res;
        if(l1 == nullptr && l2 == nullptr) return l1;
        // bool a = 0, b = 0;
        // if(l1 -> val < l2 -> val) {
        //     res = l1;
        //     l1 = l1 -> next;
        // } else {
        //     res = l2;
        //     l2 = l2 -> next;
        // }
        while((l1 != nullptr) && (l2 != nullptr)) {
            if (l1->val <= l2->val) {
                res -> next = l1;
                l1 = l1 -> next;
            }
            else {
                res -> next = l2;
                l2 = l2 -> next;
            }
            res = res->next;
        }
        if(l2 == nullptr)
            while(l1 != nullptr) {
                res -> next = l1;
                l1 = l1 -> next;
                res = res->next;
        }
        if(l1 == nullptr)
            while(l2 != nullptr) {
                res -> next = l2;
                l2 = l2 -> next;
                res = res->next;
        }
        return ans->next;
    }
};