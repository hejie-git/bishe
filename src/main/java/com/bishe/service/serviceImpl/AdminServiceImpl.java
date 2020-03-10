package com.bishe.service.serviceImpl;

import com.bishe.bean.*;
import com.bishe.dao.AdminDao;
import com.bishe.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;

    public void addTeacher(TeacherVo teacherVo){
        UserVo userVo = adminDao.getUserVo(teacherVo.getWorkNumber());
        if (null!=userVo){
            return ;
        }
        UserPo userPo = new UserPo();
        userPo.setUsername(teacherVo.getWorkNumber());
        userPo.setPassword(teacherVo.getWorkNumber());
        userPo.setFlage("T");
        adminDao.addUser(userPo);
        adminDao.addTeacherInfo(teacherVo);
    }

    public void deleteTeacherInfo(int teacherId){
        adminDao.deleteTeacherUserTable(teacherId);
        adminDao.deleteTeacherInfo(teacherId);
    }

    public List<TeacherPo> getListTeacherInfo(){
        List<TeacherPo> teacherPos = new ArrayList<TeacherPo>();
        teacherPos = adminDao.getListTeacherInfo();
        return teacherPos;
    }

    public TeacherPo getTeacherInfo(int teacherId){
        TeacherPo teacherPo = new TeacherPo();
        teacherPo = adminDao.getTeacherInfo(teacherId);
        return teacherPo;
    }
    public void updateTeacherInfo(TeacherPo teacherPo){
        adminDao.updateTeacherInfo(teacherPo);
    }
    public void addCourseInfo(CourseInfoPo courseInfoPo){
        adminDao.addCourseInfo(courseInfoPo);
    }

    public void deleteCourseInfo(CourseInfoPo courseInfoPo){
        adminDao.deleteCourseInfo(courseInfoPo);
    }

    public List<CourseInfoPo> getCourseInfos(){
        List<CourseInfoPo> courseInfoPos = new ArrayList<CourseInfoPo>();
        courseInfoPos = adminDao.getCourseInfos();
        return courseInfoPos;
    }

    public List<TeacherPo> getListTeacherName(){
        List<TeacherPo> teacherPos = new ArrayList<TeacherPo>();
        teacherPos = adminDao.getListTeacherName();
        return teacherPos;
    }
}
