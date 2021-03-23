package osgimath;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		//System.out.println("Hello World!!");
		ConvertService service = new ConvertService();
		context.registerService(ConvertService.class, service, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
