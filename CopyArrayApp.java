import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
    public static void main(String[] args) {

        int nVals = args.length;
        // to create a new array of ints
        int[] myVals = new int[nVals];
        //create a new list of ints
        ArrayList<Integer> uniqueVals = new ArrayList<>();

        for (int i = 0; i < nVals; i++) {
            int item = Integer.parseInt(args[i]);
            // to allocate a value into the created array at index i
            myVals[i] = item;
            if (uniqueVals.contains(item) == false) {
                uniqueVals.add(item);
            }
        }
        System.out.println("original values: " + Arrays.toString(myVals));
        System.out.println("unique values: " + uniqueVals);
    }
}