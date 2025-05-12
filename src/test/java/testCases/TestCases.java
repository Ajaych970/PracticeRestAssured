package testCases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class TestCases {

    RequestSpecification request= RestAssured.given();
    String baseUri="https://restful-booker.herokuapp.com";
    String basePath="";

    @Test
    public void getAllBook(){
        Response response = request.baseUri(baseUri)
                .basePath("/booking")
                .contentType(ContentType.JSON).get();

        System.out.println(response.asString());
    }

    @Test
    public void getBookingById(){
        request.baseUri(baseUri)
                .basePath("/booking/1")
                .contentType(ContentType.JSON).get();
    }
}
