package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.service.InformationService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mr.s°
 * @create 2020-07-14 9:39
 */
@RestController
@RequestMapping("sys/information")
/*信息*/
public class InformationController {
    private final InformationService informationService;

    public InformationController(InformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping
    public R getAll(String supName, PageBean pageBean) {
        return informationService.getAll(supName,pageBean);
    }

    @DeleteMapping("/{Id}")
    public R delete(@PathVariable("Id") int id) {
        return informationService.delete(id);
    }

}
