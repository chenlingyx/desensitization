package com.cl.desensitization.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author chenling
 * @date 2020/1/7 20:14
 * @since V1.0.0
 */
@Data
@TableName("user")
public class User {

    @TableId
    private  Integer id;

    private String  name;

    private String  password;

    private String sex;

    @TableField("plain_pwd")
    private  String plainPwd;

    @TableField("cipher_pwd")
    private  String cipherPwd;

    @TableField("user_assisted")
    private  String  userAssisted;

}
