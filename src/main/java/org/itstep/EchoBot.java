package org.itstep;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.LocalDateTime;

public class EchoBot extends TelegramLongPollingBot {
    public String getBotUsername() {
        return "so_tasty_bot";
    }

    public String getBotToken() {
        return "1429794334:AAGEJWBSK3FVz5lv1TPA_hbwkIkQAScKwtI";
    }

    public void onUpdateReceived(Update update) {
        System.out.println("Received at: " + LocalDateTime.now());
        if(update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            if(message.contains("hi")) {
                message = "И тебе привет";
            }
            Long chatId = update.getMessage().getChatId();
            SendMessage sendMessage = new SendMessage(String.valueOf(chatId), message);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }
}
