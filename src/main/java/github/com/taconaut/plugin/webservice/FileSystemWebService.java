package github.com.taconaut.plugin.webservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Exposes methods to retrieve directories from the host.
 */
@WebService(serviceName = "FileSystem", targetNamespace = "http://universalmediaserver.com/filesystem")
public class FileSystemWebService extends WebServiceBase {

	/**
	 * returns all root folders.
	 *
	 * @return the root folders
	 */
	@WebMethod()
	public List<String> getRoots() {
		List<String> roots = new ArrayList<String>();
		for (File child : File.listRoots()) {
			roots.add(child.getAbsolutePath());
		}
		return roots;
	}

	/**
	 * Gets the child folders (which are not hidden) for the given folder path.
	 *
	 * @param folderPath the folder path
	 * @return the child folders
	 * @throws FileNotFoundException Thrown then the folder path doesn't exist
	 */
	@WebMethod()
	public List<String> getChildFolders(@WebParam(name = "folderPath") String folderPath) throws FileNotFoundException {
		List<String> children = new ArrayList<String>();
		File d = new File(folderPath);
		if (d.isDirectory()) {
			for (File child : d.listFiles()) {
				if (child.isDirectory() && !child.isHidden()) {
					children.add(child.getAbsolutePath());
				}
			}
		} else {
			throw new FileNotFoundException();
		}
		return children;
	}
}
