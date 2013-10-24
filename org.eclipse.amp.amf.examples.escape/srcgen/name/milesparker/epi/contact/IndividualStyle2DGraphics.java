package name.milesparker.epi.contact;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

import org.ascape.util.vis.DrawFeature;

/**
 * <!-- begin-user-doc -->
 * Individual Style 2D Java Implementation.
 * 
 * Generated by AMF for model: EpidemicContact.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualStyle2DGraphics extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	enum Shapes {
		rectangle, oval, marker
	};

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Shapes shape = Shapes.rectangle;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {

		HostCell rootActGroupCell = (HostCell) object;
		if (rootActGroupCell.getOccupant() instanceof Individual) {
			Individual rootActGroup = (Individual) rootActGroupCell
					.getOccupant();
			Individual individualRule = rootActGroup;
			if (individualRule.getStatus() == StatusEnum.susceptible) {
				Color colorBlue = ColorConstants.blue;

				g.setForegroundColor(colorBlue);
				g.setBackgroundColor(colorBlue);
				shape = shape.oval;
				if (shape == Shapes.oval) {
					g.fillOval(0, 0, width, height);
				} else if (shape == Shapes.marker) {
					int d = (int) (width * .25 - 1);
					int d2 = (int) (width * .5 - 1);
					g.fillOval(d, d, d2, d2);
				} else if (shape == Shapes.rectangle) {
					g.fillRectangle(0, 0, width, height);
				}
			}
			if (individualRule.getStatus() == StatusEnum.exposed) {
				Color colorYellow = ColorConstants.yellow;

				g.setForegroundColor(colorYellow);
				g.setBackgroundColor(colorYellow);
				shape = shape.oval;
				if (shape == Shapes.oval) {
					g.fillOval(0, 0, width, height);
				} else if (shape == Shapes.marker) {
					int d = (int) (width * .25 - 1);
					int d2 = (int) (width * .5 - 1);
					g.fillOval(d, d, d2, d2);
				} else if (shape == Shapes.rectangle) {
					g.fillRectangle(0, 0, width, height);
				}
			}
			if (individualRule.getStatus() == StatusEnum.asymptomInfectious) {
				Color colorOrange = ColorConstants.orange;

				g.setForegroundColor(colorOrange);
				g.setBackgroundColor(colorOrange);
				shape = shape.oval;
				if (shape == Shapes.oval) {
					g.fillOval(0, 0, width, height);
				} else if (shape == Shapes.marker) {
					int d = (int) (width * .25 - 1);
					int d2 = (int) (width * .5 - 1);
					g.fillOval(d, d, d2, d2);
				} else if (shape == Shapes.rectangle) {
					g.fillRectangle(0, 0, width, height);
				}
			}
			if (individualRule.getStatus() == StatusEnum.recovered) {
				Color colorGreen = ColorConstants.green;

				g.setForegroundColor(colorGreen);
				g.setBackgroundColor(colorGreen);
				shape = shape.oval;
				if (shape == Shapes.oval) {
					g.fillOval(0, 0, width, height);
				} else if (shape == Shapes.marker) {
					int d = (int) (width * .25 - 1);
					int d2 = (int) (width * .5 - 1);
					g.fillOval(d, d, d2, d2);
				} else if (shape == Shapes.rectangle) {
					g.fillRectangle(0, 0, width, height);
				}
			}
			if (individualRule.getStatus() == StatusEnum.dead) {
				Color colorBlack = ColorConstants.black;

				g.setForegroundColor(colorBlack);
				g.setBackgroundColor(colorBlack);
				shape = shape.oval;
				if (shape == Shapes.oval) {
					g.fillOval(0, 0, width, height);
				} else if (shape == Shapes.marker) {
					int d = (int) (width * .25 - 1);
					int d2 = (int) (width * .5 - 1);
					g.fillOval(d, d, d2, d2);
				} else if (shape == Shapes.rectangle) {
					g.fillRectangle(0, 0, width, height);
				}
			}
			if (individualRule.getStatus() == StatusEnum.symptomInfectious) {
				Color colorRed = ColorConstants.red;

				g.setForegroundColor(colorRed);
				g.setBackgroundColor(colorRed);
				shape = shape.oval;
				if (shape == Shapes.oval) {
					g.fillOval(0, 0, width, height);
				} else if (shape == Shapes.marker) {
					int d = (int) (width * .25 - 1);
					int d2 = (int) (width * .5 - 1);
					g.fillOval(d, d, d2, d2);
				} else if (shape == Shapes.rectangle) {
					g.fillRectangle(0, 0, width, height);
				}
			}
		}
	}
}
