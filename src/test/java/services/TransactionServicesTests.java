package services;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;

public class TransactionServicesTests {


    @Test
    public void testFindByDate() {

        String url_format = "http://parabank.parasoft.com/parabank/services/bank/accounts/%s/transactions/onDate/%s";
        url_format = String.format(url_format, "12345", "07-30-2018");

        ValidatableResponse response = given().accept(ContentType.JSON).get(url_format).then();

        response.log().all();


        response.statusCode(200);
        response.body("size()", is(1));
//        response.body("id[0]", is(1000.0f));
        response.body("amount[0]", is(1000.f));

    }
}
