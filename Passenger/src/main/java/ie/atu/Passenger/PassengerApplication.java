package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/Passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){
		List<Passenger>myPassengers = List.of(
			new Passenger("Mr", "Paul", "123", "2L", 23),
			new Passenger("Mr", "Paul2", "6723", "2444L", 93),
			new Passenger("Mr", "Paul3", "144", "5562L", 53));
		return myPassengers;

	}

	@GetMapping(path = "/{PassengerID}")
	public Passenger getPassenger(@PathVariable String PassengerID){
		Passenger myPassenger = new Passenger("Mr", "Paul4","9998212", "678999L", 21);
		return myPassenger;
	}


}

