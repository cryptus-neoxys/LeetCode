/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode *h = head;
        ListNode *t = head;
        
        bool cyc = false;
        
        while(h != NULL && t != NULL) {
            t = t->next;
            if(h->next == NULL) return false;
            h = h->next->next;
            
            if(h == t) {
                return true;
            }
        }
        
        return cyc;
    }
};