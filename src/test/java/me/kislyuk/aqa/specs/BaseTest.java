package me.kislyuk.aqa.specs;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import me.kislyuk.aqa.api.InternalApiClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class BaseTest {

    protected static WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8888));
    protected static InternalApiClient client;

    protected String currentToken;

    @BeforeAll
    static void setup() {
        if (!wireMockServer.isRunning()) {
            wireMockServer.start();
        }
        configureFor("localhost", 8888);

        client = new InternalApiClient("http://localhost:8080");

        RestAssured.filters(
                new RequestLoggingFilter(),
                new ResponseLoggingFilter(),
                new AllureRestAssured()
        );
    }

    @AfterEach
    void clearSession() {
        if (currentToken != null) {
            client.logout(currentToken);
            currentToken = null;
        }
    }


    @AfterAll
    static void tearDown() {
        if (wireMockServer.isRunning()) {
            wireMockServer.stop();
        }
    }

    protected String generateValidToken() {
        return java.util.UUID.randomUUID().toString()
                .replace("-", "")
                .toUpperCase();
    }

}
