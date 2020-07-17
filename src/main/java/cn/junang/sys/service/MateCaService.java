package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.Matecategory;
import cn.junang.vo.MateCaVo;

/**
 * @author wupl
 * @create 2020-07-14 14:01
 */
public interface MateCaService {
    R getmate(String supName, PageBean pageBean);

    R delMateById(Integer id);

    R addMate(MateCaVo mateCaVo);

    R editMate(Matecategory matecategory);

}
