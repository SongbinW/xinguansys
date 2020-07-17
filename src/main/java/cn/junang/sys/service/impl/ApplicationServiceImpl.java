package cn.junang.sys.service.impl;

import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.Pur_applicationMapper;
import cn.junang.sys.model.Pur_application;
import cn.junang.sys.service.ApplicationService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Mr.s°
 * @create 2020-2020/7/17 8:36
 */
@Service
public class ApplicationServiceImpl extends BaseService implements ApplicationService {
   private final Pur_applicationMapper applicationMapper;

    public ApplicationServiceImpl(Pur_applicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }

    @Override
    public R add(Pur_application application) {
        application.setData(new Date());
        application.setReqNumber("20200101");
        applicationMapper.insert(application);
        return R.ok();
    }
}
