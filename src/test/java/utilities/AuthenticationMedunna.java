package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {

    //burda hoca main methodu token i gormemiz icin koydu
    /*
    public static void main(String[] args) {
        generateToken();
        System.out.println("generateToken() = " + generateToken());
    }

     */

    public static String generateToken(){

        String body = "{ \"password\": \"Mark.123\", \"rememberMe\": true, \"username\": \"mark_twain\"}";

        Response response =given().contentType(ContentType.JSON).body(body).post("https://medunna.com/api/authenticate");

        return response.jsonPath().getString("id_token");
    }
}
