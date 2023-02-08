package business_logic;

import domain.Pilot;

import java.util.List;

public class BlFacadeImpl implements BlFacade {
    @Override
    public void storePilot(String name, String nationality, int points) {

    }

    @Override
    public List<Pilot> getAllPilots() {
        return null;
    }

    @Override
    public List<Pilot> getPilotsByNationality(String nationality) {
        return null;
    }

    @Override
    public int deletePilotByName(String pilotName) {
        return 0;
    }

    @Override
    public void addPointsToPilot(int morePoints, String pilotName) {

    }
}
