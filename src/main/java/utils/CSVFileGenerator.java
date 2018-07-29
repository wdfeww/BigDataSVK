package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Random;
import java.util.UUID;

import models.ShoppingCartEvent;
import models.Store;

public class CSVFileGenerator {

    private CSVFileGenerator() {
    }

    public static void generateData(int numberOfMBytes) throws FileNotFoundException {

        int size = (numberOfMBytes * 1000000) / 74;

        long offset = System.currentTimeMillis();
        long end = System.currentTimeMillis() + 2671157395L;
        long diff = end - offset + 1;


        ShoppingCartEvent shoppingCartEvent = new ShoppingCartEvent();
        PrintWriter pw = new PrintWriter(new File("src/main/resources/Data.csv"));
        StringBuilder sb = new StringBuilder();

        //write header
        sb.append("id,store_id,customer_id,sensor_id,sensor_metadata,timestamp,\n");
        for (int i = 0; i < size; i++) {
            shoppingCartEvent.setId(UUID.randomUUID().toString());
            shoppingCartEvent.setStore_id(Store.getById(new Random().nextInt(3) + 1).getName());
            shoppingCartEvent.setCustomer_id("CUST_" + (new Random().nextInt(100) + 1));
            shoppingCartEvent.setSensor_id("PID_" + (new Random().nextInt(10) + 1));
            shoppingCartEvent.setSensor_metadata(""+ ((new Random().nextInt(10) + 1))
                    + ";" + new Random().nextInt(5) + 1 );
            shoppingCartEvent.setTimestamp(new Timestamp(offset + (long) (Math.random() * diff)).getTime());
            sb.append(shoppingCartEvent.toString() + "\n");
        }

        pw.write(sb.toString());
        pw.close();
    }
}
