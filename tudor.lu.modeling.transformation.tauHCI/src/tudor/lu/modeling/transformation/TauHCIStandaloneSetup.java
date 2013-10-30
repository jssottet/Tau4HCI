
package tudor.lu.modeling.transformation;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TauHCIStandaloneSetup extends TauHCIStandaloneSetupGenerated{

	public static void doSetup() {
		new TauHCIStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TauHCIPackageImpl.init(); 
		return super.createInjectorAndDoEMFRegistration();
	}


	public static void main(String[] args) throws IOException {
		TauHCIStandaloneSetup gmlS = new TauHCIStandaloneSetup();
		Injector injector = gmlS.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		//test_Px.tauhci "file:///C:/test/test_xs.tauhci
		Resource xtextResource = resourceSet.getResource(URI.createURI("file:///C:/test/test_Px.tauhci"), true);
		xtextResource.load(null);
		EcoreUtil.resolveAll(xtextResource);
		Resource xmiResource = resourceSet.createResource(URI.createURI("file:///C:/test/test_xs.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		xmiResource.save(null);
		System.out.println("Ressource Saved");
	}

}