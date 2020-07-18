package cn.junang.sys.service.impl;

import cn.junang.common.model.R;
import cn.junang.sys.mapper.DepartmentMapper;
import cn.junang.sys.model.Department;
import cn.junang.sys.model.DepartmentExample;
import cn.junang.sys.service.DepartmentService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wchen
 * @create 2020-07-18 16:20
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public R getDeptAll() {
        List<Department> departments = departmentMapper.selectByExample(null);
        return R.ok(departments);
    }
}
