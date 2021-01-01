package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.SysServiceLogDao;
import com.oyc.blog.common.domain.SysServiceLog;
import com.oyc.blog.user.service.SysServiceLogService;
import org.springframework.stereotype.Service;

/**
 * API日志表(SysServiceLog)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@Service("sysServiceLogService")
public class SysServiceLogServiceImpl extends ServiceImpl<SysServiceLogDao, SysServiceLog> implements SysServiceLogService {

}
