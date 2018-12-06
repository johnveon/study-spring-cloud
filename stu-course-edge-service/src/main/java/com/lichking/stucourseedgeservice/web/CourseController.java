package com.lichking.stucourseedgeservice.web;

import com.lichking.stucommon.dto.ResponeDTO;
import com.lichking.stucourseedgeapi.course.CourseDTO;
import com.lichking.stucourseedgeservice.edge.StuUserEdgeFeignService;
import com.lichking.stucourseedgeservice.feign.SysConfig;
import com.lichking.stuuseredgeapi.user.UserDTO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoufe
 * @date 2018/11/29 17:56
 */
@Controller
@RequestMapping(value = "/course")
@Api(value = "/course", tags = "课程")
public class CourseController {

    @Autowired
    private SysConfig sysConfig;

    @Autowired
    private StuUserEdgeFeignService stuUserEdgeFeignService;

    @GetMapping(value = "/courseListByUserId")
    @ResponseBody
    @ApiOperation(value = "获取课程", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId", value="用户ID", dataType = "Long", required=true, paramType="form"),
    })
    public ResponeDTO<CourseDTO> courseListByUserId(
            @RequestParam(value = "userId") Long userId){

        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setCourseId(1L);
        courseDTO.setCourseName("xxx");
        courseDTO.setDesc("xxxx");
        ResponeDTO<UserDTO> userDTOResponeDTO = stuUserEdgeFeignService.userById4course(userId);
        courseDTO.setTeacher(userDTOResponeDTO.getData());
        ResponeDTO success = ResponeDTO.SUCCESS(courseDTO);

        success.setWhereFrom("from port:" + sysConfig.getServerPort() + sysConfig.getFoo());
        return success;
    }

    @GetMapping(value = "/courseListByUserId4User")
    @ResponseBody
    @ApiOperation(value = "获取课程（为了用户）", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId", value="用户ID", dataType = "Long", required=true, paramType="form"),
    })
    public ResponeDTO<CourseDTO> courseListByUserId4User(
            @RequestParam(value = "userId") Long userId){

        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setCourseId(1L);
        courseDTO.setCourseName("xxx");
        courseDTO.setDesc("xxxx");
        ResponeDTO success = ResponeDTO.SUCCESS(courseDTO);

        success.setWhereFrom("from port:" + sysConfig.getServerPort() + sysConfig.getFoo());
        return success;
    }



}
