public class ConstructionSite implements Cloneable{
    public String name;
    public int numberOfWorkers;
    public SiteManager siteManager;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConstructionSite siteCopy = (ConstructionSite) super.clone();
        SiteManager managerCopy = (SiteManager) this.siteManager.clone();
        siteCopy.siteManager = managerCopy;
        return siteCopy;
    }

    public ConstructionSite(String name, int numberOfWorkers, SiteManager siteManager) {
        this.name = name;
        this.numberOfWorkers = numberOfWorkers;
        this.siteManager = siteManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    @Override
    public String toString() {
        return "deepCopy.ConstructionSite{" +
                "name='" + name + '\'' +
                ", numberOfWorkers=" + numberOfWorkers +
                ", siteManager=" + siteManager +
                '}';
    }


}