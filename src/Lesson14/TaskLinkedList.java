package Lesson14;

import java.util.*;

public class TaskLinkedList {

    public static void main(String[] args) {

        //1
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        linked_list.add("Green");
        System.out.println(linked_list);

        //2
        for (String element : linked_list){
            System.out.println(element);
        }

        //3

        Iterator<String> index = linked_list.listIterator(0);
        while (index.hasNext()){
            System.out.println(index.next());
        }

        //4
        Iterator<String> iterator = linked_list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //5
        linked_list.add(2, "Blue");
        System.out.println(linked_list);

        //6
        linked_list.addFirst("Red");
        linked_list.addLast("Red");
        System.out.println(linked_list);

        //7
        linked_list.offerFirst("Yellow");
        System.out.println(linked_list);

        //8
        linked_list.offerLast("Yellow");
        System.out.println(linked_list);

        //9
        LinkedList<String> linked_list1 = new LinkedList<>();
        linked_list1.add("Orange");
        linked_list1.add("Grey");
        linked_list.addAll(1,linked_list1);
        System.out.println(linked_list);

        //10
        System.out.println("First: " + linked_list.getFirst() + "; Last: " + linked_list.getLast());

        //11
        for ( int i = 0; i < linked_list.size(); i++){
            System.out.println("Index: " + i + " " + linked_list.get(i));
        }

        //12
        linked_list.remove(2);
        System.out.println(linked_list);

        //13
        linked_list.removeFirst();
        linked_list.removeLast();
        System.out.println(linked_list);

        //14
        linked_list.clear();
        System.out.println(linked_list);

        //15
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        linked_list.add("Green");
        System.out.println(linked_list);
        Collections.swap(linked_list,1,3);
        System.out.println(linked_list);

        //16
        Collections.shuffle(linked_list);
        System.out.println(linked_list);

        //17
        LinkedList<String> linked_list2 = new LinkedList<>();
        linked_list2.add("Red");
        linked_list2.add("Orange");
        linked_list2.add("Grey");

        LinkedList<String> linked_list3 = new LinkedList<>();
        linked_list3.addAll(linked_list);
        linked_list3.addAll(linked_list2);
        System.out.println(linked_list3);

        //18
        linked_list3 = (LinkedList<String>)linked_list.clone();
        System.out.println(linked_list3);

        //19
        linked_list.pop();
        System.out.println(linked_list);

        //20
        String peek = linked_list.peekFirst();
        System.out.println(peek);

        //21
        String peek1 = linked_list.peekLast();
        System.out.println(peek1);

        //22
        if (linked_list.contains("Black")){
            System.out.println("Found the element.");
        } else {
            System.out.println("Not found.");
        }

        //23
        List<String> arrList = new ArrayList<>(linked_list);
        for (String string : arrList)
        System.out.println(string);

        //24
        LinkedList<String> linked_list5 = new LinkedList<>();
        for (String i : linked_list)
            linked_list5.add(linked_list2.contains(i) ? "Yes" : "No");
        System.out.println(linked_list5);

        //25
        linked_list.removeAll(linked_list);
        System.out.println(linked_list);

        //26
        linked_list2.set(1, "Black");
        System.out.println(linked_list2);


    }
}
