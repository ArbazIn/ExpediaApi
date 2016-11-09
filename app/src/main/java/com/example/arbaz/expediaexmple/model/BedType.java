package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;



public class BedType implements Serializable {
    public String description;
    public String  id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
