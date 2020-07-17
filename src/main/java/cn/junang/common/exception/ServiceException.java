package cn.junang.common.exception;

import cn.junang.common.model.RCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mr.s°
 * @create 2020-07-14 15:00
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServiceException extends RuntimeException{
    private RCode rCode;
}
