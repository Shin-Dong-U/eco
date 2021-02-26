package com.goott.eco.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

//	ServletRegistration 클래스는 servlet 3.0이상 필요(pom 수정 필요)
//	@Override
//	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//		
//	}
}
