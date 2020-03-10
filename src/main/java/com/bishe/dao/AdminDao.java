package com.bishe.dao;

import com.bishe.bean.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface AdminDao {

    public UserVo getUserVo(String workNumber);
    public void addUser(UserPo userPo);
    public void addTeacherInfo(TeacherVo teacherVo);
    public void deleteTeacherUserTable(int teacherId);
    public void deleteTeacherInfo(int teacherId);
    public List<TeacherPo> getListTeacherInfo();
    public TeacherPo getTeacherInfo(int teacherId);
    public void updateTeacherInfo(TeacherPo teacherPo);
    public void addCourseInfo(CourseInfoPo courseInfoPo);
    public void deleteCourseInfo(CourseInfoPo courseInfoPo);
    public List<CourseInfoPo> getCourseInfos();
    public List<TeacherPo> getListTeacherName();
}
