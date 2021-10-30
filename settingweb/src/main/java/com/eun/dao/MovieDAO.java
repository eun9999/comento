package com.eun.dao;
import java.util.List;
import com.eun.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}