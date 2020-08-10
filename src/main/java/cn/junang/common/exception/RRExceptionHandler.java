package cn.junang.common.exception;

import cn.junang.common.model.R;
import cn.junang.common.model.RCode;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @auther wchen
 * @create 2020-07-14
 */
@RestControllerAdvice
public class RRExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(ServiceException.class)
    public R handlerRRExceptionHandler(ServiceException e){
        return R.error(e.getRCode());
    }
    @ExceptionHandler(NoHandlerFoundException.class)
    public R handlerNoFoundException(Exception e){
        logger.error(e.getMessage(),e);
        return R.error(RCode.NO_FOUND);
    }
    @ExceptionHandler(DuplicateKeyException.class)
    public R handleDUPlicateKeyException(DuplicateKeyException e){
        logger.error(e.getMessage(),e);
        return R.error(RCode.REPEAT_KEY);
    }
    @ExceptionHandler(AuthorizationException.class)
    public R handAuthorizationException(AuthorizationException e){
        logger.error(e.getMessage(),e);
        return R.error(RCode.AUTHORZITION_ERROR);
    }
}