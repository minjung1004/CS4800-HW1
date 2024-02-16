package Composition;

public class Driver {
    public static void main(String[] args){
        Folder php_demo1 = new Folder("php_demo1 ");

        php_demo1.addSubFolder("Source Files");
        php_demo1.addSubFolder("Source Files", ".phalcon");
        php_demo1.addSubFolder("Source Files", "app");
        php_demo1.addSubFolder("app", "config");
        php_demo1.addSubFolder("app", "controllers");
        php_demo1.addSubFolder("app", "library");
        php_demo1.addSubFolder("app", "migrations");
        php_demo1.addSubFolder("app", "models");
        php_demo1.addSubFolder("app", "views");
        php_demo1.addSubFolder("Source Files", "cache");
        php_demo1.addSubFolder("Source Files", "public");
        php_demo1.addSubFile("public", ".htaccess");
        php_demo1.addSubFile("public", ".htrouter.php");
        php_demo1.addSubFile("public", "index.html");
        php_demo1.addSubFolder("Include Path");
        php_demo1.addSubFolder("Remote Files");

        //print

        php_demo1.deleteSubFolder("app");
        //print

        php_demo1.deleteSubFolder("public");
        //print
    }
}
