package structuraldesignpatterns.composite.menu;


public class MenuDemo {
    public static void main(String[] args) {
        Menu mainMenu =new Menu("Main" , "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety","/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims","/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaim= new MenuItem("Personal Claims","/personalClaims");
        claimsSubMenu.add(personalClaim);

        System.out.println(mainMenu);


    }
}
