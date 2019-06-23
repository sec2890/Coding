package ProjectClass;

public class ProjectClassTest{
    public static void main(String[] args){
        ProjectClass testProject = new ProjectClass("Add a Jet", "Steven's rooftop Mansion", 120000.66);
        testProject.setName("City HeadQuarters");
        testProject.setDescription("Relocating to San Jose.");
        testProject.setCost(92000.44);
        System.out.println(testProject.elevatorPitch());
    }
}