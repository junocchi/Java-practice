
public class TypeCasting {
	public static void main(String[] args) {
		
//		byte<short<int<long <float<double
		
		float x=3.4f;
		long y=130;
		
		float result=x+y;
		System.out.println(result);
		//outputs 133.4
		
		
		//If you try to set result as "long" it will show:
		//Type mismatch: cannot convert from float to long
		//because we cannot fit an elephant in a dog's house.
	}
}
