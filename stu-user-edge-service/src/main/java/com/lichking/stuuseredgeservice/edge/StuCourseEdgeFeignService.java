package com.lichking.stuuseredgeservice.edge;

import com.lichking.stucommon.dto.ResponeDTO;
import com.lichking.stucourseedgeapi.course.CourseDTO;
import com.lichking.stuuseredgeservice.feign.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhoufe
 * @date 2018/11/29 17:39
 */
@FeignClient(value = "stu-course-edge-service", configuration = FeignConfig.class)
public interface StuCourseEdgeFeignService {

    @GetMapping(value = "/course/courseListByUserId")
    ResponeDTO<CourseDTO> courseListByUserId(@RequestParam(value = "userId") Long userId);
}
