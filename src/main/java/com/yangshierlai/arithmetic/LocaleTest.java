package com.yangshierlai.arithmetic;

import java.util.Locale;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/7 17:38
 * @Version
 **/
public class LocaleTest {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("返回国家地区代码   "+defaultLocale.getCountry());
        System.out.println("返回国家地区语言   "+defaultLocale.getLanguage());
        System.out.println("返回适合向用户显示的国家信息   "+defaultLocale.getDisplayCountry());
        System.out.println("返回适合向用户展示的语言信息   "+defaultLocale.getDisplayLanguage());
        System.out.println("返回适合向用户展示的语言环境名   "+defaultLocale.getDisplayName());

    }


}