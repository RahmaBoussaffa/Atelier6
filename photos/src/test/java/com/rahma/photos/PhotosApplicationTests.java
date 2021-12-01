package com.rahma.photos;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.rahma.photos.entities.Photo;
import com.rahma.photos.entities.Photographe;
import com.rahma.photos.repos.PhotoRepository;
@SpringBootTest
class PhotosApplicationTests {
@Autowired
private PhotoRepository photoRepository;
/*
@Test
public void testCreatePhoto() {
Photographe ph = new Photographe();
ph.setIdPhot(6L);
Photo phot = new Photo(null,"Mountains",1200.00,new Date(),ph);
photoRepository.save(phot);
}
/*
@Test
public void testFindPhoto()
{
Photo p = photoRepository.findById(3L).get();

System.out.println(p);
}
/*
@Test
public void testUpdatePhoto()
{
Photo p = photoRepository.findById(4L).get();
p.setPrixPhoto(1500.0);
photoRepository.save(p);
}
*/
/*
@Test
public void testDeletePhoto()
{
photoRepository.deleteById(3L);;
}
@Test
public void testListerTousPhotos()
{
List<Photo> phots = photoRepository.findAll();
for (Photo p : phots)
{
System.out.println(p);
}


}
*/
@Test
public void testFindByNomPhoto()
{
List<Photo> phots = photoRepository.findByNomPhoto("Fountains");

for (Photo p : phots)
{
System.out.println(p);
}

}
@Test
public void testFindByNomPhotoContains ()
{
List<Photo> phots=photoRepository.findByNomPhotoContains("Fountains");

for (Photo p : phots)
{
System.out.println(p);
} }
@Test
public void testfindByNomPrix()
{
List<Photo> phots = photoRepository.findByNomPrix("Fountains", 1000.0);
for (Photo p : phots)
{
System.out.println(p);
}

}
@Test
public void testfindByPhotographe()
{
Photographe photographe = new Photographe();
photographe.setIdPhot(5L);
List<Photo> phots = photoRepository.findByPhotographe(photographe);
for (Photo p : phots)
{
System.out.println(p);
}

}
@Test
public void findByPhotographeeIdPhot()
{
List<Photo> phots = photoRepository.findByPhotographeIdPhot(5L);
for (Photo p : phots)
{
System.out.println(p);
}

}
@Test
public void testfindByOrderByNomPhotoAsc()
{
List<Photo> phots = photoRepository.findByOrderByNomPhotoAsc();
for (Photo p : phots)
{
System.out.println(p);
}

}
@Test
public void testTrierPhotosNomsPrix()
{
List<Photo> phots = photoRepository.trierPhotosNomsPrix();
for (Photo p : phots)
{
System.out.println(p);
}

}
}