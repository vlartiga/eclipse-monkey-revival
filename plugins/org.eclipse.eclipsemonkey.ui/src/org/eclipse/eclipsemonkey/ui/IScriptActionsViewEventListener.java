/**
 * Copyright (c) 2005-2006 Aptana, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 */
package org.eclipse.eclipsemonkey.ui;

import org.eclipse.eclipsemonkey.ui.event.ScriptActionsViewEvent;

/**
 * @author Paul Colton
 */
public interface IScriptActionsViewEventListener {

	/**
	 * onActionsViewEvent
	 * 
	 * @param event
	 */
	void onScriptActionsViewEvent(ScriptActionsViewEvent event);
}
