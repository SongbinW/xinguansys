package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.Donation_formMapper;
import cn.junang.sys.model.Donation_form;
import cn.junang.sys.service.DonationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * @author Mr.s°
 * @create 2020-07-09 15:42
 */
@Service
public class DonationServiceImpl extends BaseService implements DonationService {
    private final Donation_formMapper donationMapper;

    public DonationServiceImpl(Donation_formMapper donationMapper) {
        this.donationMapper = donationMapper;
    }


    @Override
    public R getAll(PageBean pageBean) {
        PageHelper.startPage(pageBean.getPage(),pageBean.getSize());
        PageInfo<Donation_form> formPageInfo = new PageInfo<>(donationMapper.selectByExample(null));
        return R.ok(new PageResult<Donation_form>(formPageInfo.getTotal(),formPageInfo.getList()));
    }

}
