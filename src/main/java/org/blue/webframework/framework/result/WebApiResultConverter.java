package org.blue.webframework.framework.result;

import java.io.IOException;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;


/**
 * webapi的json格式
 * @author Long
 *
 */
public class WebApiResultConverter extends FastJsonHttpMessageConverter {

	public WebApiResultConverter() {
		FastJsonConfig fastJsonConfig=new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteMapNullValue);
		setFastJsonConfig(fastJsonConfig);
	}
	
	@Override
	protected void writeInternal(Object value, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

		if (value == null ||!( value instanceof ResultModel))
		{
			ResultModel model = new ResultModel();
			model.setData(value);

			model.setCode("0");
			model.setMessage("操作成功");

			value=model;
		}
		super.writeInternal(value, httpOutputMessage);
	}
	
	static class ResultModel {

		private Object data;

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		private String code, message;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
}
