import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PetstoreTest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        int petId = 123456789;

        // Criar um pet (POST)
        given()
                .header("Content-Type", "application/json")
                .body("{ \"id\": " + petId + ", \"name\": \"Doguito\", \"status\": \"available\" }")
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("name", equalTo("Doguito"))
                .body("status", equalTo("available"));

        // Buscar o pet (GET)
        given()
                .pathParam("petId", petId)
                .when()
                .get("/pet/{petId}")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(petId));

        // Atualizar o pet (PUT)
        given()
                .header("Content-Type", "application/json")
                .body("{ \"id\": " + petId + ", \"name\": \"Doguito Atualizado\", \"status\": \"sold\" }")
                .when()
                .put("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo("sold"));

        // Deletar o pet (DELETE)
        given()
                .pathParam("petId", petId)
                .when()
                .delete("/pet/{petId}")
                .then()
                .log().all()
                .statusCode(200);
    }
}
