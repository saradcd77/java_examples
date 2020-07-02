
// Roman to Integer (LeetCode Easy problem#13)
import java.util.Hashmap;

class RomanToInteger {
	public static int romanToInt(String s){
		Map <Character, Integer> map = new Hashmap <> ();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C',100);
		map.put('D', 500);
		map.put('M', 1000);
		int sum = 0;
		for (int i = 0; i < s.length() -1; i++){
			if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
				sum -= map.get(s.charAt(i));
			else
				sum += map.get(s.charAt(i));
		}
		sum += map.get(s.charAt(s.length() -1 ));
		return sum;
	}

	public static void main(String [] args){
		System.out.println(romanToInt("IX")); 
		System.out.println(romanToInt("LVIII")); 
	}
}