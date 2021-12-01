package com.rahma.photos.service;
import java.util.List;

import com.rahma.photos.entities.Photo;
import com.rahma.photos.entities.Photographe;


public interface PhotoService {
Photo savePhoto(Photo p);
Photo updatePhoto(Photo p);
void deletePhoto(Photo p);
void deletePhotoById(Long id);
Photo getPhoto(Long id);
List<Photo> getAllPhotos();
List<Photo> findByNomPhoto(String nom);
List<Photo> findByNomPhotoContains(String nom);
List<Photo> findByNomPrix (String nom, Double prix);
List<Photo> findByPhotographe (Photographe photographe);
List<Photo> findByPhotographeIdPhot(Long id);
List<Photo> findByOrderByNomPhotoAsc();
List<Photo> trierPhotosNomsPrix();
}
