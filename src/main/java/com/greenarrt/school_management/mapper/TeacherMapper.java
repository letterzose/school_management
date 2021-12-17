package com.greenarrt.school_management.mapper;

import java.util.List;

import com.greenarrt.school_management.data.TeacherVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    public void addTeacherInfo(TeacherVO data);
    public List<TeacherVO> getTeacherList(String type, String keyword, Integer offset);
    public Integer getTeacherCnt(String type, String keyword);
}