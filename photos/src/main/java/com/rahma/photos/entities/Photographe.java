package com.rahma.photos.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Photographe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idPhot;
private String nomPhot;
private String descriptionPhot;
@OneToMany(mappedBy = "photographe")
@JsonIgnore
private List<Photo> photos;

}