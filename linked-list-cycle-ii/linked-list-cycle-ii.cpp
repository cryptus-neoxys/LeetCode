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
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL || head->next == NULL) return NULL;
        ListNode *t = head;
        ListNode *h = head;
        bool cyc = false;
        
        while(h != NULL && t != NULL) {
            t = t->next;
            if(h->next == NULL) return NULL;
            h = h->next->next;
            if(h == t) {
                cyc = true;
                break;
            }
        }
        
        if(!cyc) return NULL;
        
        t = head;
        
        while(h != t) {
            h = h->next;
            t = t->next;
        }
        
        return h;
    }
};