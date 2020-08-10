package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.Scrap_fromMapper;
import cn.junang.sys.model.Scrap_from;
import cn.junang.sys.service.ScrapService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * @author wchen
 * @create 2020-07-10 10:52
 */
@Service
public class ScrapServiceImpl extends BaseService implements ScrapService {
    private final Scrap_fromMapper scrapFromMapper;

    public ScrapServiceImpl(Scrap_fromMapper scrapFromMapper) {
        this.scrapFromMapper = scrapFromMapper;
    }

    @Override
    public R getAll(PageBean pageBean) {
        PageInfo<Scrap_from> info = new PageInfo<>(scrapFromMapper.selectByExample(null));
        return R.ok(info);
    }

    @Override
    public R delete(int id) {
        scrapFromMapper.deleteByPrimaryKey(id);
        return R.ok();
    }
}
