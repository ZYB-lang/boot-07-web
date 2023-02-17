package com.zyb.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyb.admin.bean.User;
import com.zyb.admin.mapper.UserMapper;
import com.zyb.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/14 16:48
 * @Version 1.0
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
