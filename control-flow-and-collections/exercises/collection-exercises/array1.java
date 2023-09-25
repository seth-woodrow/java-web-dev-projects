import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        System.out.println(Arrays.toString(integerArray));

        String phrase= "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
