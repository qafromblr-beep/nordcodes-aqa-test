package me.kislyuk.aqa.specs;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import me.kislyuk.aqa.mock.ExternalServiceMocks;
import me.kislyuk.aqa.models.ApiResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("Авторизация")
public class LoginTests extends BaseTest {

    private final ExternalServiceMocks mocks = new ExternalServiceMocks();

    @Test
    @DisplayName("Успешная авторизация пользователя (LOGIN)")
    @Description("Проверка, что при валидном токене и успешном ответе внешнего сервиса приложение возвращает OK")
    void testSuccessfulLogin() {
        // Данные для теста (в будущем заменим на генератор)
        currentToken = generateValidToken();

        // 1. Настраиваем мок внешнего сервиса (имитируем успех /auth)
        mocks.setupAuthResponse(currentToken, 200);

        // 2. Выполняем запрос через наш клиент
        ApiResponse response = client.login(currentToken);

        // 3. Проверяем результат
        assertEquals("OK", response.getResult(), "Ожидался статус OK в поле result");
    }

    @Test
    @DisplayName("Ошибка авторизации: внешний сервис недоступен")
    void testFailedLoginExternalServiceError() {
        currentToken = generateValidToken();

        // Настраиваем мок на ошибку (500)
        mocks.setupAuthResponse(currentToken, 500);

        ApiResponse response = client.login(currentToken);

        assertEquals("ERROR", response.getResult());
    }
}
