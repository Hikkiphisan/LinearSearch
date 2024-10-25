public class LinearSearch {
    public void linearSearch(int[] arrays, int value) {
        int index = -1;
        for (int i = 0; i < arrays.length ; i++) {
            if (value == arrays[i]) {
                index = i;
                System.out.println(arrays[index]);
                break;
            }
            System.out.println(index);
        }

    }
}
