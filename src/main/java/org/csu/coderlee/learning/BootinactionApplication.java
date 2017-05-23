package org.csu.coderlee.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
public class BootinactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootinactionApplication.class, args);
	}

//	CommandLineRunner runner(ReservationRepository reservationRepository) {
//		return args -> {
//			Arrays.asList("Les, Josh, Phil, Sasha, Peter".split(","))
//					.forEach(n -> reservationRepository.save(new Reservation(n)));
//
//			reservationRepository.findAll().forEach(System.out :: println);
//
//			reservationRepository.findByReservationName("Les").forEach(System.out :: println);
//		};
//
//	}

}

//@Repository
//interface ReservationRepository extends JpaRepository<Reservation, Long>{
//
//	// select * from reservation where reservation_name = : rn
//	Collection<Reservation> findByReservationName(String rn);
//
//}

//@Entity
//class Reservation{
//
//	@Id
//	@GeneratedValue
//	private Long id;
//	private String reservationName;
//
//	Reservation() { //why jpa why ???
//	}
//
//	Reservation(String reservationName) {
//		this.reservationName = reservationName;
//	}
//
//	@Override
//	public String toString() {
//		return "Reservation{" +
//				"id=" + id +
//				", reservationName='" + reservationName + '\'' +
//				'}';
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getReservationName() {
//		return reservationName;
//	}
//
//	public void setReservationName(String reservationName) {
//		this.reservationName = reservationName;
//	}
//}
