/**
 * Copyright (c) 2005-2006 Aptana, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 */
package org.eclipse.eclipsemonkey.lang.javascript.doms.views;

import org.eclipse.eclipsemonkey.lang.javascript.doms.IJavaScriptDOMFactory;
import org.mozilla.javascript.Scriptable;

/**
 * @author Paul Colton (Aptana, Inc.)
 * 
 */
public class ViewsDOMFactory implements IJavaScriptDOMFactory {

	/**
	 * ViewsDOMFactory
	 */
	public ViewsDOMFactory() {
	}

	/**
	 * @see org.eclipse.eclipsemonkey.lang.javascript.doms.IJavaScriptDOMFactory#getDOMroot(org.mozilla.javascript.Scriptable)
	 */
	@Override
	public Object getDOMroot(Scriptable scope) {
		return new Views(scope);
	}

}
