package org.example;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;

public class Main {
    public static void main(String[] args) {
        TelegramBot bot = new TelegramBot("5424627277:AAEMba6dgSMkNyoznHAx_LfSK6kclTfWqNQ");

// Register for updates
        bot.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                updates.forEach(System.out::println);
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }
}