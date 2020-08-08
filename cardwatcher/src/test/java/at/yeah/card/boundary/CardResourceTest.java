package at.yeah.card.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CardResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/card")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}