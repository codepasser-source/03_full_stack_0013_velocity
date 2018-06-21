package com.mattdamon.core.view;

import java.util.Locale;
import java.util.Map;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class MultipartViewResolver implements ViewResolver {

	private Map<String, ViewResolver> resolvers;

	public void setResolvers(Map<String, ViewResolver> resolvers) {
		this.resolvers = resolvers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.ViewResolver#resolveViewName(java.lang
	 * .String, java.util.Locale)
	 */
	@Override
	public View resolveViewName(String viewName, Locale locale)
			throws Exception {
		System.out.println(viewName);
		int n = viewName.lastIndexOf(".");
		if (n == (-1)) {
			return null;
		}
		// 根据扩展名判断resolver
		String suffix = viewName.substring(n + 1);
		ViewResolver resolver = resolvers.get(suffix);
		if (resolver != null) {
			return resolver.resolveViewName(viewName.substring(0, n), locale);
		}
		return null;
	}

}
