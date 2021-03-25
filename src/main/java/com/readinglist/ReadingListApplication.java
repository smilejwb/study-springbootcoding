package com.readinglist;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication	// ������Ʈ �˻��� �ڵ� ���� Ȱ��ȭ
public class ReadingListApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		// ���ø����̼� ��Ʈ��Ʈ��
		SpringApplication.run(ReadingListApplication.class, args);
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// /login ��θ� login ���ø����� ����
		registry.addViewController("/login").setViewName("login");
	}
	
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		// Reader Ÿ���� ��ü�� ��Ʈ�ѷ� �Ű������� ���� �� ó���� ������ ����
		argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
	}

}
