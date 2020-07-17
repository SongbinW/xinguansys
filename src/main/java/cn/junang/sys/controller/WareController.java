package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.wpl.service.WareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wupl
 * @create 2020-07-10 12:05
 */
@RestController
@RequestMapping("wpl/ware")
public class WareController {
    private final WareService wareService;

    public WareController(WareService wareService) {
        this.wareService = wareService;
    }

    @GetMapping
    public R getWare(PageBean pageBean) {
        return wareService.getWare(pageBean);
    }
}
