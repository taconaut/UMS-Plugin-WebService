package github.com.taconaut.plugin.webservice;

import javax.swing.JComponent;
import javax.swing.JLabel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.pms.PMS;
import net.pms.external.ExternalListener;
import net.pms.network.NetworkConfiguration;

public class WebServicePlugin implements ExternalListener {
	private static final Logger log = LoggerFactory.getLogger(WebServicePlugin.class);

	private ConfigurationWebService configurationWs;
	private String configurationWsName = "UmsConfiguration";

	private FileSystemWebService fileSystemWs;
	private String fileSystemWsName = "FileSystem";

	private String hostName;
	private int port = 54425;

	public WebServicePlugin() {
		// Disable logging of stack traces when throwing exceptions through the web services
		System.setProperty(
				"com.sun.xml.internal.ws.fault.SOAPFaultBuilder.disableCaptureStackTrace",
				"false");

		hostName = getHostName();

		// check if the port has been overridden in the config
		Object tmpPort = PMS.getConfiguration().getCustomProperty("ConfigurationWS_Port");
		if (tmpPort instanceof Integer) {
			port = (Integer) tmpPort;
		}

		Object portProp = PMS.getConfiguration().getCustomProperty("WebServicePluginPort");
		if (portProp != null && portProp instanceof String) {
			try {
				port = Integer.parseInt((String) portProp);
			} catch (NumberFormatException ex) {
				log.error(String.format("Found configured port but failed to parse '%s'. Using default port %s", portProp, port));
			}
		}

		configurationWs = new ConfigurationWebService();
		configurationWs.bind(hostName, port, configurationWsName);

		fileSystemWs = new FileSystemWebService();
		fileSystemWs.bind(hostName, port, fileSystemWsName);
	}

	private static String getHostName() {
		return NetworkConfiguration.getInstance().getDefaultNetworkInterfaceAddress().getAddr().getHostName();
	}

	public JComponent config() {
		String configEndPoint = "http://" + hostName + ":" + port + "/" + configurationWsName + "?wsdl";
		String fileSystemEndPoint = "http://" + hostName + ":" + port + "/" + fileSystemWsName + "?wsdl";
		return new JLabel(String.format("<html>This plugin exposes web services and can't be configured.<br><br>%s<br>%s</html>", configEndPoint, fileSystemEndPoint));
	}

	public String name() {
		return "Web service plugin";
	}

	public void shutdown() {
		configurationWs.shutdown();
	}
}