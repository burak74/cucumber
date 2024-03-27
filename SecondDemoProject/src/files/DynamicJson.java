package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test(dataProvider = "BooksData")
	public void addBook(String isbn, String aisle) {
		
		RestAssured.baseURI ="http://216.10.245.166";
		String resp = given().header("Content-Type","application/json")
		.body(payload.Addbook(isbn,aisle)).
		when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
		
		
		JsonPath js = ReUsableMethods.rawToJson(resp);
		String id = js.get("ID");
		
		System.out.println(id);
	}
	
	@DataProvider(name = "BooksData")
	public Object[][] getData(){
		
		
		return new Object[][] {{"kitap1", "1001"},{"kitap2","1002"},{"kitap3","1003"}};
	}

}
