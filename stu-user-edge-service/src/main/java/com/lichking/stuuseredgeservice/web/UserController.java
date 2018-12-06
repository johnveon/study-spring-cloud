package com.lichking.stuuseredgeservice.web;

import com.alibaba.fastjson.JSONObject;
import com.lichking.stucommon.dto.ResponeDTO;
import com.lichking.stucourseedgeapi.course.CourseDTO;
import com.lichking.stuuseredgeapi.user.UserDTO;
import com.lichking.stuuseredgeservice.edge.StuCourseEdgeFeignService;
import com.lichking.stuuseredgeservice.feign.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoufe
 * @date 2018/11/29 17:16
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private StuCourseEdgeFeignService stuCourseEdgeFeignService;

    @Autowired
    private SysConfig sysConfig;

    @GetMapping(value = "/userById")
    @ResponseBody
    public ResponeDTO<UserDTO> userById(@RequestParam(value = "userId") Long  userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setUserName("meimei");
        userDTO.setRealName("韩梅梅");
        userDTO.setEmail("meimei@qq.com");
        userDTO.setRole("ADMIN");

        //查询course
        ResponeDTO<CourseDTO> courseDTOResponse = stuCourseEdgeFeignService.courseListByUserId4User(userId);
        System.out.println("courseDTOResponse信息:" + JSONObject.toJSONString(courseDTOResponse));

        if (ResponeDTO.RESPONSE_FAIL_CODE.equals(courseDTOResponse.getCode())){
            ResponeDTO fail = courseDTOResponse;
            return fail;
        }

        ResponeDTO success = ResponeDTO.success(userDTO);
        success.setWhereFrom(sysConfig.getServerPort() + "_" + sysConfig.getBoo());
        return success;
    }

    @GetMapping(value = "/userById4course")
    @ResponseBody
    public ResponeDTO<UserDTO> userById4course(@RequestParam(value = "userId") Long userId){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setUserName("meimei");
        userDTO.setRealName("韩梅梅");
        userDTO.setEmail("meimei@qq.com");
        userDTO.setRole("ADMIN");

        return ResponeDTO.success(userDTO);

    }

}
