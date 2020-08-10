package cn.junang.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @auther wchen
 * @create 2020-07-14
 */
public class MD5Utils {
    /**
     * 密码加密
     * @return
     */
    public static String md5Encryption(String source,String salt){
        String algorithmName = "MD5";//加密算法
        int hashIterations = 1024;//加密次数
        SimpleHash simpleHash = new SimpleHash(algorithmName,source,salt,hashIterations);
        return simpleHash+"";
    }
    //盐池
    public static void main(String[] args) {

        System.out.println(  md5Encryption("123456","1"));
    }
}
