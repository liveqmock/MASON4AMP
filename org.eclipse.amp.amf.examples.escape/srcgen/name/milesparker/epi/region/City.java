package name.milesparker.epi.region;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;

import org.eclipse.swt.graphics.Color;
import org.eclipse.jface.viewers.IColorProvider;

import org.ascape.model.Agent;
import org.ascape.model.Cell;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.rule.Rule;
import org.ascape.model.rule.ExecuteThenUpdate;
import org.ascape.model.space.CollectionSpace;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate2DDiscrete;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Location;
import org.ascape.model.space.Singleton;
import org.ascape.runtime.NonGraphicRunner;
import org.ascape.util.Conditional;
import org.ascape.util.data.DataPoint;
import org.ascape.util.data.DataPointConcrete;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.ascape.view.vis.GraphView;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;

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
public class City extends Scape implements IGraphicsAdapted {

	/**
	 * <!-- begin-user-doc -->
	 * The number of individuals to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int individualCount = 300;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int periodsperDay = 24;
	/**
	 * <!-- begin-user-doc -->
	 * The number of locations to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int locationCount = 0;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CommunityInfectionStatusEnum communityInfectionStatus = CommunityInfectionStatusEnum.noInfections;
	/**
	 * <!-- begin-user-doc -->
	 * The size of each dimension.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int[] mapDimensions = new int[2];
	/**
	 * <!-- begin-user-doc -->
	 * The horizontal extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int mapWidth = 20;
	/**
	 * <!-- begin-user-doc -->
	 * The vertical extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int mapHeight = 50;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Scape map = null;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private List<IAgentChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IAgentChild> getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Constructs a new City.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City() {

		children = new ArrayList<IAgentChild>();

	}

	//todo, make this a useful value for evaluating compatibility of different versions of generated classes

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 89989998L;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static long nextUniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private long uniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUID() {
		if (uniqueID == 0) {
			uniqueID = nextUniqueID++;
		}
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Clones the agent, ensuring that a unique id is assigned.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object clone() {
		try {
			City clone = (City) super.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	org.ascape.model.Scape individualScape;

	/**
	 * <!-- begin-user-doc -->
	 * Create an instance of Individual that will be used to populate the individualScape.
	 * Overide to customize the prototype, for example to change the views created for a member scape.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Individual createIndividualPrototype() {
		Individual individual = new Individual();
		individual.setCoordinate(new Coordinate2DDiscrete(0, 0));
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	static int next_vm_id;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int vm_unique_id;

	/**
	 * <!-- begin-user-doc -->
	 * Creates the members of City.
	 * <!-- end-user-doc --> 
	 * @generated
	 */
	public void createScape() {
		super.createScape();
		vm_unique_id = next_vm_id;
		setName("City " + vm_unique_id);
		next_vm_id++;
		setAutoCreate(false);
		setPrototypeAgent(new org.ascape.model.Scape());
		//A manager scape provides rule execution for itself in the case where a Scape is the root scape.
		if (isRoot()) {
			Scape managerScape = new Scape(new Singleton());
			add(managerScape);
			managerScape.addInitialRule(new Rule("Setup Location") {
				private static final long serialVersionUID = 6846144446402098981L;
				public void execute(Agent a) {
					((City) a.getScape()).setupLocation();
				}
			});
		}
		Individual individualProto = createIndividualPrototype();
		individualScape = new Scape();
		individualScape.setName("Individuals");
		individualScape.setPrototypeAgent(individualProto);
		individualScape.setExecutionOrder(Scape.RULE_ORDER);

		for (IAgentChild tmp : individualProto.getChildren()) {
			tmp.addDataCollectors(this);
		}

		individualScape.setSize(getIndividualCount());
		map = new Scape(new org.ascape.model.space.Array2DMoore());
		map.setExecutionOrder(Scape.RULE_ORDER);
		Place protoPlace = new Place();
		map.setPrototypeAgent(protoPlace);
		map.setExtent(new org.ascape.model.space.Coordinate2DDiscrete(
				getMapWidth(), getMapHeight()));

		map.setName("Maps");
		((CollectionSpace) map.getSpace()).setPeriodic(false);
		add(map);
		org.ascape.model.Scape placeScape = map;
		for (IAgentChild tmp : protoPlace.getChildren()) {
			tmp.addDataCollectors(this);
		}

		add(individualScape);

		for (IAgentChild tmp : individualProto.getChildren()) {
			tmp.addDataCollectors(this);
		}

		individualProto.setHostScape(map);
		map.getRules().clear();

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						individualScape.getName() + " Population") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 684614444640209893L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					@SuppressWarnings("unused")
					public final boolean meetsCondition(Object object) {
						return true;
					}
				});
		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						getName() + " Individual Susceptible Status") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final boolean meetsCondition(Object individual) {
						return StatusEnum.susceptible == ((Individual) individual)
								.getStatus();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						getName() + " Individual Exposed Status") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final boolean meetsCondition(Object individual) {
						return StatusEnum.exposed == ((Individual) individual)
								.getStatus();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						getName() + " Individual Asymptom Infectious Status") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final boolean meetsCondition(Object individual) {
						return StatusEnum.asymptomInfectious == ((Individual) individual)
								.getStatus();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						getName() + " Individual Symptom Infectious Status") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final boolean meetsCondition(Object individual) {
						return StatusEnum.symptomInfectious == ((Individual) individual)
								.getStatus();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						getName() + " Individual Recovered Status") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final boolean meetsCondition(Object individual) {
						return StatusEnum.recovered == ((Individual) individual)
								.getStatus();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCond(
						getName() + " Individual Dead Status") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final boolean meetsCondition(Object individual) {
						return StatusEnum.dead == ((Individual) individual)
								.getStatus();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCSAMM(
						getName() + " Individual Exposure End Period") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final double getValue(Object individual) {
						return ((Individual) individual).getExposureEndPeriod();
					}
				});

		individualScape
				.addStatCollector(new org.ascape.util.data.StatCollectorCSAMM(
						getName()
								+ " Individual Contact Transmission Probability") {

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					private static final long serialVersionUID = 6846144446402098985L;

					/**
					 * <!-- begin-user-doc -->
					 * 
					 * <!-- end-user-doc -->
					 * @generated
					 */
					public final double getValue(Object individual) {
						return ((Individual) individual)
								.getContactTransmissionProbability();
					}
				});

		for (IAgentChild tmp : individualProto.getChildren()) {
			tmp.addDataCollectors(this);
		}

		individualScape.addInitialRule(new Rule("Initialize Location") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098982L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((name.milesparker.epi.region.Individual) a)
						.initializeLocation();
			}
		});
		individualScape.addRule(new Rule("Movement") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098981L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((name.milesparker.epi.region.Individual) a).movement();
			}
		});

		individualScape.addInitialRule(new Rule("Initialize State") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098982L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((name.milesparker.epi.region.Individual) a).initializeState();
			}
		});
		individualScape.addRule(new Rule("Transmission") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098981L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((name.milesparker.epi.region.Individual) a).transmission();
			}
		});
		individualScape.addRule(new Rule("Progression") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098981L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((name.milesparker.epi.region.Individual) a).progression();
			}
		});
		individualScape.addRule(new Rule("Migrate") {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			private static final long serialVersionUID = 6846144446402098981L;

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void execute(Agent a) {
				((name.milesparker.epi.region.Individual) a).migrate();
			}
		});

		for (IAgentChild tmp : getChildren()) {
			tmp.addDataCollectors(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates UI views for City.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createGraphicViews() {
		super.createGraphicViews();
		create2DViews();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void scapeSetup(ScapeEvent scapeEvent) {
		//Set the size of the scape populations, e.g. for mutable scapes that need to have their size reset

		individualScape.setSize(getIndividualCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the Scape containing Individuals.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ascape.model.Scape getIndividualScape() {
		return individualScape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createChartViews() {
		ChartView chart = new ChartView();

		final City individualScape = new City();
		individualScape.setRunner(new NonGraphicRunner());
		Individual individual = new Individual() {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void requestUpdate() {
			}

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public City getCity() {
				return individualScape;
			}
		};
		individualScape.add(individual);
		HostCell individualHost = new HostCell() {

			/**
			 * <!-- begin-user-doc -->
			 * 
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public void requestUpdate() {
			}
		};
		individualHost.setOccupant((CellOccupant) individual);

		IColorProvider individualStyle2DColorProvider = new IndividualStyle2DColorProvider();

		individual.setStatus(StatusEnum.susceptible);
		chart.addSeries(
				"Count Individual Susceptible Status",
				getInferredChartColor(individual,
						individualStyle2DColorProvider));

		individual.setStatus(StatusEnum.exposed);
		chart.addSeries(
				"Count Individual Exposed Status",
				getInferredChartColor(individual,
						individualStyle2DColorProvider));

		individual.setStatus(StatusEnum.asymptomInfectious);
		chart.addSeries(
				"Count Individual Asymptom Infectious Status",
				getInferredChartColor(individual,
						individualStyle2DColorProvider));

		individual.setStatus(StatusEnum.symptomInfectious);
		chart.addSeries(
				"Count Individual Symptom Infectious Status",
				getInferredChartColor(individual,
						individualStyle2DColorProvider));

		individual.setStatus(StatusEnum.recovered);
		chart.addSeries(
				"Count Individual Recovered Status",
				getInferredChartColor(individual,
						individualStyle2DColorProvider));

		individual.setStatus(StatusEnum.dead);
		chart.addSeries(
				"Count Individual Dead Status",
				getInferredChartColor(individual,
						individualStyle2DColorProvider));

		addView(chart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create2DViews() {
		addView(new GEFView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGraphViews() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGraphicsAdapter getGraphicsAdapter() {
		return CityGraphicsAdapter.getDefault();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Color getInferredChartColor(Object agent,
			IColorProvider colorProvider) {
		Color color = colorProvider.getForeground(agent);
		if (color == ColorFeature.BLACK) {
			color = ColorFeatureConcrete.createHSB(
					(float) java.lang.Math.random() * 360f, 1.0f, 0.8f);
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		(new NonGraphicRunner())
				.openInstance("name.milesparker.epi.region.City");
	}

	/**
	 * <!-- begin-user-doc -->
	 * A simple model of epidemic dynamics. We define individual agents with different disease states. The progression of disease moves from succeptible to exposed to infectious (either symptomatic or asymptomatic) to some outcome state. Agents can transmit infection to their immediate neighbors.

	For some background on the general approach, see Joshua M. Epstein. "Generative Social Science". 2006. Princeton. 

	Copyright 2009, Miles Parker. Released under Eclipse Public License. All uses should be attributed.
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void executeOnMembers() {
		int timeStep = getRunner().getPeriod();
		startSimulationAgentChild(timeStep);

		//A normal movable agent
		((Individual) individualScape.getPrototypeAgent())
				.startSimulationAgentChild(timeStep);

		//this is an agent that represent a cell and cannot move.

		((Place) map.getPrototypeAgent()).startSimulationAgentChild(timeStep);

		super.executeOnMembers();
		calculateTimeStep(timeStep);

		//A normal movable agent
		((Individual) individualScape.getPrototypeAgent())
				.calculateTimeStep(timeStep);

		//this is an agent that represent a cell and cannot move.

		((Place) map.getPrototypeAgent()).calculateTimeStep(timeStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		return (Region) getScape().getScape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * A simple model of epidemic dynamics. We define individual agents with different disease states. The progression of disease moves from succeptible to exposed to infectious (either symptomatic or asymptomatic) to some outcome state. Agents can transmit infection to their immediate neighbors.

	For some background on the general approach, see Joshua M. Epstein. "Generative Social Science". 2006. Princeton. 

	Copyright 2009, Miles Parker. Released under Eclipse Public License. All uses should be attributed.
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void startSimulationAgentChild(int timeStep) {
		if (timeStep == getRoot().getRunner().getEarliestPeriod()) {
			for (IAgentChild tmp : children) {
				tmp.startSimulation(timeStep);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * A simple model of epidemic dynamics. We define individual agents with different disease states. The progression of disease moves from succeptible to exposed to infectious (either symptomatic or asymptomatic) to some outcome state. Agents can transmit infection to their immediate neighbors.

	For some background on the general approach, see Joshua M. Epstein. "Generative Social Science". 2006. Princeton. 

	Copyright 2009, Miles Parker. Released under Eclipse Public License. All uses should be attributed.
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void calculateTimeStep(int timeStep) {
		for (IAgentChild tmp : children) {
			tmp.calculate(timeStep);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Setup Location Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setupLocation() {
		RegionalLocation cityLocation = (RegionalLocation) ((org.ascape.model.space.Discrete) getRegion()
				.getRegionalMap().getSpace()).findRandomAvailable();
		if (cityLocation != null) {
			if (getHostScape() != ((Agent) cityLocation).getScape()) {
				die();
				getRegion().getCityScape().add(this);
			}
			moveTo(cityLocation);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Gets the Individual Count property for City.
	 * @return The number of individuals to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndividualCount() {
		return individualCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Individual Count property for City.
	 * The number of individuals to create.
	 * @param _individualCount the new Individual Count value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualCount(int _individualCount) {
		individualCount = _individualCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Periods per Day property for City.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodsperDay() {
		return periodsperDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Periods per Day property for City.
	 * 
	 * @param _periodsperDay the new Periods per Day value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodsperDay(int _periodsperDay) {
		periodsperDay = _periodsperDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Location Count property for City.
	 * @return The number of locations to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocationCount() {
		return locationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Location Count property for City.
	 * The number of locations to create.
	 * @param _locationCount the new Location Count value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationCount(int _locationCount) {
		locationCount = _locationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Community Infection Status property for City.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunityInfectionStatusEnum getCommunityInfectionStatus() {
		return communityInfectionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Community Infection Status property for City.
	 * 
	 * @param _communityInfectionStatus the new Community Infection Status value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunityInfectionStatus(
			CommunityInfectionStatusEnum _communityInfectionStatus) {
		communityInfectionStatus = _communityInfectionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Dimensions property for Map.
	 * @return The size of each dimension.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getMapDimensions() {
		return mapDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Dimensions property for Map.
	 * The size of each dimension.
	 * @param _mapDimensions the new Dimensions value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapDimensions(int[] _mapDimensions) {
		mapDimensions = _mapDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Width property for Map.
	 * @return The horizontal extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMapWidth() {
		return mapWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Width property for Map.
	 * The horizontal extent of the space.
	 * @param _mapWidth the new Width value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapWidth(int _mapWidth) {
		mapWidth = _mapWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Height property for Map.
	 * @return The vertical extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMapHeight() {
		return mapHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Height property for Map.
	 * The vertical extent of the space.
	 * @param _mapHeight the new Height value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapHeight(int _mapHeight) {
		mapHeight = _mapHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Map property for City.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scape getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Map property for City.
	 * 
	 * @param _map the new Map value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Scape _map) {
		map = _map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "City " + getUID();
		} else {
			return name;
		}
	}
}
