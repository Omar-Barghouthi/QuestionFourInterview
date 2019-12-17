package sample;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 8, 3, 4, 5};
        int[] labels = {3, 2, 2, 1, 1};
        int number_wanted = 3;
        int label_limit = 2;
        int sum = 0;
        int count = 0;
        int max =0;
        for (int i = 0; i < labels.length; i++) {
            count =0;
            sum = 0;
            for (int j = i; j < values.length; j++) {
                if (labels[j] <= label_limit && count < number_wanted) {
                    sum += values[j];
                    count++;
                }
                if (max < sum )
                    max = sum;
            }
        }
        System.out.println(max);
    }
}
