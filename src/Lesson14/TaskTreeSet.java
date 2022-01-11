package Lesson14;

import java.util.TreeSet;

public class TaskTreeSet {
    public static void main(String[] args) {

        //1
        TreeSet<String> tree_set = new TreeSet<>();
        tree_set.add("Red");
        tree_set.add("Black");
        tree_set.add("Blue");
        System.out.println(tree_set);

        //2
        for(String element : tree_set){
            System.out.println(element);
        }
    }
}
