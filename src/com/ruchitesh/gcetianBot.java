package com.ruchitesh;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class gcetianBot extends TelegramLongPollingBot {
    private final String botToken=giveMeMyToken.getBotToken();
    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()&&update.getMessage().hasText()) {
            SendMessage replyOfBot = new SendMessage().setChatId(update.getMessage().getChatId());
            replyOfBot.setText(update.getMessage().getText());

            try {
                execute(replyOfBot);
            }catch (TelegramApiException e){
                e.printStackTrace();
            }
        }

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
