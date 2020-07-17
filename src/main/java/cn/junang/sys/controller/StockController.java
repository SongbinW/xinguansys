package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.wpl.service.StockService;
import org.springframework.web.bind.annotation.*;

/**
 * @author wupl
 * @create 2020-07-16 23:43
 */
@RestController
@RequestMapping("wpl/stock")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping
    public R getsto(String outNumber, PageBean pageBean){
        return stockService.getsto(outNumber,pageBean);
    }

    @DeleteMapping("{id}")
    public R delstoById(@PathVariable("id") Integer id){
        return stockService.delstoById(id);
    }
}
