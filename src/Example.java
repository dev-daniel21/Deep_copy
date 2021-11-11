public class Example {
    public static void main(String[] args) throws CloneNotSupportedException{
        SiteManager siteManager1 = new SiteManager("John", "Kowalski", 42, Experience.ADVANCED);
        ConstructionSite constructionSite1 = new ConstructionSite(
                "Commercial gallery",
                5000,
                siteManager1);
        ConstructionSite constructionSite2 = null;

        try {
            constructionSite2 = (ConstructionSite) constructionSite1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Base object:");
        System.out.println(constructionSite1);
        System.out.println("Copy without changes");
        System.out.println(constructionSite2);

        constructionSite2.setName("residential");
        constructionSite2.setNumberOfWorkers(600);
        constructionSite2.getSiteManager().lastName="Brown";
        constructionSite2.getSiteManager().name="Adam";
        constructionSite2.getSiteManager().experience = Experience.MEDIUM;
        constructionSite2.getSiteManager().age = 50;
        System.out.println("Base object after changes to the copy:");
        System.out.println(constructionSite1);
        System.out.println("Copied object after changes:");
        System.out.println(constructionSite2);

    }
}
