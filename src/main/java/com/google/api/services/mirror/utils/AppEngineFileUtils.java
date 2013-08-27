package com.google.api.services.mirror.utils;

import java.util.logging.Logger;


public final class AppEngineFileUtils
{

	private static final Logger LOG = Logger.getLogger(AppEngineFileUtils.class.getSimpleName());

	public static final String APP_ENGINE_URL = "app_engine_url";

	public static final String getAppURL()
	{

		LOG.fine("Getting the app engine URL");

		String appURL = System.getProperty(APP_ENGINE_URL);

		if (appURL == null)
		{
			throw new IllegalArgumentException("Unable to get your app engine URL in the system");
		}
		else
		{
			return appURL;
		}
			

	}

}
