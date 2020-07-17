package cn.junang.sys.controller;

import cn.junang.common.model.R;
import cn.junang.sys.model.SysRoleResources;
import cn.junang.sys.service.ReloResourceService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mr.s°
 * @create 2020-07-06 9:28
 */
@RestController
@RequestMapping("sys/roleRes")
public class ReloResourceController {
    private final ReloResourceService reloResourceService;

    public ReloResourceController(ReloResourceService reloResourceService) {
        this.reloResourceService = reloResourceService;
    }
    @DeleteMapping("/{roleId}/{resIds}")
    public R delete(@PathVariable("roleId") Long roleId, @PathVariable("resIds")String ResIds){
        return reloResourceService.delete(roleId,ResIds);
    }
    @PutMapping("/{roleId}")
    public R update(@PathVariable("roleId") Long roleId, @RequestBody SysRoleResources[] roleRes){
        return reloResourceService.update(roleId,roleRes);
    }
}

