package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int countRecur = 0 ;
    private static int countAdvanced = 0 ;

    public static void main(String args[]) {
        List<Integer>   mainf = new ArrayList<Integer>();

        for(int j=0;j<=10;j++){
           mainf.add(j) ;
        }
        recu(mainf);
        System.out.println(countRecur+" Recur called  count");
        System.out.println(countAdvanced+" AdvancedRecur called  count");

    }


    private synchronized static List<Integer> recu(List<Integer> array) {countRecur++;
        System.out.println("Calling recur for "+ countRecur+" times"+" Array size "+array.size());


        List<Integer> left;List<Integer> right;
        if (array.size() == 1) {

            return array;

        } else {
             left = new ArrayList<Integer>();
             right = new ArrayList<Integer>();
             int j =getHalf(array) ;

            for (int i = 0; i <= array.size()-1; i++) {
                if (i < j) {
                    left.add(array.get(i));
                } else {
                    right.add(array.get(i));

                }
            }

        }
        List<Integer>newleft = recu(left);
        List<Integer>newright = recu(right);

        return recurAvanced(newleft, newright);
    }

    private static int getHalf(List<Integer> array) {
      if(array.size()%2==0) {
          return array.size()/2 ;
      } else if(array.size()==0){
          return 0;
        }
      else{
          return (array.size()+1)/2 ;

      }
    }

    private synchronized static List<Integer> recurAvanced(List<Integer> left, List<Integer> right) {countAdvanced++;
        System.out.println("Calling Advancedrecur for "+ countAdvanced+" times"+" Array size  Left:"+left.size()+" Right:"+right.size());
    //    left.remove(0);
    //    right.remove(0);
        left.addAll(right);
        return left;
    }


}
