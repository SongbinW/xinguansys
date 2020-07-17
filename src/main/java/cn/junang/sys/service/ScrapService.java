package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;

/**
 * @author Mr.s°
 * @create 2020-07-10 10:52
 */
public interface ScrapService {
    R getAll(PageBean pageBean);

    R delete(int id);

}
