package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.Matecategory;
import cn.junang.sys.service.MateCaService;
import cn.junang.vo.MateCaVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author wupl
 * @create 2020-07-14 14:05
 */
@RestController
@RequestMapping("wpl/mate")
public class MateCaController {
    private final MateCaService mateCaService;

    public MateCaController(MateCaService mateCaService) {
        this.mateCaService = mateCaService;
    }

    @GetMapping
    public R getmate(String supName, PageBean pageBean){
        return mateCaService.getmate(supName,pageBean);
    }

    @PutMapping
    public R editMate(@RequestBody Matecategory matecategory) {
        return mateCaService.editMate(matecategory);
    }
    @DeleteMapping("{id}")
    public R delMateById(@PathVariable("id") Integer id){
        return mateCaService.delMateById(id);
    }

    @PostMapping
    public R addMate(@RequestBody MateCaVo mateCaVo) {
        return mateCaService.addMate(mateCaVo);
    }


}
