package sdl.SIR.sd;

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
 * SIR Agent Style 2D Java Implementation.
 * 
 * Generated by AMF for model: SIR.metaabm in project: org.eclipse.amp.amf.examples.sd 
 * <!-- end-user-doc -->
 * @generated
 */
public class SIRAgentStyle2DFigureProvider extends DefaultFigureProvider {

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
		SIRAgent actions = (SIRAgent) object;
		SIRAgent defaultSIRAgentStyle = actions;
		if (figure == null) {
			figure = Shapes.createOval();
		}
		color = ColorConstants.blue;

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
			singleton = new SIRAgentStyle2DFigureProvider();
		}
		return singleton;
	}
}
