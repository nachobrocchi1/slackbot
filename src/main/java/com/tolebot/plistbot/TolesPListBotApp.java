package com.tolebot.plistbot;

import com.slack.api.bolt.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;

@Configuration
public class TolesPListBotApp {
    @Bean
    public App initSlackApp() {
        App app = new App();
        app.command("/hello everyone, let's play music", (req, ctx) -> ctx.ack("Hi there!"));
        return app;
    }
}

