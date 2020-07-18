package cn.junang.sys.controller;

import cn.junang.common.model.R;
import cn.junang.sys.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wchen
 * @create 2020-07-18 16:12
 */
@RestController
@RequestMapping("department/excel")
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping
    public R getDeptAll(){
        return departmentService.getDeptAll();
    }
}
