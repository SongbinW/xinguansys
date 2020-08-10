package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.model.RCode;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.MatecategoryMapper;
import cn.junang.sys.model.Matecategory;
import cn.junang.sys.model.MatecategoryExample;
import cn.junang.sys.service.MateCaService;
import cn.junang.vo.MateCaVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @author wchen
 * @create 2020-07-14 14:02
 */
@Service
public class MateCaServiceImpl extends BaseService implements MateCaService {
    private final MatecategoryMapper matecategoryMapper;

    public MateCaServiceImpl(MatecategoryMapper matecategoryMapper) {
        this.matecategoryMapper = matecategoryMapper;
    }

    @Override
    public R getmate(String supName, PageBean pageBean) {
        MatecategoryExample example = new MatecategoryExample();
        MatecategoryExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(supName)) {
            criteria.andSupNameLike("%" + supName + "%");
        }
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<Matecategory> info = new PageInfo<>(matecategoryMapper.selectByExample(example));
        return R.ok(new PageResult<Matecategory>(info.getTotal(), info.getList()));
    }

    @Override
    public R delMateById(Integer id) {
        matecategoryMapper.deleteByPrimaryKey(id);
        return R.ok();
    }

    @Override
    public R addMate(Matecategory matecategory) {
        matecategoryMapper.insertSelective(matecategory);
        return R.ok();
    }

    @Override
    public R editMate(Matecategory matecategory) {
        Matecategory mate = matecategoryMapper.selectByPrimaryKey(matecategory.getId());
        if (!(mate.getSupName()).equals(matecategory.getSupName())){
        }
        matecategoryMapper.updateByPrimaryKeySelective(mate);
        return R.ok();
    }

    private boolean isMateExist(String supName) {
        MatecategoryExample example = new MatecategoryExample();
        example.createCriteria().andSupNameEqualTo(supName);
        List<Matecategory> matecategories = matecategoryMapper.selectByExample(example);
        if (matecategories != null && matecategories.size() > 0) {
            return true;
        }
        return false;
    }

}
