package test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;



public class C10_Get_ExpectedDataHazirlama {
     /*
 https://jsonplaceholder.typicode.com/posts/22 url'ine
 bir GET request yolladigimizda donen response body'sinin
 asagida verilen ile ayni oldugunu test ediniz

Response body :
 {
 "userId":3,
 "id":22,
 "title":"dolor sint quo a velit explicabo quia nam",
 "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"
 }
  */

    @Test
    public void getExp(){
        // Endpoint hazırlama
        String url="https://jsonplaceholder.typicode.com/posts/22";

        //Expected data hazırlama
        JSONObject exbody=new JSONObject();
        exbody.put("userId",3);
        exbody.put("id",22);
        exbody.put("title","dolor sint quo a velit explicabo quia nam");
        exbody.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");
        //3Response Kaydetme
        Response response=given().when().get(url);

        //4- Assertion İşlemi

        JsonPath resJP=response.jsonPath();

        Assert.assertEquals(exbody.get("userId"), resJP.get("userId"));
        Assert.assertEquals(exbody.get("id"), resJP.get("id"));
        Assert.assertEquals(exbody.get("title"), resJP.get("title"));
        Assert.assertEquals(exbody.get("body"), resJP.get("body"));


    }
}
