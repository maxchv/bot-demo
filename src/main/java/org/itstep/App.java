package org.itstep;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class App {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi =
                new TelegramBotsApi(DefaultBotSession.class);
        //telegramBotsApi.registerBot(new EchoBot());
        telegramBotsApi
                .registerBot(new DemoBot("1429794334:AAGEJWBSK3FVz5lv1TPA_hbwkIkQAScKwtI", "so_tasty_bot"));
    }
}
