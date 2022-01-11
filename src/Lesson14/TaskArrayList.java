package Lesson14;
import java.util.*;

public class TaskArrayList {
    public static void main(String[] args) {

        //1
        ArrayList <String> list = new ArrayList<>();
        list.add("Black");
        list.add("White");
        System.out.println(list);

        //2
        for (String element : list){
            System.out.println(element);
        }

        //3
        list.add(1, "Pink");
        System.out.println(list);

        //4
        String element_index = list.get(0);
        System.out.println(element_index);

        //5
        list.set(2,"Green");
        System.out.println(list);

        //6
        list.remove(2);
        System.out.println(list);

        //7
        if (list.contains("Black")){
            System.out.println("Found the element.");
        } else {
            System.out.println("Not found.");
        }

        //8
        Collections.sort(list);
        System.out.println(list);

        //9
        List<String> list1 = new ArrayList<>();
        list1.add("Orange");
        list1.add("Blue");
        Collections.copy(list, list1);
        System.out.println(list);

        //10
        Collections.shuffle(list);
        System.out.println(list);

        //11
        Collections.reverse(list);
        System.out.println(list);

        //12
        List<String> subList = list.subList(0,2);
        System.out.println(subList);

        //13
        List<String> list2 = new ArrayList<>();
        for (String arr : list){
            list2.add(list1.contains(arr) ? "Yes" : "No");
            System.out.println(list2);
        }

        //14
        Collections.swap(list,0,1);
        System.out.println(list);

        //15
        List<String> list3 = new ArrayList<>();
        list3.add("Black");
        list3.add("White");
        List<String> all_list = new ArrayList<>();
        all_list.addAll(list3);
        all_list.addAll(list1);
        System.out.println(all_list);

        //16
        List<String> clone_list = (List<String>) list.clone();
        System.out.println(clone_list);

        //17
        list.removeAll(list);
        System.out.println(list);

        //18
        System.out.println(list.isEmpty());

        //19
        list.add("Black");
        list.trimToSize();
        System.out.println(list);

        //20
        list.ensureCapacity(3);
        System.out.println(list);

        //21

        list.add("Blue");
        list.add("Black");
        list.add("White");
        String new_color = "Red";
        list.set(2,new_color);
        int num = list.size();
        for (int i = 0; i < num; i++)
            System.out.println(list.get(i));

        //22
        list.add("Blue");
        list.add("Black");
        list.add("White");
        int no_of_elements = list.size();
        for (int i = 0; i < no_of_elements; i++)
            System.out.println(list.get(i));
    }
}
