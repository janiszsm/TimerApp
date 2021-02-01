import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IntervalManager {
	
	private Map<PresetDetails, List<Interval>> allIntervals;
	
	public IntervalManager() {
		allIntervals = new HashMap<>();
	}

	public void add(PresetDetails preset, Interval interval) {


		List<Interval> presetIntervals;
		if (allIntervals.containsKey(preset)) {
			presetIntervals = allIntervals.get(preset);
			
		} else {
			presetIntervals = new ArrayList<Interval>();
			allIntervals.put(preset, presetIntervals);
			
		}
		presetIntervals.add(interval);
	}
	
	public void addAll(PresetDetails preset, List<Interval> intervals) {
		allIntervals.put(preset, intervals);
		
		
	}
	public List<Interval> getAll(PresetDetails preset) {
		return allIntervals.get(preset);
	
	}
	public void update(PresetDetails presets, List<Interval> intervals) {
		System.out.println("preset: " + presets + ", interval: " + intervals);
	
	}
	
	public void removeAll(PresetDetails presets) {
		List<Interval> presetIntervals2 = allIntervals.get(presets);
		if (presetIntervals2 == null) {
			return;
		}
		presetIntervals2 = new ArrayList<Interval>();
//		allIntervals.put(preset, presetIntervals);
	}


	@Override
	public String toString() {
		return "IntervalManager [allIntervals=" + allIntervals + "]";
	}
	

}
