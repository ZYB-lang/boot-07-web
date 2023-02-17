package com.zyb.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/11 14:00
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String passWord;
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
