package org.blue.webframework.framework.webservice;

import java.io.IOException;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;


/**
 * webapi的json格式
 * @author Long
 *
 */
public class WebApiResultConverter extends MappingJackson2HttpMessageConverter {

	@Override
	protected void writeInternal(Object value, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

		if (value == null ||!( value instanceof ResultModel))
		{
			ResultModel model = new ResultModel();
			model.setData(value);
			ResultModel.Result result = new ResultModel.Result();
			result.setCode("0000");
			result.setMessage("操作成功");
			model.setResult(result);
			value=model;
		}
		super.writeInternal(value, httpOutputMessage);
	}
}
