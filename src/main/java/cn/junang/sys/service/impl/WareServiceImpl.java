package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.WareInfoMapper;
import cn.junang.sys.model.WareInfo;
import cn.junang.sys.model.WareInfoExample;
import cn.junang.wpl.service.WareService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * @author wupl
 * @create 2020-07-10 12:04
 */
@Service
public class WareServiceImpl extends BaseService implements WareService {
    private final WareInfoMapper wareInfoMapper;

    public WareServiceImpl(WareInfoMapper wareInfoMapper) {
        this.wareInfoMapper = wareInfoMapper;
    }

    @Override
    public R getWare(PageBean pageBean) {
        WareInfoExample example = new WareInfoExample();
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<WareInfo> info = new PageInfo<>(wareInfoMapper.selectByExample(example));
        return R.ok(new PageResult<WareInfo>(info.getTotal(),info.getList()));
    }
}
