package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.Pur_informationMapper;
import cn.junang.sys.model.Pur_information;
import cn.junang.sys.model.Pur_informationExample;
import cn.junang.sys.service.InformationService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author Mr.s°
 * @create 2020-07-14 9:37
 */
@Service
public class InformationServiceImpl extends BaseService implements InformationService {
    private final Pur_informationMapper informationMapper;

    public InformationServiceImpl(Pur_informationMapper informationMapper) {
        this.informationMapper = informationMapper;
    }

    @Override
    public R getAll(String supName, PageBean pageBean) {
        Pur_informationExample example = new Pur_informationExample();
        Pur_informationExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(supName)) {
            criteria.andSupNameLike("%" + supName + "%");
        }
        PageInfo<Pur_information> info = new PageInfo<>(informationMapper.selectByExample(null));
        return R.ok(info);
    }

    @Override
    public R delete(int id) {
        informationMapper.deleteByPrimaryKey(id);
        return R.ok();
    }

}
