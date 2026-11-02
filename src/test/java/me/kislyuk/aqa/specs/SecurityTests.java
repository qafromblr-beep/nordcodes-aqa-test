package me.kislyuk.aqa.specs;

import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

@Feature("Безопасность и Валидация")
public class SecurityTests extends BaseTest {

    @Test
    @DisplayName("Ошибка при неверном X-Api-Key")
    void testInvalidApiKey() {
        currentToken = generateValidToken();
        Response response = client.sendWithCustomKey(currentToken, "LOGIN", "wrong-key");

        response.then().body("result", equalTo("ERROR"));
    }

    @Test
    @DisplayName("Ошибка при невалидном формате токена")
    void testInvalidTokenFormat() {
        String invalidToken = "12345ABC";
        Response response = client.sendRequest(invalidToken, "LOGIN");

        response.then()
                .statusCode(400)
                .body("result", equalTo("ERROR"));
    }
}
