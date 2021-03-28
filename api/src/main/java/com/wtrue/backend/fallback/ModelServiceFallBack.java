package com.wtrue.backend.fallback;

import com.wtrue.backend.feign.ModelService;
import com.wtrue.backend.request.UserAddReq;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/28 7:30 PM
 */
@Slf4j
@Component
public class ModelServiceFallBack implements FallbackFactory<ModelService> {

    @Override
    public ModelService create(Throwable cause) {
        return new ModelService() {
            @Override
            public String add(UserAddReq req) {
                log.error("ModelService - add - 调用异常",cause);
                return null;
            }

            @Override
            public String update(UserAddReq req) {
                return null;
            }
        };
    }
}
