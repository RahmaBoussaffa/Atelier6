package com.rahma.photos.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomPhoto", types = { Photo.class })
public interface PhotoProjection {
public String getNomPhoto();
}
