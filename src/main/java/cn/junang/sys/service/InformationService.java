package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;

/**
 * @author wchen
 * @create 2020-07-14 9:37
 */
public interface InformationService {
    R getAll(String supName, PageBean pageBean);

    R delete(int id);
}
