package com.bishe.service;

import com.bishe.bean.CourseInfoPo;
import com.bishe.bean.TeacherPo;
import com.bishe.bean.TeacherVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    public void addTeacher(TeacherVo teacherVo);
    public void deleteTeacherInfo(int teacherId);
    public List<TeacherPo> getListTeacherInfo();
    public TeacherPo getTeacherInfo(int teacherId);
    public void updateTeacherInfo(TeacherPo teacherPo);
    public void addCourseInfo(CourseInfoPo courseInfoPo);
    public void deleteCourseInfo(CourseInfoPo courseInfoPo);
    public List<CourseInfoPo> getCourseInfos();
    public List<TeacherPo> getListTeacherName();

}
