package test;

import baseUrl.CollectAPIBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class C27_CollectApiNobetciEczane extends CollectAPIBaseUrl {
    @Test
    public void NobetciEcz(){
        specCollectApi.pathParams("pp1","health","pp2","dutyPharmacy")
                .queryParams("ilce","dörtyol","il","hatay");

        String token = "6QbiNb59f8m3UVjvA5qvmy:3660u4AkS6QldlUlC1XPvH";

        Response response = given()
                .spec(specCollectApi)
                .headers("authorization", "apikey " + token)
                .when()
                .get("/{pp1}/{pp2}");
        //System.out.println("statusCode = " + response.statusCode());
        response.prettyPrint();
    }
}