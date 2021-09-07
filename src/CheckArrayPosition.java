public class CheckArrayPosition {

    public static String hasArray(
            int[] arr, int sum) {
        String positions = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    if (positions.equals("")) {
                        positions = i + " and " + j;
                    } else {
                        positions = positions + ", " + i + " and " + j;
                    }
                }
            }
        }

        return positions;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8, 8, 8};
        int n = 16;

        if (hasArray(arr, n).equals("")) {
            System.out.println("No positions");
        } else {
            System.out.println("The positions are: " + hasArray(arr, n));
        }
    }
}



