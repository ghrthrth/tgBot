package org.example;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;

public class Main {git
    public static void main(String[] args) {
        TelegramBot bot = new TelegramBot("5424627277:AAEMba6dgSMkNyoznHAx_LfSK6kclTfWqNQ");

// Register for updates
        bot.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                if (update.message().text().equals("/send")) {
                    bot.execute(new SendMessage(update.message().chat().id(), "Люблю тебя!!!!!!!!"));
                } else if (update.message().text().equals("/start!!")) {
                    bot.execute(new SendMessage(update.message().chat().id(), "Что бы ты хотел от меня?"));
                } else {
                    bot.execute(new SendMessage(update.message().chat().id(), "Я тебя не понимаю!"));
                }
                updates.forEach(System.out::println);
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }
}