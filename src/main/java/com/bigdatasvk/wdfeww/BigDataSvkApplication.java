package com.bigdatasvk.wdfeww;

import com.bigdatasvk.wdfeww.utils.CSVFileGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigDataSvkApplication {


    public static void main(String[] args) {
        SpringApplication.run(BigDataSvkApplication.class, args);
        try {
            System.out.println("Creating new file");
           new CSVFileGenerator().generateData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
