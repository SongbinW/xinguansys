package cn.junang.wpl.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;

/**
 * @author wupl
 * @create 2020-07-16 23:41
 */
public interface StockService {
    R getsto(String outNumber, PageBean pageBean);

    R delstoById(Integer id);
}
