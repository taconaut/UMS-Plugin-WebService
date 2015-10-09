package github.com.taconaut.plugin.webservice;

import javax.swing.JComponent;
import javax.swing.JLabel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.pms.PMS;
import net.pms.external.ExternalListener;
import net.pms.network.NetworkConfiguration;

public class WebServicePlugin implements ExternalListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebServicePlugin.class);

	private ConfigurationWebService configurationWs;
	private String configurationWsName = "Configuration";

	private FileSystemWebService fileSystemWs;
	private String fileSystemWsName = "FileSystem";

	private String hostName;
	private int port = 54425;

	public WebServicePlugin() {
		// Disable logging of stack traces when throwing exceptions through the web services
		System.setProperty("com.sun.xml.internal.ws.fault.SOAPFaultBuilder.disableCaptureStackTrace", "false");

		hostName = getHostName();

		// check if the port has been overridden in the configuration
		Object portProperty = PMS.getConfiguration().getCustomProperty("WebServicePluginPort");
		if (portProperty != null && portProperty instanceof String) {
			try {
				port = Integer.parseInt((String) portProperty);
				LOGGER.info(String.format("Using port=%s configured in the UMS configuration", port));
			} catch (NumberFormatException ex) {
				LOGGER.error(String.format("Found configured port but failed to parse '%s'. Using default port %s", portProperty, port));
			}
		}

		// Instantiate and bind the web services
		configurationWs = new ConfigurationWebService();
		configurationWs.bind(hostName, port, configurationWsName);

		fileSystemWs = new FileSystemWebService();
		fileSystemWs.bind(hostName, port, fileSystemWsName);
	}

	private static String getHostName() {
		return NetworkConfiguration.getInstance().getDefaultNetworkInterfaceAddress().getAddr().getHostName();
	}

	public JComponent config() {
		String configurationWsEndPoint = String.format("http://%s:%s/%s?wsdl", hostName, port, configurationWsName);
		String fileSystemWsEndPoint = String.format("http://%s:%s/%s?wsdl", hostName, port, fileSystemWsName);

		return new JLabel(String.format("<html>This plugin exposes web services.<br>The web service port can be configured by adding e.g. 'WebServicePluginPort=1234' in your UMS.conf file.<br><br>%s<br>%s</html>", configurationWsEndPoint, fileSystemWsEndPoint));
	}

	public String name() {
		return "Web service plugin";
	}

	public void shutdown() {
		configurationWs.shutdown();
		fileSystemWs.shutdown();
	}
}