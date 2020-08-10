package cn.junang.sys.controller;

import cn.junang.common.model.R;
import cn.junang.sys.service.ResourcesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wchen
 * @create 2020-06-29 20:58
 */
@RestController
@RequestMapping("sys/res")
@CrossOrigin("http://localhost:8080")
public class ResourcesController {
    private final ResourcesService resourcesService;

    public ResourcesController(ResourcesService resourcesService) {
        this.resourcesService = resourcesService;
    }
    @GetMapping("getMenu")
    public R getMenu(){
        return resourcesService.getMenu();
    }
    @GetMapping
    public R getAll(){
        return resourcesService.getAll();
    }
}
