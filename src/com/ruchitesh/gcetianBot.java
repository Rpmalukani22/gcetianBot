package com.ruchitesh;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class gcetianBot extends TelegramLongPollingBot {
    private final String botToken=
    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "gcetianBot";
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
