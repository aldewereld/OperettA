package net.sf.ictalive.runtime.dashboard;

import net.sf.ictalive.dashboard.PluggedInDashboardAction;

public class ServicePlatformStopAction extends PluggedInDashboardAction<RuntimeDashboardState> {

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.StopServicePlatformId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return "Stopping the service platform has to be done manually.";
	}

	@Override
	public void run(RuntimeDashboardState state) {
	}

}
