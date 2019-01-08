package org.blue.webframework.web.admin.tag;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

public class PrivilegeDialect extends AbstractProcessorDialect {

	private static final String TAG_NAME = "Privilege";// 标签名

	public PrivilegeDialect() {
		super(TAG_NAME, "privilege", 1000);

	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		Set<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new PermissionTagProcessor(dialectPrefix));// 添加我们定义的标签

		return processors;

	}

}
