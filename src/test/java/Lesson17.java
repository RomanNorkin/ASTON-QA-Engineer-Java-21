import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Lesson16 {

    @Test
    public void lesson17GETRequest() {

        given()
                .baseUri("https://postman-echo.com")
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .log()
                .all();
    }

    @Test
    public void lesson17POSTRawText() {
        HashMap<String, String> rawtext = new HashMap<>();
        rawtext.put("This is expected to be sent back as part of response body.", "true");
        given()
                .baseUri("https://postman-echo.com/post")
                .body(rawtext)
                .when()
                .post()
                .then()
                .log()
                .all()
                .and()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo("{\"This is expected to be sent back as part of response body.\":\"true\"}"));
    }

    @Test
    public void lesson17POSTFormData() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("multipart/form-data; charset=utf-8")
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log()
                .body()
                .and()
                .statusCode(HttpStatus.SC_OK);
               
    }

    @Test
    public void lesson17PUTRequest() {

        given()
                .baseUri("https://postman-echo.com").body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .log()
                .body()
                .and()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void lesson17PATCHRequest() {

        given()
                .baseUri("https://postman-echo.com").body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .log()
                .body()
                .and()
                .statusCode(HttpStatus.SC_OK)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void lesson17DELETERequest() {

        given()
                .baseUri("https://postman-echo.com/delete").body("This is expected to be sent back as part of response body.")
                .when()
                .delete("data")
                .then()
                .log()
                .all()
                .and()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
