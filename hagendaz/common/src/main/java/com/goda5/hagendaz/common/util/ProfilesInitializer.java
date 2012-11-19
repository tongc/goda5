package com.goda5.hagendaz.common.util;

import java.io.IOException;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.support.ResourcePropertySource;

public class ProfilesInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(final ConfigurableApplicationContext ctx) {
		try {
			final String profilesSysProp = System.getProperty("spring.profiles.active");
			// if we set it explicitly such as in command line, then we honour
			// this.
			if (profilesSysProp != null) {
				return;
			}
			final String confFileFolder = System.getenv("GODA_HOME");
			ctx.getEnvironment().getPropertySources()
					.addFirst(new ResourcePropertySource("file://" + confFileFolder + "/goda5.properties"));
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}

}
