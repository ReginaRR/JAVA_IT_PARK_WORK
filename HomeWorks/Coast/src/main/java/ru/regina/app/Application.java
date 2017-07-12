package ru.regina.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// класс, отвечающий за запуск приложения
// внутри него Main
// SpringBoot-класс
// SpringBoot-библиотека для быстрой конфигурации приложения, быстрого запуска и
// деплоя на хосте
@SpringBootApplication
@ComponentScan("ru.regina")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
