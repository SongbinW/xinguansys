package cn.junang.Shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author Mr.s°
 * @create 2020-07-10 14:12
 */
public class JWTToken implements AuthenticationToken {

    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}