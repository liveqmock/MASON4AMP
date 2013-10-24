package name.milesparker.epi;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.ascape.util.vis.DrawFeature;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

/**
 * <!-- begin-user-doc -->
 * Place Style 2D Java Implementation.
 * 
 * Generated by AMF for model: Epidemic.metaabm in project: org.eclipse.amp.amf.examples.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaceStyle2D extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {
		Shape shape = null;
		Place rootActGroup = (Place) object;
		Place locationRule = rootActGroup;
		java.awt.Color locationRuleColorBlack = java.awt.Color.BLACK

		;

		g.setColor(locationRuleColorBlack);
		shape = new Rectangle2D.Double(0, 0, width, height);
		((Graphics2D) g).fill(shape);
	}
}