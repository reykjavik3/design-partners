package com.letcode;

/**
 * create by murong
 * create in 2019-2-22
 */
public enum ActionEnum {
    Start_agent("start","agent"),
    api_dispatcher("api","dispatcher");
    String name;
    String value;

    ActionEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
