package com.zyb.admin.mapper;

import com.zyb.admin.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/14 13:51
 * @Version 1.0
 **/
//@Mapper
public interface DeptMapper {
    public Dept getDept(Integer deptId);
}
