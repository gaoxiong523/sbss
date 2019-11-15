package com.gaoxiong.read_write.service.impl;

import com.gaoxiong.read_write.entity.User;
import com.gaoxiong.read_write.dao.UserMapper;
import com.gaoxiong.read_write.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gx
 * @since 2019-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
