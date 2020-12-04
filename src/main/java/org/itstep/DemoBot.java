package org.itstep;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Locality;
import org.telegram.abilitybots.api.objects.Privacy;

public class DemoBot extends AbilityBot {
    protected DemoBot(String botToken, String botUsername) {
        super(botToken, botUsername);
    }

    public Ability hello() {

        return Ability
                .builder()
                .name("hello")
                .info("Simple help command")
                .privacy(Privacy.PUBLIC)
                .locality(Locality.ALL)
                .input(0)
                .action(messageContext -> {
                    System.out.println(messageContext.user());
                    silent.send("It is simple help command", messageContext.chatId());
                })
                .build();
    }

    @Override
    public int creatorId() {
        return 517806843;
    }
}
