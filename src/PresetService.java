import java.util.ArrayList;
import java.util.List;

public class PresetService {

	private List<PresetDetails> presets;

	// CRUD

	public PresetService() {
		presets = new ArrayList<PresetDetails>();
	}

	// Create
	public void save(PresetDetails presetDetails) {
		for (int i = 0; i < presets.size(); i++) {
			if (presets.get(i).getPresetName().equals(presetDetails.getPresetName())) {
				System.out.println("Preset name already used !!!");
				return;
			}
		}
		presets.add(presetDetails);
	}

	// Read
	public PresetDetails get(String presetName) {
		for (PresetDetails preset : presets) {
			if (preset.getPresetName().equals(presetName)) {
				return preset;
			}
		}
		return null;
	}
		
	// Read all
	public PresetDetails getAll() {
		for (PresetDetails preset : presets) {
			// if (preset.getPresetName().equals(presetName)) {
			return preset;
		}
		// }
		return null;

	}

	// Update
	public void update(PresetDetails presetDetails) {
		for (int i = 0; i < presets.size(); i++) {
			if (presets.get(i).getPresetName().equals(presetDetails.getPresetName())) {
				presets.set(i, presetDetails);
				return;
			}
		}

	}

	// Delete
	public void delete(String presetName) {
		for (int i = 0; i < presets.size(); i++) {
			if (presets.get(i).getPresetName().equals(presetName)) {
				presets.remove(i);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "PresetService [presets=" + presets + "]";
	}
	
	

}
