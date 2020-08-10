package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.StockOutinfoMapper;
import cn.junang.sys.model.Pur_information;
import cn.junang.sys.model.StockOutinfo;
import cn.junang.sys.model.StockOutinfoExample;
import cn.junang.sys.service.StockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author wchen
 * @create 2020-07-16 23:41
 */
@Service
public class StockServiceImpl extends BaseService implements StockService {
    private final StockOutinfoMapper stockOutinfoMapper;


    public StockServiceImpl(StockOutinfoMapper stockOutinfoMapper) {
        this.stockOutinfoMapper = stockOutinfoMapper;
    }

    @Override
    public R getsto(String outNumber, PageBean pageBean) {
        StockOutinfoExample example = new StockOutinfoExample();
        StockOutinfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(outNumber)){
            criteria.andOutNumberLike("%" + outNumber + "%");
        }
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<StockOutinfo> info = new PageInfo<>(stockOutinfoMapper.selectByExample(example));
        return R.ok(new PageResult<StockOutinfo>(info.getTotal(),info.getList()));
    }

    @Override
    public R delstoById(Integer id) {
        stockOutinfoMapper.deleteByPrimaryKey(id);
        return R.ok();
    }
}
