package Recursion;

public class Permutations {
    public static ArrayList<ArrayList<Integer>> result;
    
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        if(A.size() == 0) {
            return null;
        }
        result = new ArrayList<ArrayList<Integer>>();
        permutation(new ArrayList<Integer>(), A);
        return result;
    }
    
    public static void permutation(ArrayList<Integer> ans, ArrayList<Integer> remain) {
        if(remain.size() == 0){
            result.add(ans);
        }
        else {
            for(int i=0; i<remain.size(); i++) {
                ArrayList<Integer> tempRemain = new ArrayList<Integer>(remain);
                tempRemain.remove(i);
                ArrayList<Integer> tempAns = new ArrayList<Integer>(ans);
                tempAns.add(remain.get(i));
                permutation(tempAns,tempRemain);
            }
        }
        return;
    }

}
