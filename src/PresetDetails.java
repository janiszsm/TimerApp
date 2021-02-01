
public class PresetDetails { 
	
	private String presetName;
	private int preparationTime;
	private int duration;
	
	public PresetDetails(String presetName) {
		this (presetName, 0, 0);
	}

	
	public PresetDetails(String presetName, int preparationTime, int duration) {
		this.presetName = presetName;
		this.preparationTime = preparationTime;
		this.duration = duration;
	}

	public String getPresetName() {
		return presetName;
	}
	public void setPresetName(String presetName) {
		this.presetName = presetName;
	}
	public int getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "PresetDetails [presetName=" + presetName + ", preparationTime=" + preparationTime + ", duration="
				+ duration + "]";
	}
	
	

	
}
