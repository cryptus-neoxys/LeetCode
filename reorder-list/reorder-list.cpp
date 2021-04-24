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

ListNode* mid(ListNode* head) {
    ListNode *slow = head, *fast = head;
    while(fast && fast->next) {
        fast = fast->next->next;
        if(fast)slow = slow->next;
    }
    return slow;
}

ListNode* reverseList(ListNode* head) {
    ListNode* current = head;
    ListNode *prev = nullptr, *next = nullptr;

    while(current != nullptr)
    {
        next = current->next;

        current->next = prev;

        prev = current;
        current = next;
    }
    head = prev;

    return head;
}

class Solution {
public:
    void reorderList(ListNode* head) {
        ListNode* B = mid(head);
        ListNode* A = reverseList(B->next);
        B->next = nullptr;
        
        
        ListNode * a = A;
        ListNode * b = head;
        
        
        
        ListNode * c = a;
        ListNode * d = new ListNode();

        
        
        
        
        
        // bool c = 1;
        
        while(c != nullptr && b != nullptr)
        {
            d = c;
            c = b->next;
            b->next = d;
            b = b -> next;
        }
        
//         while(a != nullptr) {
//             c->next = a ; c = c->next;
//             a = a->next;
//         }
        
//         while(b != nullptr) {
//             c->next = b ; c = c->next;
//             b = b->next;
//         }
        head = c;
    }
};