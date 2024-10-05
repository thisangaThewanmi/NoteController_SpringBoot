package lk.ijse.ncv2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//me annotation consists of @ComponentScan,@cONFIGURATION AND @EnableAutoConfiguration
public class Ncv2Application {

	//meka tama dn spring waladi appliacation context eka hadapu wada karanne api mona hari
	//beans hadanawanm metana tamam hadanna ona
	public static void main(String[] args) {

		SpringApplication.run(Ncv2Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {

		return new ModelMapper();
	}

}
