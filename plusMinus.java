public static void plusMinus(List<Integer> arr) {
    int positives = 0;
    int negatives = 0;
    int zeros = 0;

    for (int num : arr) {
        if (num > 0) positives++;
        else if (num < 0) negatives++;
        else zeros++;
    }

    int total = arr.size();

    System.out.printf("%.6f\n", (double) positives / total);
    System.out.printf("%.6f\n", (double) negatives / total);
    System.out.printf("%.6f\n", (double) zeros / total);
}
