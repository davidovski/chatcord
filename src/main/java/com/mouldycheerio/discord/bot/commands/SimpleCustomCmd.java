package com.mouldycheerio.discord.bot.commands;

import com.mouldycheerio.discord.bot.MyBot;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IMessage;

public class SimpleCustomCmd extends BotCommand {
    private String text;
    private boolean showInHelp;
    private String command;
    public SimpleCustomCmd(String command, CommandDescription description, String text) {
        this.text = text;
        setName(command);
        setDescription(description);
        showInHelp = true;
    }

    public SimpleCustomCmd(String command, String desc, String text) {
        this.text = text;
        setName(command);
        setDescription(new CommandDescription(command, desc, command));
        showInHelp = true;
    }

    public void onCommand(MyBot orangepeel, IDiscordClient client, IMessage commandMessage, String[] args) {
        commandMessage.getChannel().sendMessage(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isShowInHelp() {
        return showInHelp;
    }

    public void setShowInHelp(boolean showInHelp) {
        this.showInHelp = showInHelp;
    }
}
