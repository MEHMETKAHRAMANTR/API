package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class C08_JSONArrayKullanimi {
     /*
        {
        "firstName": "John",
        "lastName": "doe",
        "age": 26,
        "address": {
            "streetAddress": "naist street",
            "city": "Nara",
            "postalCode": "630-0192"
                    },
        "phoneNumbers": [
                        {
                            "type": "iPhone",
                            "number": "0123-4567-8888"
                        },
                        {
                            "type": "home",
                            "number": "0123-4567-8910"
                        }
                        ]
        }
 */
    @Test
    public void JsonArray(){
        JSONObject ceptel=new JSONObject();
        ceptel.put("type", "iPhone");
        ceptel.put("number", "0123-456-8888");

        JSONObject evtel=new JSONObject();
        evtel.put("type", "home");
        evtel.put("number", "0123-456-8910");

        JSONArray phoneNumbers=new JSONArray();
        phoneNumbers.put(0,ceptel);
        phoneNumbers.put(1,evtel);

        JSONObject adres=new JSONObject();
        adres.put("streetAddress","naist street");
        adres.put("city","Nara");
        adres.put("postalCode","630-0192");

        JSONObject personelInfo=new JSONObject();
        personelInfo.put("firstName","Jhon");
        personelInfo.put("LastName","doe");
        personelInfo.put("age",26);
        personelInfo.put("address",adres);
        personelInfo.put("phoneNumbers",phoneNumbers);

        System.out.println("personelInfo: "+personelInfo);
        
    }

}
