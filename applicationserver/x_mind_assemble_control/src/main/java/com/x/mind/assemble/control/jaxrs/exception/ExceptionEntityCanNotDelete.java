package com.x.mind.assemble.control.jaxrs.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionEntityCanNotDelete extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionEntityCanNotDelete( String message ) {
		super( "信息无法删除！MESSAGE：" + message  );
	}
}
