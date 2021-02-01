import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PresetService presetService = new PresetService();
		System.out.println("Start !!!!  " + presetService);
		System.out.println("---------------------------------");
		
		PresetDetails testzz1 = new PresetDetails("Test", 0, 10);
		System.out.println("Input check: " + testzz1);
		
		PresetDetails testzz2 = new PresetDetails("Test only Name");
		System.out.println("Input check: " + testzz2);
		System.out.println("---------------------------------");
		
		System.out.println("Test before save: " + presetService);
		System.out.println("---------------------------------");
		
		
		System.out.println("Test for multiple save: " + presetService);
		presetService.save(testzz1); //test for identical preset name
		presetService.save(testzz1);
		presetService.save(testzz1);
		presetService.save(testzz1);

		presetService.save(testzz2);
		System.out.println("---------------------------------");
		
		System.out.println("Test after save: " + presetService);
		
		System.out.println("---------------------------------");
		
		PresetDetails testzz11 = presetService.get("Test");
		System.out.println("Back reading preset 'Test' ---> " + testzz11);
		PresetDetails testzz22 = presetService.get("Test only Name");
		System.out.println("Back reading preset 'Test only Name' ---> " + testzz22);
		
		System.out.println("---------------------------------");
		
			
		PresetDetails testzzSwap = new PresetDetails("Test", 2, 20);
		presetService.update(testzzSwap);
		testzz1 = presetService.get("Test");
		System.out.println("Update Test done --> 'Test', 2, 20 --> " + testzz1);
		
		System.out.println("---------------------------------");
		
		presetService.delete("Test");
		testzz2 = presetService.get("Test");
		System.out.println("Delete Test 1 !!! " + testzz2);
		
		presetService.delete("Test");
		testzz2 = presetService.get("Test");
		System.out.println("Delete Test 2 !!! " + testzz2);
		
		presetService.delete("Test");
		testzz2 = presetService.get("Test");
		System.out.println("Delete Test 3 !!! " + testzz2);
		
		System.out.println("---------------------------------");
		
		System.out.println("Final List read after deletes --> 'Test only Name',0,0 -->  " + presetService);
		
		System.out.println("---------------------------------");
		
				
		IntervalManager intervalManager = new IntervalManager();
		
		
		PresetDetails testzz111 = presetService.get("Test only Name");
		intervalManager.add(testzz111, new Interval(11));
		intervalManager.add(testzz111, new Interval(22));
		
		intervalManager.add(testzz111, new Interval(44));
		
	
		
		System.out.println("Hash map save test ---> " + intervalManager);
		
		
		System.out.println(testzz111);
		intervalManager.removeAll(testzz111);
		System.out.println("Hash map all intervals delete test ---> " + intervalManager);
		
//		List<Object> objects2 = Arrays.asList(object);
		

	}

}
