import java.util.Scanner;

class node{
    node left;
    node right;
    int data;

    boolean color;

    node(int data){
        this.data = data;
        left = null;
        right = null;

        color = true;
    }
}

public class LRBTREE{
    private static node root = null;

node rotateLeft(node myNode){
    System.out.printf("поворот влево!!!\n");
    node child = myNode.right;
    node childLeft = child.left;

    childLeft = myNode;
    myNode.right = childLeft;

    return child;
}

node rotateRight(node myNode){
    System.out.printf("правый разворот!!!\n");
    node child = myNode.left;
    node childRight = child.right;

    child.right = myNode;
    myNode.left = childRight;

    return child;
}

boolean isRed(node myNode){
    if (myNode == null){
        return false;
    }
    return (myNode.color = true);
}

void swapColors(node node1, node node2){
    boolean temp = node1.color;
    node1.color = node2.color;
    node2.color = temp;
}

node insert(node myNode, int data){
    if (myNode == null){
        return new node(data);
    }
    if (data < myNode.data){
        myNode.left = insert(myNode.left, data);
    }else if (data > myNode.data){
        myNode.right = insert(myNode.right, data);
    }else{
        return myNode;
    }

    if (isRed(myNode.right) && !isRed(myNode.left)){
        myNode = rotateLeft(myNode);

        swapColors(myNode, myNode.left);
    }

    if (isRed(myNode.left) && !isRed(myNode.left.left)){
        myNode = rotateRight(myNode);
        swapColors(myNode, myNode.right);

    }
    
    if (isRed(myNode.left) && isRed(myNode.right)){
        myNode.color = !myNode.color;

        myNode.left.color = false;
        myNode.right.color = false;
    }

    return myNode;

}

void inOrder(node node){
    if (node != null){
        inOrder(node.left);
        char c = ;

    }
}

}



