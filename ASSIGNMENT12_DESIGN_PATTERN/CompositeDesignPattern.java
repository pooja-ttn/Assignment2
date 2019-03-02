import java.util.ArrayList;
import java.util.List;

/*Q7) Implement Composite Design Pattern to maintaing the directories of employees on the basis of departments.*/

//Component
interface Directory {
    void showDirectoryDetails();
}


//Leaf
class TechnicalDepartment implements Directory {
    private String name;
    private String language;

    public TechnicalDepartment(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Technical { " +
                "name='" + name + '\'' +
                ",Language='" + language + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Developer{ " +
                "name='" + name + '\'' +
                ",Language='" + language + '\'' +
                '}';
    }
}

//leaf
class MarketingDepartment implements Directory{

    private String name;
    private String type;

    public MarketingDepartment(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager{ " +
                "name='" + name + '\'' +
                ",type='" + type + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Manager{ " +
                "name='" + name + '\'' +
                ",type='" + type + '\'' +
                '}';
    }
}




//Composite
class TechnicalDirectory implements Directory{

    List<Directory> technicalDirectory = new ArrayList<Directory>();
    @Override
    public void showDirectoryDetails() {
        System.out.println("Technical Directory");
        technicalDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite
class MarketingDirectory implements Directory{

    List<Directory> marketingDirectory = new ArrayList<Directory>();
    @Override
    public void showDirectoryDetails() {
        System.out.println("\nMarketing Directory");
        marketingDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite

class CompanyDirectory implements Directory{

    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
}





public class CompositeDesignPattern {

    public static void main(String[] args) {

        TechnicalDepartment developer1 = new TechnicalDepartment("Pooja","Java");
        TechnicalDepartment developer2 = new TechnicalDepartment("Sheetal","AMC");

        MarketingDepartment manager1 = new MarketingDepartment("Amit Shah","Associate");
        MarketingDepartment manager2 = new MarketingDepartment("Nikhil","Senior");

        TechnicalDirectory technicalDirectory= new TechnicalDirectory();
        technicalDirectory.technicalDirectory.add(developer1);
        technicalDirectory.technicalDirectory.add(developer2);

        MarketingDirectory marketingDirectory = new MarketingDirectory();
        marketingDirectory.marketingDirectory.add(manager1);
        marketingDirectory.marketingDirectory.add(manager2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(technicalDirectory);
        companyDirectory.companyDirectory.add(marketingDirectory);

        companyDirectory.showDirectoryDetails();
    }
}
