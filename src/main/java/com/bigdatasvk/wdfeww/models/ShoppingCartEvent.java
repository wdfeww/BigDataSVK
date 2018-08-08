package com.bigdatasvk.wdfeww.models;

public class ShoppingCartEvent {

    String id;
    String storeId;
    String customerId;
    String sensorId;
    String sensorMetadata;
    long timestamp;

    public ShoppingCartEvent(String id, String storeId, String customerId, String sensorId, String sensorMetadata, long timestamp) {
        this.id = id;
        this.storeId = storeId;
        this.customerId = customerId;
        this.sensorId = sensorId;
        this.sensorMetadata = sensorMetadata;
        this.timestamp = timestamp;
    }

    public ShoppingCartEvent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorMetadata() {
        return sensorMetadata;
    }

    public void setSensorMetadata(String sensorMetadata) {
        this.sensorMetadata = sensorMetadata;
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
                + storeId + ','
                + customerId + ','
                + sensorId + ','
                + sensorMetadata + ','
                + timestamp;
    }
}
