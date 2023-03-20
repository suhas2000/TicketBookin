package com.movies.TicketBookin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Table(name = "showtime")
public class Showtime {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	private Movie movie;
	@NotBlank(message = "The starttime should not be blank")
	private String starttime;
	@NotBlank(message = "The endtime should not be blank")
	private String endtime;
	@NotBlank(message = "The theatre name should not be blank")
	private String theatre;
	@NotBlank(message = "The availableSeats should not be blank")
	private int availableseats;
}
