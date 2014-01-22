package com.remainsoftware.fde.internal.ui.parts;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;

public class RunImportHandler {

	@Execute
	public void execute(MDirectMenuItem item) {
		System.err.println(item.getPersistedState().get("service"));
	}
}
