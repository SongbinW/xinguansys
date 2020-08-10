package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.InventoryInfo;
import cn.junang.sys.model.Pur_information;
import cn.junang.sys.service.PurInfoService;
import org.springframework.web.bind.annotation.*;

/**
 * @author wchen
 * @create 2020-07-16 21:09
 */
@RestController
@RequestMapping("wpl/purinfo")
public class PurInfoController {
    private final PurInfoService purInfoService;

    public PurInfoController(PurInfoService purInfoService) {
        this.purInfoService = purInfoService;
    }
    @GetMapping
    public R getpur(String purNumber, PageBean pageBean){
        return purInfoService.getpur(purNumber,pageBean);
    }

    @PostMapping
    public R addPur(@RequestBody Pur_information purinformation) {
        return purInfoService.addPur(purinformation);
    }


    @DeleteMapping("{id}")
    public R delPurById(@PathVariable("id") Integer id){
        return purInfoService.delPurById(id);
    }

}
