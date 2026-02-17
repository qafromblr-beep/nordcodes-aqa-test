package me.kislyuk.aqa.api;

import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import me.kislyuk.aqa.models.ApiResponse;
import static io.restassured.RestAssured.given;

public class InternalApiClient {

    private final String apiKey = "qazWSXedc";
    private final RequestSpecification spec;

    // Конструктор позволяет передавать URL (например, из BaseTest)
    public InternalApiClient(String baseUri) {
        this.spec = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setContentType(ContentType.URLENC) // Устанавливаем x-www-form-urlencoded
                .addHeader("X-Api-Key", apiKey)
                .addHeader("Accept", "application/json")
                .build();
    }

    @Step("Действие: LOGIN, токен: {token}")
    public ApiResponse login(String token) {
        return sendRequest(token, "LOGIN").as(ApiResponse.class);
    }

    @Step("Действие: ACTION, токен: {token}")
    public ApiResponse action(String token) {
        return sendRequest(token, "ACTION").as(ApiResponse.class);
    }

    @Step("Действие: LOGOUT, токен: {token}")
    public ApiResponse logout(String token) {
        return sendRequest(token, "LOGOUT").as(ApiResponse.class);
    }

    /**
     * Базовый метод для выполнения запроса.
     * Возвращает Response, чтобы мы могли проверить статус-код перед десериализацией.
     */
    @Step("Отправка POST запроса на /endpoint")
    public Response sendRequest(String token, String action) {
        return given()
                .spec(spec)
                .formParam("token", token)
                .formParam("action", action)
                .when()
                .post("/endpoint");
    }

    /**
     * Метод для негативных тестов (например, с неверным API ключом)
     */
    @Step("Запрос с кастомным API-ключом: {customKey}")
    public Response sendWithCustomKey(String token, String action, String customKey) {
        return given()
                .baseUri("http://localhost:8080")
                .header("X-Api-Key", customKey)
                .contentType(ContentType.URLENC)
                .formParam("token", token)
                .formParam("action", action)
                .post("/endpoint");
    }
}
