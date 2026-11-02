package me.kislyuk.aqa.specs;

import io.qameta.allure.Feature;
import me.kislyuk.aqa.mock.ExternalServiceMocks;
import me.kislyuk.aqa.models.ApiResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("Завершение сессии (LOGOUT)")
public class LogoutTests extends BaseTest {
    private final ExternalServiceMocks mocks = new ExternalServiceMocks();

    @Test
    @DisplayName("LOGOUT удаляет токен из хранилища")
    void testLogoutRemovesToken() {
        currentToken = generateValidToken();

        mocks.setupAuthResponse(currentToken, 200);
        client.login(currentToken);

        ApiResponse logoutResponse = client.logout(currentToken);
        assertEquals("OK", logoutResponse.getResult());

        ApiResponse actionResponse = client.action(currentToken);
        assertEquals("ERROR", actionResponse.getResult());
    }
}
