package Default;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    /* static class Node<E>{
         E type ;
         Node node;
        public Node(){

        }*/
  /*  Lock lock = new ReentrantLock();
    Condition isAdded = lock.newCondition();
    Condition isRemoved = lock.newCondition();*/

private List<Integer> array ;
    private static int count ;
    public Stack (int size){
        array = new ArrayList<Integer>(size);
        count =0 ;
    }
    public Stack (){
        array = new ArrayList<Integer>();
        count =0 ;
    }

    public final boolean put(int element) {
        if(count==0){
            array.add(element);
            increment();
        }
        else {
            //////////unique elements 
            if (isPresent(element)) {
                return false;

            }
            array.add(element);
            increment();

        }
        return true;
    }

    private  void increment()  {
        synchronized(this){
            count++;

        }
        
    }
    private  void decrement()  {
        synchronized(this){
            count--;

        }

    }
    private boolean isPresent(int element) {
        for(int elements : array){
            if(element==elements){
              return true ;  
            }
        } 
        return false ;
    }

    public void check() {
        for(int elements : array){
            System.out.print(elements+" ");
            }
        System.out.println();
    }

    public void remove(int i) throws NoSuchFieldException {
        if(isPresent(i)){
            array.remove(i);
        }
        else{
            throw new NoSuchFieldException();
        }
    }
}
