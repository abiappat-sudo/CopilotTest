import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args)
    {
        //crete names object

        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("Doe");

        //find duplicate names
        //findDuplicateNames(names);

        //create a list to store duplicate names
        List<String> duplicateNames = new ArrayList<String>();



        //iterate through the names list
        for (String name : names) {
            //get the name at index I
            //check if the name is already in the duplicate names list
            //System.out.println(name);
            if (duplicateNames.contains(name)) {
                //if the name is already in the duplicate names list, print it
                System.out.println(name);
            } else {
                //if the name is not in the duplicate names list, add it to the list
                duplicateNames.add(name);
            }
        }

        //print the duplicate names list
        System.out.println(duplicateNames);

        System.out.println("/n This is runner program");
    }


}
