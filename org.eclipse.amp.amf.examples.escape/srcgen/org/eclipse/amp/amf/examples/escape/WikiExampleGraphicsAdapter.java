package org.eclipse.amp.amf.examples.escape;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.GraphicsAdapter;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.core.runtime.IAdapterFactory;

import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * <!-- begin-user-doc -->
 * WikiExample Java Implementation.
 * 
 * Generated by AMF for model: WikiExample.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiExampleGraphicsAdapter extends GraphicsAdapter {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static IGraphicsAdapter singleton;

	IColorProvider[] wikiExampleColorProviders = new IColorProvider[]{};
	IColorProvider[] individualColorProviders = new IColorProvider[]{SimpleDrawColorProvider
			.getDefault()};
	IColorProvider[] blockColorProviders = new IColorProvider[]{};

	IFigureProvider[] wikiExampleFigureProviders = new IFigureProvider[]{};
	IFigureProvider[] individualFigureProviders = new IFigureProvider[]{SimpleDrawFigureProvider
			.getDefault()};
	IFigureProvider[] blockFigureProviders = new IFigureProvider[]{};

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getColorsForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IColorProvider[] getColorsForClass(Class type) {
		if (type == WikiExample.class) {
			return wikiExampleColorProviders;
		}
		if (type == Individual.class) {
			return individualColorProviders;
		}
		if (type == Block.class) {
			return blockColorProviders;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getFiguresForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFigureProvider[] getFiguresForClass(Class type) {
		if (type == WikiExample.class) {
			return wikiExampleFigureProviders;
		}
		if (type == Individual.class) {
			return individualFigureProviders;
		}
		if (type == Block.class) {
			return blockFigureProviders;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getLabelsForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILabelProvider[] getLabelsForClass(Class type) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IGraphicsAdapter getDefault() {
		if (singleton == null) {
			singleton = new WikiExampleGraphicsAdapter();
		}
		return singleton;
	}
}
