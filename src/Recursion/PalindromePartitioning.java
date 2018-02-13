package Recursion;

public class PalindromePartitioning {
	public ArrayList<ArrayList<String>> partition(String a) {
	    
	    if (a.length() == 0)
	        return new ArrayList<ArrayList<String>>();
	        
	   
	    
	    ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
	    
	    for (int length = 1; length <= a.length(); length++){
	        ArrayList<String> row = new ArrayList<String>();
	        String st = a.substring(0, length);
	        
	        if (isPalindrome(st)){
	            row.add(st);
	            if (length == a.length()){
	                ans.add(row);
	            }else{
	                ans = findPartition(ans, row, a.substring(length));
	            }
	        }
	    }
	    
	    return ans;
	}
	
	ArrayList<ArrayList<String>> findPartition(ArrayList<ArrayList<String>> ans, ArrayList<String> row, String a){
	    
	    
	    for (int length = 1; length <= a.length(); length++){
	        ArrayList<String> curRow = new ArrayList<String>();
	    
    	    for (int i = 0; i < row.size(); i++){
    	        curRow.add(row.get(i));
    	    }
    	    
    	    String st = a.substring(0, length);
	        
	        if (isPalindrome(st)){
	            curRow.add(st);
	            if (length == a.length()){
	                ans.add(curRow);
	            }else{
	                ans = findPartition(ans, curRow, a.substring(length));
	            }
	        }
	    }
	    
	    return ans;
	}
	
	boolean isPalindrome(String st){
	    char[] ch = st.toCharArray();
	    
	    for (int i = 0; i < ch.length / 2; i++){
	        if (ch[i] != ch[ch.length - 1 - i])
	            return false;
	    }
	    
	    return true;
	}}

}
