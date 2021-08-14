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
    ListNode* reverseList(ListNode* head) {
        ListNode *c = head, *n = NULL, *p=NULL;
        
        while(c != NULL) {
            n = c->next;
            c->next = p;
            p = c;
            c = n;
        }
        
        return p;
    }
    
    ListNode* middleOfList(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head->next;
        if(!slow || !slow->next) return slow;
        
        while (fast != NULL && fast->next != NULL && fast->next->next != NULL) {
            fast = fast->next->next;
            if(!fast || !fast->next) break;
            slow = slow->next;
        }
        return slow;
    }
    
    bool isPalindrome(ListNode* head) {
        if(!head || !head->next) return true;
        if(!head->next->next) return head->val == head->next->val;
        ListNode *mid = middleOfList(head);
        
        cout << mid->val << " " << mid->next->val << endl;
        
        ListNode *rev = reverseList(mid->next);
        mid->next == NULL;
        ListNode *p = head, *v = rev;
        while(p != NULL && v!=NULL) {
            if(p->val != v->val) return false;
            p = p->next; v = v->next;
        }
        
        return true;
    }
};