import java.util.ArrayList;
import java.util.Collection;

class CollectionDemo{
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(87);
        marks.addLast(89);
        marks.addFirst(101);
        marks.add(2, 56);

        System.out.println(marks);
        System.out.println("Size of array is - "+marks.size());
    }
}