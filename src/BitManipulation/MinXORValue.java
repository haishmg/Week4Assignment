package BitManipulation;

public class MinXORValue {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<A.size()-1; i++) {
            int xor = A.get(i) ^ A.get(i+1);
            min = Math.min(min, xor);
        }
        
        return min;
    }
}
