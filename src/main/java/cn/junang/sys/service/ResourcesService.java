package cn.junang.sys.service;

import cn.junang.common.model.R;
import cn.junang.sys.model.SysResources;
import cn.junang.vo.MenuNodeVo;

import java.util.List;

/**
 * @author songbin
 * @create 2020-06-29 17:33
 */
public interface ResourcesService {

    R getMenu();
    List<MenuNodeVo> getTree(List<SysResources> ress);

    R getAll();

}
