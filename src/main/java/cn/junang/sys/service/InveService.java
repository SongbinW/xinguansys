package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.InventoryInfo;

/**
 * @author wupl
 * @create 2020-07-10 22:00
 */
public interface InveService {
    R getInve(String supName,PageBean pageBean);

    R addInve(InventoryInfo inventoryInfo);

    R editInve(InventoryInfo inventoryInfo);

    R delInveById(Integer id);
}
