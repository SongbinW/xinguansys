package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.Pur_information;

/**
 * @author wupl
 * @create 2020-07-16 21:07
 */
public interface PurInfoService {
    R getpur(String purNumber, PageBean pageBean);

    R delPurById(Integer id);

    R addPur(Pur_information purinformation);
}
