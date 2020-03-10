package com.bishe.controller;

import com.bishe.bean.CourseInfoPo;
import com.bishe.bean.TeacherPo;
import com.bishe.bean.TeacherVo;
import com.bishe.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/adminController")
public class AdminController {

    @Autowired
    private AdminService adminService;

    //录入教师信息
    @RequestMapping("/addTeacherInfo.do")
    public String addTeacherInfo(TeacherVo teacherVo){
        adminService.addTeacher(teacherVo);
        return null;
    }
    //删除教师信息
    @RequestMapping("/deleteTeacherInfo.do")
    public void deleteTeacherInfo(int teacherId){
        adminService.deleteTeacherInfo(teacherId);
    }

    //教师信息展示
    @RequestMapping("/getListTeacherInfo")
    public List<TeacherPo> getListTeacherInfo(){
        List<TeacherPo> teacherPos = new ArrayList<TeacherPo>();
       teacherPos=adminService.getListTeacherInfo();
       return teacherPos;
    }
    //查询单条教师信息
    @RequestMapping("/getTeacherInfo")
    public TeacherPo getTeacherPo(int teacherId){
        TeacherPo teacherPo = adminService.getTeacherInfo(teacherId);
        return teacherPo;
    }
    //教师信息修改
    @RequestMapping("/updateTeacherInfo")
    public void updateTeacherInfo(TeacherPo teacherPo){
        adminService.updateTeacherInfo(teacherPo);
    }

    //课程信息录入

    @RequestMapping("/addCourseInfo")
    public void addCourseInfo(CourseInfoPo courseInfoPo){
        adminService.addCourseInfo(courseInfoPo);
    }
    //课程信息删除

    @RequestMapping("/deleteCourseInfo")
    public void deleteCourseInfo(CourseInfoPo courseInfoPo){
        adminService.deleteCourseInfo(courseInfoPo);
    }
    //课程信息列表展示

    @RequestMapping("/getCourseInfos")
    public List<CourseInfoPo> getCourseInfos(){
        List<CourseInfoPo> courseInfoPos = new ArrayList<CourseInfoPo>();
        courseInfoPos = adminService.getCourseInfos();
        return courseInfoPos;
    }

    @RequestMapping("/getListTeacherName")
    public List<TeacherPo> getListTeacherName(){
        List<TeacherPo> teacherPos = new ArrayList<TeacherPo>();
        teacherPos = adminService.getListTeacherName();
        return teacherPos;
    }

    //排课
    //
    //
    //
}
