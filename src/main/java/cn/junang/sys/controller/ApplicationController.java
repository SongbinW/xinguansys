package cn.junang.sys.controller;

import cn.junang.common.model.R;
import cn.junang.sys.model.Pur_application;
import cn.junang.sys.service.ApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.s°
 * @create 2020-2020/7/17 8:38
 */
@RestController
@RequestMapping("sys/application")
public class ApplicationController {
   private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public R add(@RequestBody Pur_application application){
        return applicationService.add(application);
    }
}
