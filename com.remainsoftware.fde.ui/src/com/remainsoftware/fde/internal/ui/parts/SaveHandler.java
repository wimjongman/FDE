package com.remainsoftware.fde.internal.ui.parts;

import java.io.IOException;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class SaveHandler {

	@Execute
	public void execute(Resource resource, Shell shell) throws IOException {
		FileDialog fd = new FileDialog(shell);
		fd.setText("Save as");
		fd.setFilterNames(new String[] { "model" });
		String result = fd.open();
		if (result != null) {
			resource.setURI(URI.createFileURI(result));
			resource.save(null);
		}
	}
}
