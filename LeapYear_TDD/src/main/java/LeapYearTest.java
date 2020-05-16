
import java.util.function.Predicate;

public class LeapYearTest{
	
	Predicate<Integer> leapPredicate = (x) -> { if(x%4 == 0){
			return true;
		}else 
			return false;
	};
	
	public boolean leapTest(int x) {
	 if(leapPredicate.test(x)) {
		 return true;
	 }
	 else 
		 return false;
	}
	
}