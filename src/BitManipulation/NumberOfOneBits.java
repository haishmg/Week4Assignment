package BitManipulation;

public class NumberOfOneBits {
	public int numSetBits(long a) {
	    int count = 0;
while (a > 0){
    count+= a%2;
    a = a>> 1;
}
return count;

}
}
