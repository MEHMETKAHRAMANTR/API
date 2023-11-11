package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C07_TekrarlardanKurtulma {

    /*
        https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request gonderdigimizde donen Response'un,
        status code'unun 200,
        ve content type'inin application/json, ve response body'sindeki
        "firstname"in, "Mark",
        ve "lastname"in, "Jones",
        ve "totalprice"in, 615,
        ve "depositpaid"in, true,
     ve "additionalneeds"in, "Breakfast" oldugunu test edin
    */

    @Test
    public void repeat(){
        //End point hazırlama
        String url="https://restful-booker.herokuapp.com/booking/10";
        //expected Body verilmediği için hazırlanmadı
        //Response Kaydet
        Response response=given().when().get(url);

        response.then().assertThat().statusCode(200).contentType("application/json")
                .body("firstname",equalTo("Mark"),
                        "lastname", equalTo("Jones"),
                        "totalprice", equalTo(615),
                        "depositpaid", equalTo(true),
                        "additionalneeds", equalTo("Breakfast"));

    }

}
