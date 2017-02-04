public class InterfaceSegregation {
    public static void main(String[] args) throws Exception {
        MaquilaFactory maquilaX = new MaquilaFactory();
        SodaFactory sodaX = new SodaFactory();
        CarFactory carX = new CarFactory();
    }
}

class MaquilaFactory implements ProductionDepartment, DeliveryDepartment{
    public MaquilaFactory(){;}
    public void manufacture(){;};
    public void transformRawMaterial(){;};
    public void logistics(){;};
    public void distribution(){;};
}

class SodaFactory implements ProductionDepartment, AdministrativeDepartment, InvestigationDepartment{
    public SodaFactory(){;}
    public void manufacture(){;};
    public void transformRawMaterial(){;};
    public void administration(){;};
    public void accountancy(){;};
    public void createNewProduct(){;};
    public void costReduction(){;};
}

class CarFactory implements ProductionDepartment, InvestigationDepartment{
    public CarFactory(){;}
    public void manufacture(){;};
    public void transformRawMaterial(){;};
    public void createNewProduct(){;};
    public void costReduction(){;};
}

//Bad Implementation
interface Factory {
    public void administration();
    public void manufacture();
    public void accountancy();
    public void transformRawMaterial();
    public void createNewProduct();
    public void costReduction();
    public void logistics();
    public void distribution();
}

//Better Implementation applying Interface Segregation
//Segregate Factory interface on Department interfaces
interface AdministrativeDepartment {
    public void administration();
    public void accountancy();
}

interface ProductionDepartment {
    public void manufacture();
    public void transformRawMaterial();
}

interface InvestigationDepartment {
    public void createNewProduct();
    public void costReduction();
}

interface DeliveryDepartment {
    public void logistics();
    public void distribution();
}