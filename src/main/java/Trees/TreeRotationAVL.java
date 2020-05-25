package Trees;

import utils.UtilsFunctions;

class Node{
    int key, height;
    Node right, left ;
    Node(int data){
       height=1;
       key= data;
    }

        }

public   class TreeRotationAVL extends UtilsFunctions {
     Node root;
     // Utility function to get the height of a tree
      int height(Node n){
           if(n==null)
               return 0;
           return n.height;
     }

     // utility function for doing left Rotation
     Node leftRotation(Node currRoot){
         Node X= currRoot.left; // left node of the current root node (currRoot)
         Node T2 = X.right; // subtree of X node

         //perform rotation
         X.right = currRoot;
         currRoot.left=T2;
         // Update heigths
         X.height=max(height(X.left),height(X.right))+1;
         currRoot.height=max(height(currRoot.left),height(currRoot.right))+1;

        return X;
     }
      Node rightRotation(Node currRoot) {
         Node Y = currRoot.right; // X stores current right node
         Node T2 = Y.left; // T2 store the current subtree of the currRoot node

         // perform Rotations
         Y.right = T2;
         currRoot.left=Y;

         currRoot.height= max(height(currRoot.left),height(currRoot.left))+1;
         Y.height=max(height(Y.left),height(Y.right))+1;

         return Y;

     }
     // Get the balance factor
      int getBalance(Node N){
         if(N==null)
             return 0;
         return height(N.left)-height(N.right);
     }

    public  Node insert(Node node , int key ) {
        // Performing normal BST insertion
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplocate keys are not allowed
            return node;

        // Update height of its ancestor node
        node.height = 1 + max(height(node.left), height(node.right));

        // get the balance factor of the ancestor node
        int balance = getBalance(node);

        // if the node is inbalanced for steps
        // left left rotation
        if (balance > 1 && key < node.left.key)
            leftRotation(node);

        // Right Right rotation
        if (balance > 1 && key > node.right.key)
            rightRotation(node);

        // Left Right rotation
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        // Right Left rotation
        if (balance > 1 && key < node.right.key) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }

        return node;

    }
        // function to print the tree (Preoder)
        void preOrder (Node node){
            if (node != null) {
                System.out.print(node.key + " ");
                preOrder(node.left);
                preOrder(node.right);
            }

        }

    public static void main(String[] args) {
        TreeRotationAVL tree = new TreeRotationAVL();
        
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        tree.preOrder(tree.root);
    }
}

