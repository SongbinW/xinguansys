package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.model.RCode;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.Pur_applicationMapper;
import cn.junang.sys.mapper.Pur_informationMapper;
import cn.junang.sys.model.InventoryInfo;
import cn.junang.sys.model.InventoryInfoExample;
import cn.junang.sys.model.Pur_information;
import cn.junang.sys.model.Pur_informationExample;
import cn.junang.sys.service.PurInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author wupl
 * @create 2020-07-16 21:07
 */
@Service
public class Pur_InfoServiceImpl extends BaseService implements PurInfoService {
    private final Pur_informationMapper purinformationMapper;

    public Pur_InfoServiceImpl(Pur_informationMapper purinformationMapper) {
        this.purinformationMapper = purinformationMapper;
    }


    @Override
    public R getpur(String purNumber, PageBean pageBean) {
        Pur_informationExample example = new Pur_informationExample();
        Pur_informationExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(purNumber)){
            criteria.andPurNumberLike("%" + purNumber + "%");
        }
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<Pur_information> info = new PageInfo<Pur_information>(purinformationMapper.selectByExample(example));
        return R.ok(new PageResult<Pur_information>(info.getTotal(),info.getList()));
    }

    @Override
    public R delPurById(Integer id) {
        purinformationMapper.deleteByPrimaryKey(id);
        return R.ok();
    }

    @Override
    public R addPur(Pur_information purinformation) {
        if (isInveExist(purinformation.getPurNumber())) {
            return R.error(RCode.INVE_NAME_REPEAT);
        }
        purinformationMapper.insertSelective(purinformation);
        return R.ok();
    }

    private boolean isInveExist(String purNumber) {
        Pur_informationExample example = new Pur_informationExample();
        example.createCriteria().andPurNumberEqualTo(purNumber);
        List<Pur_information> pur = purinformationMapper.selectByExample(example);
        if (pur != null && pur.size() > 0) {
            return true;
        }
        return false;
    }
}
