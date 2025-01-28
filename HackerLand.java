/*
Time complexity: O(n log n), where n is the length of the array due to the sorting step, and the rest is linear.
Space complexity: O(1), as no additional space is used apart from variables.
 */
static int hackerlandRadioTransmitters(int[] x, int k) {
    int n = x.length;
    int count = 0;
    int index = 0;

    Arrays.sort(x);

    while (index < n) {
        count++;
        int y = x[index] + k;

        while (index < n && x[index] <= y) {
            index++;
        }

        y = x[--index] + k;

        while (index < n && x[index] <= y) {
            index++;
        }
    }

    return count;
}
