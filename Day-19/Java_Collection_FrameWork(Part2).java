import java.util.*;
public class HashSetBasics {
    public static void main(String[] args){
        Set<Integer> st = new HashSet();
        Set<Integer> st2 = new HashSet();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);

        st2.add(10);
        st2.add(20);
        st2.add(3);
        st2.add(4);
        st2.add(5);
        st2.add(6);
        System.out.println(st2);

        //Retain all-->it only shows the itercation element
        st.retainAll(st2);
        System.out.println(st);

        System.out.println(st.containsAll(st2));



    }
}
