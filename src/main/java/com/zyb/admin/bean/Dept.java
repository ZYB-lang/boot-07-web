package com.zyb.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/14 13:52
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer deptId;
    private String deptName;
}
