import java.util.HashMap;
import java.util.Map;

//   int[] nums = {1,2,3,1,1,3};
class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] A) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                count += map.get(A[i]);

                System.out.print(map.get(A[i]) + 1);
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }

        }
        return count;
    }

}
