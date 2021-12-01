package com.rahma.photos.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rahma.photos.entities.Photo;
import com.rahma.photos.entities.Photographe;
@RepositoryRestResource(path = "rest")
public interface PhotoRepository extends JpaRepository<Photo, Long> {
	List<Photo> findByNomPhoto(String nom);
	List<Photo> findByNomPhotoContains(String nom);
	@Query("select p from Photo p where p.nomPhoto like %?1 and p.prixPhoto > ?2")
	List<Photo> findByNomPrix (String nom, Double prix);
	@Query("select p from Photo p where p.photographe = ?1")
	List<Photo> findByPhotographe (Photographe photographe);
	List<Photo> findByPhotographeIdPhot(Long id);
	List<Photo> findByOrderByNomPhotoAsc();
	@Query("select p from Photo p order by p.nomPhoto ASC, p.prixPhoto DESC")
	List<Photo> trierPhotosNomsPrix ();
}
