package name.milesparker.epi.region;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.GraphicsAdapter;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.core.runtime.IAdapterFactory;

import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * <!-- begin-user-doc -->
 * City Java Implementation.
 * A simple model of epidemic dynamics. We define individual agents with different disease states. The progression of disease moves from succeptible to exposed to infectious (either symptomatic or asymptomatic) to some outcome state. Agents can transmit infection to their immediate neighbors.

For some background on the general approach, see Joshua M. Epstein. "Generative Social Science". 2006. Princeton. 

Copyright 2009, Miles Parker. Released under Eclipse Public License. All uses should be attributed.
 * Generated by AMF for model: EpidemicRegional.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class CityGraphicsAdapter extends GraphicsAdapter {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static IGraphicsAdapter singleton;

	IColorProvider[] cityColorProviders = new IColorProvider[]{CityStyle2DColorProvider
			.getDefault()};
	IColorProvider[] individualColorProviders = new IColorProvider[]{IndividualStyle2DColorProvider
			.getDefault()};
	IColorProvider[] placeColorProviders = new IColorProvider[]{};

	IFigureProvider[] cityFigureProviders = new IFigureProvider[]{CityStyle2DFigureProvider
			.getDefault()};
	IFigureProvider[] individualFigureProviders = new IFigureProvider[]{IndividualStyle2DFigureProvider
			.getDefault()};
	IFigureProvider[] placeFigureProviders = new IFigureProvider[]{};

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getColorsForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IColorProvider[] getColorsForClass(Class type) {
		if (type == City.class) {
			return cityColorProviders;
		}
		if (type == Individual.class) {
			return individualColorProviders;
		}
		if (type == Place.class) {
			return placeColorProviders;
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
		if (type == City.class) {
			return cityFigureProviders;
		}
		if (type == Individual.class) {
			return individualFigureProviders;
		}
		if (type == Place.class) {
			return placeFigureProviders;
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
			singleton = new CityGraphicsAdapter();
		}
		return singleton;
	}
}
