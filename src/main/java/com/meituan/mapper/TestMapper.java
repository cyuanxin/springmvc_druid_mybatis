package com.meituan.mapper;

import com.meituan.domain.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangyuanxin on 2017/4/12.
 */
public interface TestMapper {
    List<Test> findAll(Map<String, Object> map);
}
