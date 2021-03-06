package cn.junang.sys.service.impl;

import cn.junang.common.model.R;
import cn.junang.sys.mapper.MsgInfoMapper;
import cn.junang.sys.model.MsgInfo;
import cn.junang.sys.model.MsgInfoExample;
import cn.junang.sys.service.MsgEditService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wchen
 * @create 2020-07-09 18:04
 */
@Service
public class MsgEditServiceImpl implements MsgEditService {
    private final MsgInfoMapper msgInfoMapper;

    public MsgEditServiceImpl(MsgInfoMapper msgInfoMapper) {
        this.msgInfoMapper = msgInfoMapper;
    }

    @Override
    public R getMsgData() {
        MsgInfoExample Example = new MsgInfoExample();
        List<MsgInfo> msgInfos = msgInfoMapper.selectByExample(Example);
        return R.ok(msgInfos);
    }

    @Override
    public R editMsgFrom(MsgInfo msgInfo) {
        msgInfoMapper.selectByPrimaryKey(msgInfo.getId());
        msgInfoMapper.updateByPrimaryKeySelective(msgInfo);
        return R.ok();
    }
}

