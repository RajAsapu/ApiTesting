package steps;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.Category;
import model.Promotions;
import org.junit.Assert;

import java.io.IOException;

public class ApiTestSteps {

    public static final String SANDBOX_ENDPOINT = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
    private Response response = null;
    private ObjectMapper objectMapper = null;
    private Category category = null;

    public ApiTestSteps() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    }

    @Given("^the user has access to sandbox end point$")
    public void the_user_has_access_to_sandbox_end_point() {
        // Place holder - Intended to validate access using headers
    }

    @When("^the user hits the sandbox end point$")
    public void the_user_hits_the_sandbox_end_point() {
        response = RestAssured.given().when().get(SANDBOX_ENDPOINT).thenReturn();
    }

    @Then("^the response code should be (.*)$")
    public void the_response_code_should_be(Integer statusCode) {
        Assert.assertTrue("Response code doesn't match , Expected:" + statusCode + ", Actual:" + response.getStatusCode(), response.getStatusCode() == statusCode);
    }

    @Then("^the value of name should be \"(.*)\"$$")
    public void the_value_of_name_should_be_carbon_credits(String compare) {
        try {
            category = objectMapper.readValue(response.asString(), Category.class);
            Assert.assertTrue("Name is not " + compare, category.getName().equals(compare));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("^the value of canReList should be true$")
    public void the_value_of_canrelist_should_be() {
        try {
            category = objectMapper.readValue(response.asString(), Category.class);
            Assert.assertTrue("canReList is not true", category.getCanRelist());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("^the value of promotion element with name gallery should have description \'(.*)\' in it$")
    public void the_value_of_promotion_element_with_name_gallery_should_have_description_as(String string) {
        try {
            category = objectMapper.readValue(response.asString(), Category.class);
            for (Promotions promotion : category.getPromotions()) {
                if (promotion.getName().equals("Gallery")) {
                    Assert.assertTrue("Description is not 2x larger image", promotion.getDescription().contains("2x larger image"));
                }
            }
            Assert.assertTrue("canReList is not true", category.getCanRelist());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
