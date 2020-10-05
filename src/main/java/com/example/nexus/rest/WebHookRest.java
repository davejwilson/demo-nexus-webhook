package com.example.nexus.rest;

import com.example.nexus.client.NexusClient;
import com.example.nexus.model.AssetEvent;
import com.example.nexus.model.AssetInfo;
import com.example.nexus.model.ComponentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class WebHookRest {
    @Autowired
    NexusClient nexusClient;

    @PostMapping(path = "/component", consumes = "application/json", produces = "application/json")
    public String newComponentEvent(@RequestBody ComponentEvent event,
                                    @RequestHeader Map<String, String> headers) {
        System.out.println("headers=" + headers);
        System.out.println(event);
        return "success";
    }

    @PostMapping(path = "/asset", consumes = "application/json", produces = "application/json")
    public String newAssetEvent(@RequestBody AssetEvent event,
                                @RequestHeader Map<String, String> headers) {
        if (event.getAsset().getName().endsWith(".jar") ||
                event.getAsset().getName().endsWith(".war") ||
                event.getAsset().getName().endsWith(".ear") ) {
            String assetId = event.getAsset().getAssetId();
            System.out.println("assetId=" + assetId);

            AssetInfo assetInfo = nexusClient.getAsset(assetId);

            System.out.println("assetInfo=" + assetInfo);
        }
//        System.out.println("headers=" + headers);
//        System.out.println(event);
        return "success";
    }
}
