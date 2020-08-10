package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.service.ScrapService;
import org.springframework.web.bind.annotation.*;

/**
 * @author wchen
 * @create 2020-07-10 10:51
 */
@RestController
@RequestMapping("sys/scrap")
/*报废*/
public class ScrapController {
    private final ScrapService scrapService;

    public ScrapController(ScrapService scrapService) {
        this.scrapService = scrapService;
    }
    @GetMapping
    public R getAll(PageBean pageBean){
        return scrapService.getAll(pageBean);
    }
    @DeleteMapping("/{Id}")
    public R delete(@PathVariable("Id") int id){
        return scrapService.delete(id);
    }
}
