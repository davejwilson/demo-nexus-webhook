package com.example.nexus.model;

import lombok.Data;

@Data
public class Component {
    private String id;
    private String componentId;
    private String format;
    private String name;
    private String group;
    private String version;
}
