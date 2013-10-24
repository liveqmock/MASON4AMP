/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.validation;

import org.metaabm.SImplementationMode;
import org.metaabm.SImplemented;

/**
 * A sample validator interface for {@link org.metaabm.SImplementation}. This
 * doesn't really do anything, and it's not a real EMF artifact. It was
 * generated by the org.eclipse.emf.examples.generator.validator plug-in to
 * illustrate how EMF's code generator can be extended. This can be disabled
 * with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SImplementationValidator {
	boolean validate();

	boolean validatePackage(String value);

	boolean validateClassName(String value);

	boolean validateBasePath(String value);

	boolean validateMode(SImplementationMode value);

	boolean validateTarget(SImplemented value);

	boolean validateQualifiedName(String value);

	boolean validateDerivedPath(String value);

	boolean validateDerivedPackage(String value);

	boolean validateJavaFileLoc(String value);

	boolean validateSrcDir(String value);

	boolean validateBinDir(String value);

	boolean validateClassFileLoc(String value);

	boolean validateDerivedBinDir(String value);

	boolean validateDerivedSrcDir(String value);
}
