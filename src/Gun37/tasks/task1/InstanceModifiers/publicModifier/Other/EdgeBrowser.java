package Gun37.tasks.task1.InstanceModifiers.publicModifier.Other;

import Gun37.tasks.task1.InstanceModifiers.publicModifier.Same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {
        // diğer oaketteki bu constructor a ulaşabildim.
        // çünkü public.
        SearchEngine microsoft=new SearchEngine("explorer");
        microsoft.name ="Edge"; // diğer paketteki bu fileda ulaşabildim

        System.out.println("microsoft = " + microsoft);
    }
}
