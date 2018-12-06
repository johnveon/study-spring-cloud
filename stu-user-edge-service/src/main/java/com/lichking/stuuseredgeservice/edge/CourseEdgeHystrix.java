package com.lichking.stuuseredgeservice.edge;

import com.lichking.stucommon.dto.ResponeDTO;
import com.lichking.stucourseedgeapi.course.CourseDTO;
import org.springframework.stereotype.Component;

/**
 * @author zhoufe
 * @date 2018/12/5 17:37
 */
@Component
public class CourseEdgeHystrix implements StuCourseEdgeFeignService{
    @Override
    public ResponeDTO<CourseDTO> courseListByUserId4User(Long userId) {
        CourseDTO data = new CourseDTO();
        data.setCourseName("StuCourseEdgeFeignService 调用失败");
        return ResponeDTO.failure("10001", "StuCourseEdgeFeignService 调用失败");
    }
}
