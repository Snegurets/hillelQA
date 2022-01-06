package Lesson14;

import java.util.HashSet;
import java.util.Iterator;

public class TaskHashSet {
    public static void main(String[] args) {

        //1
        HashSet<String> hash_set = new HashSet<>();
        hash_set.add("Green");
        hash_set.add("Blue");
        hash_set.add("Black");
        System.out.println(hash_set);

        //2
        Iterator<String> a = hash_set.iterator();
        while (a.hasNext()){
            System.out.println(a.next());
        }


    }
}
