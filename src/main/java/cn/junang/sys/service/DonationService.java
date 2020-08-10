package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;

/**
 * @author wchen
 * @create 2020-07-09 15:42
 */
public interface DonationService {
    R getAll(PageBean pageBean);
}
