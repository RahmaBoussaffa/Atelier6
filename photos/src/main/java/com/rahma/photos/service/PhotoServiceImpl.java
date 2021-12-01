package com.rahma.photos.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahma.photos.entities.Photo;
import com.rahma.photos.entities.Photographe;
import com.rahma.photos.repos.PhotoRepository;


@Service
public class PhotoServiceImpl implements PhotoService {
@Autowired
PhotoRepository photoRepository;
@Override
public Photo savePhoto(Photo p) {
return photoRepository.save(p);
}
@Override
public Photo updatePhoto(Photo p) {
return photoRepository.save(p);
}
@Override
public void deletePhoto(Photo p) {
photoRepository.delete(p);
}
@Override
public void deletePhotoById(Long id) {
photoRepository.deleteById(id);
}
@Override
public Photo getPhoto(Long id) {
return photoRepository.findById(id).get();
}
@Override
public List<Photo> getAllPhotos() {
return photoRepository.findAll();
}
@Override
public List<Photo> findByNomPhoto(String nom) {
return photoRepository.findByNomPhoto(nom);
}
@Override
public List<Photo> findByNomPhotoContains(String nom) {
return photoRepository.findByNomPhotoContains(nom);
}
@Override
public List<Photo> findByNomPrix(String nom, Double prix) {
	
return photoRepository.findByNomPrix(nom, prix);
	}
@Override
public List<Photo> findByPhotographe(Photographe photographe) {
return photoRepository.findByPhotographe(photographe);
}
@Override
public List<Photo> findByPhotographeIdPhot(Long id) {
return photoRepository.findByPhotographeIdPhot(id);
}
@Override
public List<Photo> findByOrderByNomPhotoAsc() {
return photoRepository.findByOrderByNomPhotoAsc();
}
@Override
public List<Photo> trierPhotosNomsPrix() {
return photoRepository.trierPhotosNomsPrix();
}
}