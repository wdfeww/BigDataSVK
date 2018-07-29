package models;

public class ShoppingCartEvent {

    String id;
    String store_id;
    String customer_id;
    String sensor_id;
    String sensor_metadata;
    long timestamp;

    public ShoppingCartEvent(String id, String store_id, String customer_id, String sensor_id, String sensor_metadata, long timestamp) {
        this.id = id;
        this.store_id = store_id;
        this.customer_id = customer_id;
        this.sensor_id = sensor_id;
        this.sensor_metadata = sensor_metadata;
        this.timestamp = timestamp;
    }

    public ShoppingCartEvent(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensor_metadata() {
        return sensor_metadata;
    }

    public void setSensor_metadata(String sensor_metadata) {
        this.sensor_metadata = sensor_metadata;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "" + id + ','
                + store_id + ','
                + customer_id + ','
                + sensor_id + ','
                + sensor_metadata + ','
                + timestamp;
    }
}
