package de.androidcrypto.desfiretoolsforandroidsdk33;

import android.app.Application;

import de.androidcrypto.desfiretoolsforandroidsdk33.keys.DataSource;

public class MainApplication extends Application {

	private static MainApplication application;
	
	private DataSource dataSource;
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		MainApplication.application = this;
		
		this.dataSource = new DataSource(this);
		this.dataSource.loadAll();
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public static MainApplication getInstance() {
		return application;
	}
}

