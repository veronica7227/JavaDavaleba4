package demo1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class unic {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicateValues = new ArrayList<>();
        listWithDuplicateValues.add("veronika");
        listWithDuplicateValues.add("gela");
        listWithDuplicateValues.add("veronika");
        listWithDuplicateValues.add("nona");
        listWithDuplicateValues.add("giorgi");

        ArrayList uniqueList = (ArrayList) listWithDuplicateValues.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
