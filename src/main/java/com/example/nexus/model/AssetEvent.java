package com.example.nexus.model;

import lombok.Data;

@Data
public class AssetEvent {
    private String timestamp;
    private String nodeId;
    private String initiator;
    private String repositoryName;
    private String action;
    private Asset asset;
}
