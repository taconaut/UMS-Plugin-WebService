package github.com.taconaut.plugin.webservice;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract base class to create web services
 */
public abstract class WebServiceBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebServiceBase.class);
	protected boolean isInitialized;

	/**
	 * The published endpoint
	 */
	private Endpoint endpoint = null;

	/**
	 * 
	 * Start to listen for remote requests
	 * 
	 * @param host IP or host name
	 * @param port port to use
	 * @param path name of the web service
	 */
	public void bind(String host, int port, String path) {
		String endpointURL = String.format("http://%s:%s/%s", host, port, path);
		try {
			endpoint = Endpoint.publish(endpointURL, this);
			isInitialized = true;
			LOGGER.info(String.format("Sucessfully bound enpoint: %s", endpointURL));
		} catch (Exception e) {
			LOGGER.error(String.format("Failed to bind enpoint: %s", endpointURL), e);
		}
	}

	/**
	 * Stop the webservice
	 */
	public void shutdown() {
		LOGGER.info("Shut down " + getClass().getName());

		if (endpoint != null) {
			endpoint.stop();
		}
		endpoint = null;
	}
}