package com.cl.desensitization.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cl.desensitization.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenling
 * @date 2020/1/7 20:19
 * @since V1.0.0
 */
@Mapper
public interface TestMapper  extends BaseMapper<User> {
}
