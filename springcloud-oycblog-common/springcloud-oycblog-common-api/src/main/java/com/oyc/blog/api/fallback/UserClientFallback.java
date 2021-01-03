package com.oyc.blog.api.fallback;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.UserClient;
import com.oyc.blog.common.domain.BlogUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * 用户服务容错
 */
@Component
@Slf4j
public class UserClientFallback implements UserClient {

    @Override
    public R hello() {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }

    @Override
    public R list() {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }

    @Override
    public R selectOneUser(Serializable id) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }

    @Override
    public R insertUser(BlogUser blogUser) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }

    @Override
    public R updateUser(BlogUser blogUser) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }

    @Override
    public R deleteUser(List<Long> idList) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }
}
