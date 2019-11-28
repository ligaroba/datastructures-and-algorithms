'''
Question 3: Write a function which accepts the root of a tree, and returns a Linked List which contains the leaf nodes of the tree from left to right order.
Assumptions:
(*) Structure of the node of tree is as follows:
struct TreeNode
{
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

(*) Don't allocate extra memory for Linked List, just let the right pointer of a leaf
node point to the next leaf node to form a linked list.

Example:
            10
         /      \
       20        100
      /  \       / \
    30    40    9   66

Output: 30 -> 40 -> 9 -> 66

'''


