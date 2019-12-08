package Default ;

import java.util.ArrayList;
import java.util.List;

class BinaryTree{
     /**
      * Binary tree implementation where left side takes values less than the current value
      * and the right side takes value greater than the current value
      *
       */
     private List<Node>Nodelist = new ArrayList<Node>();

    class Node{
      final  Tree left ;
      final  Tree right ;

        public Node(int count ,Tree parent ){
             this.left =parent.left;
             this.right = parent.right ;
        }


     }

     class Tree{
         Tree left ;
         Tree right ;
         int data ;

         /**
          * Constructor tree class
          * @param data the value to be put
          */
         public Tree(int data){
           this.data = data ;
             left = null ;
             right = null ;
         }}
         private Tree root ;

         /**
          * Put method to add items into the tree
          * @param value the value to be added
          */
         public void put(int value){
             Tree treeMake = new Tree(value);
             //checks if the tree is rootless .if true it assigns it the first item added

             if(root==null){
                 root =  treeMake ;
             }else{
                 Tree newParent = find(value);//to be parent
                 newParent.data = value ;

             }
         }




    private Tree find(int value) {
         Tree current = root ;
         if(current.data<value){
             if(current.right==null){
                 return current.right;
             }else{current=current.right;}
         }
         return null ;
     }

 }
