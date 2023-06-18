package com.jareer.docker_compose;

import com.jareer.docker_compose.model.Post;
import com.jareer.docker_compose.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.plaf.PanelUI;

@SpringBootApplication
public class DockerComposeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerComposeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository postRepository) {
        return args -> {
            postRepository.save(new Post("Post 1", "Body of Post 1"));
        };
    }
}