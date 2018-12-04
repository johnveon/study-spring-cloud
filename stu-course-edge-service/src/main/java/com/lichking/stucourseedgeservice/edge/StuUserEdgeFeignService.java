package com.lichking.stucourseedgeservice.edge;

import com.lichking.stucommon.dto.ResponeDTO;
import com.lichking.stucourseedgeservice.feign.FeignConfig;
import com.lichking.stuuseredgeapi.user.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhoufe
 * @date 2018/11/30 10:01
 */
@FeignClient(value = "stu-user-edge-service", configuration = FeignConfig.class)
public interface StuUserEdgeFeignService {

    @GetMapping(value = "/user/userById4course")
    ResponeDTO<UserDTO> userById4course(@RequestParam(value = "userId") Long userId);
}
