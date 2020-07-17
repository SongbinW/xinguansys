package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.InventoryInfo;
import cn.junang.sys.service.InveService;
import org.springframework.web.bind.annotation.*;

/**
 * @author wupl
 * @create 2020-07-10 22:10
 */
@RestController
@RequestMapping("wpl/inve")
public class InveController {
    private final InveService inveService;

    public InveController(InveService inveService) {
        this.inveService = inveService;
    }

    @GetMapping
    public R getInve(String supName, PageBean pageBean) {
        return inveService.getInve(supName, pageBean);
    }

    @PutMapping
    public R editInve(@RequestBody InventoryInfo inventoryInfo) {
        return inveService.editInve(inventoryInfo);
    }

    @DeleteMapping("{Iid}")
    public R delInveById(@PathVariable("Iid") Integer id){
        return inveService.delInveById(id);
    }


    @PostMapping
    public R addInve(@RequestBody InventoryInfo inventoryInfo) {
        return inveService.addInve(inventoryInfo);
    }
}
