package me.kislyuk.aqa.specs;

import io.qameta.allure.Feature;
import me.kislyuk.aqa.mock.ExternalServiceMocks;
import me.kislyuk.aqa.models.ApiResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("Выполнение действий (ACTION)")
public class ActionTests extends BaseTest {
    private final ExternalServiceMocks mocks = new ExternalServiceMocks();

    @Test
    @DisplayName("Успешный ACTION после LOGIN")
    void testActionAfterLogin() {
        currentToken = generateValidToken();

        // Авторизуемся
        mocks.setupAuthResponse(currentToken, 200);
        client.login(currentToken);

        // Выполняем действие
        mocks.setupActionResponse(currentToken, 200);
        ApiResponse response = client.action(currentToken);
        assertEquals("OK", response.getResult());
    }

    @Test
    @DisplayName("Ошибка ACTION без предварительного LOGIN")
    void testActionWithoutLogin() {
        currentToken = generateValidToken();
        // LOGIN не вызываем
        ApiResponse response = client.action(currentToken);

        assertEquals("ERROR", response.getResult());
        assertEquals("Token '" + currentToken + "' not found", response.getMessage());
    }
}
