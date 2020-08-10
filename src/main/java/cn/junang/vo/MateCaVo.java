package cn.junang.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author wchen
 * @create 2020-2020/7/17 14:36
 */
public class MateCaVo {
    private Integer id;
    @NotBlank(message = "分类名称不能为空")
    private String supName;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date CreateTime;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date modifindTime;

}
