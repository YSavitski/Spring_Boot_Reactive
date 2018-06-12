package com.example.learning_spring_boot.social_media_platform.util;

import com.example.learning_spring_boot.social_media_platform.domain.Chapter;
import com.example.learning_spring_boot.social_media_platform.repository.ChapterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class DatabaseLoader {
    @Bean
    CommandLineRunner init(ChapterRepository chapterRepository) {
        return args -> {
            Flux
                    .just(
                            new Chapter("Quick Start with Java"),
                            new Chapter("Reactive Web with Spring Boot"),
                            new Chapter("...and more!"))
                    .flatMap(chapterRepository::save)
                    .subscribe(System.out::println);
        };
    }
}
