import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		
		JsonPath js = new JsonPath(payload.CoursePrice());
		
		int count = js.getInt("courses.size()");
		
		System.out.println(count);
		
		//Print Purchase Amount

		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		String titleFirstCourse = js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		System.out.println("");
		
		
		String courseNames;

		System.out.println("Print no of copies sold by RPA Course");
		
		for (int i = 0; i < count; i++) {
			
			courseNames=js.get("courses[" + i + "].title");
			if (courseNames.equalsIgnoreCase("RPA")) {
				int copies = js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
				
			}
			
		}
	}

}
