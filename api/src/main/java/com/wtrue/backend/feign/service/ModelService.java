package com.wtrue.backend.feign.service;

import com.wtrue.backend.feign.fallback.ModelServiceFallBack;
import com.wtrue.backend.request.UserAddReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 9:51 PM
 */
@FeignClient(name = "model-service", fallbackFactory = ModelServiceFallBack.class)
public interface ModelService {

    @PostMapping("user/add")
    String add(@RequestBody UserAddReq req);

    @PostMapping("user/update")
    String update(@RequestBody UserAddReq req);
}
