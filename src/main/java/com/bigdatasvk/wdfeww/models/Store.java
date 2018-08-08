package com.bigdatasvk.wdfeww.models;

public enum Store {

    UNKNOWN(0, "UNKNOWN"),
    TESCO(1, "Tesco"),
    KAUFLAND(2, "Kaufland"),
    LIDL(3, "Lidl"),
    AGRO(4, "Agro");

    private int id;
    private String name;

    Store(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static Store getById(int id) {
        for (Store s : values()) {
            if (s.id == id) return s;
        }
        return Store.UNKNOWN;
    }

}
