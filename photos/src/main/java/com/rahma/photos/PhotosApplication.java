package com.rahma.photos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.rahma.photos.entities.Photo;

@SpringBootApplication
public class PhotosApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
public static void main(String[] args) {
SpringApplication.run(PhotosApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
repositoryRestConfiguration.exposeIdsFor(Photo.class);
}
}

