package cn.junang.common.model;

import lombok.Data;

/**
 * @author songbin
 * @create 2020-07-01 9:19
 */
@Data
public class PageBean {
    private Integer page = 1;
    private Integer size =10;
}
