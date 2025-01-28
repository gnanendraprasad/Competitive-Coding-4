/*
 * Time complexity: O(n), where n is the length of the array, as we iterate through the array once.
 * Space complexity: O(1), as no additional space is used other than variables.
 */
static int[] maxSubarray(int[] arr) {
    if (arr.length == 1) return new int[]{arr[0], arr[0]};

    int maxSumSubArray = arr[0];
    int maxSumSubSeq = arr[0];

    for (int i = 1; i < arr.length; i++) {
        maxSumSubSeq = Math.max(maxSumSubSeq, Math.max(arr[i], arr[i] + maxSumSubSeq));

        arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);

        if (arr[i] > maxSumSubArray) {
            maxSumSubArray = arr[i];
        }
    }

    return new int[]{maxSumSubArray, maxSumSubSeq};
}
