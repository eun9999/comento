package com.eun.service;
import java.util.List;
import com.eun.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}