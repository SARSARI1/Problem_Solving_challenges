public static void miniMaxSum(List<Integer> arr) {
    Collections.sort(arr); // from min to max

    long minSum = 0L;
    long maxSum = 0L;

    // smallest 4: first 4 values
    for (int i = 0; i < 4; i++) {
        minSum += arr.get(i);
    }

    // largest 4: last 4 values
    for (int i = 1; i < 5; i++) {
        maxSum += arr.get(i);
    }

    System.out.println(minSum + " " + maxSum);
}

