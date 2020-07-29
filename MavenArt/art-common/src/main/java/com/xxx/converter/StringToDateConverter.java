package com.xxx.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//����ת����
public class StringToDateConverter implements Converter <String, Date> {
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(source);
			return date;
		} catch (ParseException e) {
			throw new RuntimeException("��������ȷ���������ͣ���ʽΪyyyy-MM-dd");
		}
	}
}
