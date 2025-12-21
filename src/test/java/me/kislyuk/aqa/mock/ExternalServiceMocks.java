package me.kislyuk.aqa.mock;

import io.qameta.allure.Step;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class ExternalServiceMocks {

    @Step("Мок внешнего сервиса: /auth для токена {token} вернет статус {status}")
    public void setupAuthResponse(String token, int status) {
        stubFor(post(urlEqualTo("/auth"))
                .withRequestBody(containing("token=" + token))
                .willReturn(aResponse()
                        .withStatus(status)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"status\":\"mocked\"}")));
    }

    @Step("Мок внешнего сервиса: /doAction для токена {token} вернет статус {status}")
    public void setupActionResponse(String token, int status) {
        stubFor(post(urlEqualTo("/doAction"))
                .withRequestBody(containing("token=" + token))
                .willReturn(aResponse()
                        .withStatus(status)));
    }
}
