package com.f_rafael.junitproject_lucas_moy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class JunitprojectLucasMoyApplication {

	public static void main(String[] args) {
		//double salary = 1000;
		Game game = new Game();
		game.play();

		//SpringApplication.run(JunitprojectLucasMoyApplication.class, args);
	}

}
