package cn.junang.vo;

import lombok.Data;

import java.util.List;

/**
 * @author wchen
 * @create 2020-06-29 17:09
 */
@Data
public class MenuNodeVo {
    private long id;
    private long pid;
    private String name;
    private String icon;
    private String url;
    private List<MenuNodeVo> children;
}
