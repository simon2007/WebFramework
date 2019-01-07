package org.blue.webframework.framework.web;

import java.lang.reflect.Field;

import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;

public class XmlResultConver extends Jaxb2RootElementHttpMessageConverter {

	@Override
	protected void customizeMarshaller(Marshaller marshaller) {
		try {
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setListener(new MarshallerListener());
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
			//转换所有的适配字符，包括xml实体字符&lt;和&gt;，xml实体字符在好多处理xml
			//的框架中是处理不了的，除非序列化。
		} catch (PropertyException e) {
			e.printStackTrace();
		}
		super.customizeMarshaller(marshaller);
	}
	
	static class MarshallerListener extends Marshaller.Listener
	{
		public static final String BLANK_CHAR = "";  
		  
	    @Override  
	    public void beforeMarshal(Object source) {  
	        super.beforeMarshal(source);  
	        Field[] fields = source.getClass().getDeclaredFields();  
	        for (Field f : fields) {  
	            f.setAccessible(true);  
	            //获取字段上注解<pre name="code" class="java">            
	             try {  
	                    if (f.getType() == String.class && f.get(source) == null) {  
	                        f.set(source, BLANK_CHAR);  
	                    }  
	                } catch (IllegalAccessException e) {  
	                    e.printStackTrace();  
	                }  
	        }  
	    }
	    
	}
}
