package jisoo.spring.web.controller;

/**
 * 최종적으로 실행될 view 경로와 파일명을 완성해주는 클래스.
 */
public class ViewResolver {
	private String prefix;
	private String suffix;
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getView(String viewName) {
		return prefix + viewName + suffix;
	}
}
