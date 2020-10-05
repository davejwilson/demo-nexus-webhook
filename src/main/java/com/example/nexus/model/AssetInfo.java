package com.example.nexus.model;

import lombok.Data;

@Data
public class AssetInfo {
    private String downloadUrl;
    private String path;
    private String id;
    private String repository;
    private String format;
    private Checksum checksum;
}
