import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RandomApiTest {

    @Test(description = "To verify one of Document", priority = 0)
    public void verifyDocument() {

        int statusCode = given()
                .when().get("https://www.mastercontrol.com/customapi/ResourceWidgetData/GetDocumentData/?legacyIds=1&lang=us").getStatusCode();
        System.out.println("The response status is " + statusCode);

    }

    @Test(description = "Post method usage")
    public void createUser()
    {
//        JSONObject data = new JSONObject();
//        data.put("id", "1");
//        data.put("username", "bilgehanguzin");
//        data.put("firstname", "bilgehan");
//        data.put("lastName", "guzin");
//        data.put("email", "bilgehanguzin@gmail.com");
//        data.put("password", "12312312412");
//        data.put("phone", "+905544574314");
//        data.put("userstatus", "0");
//
//        int statusCode = given().baseUri("https://petstore.swagger.io/").contentType(ContentType.JSON)
//                .body(data.toString())
//                .when()
//                .post("/v2/user")
//                .then()
//                .statusCode(200);
    }
}
