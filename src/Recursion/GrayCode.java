package Recursion;

public class GrayCode {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res = solve(n);
        return res;
    }

    private ArrayList<Integer> solve(int n) {
        if (n == 0) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(0);
            return res;
        }
        ArrayList<Integer> prev = solve(n - 1);

        for (int i = prev.size() - 1; i>=0; i--) {
            int num = prev.get(i);
            num |= (1 << (n - 1));
            prev.add(num);
        }
        return prev;
    }
}
