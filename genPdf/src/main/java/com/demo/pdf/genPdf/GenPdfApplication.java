package com.demo.pdf.genPdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenPdfApplication {

	public static void main(String[] args) {
		System.out.println("gen pdf");
		SpringApplication.run(GenPdfApplication.class, args);
		System.out.println("PDF generated");
	}
}
