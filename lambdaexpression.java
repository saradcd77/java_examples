import java.util.function.*;

class Square {

	public static int squareIt(int n)
	{
		return n*n;
	}
	public static void main(String [] args)
	{
		System.out.println("The Square of 5:"+squareIt(5));
		System.out.println("The Square of 6:"+squareIt(6));
	}
}

class Square {

	public static void main(String [] args)
	{
		Function <Integer, Integer> f = i-> i*i;
		System.out.println("The square of 7:"+f.apply(7));
		System.out.println("The square of 8:"f.apply(8));
	}
}