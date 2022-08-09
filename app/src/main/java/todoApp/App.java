
package todoApp;

import controller.ProjectController;
import java.util.List;
import model.Project;

public class App {
     static {
    }

    public static void main(String[] args) {
             ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto taste");
        project.setDescription("description");
        projectController.save(project);

        project.setName("Novo nome do projeto");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());
    }
}
