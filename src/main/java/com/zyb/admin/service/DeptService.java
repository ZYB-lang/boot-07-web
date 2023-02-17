package com.zyb.admin.service;

import com.zyb.admin.bean.Dept;
import com.zyb.admin.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName DeptService
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/14 14:04
 * @Version 1.0
 **/
@Service
public class DeptService {
    @Autowired
    DeptMapper deptMapper;
    public Dept getDeptById(Integer deptId){
       return deptMapper.getDept(deptId);
    }

}
