public class MainCity {
    public static void main(String[] args) {
        City Salvador = new City("Salvador", 2886698, 693.8, "Bahia", true);
        City SP = new City("São Paulo", 12325232, 1521, "São Paulo", true);
        City Curitiba = new City("Curitiba", 1948626, 4349, "Paraná", true);
        City Campinas = new City("Campinas", 1223237, 7953, "São Paulo", false);

        System.out.println("City name: " + Salvador.getName() + "\nPopulation: " + Salvador.getPopulation() + "\nArea: " + Salvador.getArea() + "\nState: " + Salvador.getState() + "\nIs capital? " + Salvador.isCapital());
        System.out.println("-------------------");
    }
}
