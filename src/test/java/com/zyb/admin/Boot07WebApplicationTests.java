package com.zyb.admin;

import com.zyb.admin.bean.User;
import com.zyb.admin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot07WebApplicationTests {
     @Autowired
    JdbcTemplate jdbcTemplate;
     @Autowired
     DataSource dataSource;
     @Autowired
     UserMapper userMapper;
    @Test
    void contextLoads() {
//        jdbcTemplate.queryForList("select * from t_user");
        Long count =  jdbcTemplate.queryForObject("select count(*) from t_emp",Long.class);
        log.info("记录总数：{}",count);
        log.info("数据源类型:{}",dataSource.getClass());
    }
    @Test
    void testUserMapper(){
        User user = (User) userMapper.selectById(1L);
        log.info("用户信息:{}",user);

    }

}
