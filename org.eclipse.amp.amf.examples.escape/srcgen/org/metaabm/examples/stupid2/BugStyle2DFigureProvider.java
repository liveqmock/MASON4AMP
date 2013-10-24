package org.metaabm.examples.stupid2;

import org.ascape.util.vis.ColorFeature;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.ColorConstants;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.agf.gef.DefaultFigureProvider;
import org.eclipse.amp.agf.gef.Shapes;

/**
 * <!-- begin-user-doc -->
 * Bug Style 2D Java Implementation.
 * 
 * Generated by AMF for model: StupidModel2.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class BugStyle2DFigureProvider extends DefaultFigureProvider {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static IFigureProvider singleton;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFigure getFigure(Object object) {
		IFigure figure = null;
		Color color = null;
		Bug rootActGroup = (Bug) object;
		Bug bugRule = rootActGroup;
		double bugSizeRatio = bugRule.getSize() / 10.0;

		double bugSizeUnit = java.lang.Math.min(bugSizeRatio, 1.0)

		;

		double invertBugSize = 1 - bugSizeUnit;

		if (figure == null) {
			figure = Shapes.createOval();
		}
		color = new Color(Display.getCurrent(), (int) (1.0 * 255),
				(int) (invertBugSize * 255), (int) (invertBugSize * 255));

		figure.setBackgroundColor(color);
		((Shape) figure).setFill(true);
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IFigureProvider getDefault() {
		if (singleton == null) {
			singleton = new BugStyle2DFigureProvider();
		}
		return singleton;
	}
}
