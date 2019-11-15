package com.gaoxiong.read_write.dao;

import com.gaoxiong.read_write.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gx
 * @since 2019-11-15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
