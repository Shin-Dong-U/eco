package com.goott.eco.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardDAO {
    List<BoardVO> selectBoardList() throws Exception;
    void insertBoard(@Param("num") int num) throws Exception;
}
