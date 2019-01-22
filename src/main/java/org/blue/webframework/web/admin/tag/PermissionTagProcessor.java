package org.blue.webframework.web.admin.tag;

import org.blue.webframework.utils.ServerHelper;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class PermissionTagProcessor extends AbstractElementTagProcessor {

	private static final String TAG_NAME = "permission";// 标签名
	private static final int PRECEDENCE = 10000;// 优先级

	public PermissionTagProcessor(String dialectPrefix) {
		super(TemplateMode.HTML, // 此处理器将仅应用于HTML模式
				dialectPrefix, // 要应用于名称的匹配前缀
				TAG_NAME, // 标签名称：匹配此名称的特定标签
				true, // 将标签前缀应用于标签名称
				null, // 无属性名称：将通过标签名称匹配
				false, // 没有要应用于属性名称的前缀
				PRECEDENCE); // 优先(内部方言自己的优先)

	}

	/**
	 * context 页面上下文 tag 标签
	 * 
	 */
	@Override
	protected void doProcess(final ITemplateContext context, final IProcessableElementTag tag,
			final IElementTagStructureHandler structureHandler) {


		Long roleId = ServerHelper.getCurrentRoleId();
		Long accountId = ServerHelper.getCurrentAccountId();
		String resource = tag.getAttributeValue("resource");
		String action = tag.getAttributeValue("action");


		if (!"admin".equals(roleId))
			structureHandler.removeElement();
		else
			structureHandler.removeTags();
	}

}
