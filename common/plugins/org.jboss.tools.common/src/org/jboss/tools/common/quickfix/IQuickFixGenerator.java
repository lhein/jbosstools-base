/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.jboss.tools.common.quickfix;

import org.eclipse.jdt.ui.text.java.IJavaCompletionProposal;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;

public interface IQuickFixGenerator {
	
	/**
     * Returns whether there are any proposals for the given annotation.
     *
     * @param annotation the annotation
     * @return <code>true</code> if there are proposals for the given annotation,
     *   <code>false</code> if not
     */
	public boolean hasProposals(Annotation annotation, Position position);
	
	/**
     * Returns array of proposals for the given annotation (may
     * be empty).
     *
     * @param annotation the annotation
     * @return list of proposals for the given annotation
     */
	public IJavaCompletionProposal[] getProposals(Annotation annotation, Position position);
}
