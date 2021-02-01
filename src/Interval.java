import java.util.List;
import java.util.ArrayList;

public class Interval {
	
	private Integer intervals;

	public Interval(Integer intervals) {
		this.intervals = intervals;
	}
	
	public Interval(List<Interval> intervals) {
		
	}

	@Override
	public String toString() {
		return "Interval [intervals=" + intervals + "]";
	}
	

}
