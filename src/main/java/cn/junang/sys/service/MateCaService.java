package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.Matecategory;
import cn.junang.vo.MateCaVo;

/**
 * @author wchen
 * @create 2020-07-14 14:01
 */
public interface MateCaService {
    R getmate(String supName, PageBean pageBean);

    R delMateById(Integer id);

    R addMate(Matecategory matecategory);

    R editMate(Matecategory matecategory);

}
