package name.milesparker.epi.region;

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
 * Generated by AMF for model: EpidemicRegional.metaabm in project: org.eclipse.amp.amf.examples.escape 
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
				Color individualRuleColorBlue = ColorConstants.blue;

				g.setForegroundColor(individualRuleColorBlue);
				g.setBackgroundColor(individualRuleColorBlue);
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
				Color individualRuleColorYellow = ColorConstants.yellow;

				g.setForegroundColor(individualRuleColorYellow);
				g.setBackgroundColor(individualRuleColorYellow);
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
				Color individualRuleColorOrange = ColorConstants.orange;

				g.setForegroundColor(individualRuleColorOrange);
				g.setBackgroundColor(individualRuleColorOrange);
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
				Color individualRuleColorGreen = ColorConstants.green;

				g.setForegroundColor(individualRuleColorGreen);
				g.setBackgroundColor(individualRuleColorGreen);
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
				Color individualRuleColorBlack = ColorConstants.black;

				g.setForegroundColor(individualRuleColorBlack);
				g.setBackgroundColor(individualRuleColorBlack);
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
				Color individualRuleColorRed = ColorConstants.red;

				g.setForegroundColor(individualRuleColorRed);
				g.setBackgroundColor(individualRuleColorRed);
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
