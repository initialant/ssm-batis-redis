package com.xxx.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//类型转换器
public class StringToDateConverter implements Converter <String, Date> {
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(source);
			return date;
		} catch (ParseException e) {
			throw new RuntimeException("请输入正确的日期类型，格式为yyyy-MM-dd");
		}
	}
}
