package com.rahma.photos.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rahma.photos.entities.Photo;
import com.rahma.photos.service.PhotoService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class PhotoRESTController {
@Autowired
PhotoService photoService ;
@RequestMapping(path = "all",method = RequestMethod.GET)
public List<Photo> getAllPhotos() {
return photoService.getAllPhotos();
}
@RequestMapping (value="/{id}",method = RequestMethod.GET)
public Photo getPhotoById(@PathVariable("id") Long id) {
return photoService.getPhoto(id);
}
@RequestMapping(method = RequestMethod.POST)
public Photo createPhoto(@RequestBody Photo photo) {
return photoService.savePhoto(photo);
}
@RequestMapping(method = RequestMethod.PUT)
public Photo updatePhoto(@RequestBody Photo photo) {
return photoService.updatePhoto(photo);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deletePhoto(@PathVariable("id") Long id)
{
photoService.deletePhotoById(id);
}
@RequestMapping(value="/prodscat/{idPhot}",method = RequestMethod.GET)
public List<Photo> getPhotosByCatId(@PathVariable("idPhot") Long idPhot) {
return photoService.findByPhotographeIdPhot(idPhot);
}
}