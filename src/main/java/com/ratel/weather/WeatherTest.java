package com.ratel.weather;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @业务描述：
 * @package_name： com.ratel.weather
 * @project_name： weather
 * @author： ratelfu@qq.com
 * @create_time： 2021-07-23
 * @copyright (c) ratelfu 版权所有
 */
public class WeatherTest {
    public static void main(String[] args) throws MalformedURLException {
        //也可以使用new WeatherWebService(url)此方法可重新设置请求的地址
        //URL url=new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl");
        //WeatherWebService factory = new WeatherWebService(url);
        WeatherWebService factory = new WeatherWebService();
        WeatherWebServiceSoap weatherWebServiceSoap = factory.getWeatherWebServiceSoap(); //WeatherWebServiceSoap为调用的实现类
        ArrayOfString strArray = null;
        strArray = weatherWebServiceSoap.getWeatherbyCityName("郑州");
        System.out.println(strArray.getString());
    }
}
