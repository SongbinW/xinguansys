package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.model.RCode;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.InventoryInfoMapper;
import cn.junang.sys.model.InventoryInfo;
import cn.junang.sys.model.InventoryInfoExample;
import cn.junang.sys.service.InveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author wupl
 * @create 2020-07-10 22:01
 */
@Service
public class InveServiceimpl extends BaseService implements InveService {
    private final InventoryInfoMapper inventoryInfoMapper;

    public InveServiceimpl(InventoryInfoMapper inventoryInfoMapper) {
        this.inventoryInfoMapper = inventoryInfoMapper;
    }

    @Override
    public R getInve(String supName, PageBean pageBean) {
        InventoryInfoExample example = new InventoryInfoExample();
        InventoryInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(supName)) {
            criteria.andSupNameLike("%" + supName + "%");
        }
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<InventoryInfo> info = new PageInfo<>(inventoryInfoMapper.selectByExample(example));
        return R.ok(new PageResult<InventoryInfo>(info.getTotal(), info.getList()));
    }

    @Override
    public R addInve(InventoryInfo inventoryInfo) {
        inventoryInfoMapper.insertSelective(inventoryInfo);
        return R.ok();
    }

    @Override
    public R editInve(InventoryInfo inventoryInfo) {
        InventoryInfo info = inventoryInfoMapper.selectByPrimaryKey(inventoryInfo.getId());
        if (!(info.getSupName()).equals(inventoryInfo.getSupName())){
        }
        inventoryInfoMapper.updateByPrimaryKeySelective(info);
        return R.ok();
    }

    @Override
    public R delInveById(Integer id) {
        inventoryInfoMapper.deleteByPrimaryKey(id);
        return R.ok();
    }


    private boolean isInveExist(String supName) {
        InventoryInfoExample example = new InventoryInfoExample();
        example.createCriteria().andSupNameEqualTo(supName);
        List<InventoryInfo> infos = inventoryInfoMapper.selectByExample(example);
        if (infos != null && infos.size() > 0) {
            return true;
        }
        return false;
    }
}
