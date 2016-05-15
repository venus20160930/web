package com.venus.frontend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfiguration {

	@Bean
	public TilesViewResolver viewResolver() {
	    
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		//tilesViewResolver.setSuffix(".html");
		return tilesViewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		
	    TilesConfigurer tilesConfigurer = new TilesConfigurer();
	    tilesConfigurer.setDefinitions("WEB-INF/tiles/tiles.xml");
	    tilesConfigurer.setCheckRefresh(true);
	    
	    return tilesConfigurer;    
	}

}
