package com.bigdatasvk.wdfeww.utils;

import com.bigdatasvk.wdfeww.models.ShoppingCartEvent;
import com.bigdatasvk.wdfeww.models.Store;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.Random;
import java.util.UUID;

public class CSVFileGenerator {

    private String fileName = "Data.csv";
    private long fileSize = 500L;
    private static final Logger log = LoggerFactory.getLogger(CSVFileGenerator.class);

    public void generateData() {

        long size = (fileSize * 1000000L) / 74L;

        long offset = System.currentTimeMillis();
        long end = System.currentTimeMillis() + 2671157395L;
        long diff = end - offset + 1;

        ShoppingCartEvent shoppingCartEvent = new ShoppingCartEvent();
        try (Writer writer = new BufferedWriter(new FileWriter(fileName, true))) {
            //write header
            writer.write("id,store_id,customer_id,sensor_id,sensor_metadata,timestamp,\n");
            for (long i = 0L; i < size; i++) {
                shoppingCartEvent.setId(UUID.randomUUID().toString());
                shoppingCartEvent.setStoreId(Store.getById(new Random().nextInt(3) + 1).getName());
                shoppingCartEvent.setCustomerId("CUST_" + (new Random().nextInt(100) + 1));
                shoppingCartEvent.setSensorId("PID_" + (new Random().nextInt(10) + 1));
                shoppingCartEvent.setSensorMetadata("" + (new Random().nextInt(10) + 1)
                        + ";" + new Random().nextInt(5) + 1);
                shoppingCartEvent.setTimestamp(new Timestamp(offset + (long) (Math.random() * diff)).getTime());
                writer.write(shoppingCartEvent.toString() + "\n");
            }
        } catch (Exception ex) {
            log.error("problem with process file", ex);
        }
    }
}
