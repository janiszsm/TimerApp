import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("Timer App Started !!!!  ");
		System.out.println("---------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		String input = "";

		while (!input.equals("X")) {
			System.out.println("To start  timer press S: ");
			System.out.println("To edit presets press E: ");
			System.out.println("To exit app press X: ");
			System.out.println("---------------------------------------------------");


			input = sc.next().toUpperCase();


			switch (input) {
			case "S":
				System.out.println("---------------------------------------------------");
				System.out.println("Timer App Under Construction...  ");
				System.out.println("---------------------------------------------------");
				break;
			case "E":
				presetEdit();
				break;


			}

		}
		sc.close();
	}
	
	public static void presetEdit() {

		PresetService presetService = new PresetService();
		String input = "";
		Scanner sc = new Scanner(System.in);

		while (!input.equals("X")) {
			System.out.println("---------------------------------------------------");
			System.out.println("To list presets press L: ");
			System.out.println("To create presets press C: ");
			System.out.println("To edit presets press E: ");
			System.out.println("To exit press X: ");
			System.out.println("---------------------------------------------------");

			input = sc.next().toUpperCase();

			switch (input) {
			case "L":
				System.out.println("Presets: " + presetService.getAll());
				break;
			case "C":
				System.out.print("Enter Preset name: ");
				String presetName = sc.next().toUpperCase();
				System.out.print("Enter time to prepare in seconds: ");
				int prepareTime = sc.nextInt();
				System.out.print("Enter total time of meditation: ");
				int totalTime = sc.nextInt();
				presetService.save(new PresetDetails(presetName, prepareTime, totalTime));
				break;
			case "E":
				break;


			}

		}

	}
		
		
//		PresetDetails testzz1 = new PresetDetails("Test", 0, 10);
//		System.out.println("Input check: " + testzz1);
//		
//		PresetDetails testzz2 = new PresetDetails("Test only Name");
//		System.out.println("Input check: " + testzz2);
//		System.out.println("---------------------------------");
//		
//		System.out.println("Test before save: " + presetService);
//		System.out.println("---------------------------------");
//		
//		
//		System.out.println("Test for multiple save: " + presetService);
//		presetService.save(testzz1); //test for identical preset name
//		presetService.save(testzz1);
//		presetService.save(testzz1);
//		presetService.save(testzz1);
//
//		presetService.save(testzz2);
//		System.out.println("---------------------------------");
//		
//		System.out.println("Test after save: " + presetService);
//		
//		System.out.println("---------------------------------");
//		
//		PresetDetails testzz11 = presetService.get("Test");
//		System.out.println("Back reading preset 'Test' ---> " + testzz11);
//		PresetDetails testzz22 = presetService.get("Test only Name");
//		System.out.println("Back reading preset 'Test only Name' ---> " + testzz22);
//		
//		System.out.println("---------------------------------");
//		
//			
//		PresetDetails testzzSwap = new PresetDetails("Test", 2, 20);
//		presetService.update(testzzSwap);
//		testzz1 = presetService.get("Test");
//		System.out.println("Update Test done --> 'Test', 2, 20 --> " + testzz1);
//		
//		System.out.println("---------------------------------");
//		
//		presetService.delete("Test");
//		testzz2 = presetService.get("Test");
//		System.out.println("Delete Test 1 !!! " + testzz2);
//		
//		presetService.delete("Test");
//		testzz2 = presetService.get("Test");
//		System.out.println("Delete Test 2 !!! " + testzz2);
//		
//		presetService.delete("Test");
//		testzz2 = presetService.get("Test");
//		System.out.println("Delete Test 3 !!! " + testzz2);
//		
//		System.out.println("---------------------------------");
//		
//		System.out.println("Final List read after deletes --> 'Test only Name',0,0 -->  " + presetService);
//		
//		System.out.println("---------------------------------");
		
//				
//		IntervalManager intervalManager = new IntervalManager();
//		
//		
//		PresetDetails testzz111 = presetService.get("Test only Name");
//		intervalManager.add(testzz111, new Interval(11));
//		intervalManager.add(testzz111, new Interval(22));
//		
//		intervalManager.add(testzz111, new Interval(44));
//		
//	
//		
//		System.out.println("Hash map save test ---> " + intervalManager);
//		
//		
//		System.out.println(testzz111);
//		intervalManager.removeAll(testzz111);
//		System.out.println("Hash map all intervals delete test ---> " + intervalManager);
		
//		List<Object> objects2 = Arrays.asList(object);
		

	

}
