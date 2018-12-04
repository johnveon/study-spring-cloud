package com.lichking.stucourseedgeapi.course;

import com.lichking.stuuseredgeapi.user.UserDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zhoufe
 * @date 2018/11/29 15:27
 */
@ApiModel
public class CourseDTO implements Serializable {

    @ApiModelProperty(value = "课程ID")
    private Long courseId;
    @ApiModelProperty(value = "课程名称")
    private String courseName;
    @ApiModelProperty(value = "课程描述")
    private String desc;
    @ApiModelProperty(value = "用户")
    private UserDTO teacher;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UserDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(UserDTO teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", desc='" + desc + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
