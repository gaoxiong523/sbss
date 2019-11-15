package com.gaoxiong.read_write.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author gaoxiong
 * @ClassName MyMapper
 * @Description
 * @date 2019/11/15 11:38
 */
public interface MyMapper<T> extends BaseMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
