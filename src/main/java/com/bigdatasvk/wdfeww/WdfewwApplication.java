package com.bigdatasvk.wdfeww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.CSVFileGenerator;

import java.io.FileNotFoundException;

@SpringBootApplication
public class WdfewwApplication {

    public static void main(String[] args) {
        SpringApplication.run(WdfewwApplication.class, args);

        try {
            CSVFileGenerator.generateData(500);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
