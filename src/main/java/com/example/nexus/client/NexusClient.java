package com.example.nexus.client;

import com.example.nexus.model.AssetInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "assets", url = "${nexus.url}")
public interface NexusClient {
    @RequestMapping(method = RequestMethod.GET, value = "/service/rest/v1/assets/{id}")
    AssetInfo getAsset(@PathVariable("id") String assetId);
}
