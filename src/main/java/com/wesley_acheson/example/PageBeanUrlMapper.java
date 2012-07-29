package com.wesley_acheson.example;

import java.util.Map;

import javax.annotation.Resource;

import com.wesley_acheson.spring.UrlBackingBeanMapper;

/**
 * 
 * A simplistic example of a UrlBackingBeanMapper which is not meant to represent real life.
 * 
 * Real implentations would probably be backed by a database or similar.
 * @author Wesley Acheson
 *
 */
public class PageBeanUrlMapper implements UrlBackingBeanMapper<Page> {
	@Resource
	private Map<String, Page> pages;

	public Map<String, Page> getPages() {
		return pages;
	}

	public void setPages(Map<String, Page> pages) {
		this.pages = pages;
	}

	@Override
	public boolean isPathMapped(String relativePath) {
		return pages.containsKey(relativePath);
	}

	@Override
	public Page retrieveBackingBean(String relativePath) {
		return pages.get(relativePath);
	}

}
